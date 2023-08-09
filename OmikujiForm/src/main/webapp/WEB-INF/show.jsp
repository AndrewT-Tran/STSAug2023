<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <!-- for Bootstrap CSS -->
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <!-- YOUR own local CSS -->
        <link rel="stylesheet" href="/css/main.css" />
        <!-- For any Bootstrap that uses JS -->
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        <meta charset="UTF-8">
        <title>Omikuji</title>
        <link href="https://fonts.googleapis.com/css?family=Poppins&display=swap" rel="stylesheet">
        <style>
            body {
                font-family: 'Poppins', sans-serif;
            }
        </style>
    </head>

    <body>
        <div class="container-sm my-5">

            <h1 class="text-center text-success mb-3">Here is your 
            <span class="text-primary font-italic text-uppercase text-decoration-underline">Omikuji</span> 
            </h1>
            <div class="d-flex justify-content-center">
                <div class="card bg-success bg-opacity-50 border rounded p-2" style="width: 400px;">
                    <div class="card-body text-center">
                        <p>In <span class="text-primary">
                                ${sessionScope.number} </span> years, you will live with <span
                                class="text-warning">${sessionScope.person} </span> in ${sessionScope.city}
                            , where you guys will ${sessionScope.hobby} . When you see ${sessionScope.thing}
                            , tell them "${sessionScope.nice}""</p>
                    </div>
                </div>
            </div>
        </div>
    </body>

    </html>