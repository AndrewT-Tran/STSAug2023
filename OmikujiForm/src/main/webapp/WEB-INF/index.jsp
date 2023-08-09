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
    </head>

    <body>
        <h1 class="text-center text-success my-3"> Send an Omikuji</h1>

        <div class="container-sm text-center">
            <form action="/show" method="post"
                class="narrow-form border border-success border-3  bg-success bg-opacity-25 rounded p-3">
                <div class="form-group">
                    <label class="text-left">Pick any number from 5 to 25:</label>
                    <input type="number" name="number" class="form-control" min="5" max="25">
                </div>
                <div class="form-group">
                    <label class="text-left">Enter the Name of any City</label>
                    <input type="text" name="city" class="form-control">
                </div>
                <div class="form-group">
                    <label class="text-left">Enter the Name of any Real Person</label>
                    <input type="text" name="person" class="form-control">
                </div>
                <div class="form-group">
                    <label class="text-left">Enter personal endeavor or hobby</label>
                    <input type="text" name="hobby" class="form-control">
                </div>
                <div class="form-group">
                    <label class="text-left">Enter the Name of any living thing</label>
                    <input type="text" name="thing" class="form-control">
                </div>
                <div class="form-group">
                    <label class="text-left">Say Something nice</label>
                    <input type="text" name="nice" class="form-control">
                </div>
                <input type="submit" class="btn btn-success my-2">
            </form>
        </div>


    </body>