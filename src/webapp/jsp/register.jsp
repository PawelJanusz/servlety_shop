<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Register</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <!-- Brand/logo -->
    <a class="navbar-brand" href="/">Home</a>
    <!-- Links -->
    <ul class="navbar-nav">
        <c:if test="${not empty user}">
            <li class="nav-item">
                <a class="nav-link" href="/all-products">Produkty</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/add-product">Dodaj produkt</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/users">Uzytkownicy</a>
            </li>
        </c:if>
        <c:if test="${empty user}">
            <li class="nav-item">
                <a class="nav-link" href="/register">Register</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Login</a>
            </li>
        </c:if>
        <c:if test="${not empty user}">
            <li class="nav-item">
                <a class="nav-link" href="/logout">Logout</a>
            </li>
        </c:if>
    </ul>
</nav>

<div class="container">
    <h1 align="center">Zarejestruj się</h1>
    <form method="post" action="/register">
        <div class="form-group">
            <label for="name">User name :</label>
            <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
        </div>

        <div class="form-group">
            <label for="surname">User surname :</label>
            <input type="text" class="form-control" id="surname" placeholder="Enter surname" name="surname">
        </div>

        <div class="form-group">
            <label for="login">Login :</label>
            <input type="text" class="form-control" id="login" placeholder="Enter login" name="login">
        </div>

        <div class="form-group">
            <label for="password">Password :</label>
            <input type="text" class="form-control" id="password" placeholder="Enter password" name="password">
        </div>

        <div class="form-group">
            <label for="password2">Confirm password :</label>
            <input type="text" class="form-control" id="password2" placeholder="Enter password2" name="password2">
        </div>

        <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>
</body>
</html>