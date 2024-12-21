<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Bag Details</title>
    <style>
        .text-success {
            color: green;
        }
        .text-danger {
            color: red;
        }
    </style>
</head>
<body>
    <h1>Bag Details - Fill the Details Below</h1>
    <form action="Click" method="post">
        <h3>Fill The Details</h3>
        
        <!-- Display success and failure messages if set by servlet -->
        <span class="text-success">${success}</span>
        <span class="text-danger">${failure}</span>
        
        <br><br>
        Bag Name: <input type="text" name="bagName" value="${dto.bagName}"><br><br>
        Bag Brand: <input type="text" name="bagBrand" value="${dto.bagBrand}"><br><br>
        Bag Color: <input type="text" name="bagColor" value="${dto.bagColor}"><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>