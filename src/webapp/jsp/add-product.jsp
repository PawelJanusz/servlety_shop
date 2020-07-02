<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Add product</title>
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
        <li class="nav-item">
            <a class="nav-link" href="/all-products">Products</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/add-product">Add products</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/register">Register</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/login">Login</a>
        </li>
    </ul>
</nav>

<div class="container">
    <h1 align="center">Dodaj produkt</h1>

    <c:if test="${not empty error}">
        <h2 style="color: red">Error while submitting from: ${error}</h2>
    </c:if>

    <form method="post" action="/add-product">
        <div class="form-group">
            <label for="productName">Product name :</label>
            <input type="text" class="form-control" id="productName" placeholder="Enter product name" name="name">
        </div>
        <div class="form-group">
            <label for="productPrice">Product price :</label>
            <input type="number" class="form-control" id="productPrice" placeholder="Enter product price" name="price">
        </div>
        <div class="form-group">
            <label for="description">Description :</label>
            <input type="text" class="form-control" id="description" placeholder="Enter description" name="description">
        </div>
        <div class="form-group">
            <label for="category">Category :</label>
            <select id="category" class="form-control" name="category" size="1">
                <option>ELECTRONICS</option>
                <option>HEALTH</option>
                <option>SPORT</option>
                <option>FOOD</option>
            </select>
        </div>
        <div class="form-group">
            <label for="quantity">Quantity:</label>
            <input type="number" class="form-control" id="quantity" placeholder="Enter product quantity" name="quantity">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>
</body>
</html>