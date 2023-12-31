package com.tran.bookclub.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tran.bookclub.models.Book;
import com.tran.bookclub.models.LoginUser;
import com.tran.bookclub.models.User;
import com.tran.bookclub.services.BookService;
import com.tran.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	private final BookService bookSer;
	private final UserService userSer;

	public HomeController(BookService bookSer, UserService userSer) {
		this.bookSer = bookSer;
		this.userSer = userSer;
	}

	// ================================ BOOKS ================================
	@GetMapping("/add/book")
	public String addBook(Model model, HttpSession session, @ModelAttribute("book") Book book) {
		if (session.getAttribute("user_id") != null) {
			Long loggedID = (Long) session.getAttribute("user_id");
			model.addAttribute("logged", loggedID);
			return "addBook.jsp";
		} else {
			return "redirect:/";
		}
	}

	@PostMapping("api/add/book")
	public String addBookForm(Model model, @Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "addBook.jsp";
		} else {
			bookSer.createBook(book);
			return "redirect:/dashboard";
		}
	}

	@GetMapping("/book")
	public String book(Model model, HttpSession session) {
		if (session.getAttribute("user_id") != null) {
			return "book.jsp";
		} else {
			return "redirect:/";
		}
	}

	@GetMapping("/logout")
	public String dashboard(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model, HttpSession session) {
		if (session.getAttribute("user_id") != null) {
			Long loggedID = (Long) session.getAttribute("user_id");
			com.tran.bookclub.models.User userName = userSer.oneUser(loggedID);
			List<Book> allBooks = bookSer.allBooks();
			model.addAttribute("logged", userName);
			model.addAttribute("allBooks", allBooks);
			return "dashboard.jsp";
		} else {
			return "redirect:/";
		}
	}

	@GetMapping("/edit/book/{id}")
	public String editBook(Model model, HttpSession session, @PathVariable("id") Long id,
			@ModelAttribute("book") Book book) {
		if (session.getAttribute("user_id") != null) {
			com.tran.bookclub.models.Book thisBook = bookSer.singleBook(id);
			Long loggedID = (Long) session.getAttribute("user_id");
			model.addAttribute("logged", loggedID);
			model.addAttribute("thisBook", thisBook);
			return "editBook.jsp";
		} else {
			return "redirect:/";
		}
	}

	@PostMapping("api/edit/book")
	public String editBookForm(Model model, @Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "editBook.jsp";
		} else {
			bookSer.updateBook(book);
			return "redirect:/dashboard";
		}
	}

	// ================================ GENERAL ================================
	@GetMapping("/")
	public String index(Model model, HttpSession session) {
		if (session.getAttribute("user_id") != null) {
			return "dashboard.jsp";
		} else {
			model.addAttribute("newUser", new User());
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
	}

	@PostMapping("/api/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {
		com.tran.bookclub.models.User user = userSer.login(newLogin, result);
		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}

		session.setAttribute("user_id", ((HttpSession) user).getId());
		String string = "redirect:/dashboard";
		return string;
	}

	// ================================ LOGIN / REGISTRATION
	// ================================
	@PostMapping("/api/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		userSer.register(newUser, result);

		if (result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}

		session.setAttribute("user_id", newUser.getId());
		return "redirect:/dashboard";
	}

	@GetMapping("/book/{id}")
	public String showBook(Model model, HttpSession session, @PathVariable("id") Long id) {
		Book book = bookSer.singleBook(id);
		Long loggedID = (Long) session.getAttribute("user_id");
		model.addAttribute("logged", loggedID);
		model.addAttribute("book", book);
		return "book.jsp";
	}
}
