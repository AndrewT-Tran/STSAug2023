package com.tran.bookclub.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 2, max = 100, message = "Title cannot be blank")
	private String title;

	@NotNull
	@Size(min = 2, max = 100, message = "Author cannot be blank")
	private String author;

	@NotNull
	@Size(min = 10, max = 200, message = "Message annot be blank")
	private String thoughts;

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	// RELATIONSHIPS
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	public Book() {
		super();
	}

	// CONTROLLERS
	public Book(Long id, @NotNull @Size(min = 2, max = 100, message = "Title cannot be blank") String title,
			@NotNull @Size(min = 2, max = 100, message = "Author cannot be blank") String author,
			@NotNull @Size(min = 10, max = 200, message = "Message annot be blank") String thoughts, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.thoughts = thoughts;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Book(Long id, @NotNull @Size(min = 2, max = 100, message = "Title cannot be blank") String title,
			@NotNull @Size(min = 2, max = 100, message = "Author cannot be blank") String author,
			@NotNull @Size(min = 10, max = 200, message = "Message annot be blank") String thoughts, Date createdAt,
			Date updatedAt, User user) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.thoughts = thoughts;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.user = user;
	}

	public Book(@NotNull @Size(min = 2, max = 100, message = "Title cannot be blank") String title,
			@NotNull @Size(min = 2, max = 100, message = "Author cannot be blank") String author,
			@NotNull @Size(min = 10, max = 200, message = "Message annot be blank") String thoughts) {
		super();
		this.title = title;
		this.author = author;
		this.thoughts = thoughts;
	}

	public Book(@NotNull @Size(min = 2, max = 100, message = "Title cannot be blank") String title,
			@NotNull @Size(min = 2, max = 100, message = "Author cannot be blank") String author,
			@NotNull @Size(min = 10, max = 200, message = "Message annot be blank") String thoughts, User user) {
		super();
		this.title = title;
		this.author = author;
		this.thoughts = thoughts;
		this.user = user;
	}

	public String getAuthor() {
		return author;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	// GETTERS / SETTERS
	public Long getId() {
		return id;
	}

	public String getThoughts() {
		return thoughts;
	}

	public String getTitle() {
		return title;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public User getUser() {
		return user;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
