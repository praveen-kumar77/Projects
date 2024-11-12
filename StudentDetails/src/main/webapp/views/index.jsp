<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Employee Details Application</title>
</head>
<body>
    <div class="container">
        <h2>Employee Details Upload</h2>

        <form action="/Success" method="post" class="form-upload">
            <label for="id">Employee ID</label>
            <input type="text" id="id" name="id" >

            <label for="name">Employee Name</label>
            <input type="text" id="name" name="name" >

            <label for="age">Age</label>
            <input type="text" id="age" name="age" >

            <label for="salary">Salary</label>
            <input type="text" id="salary" name="salary" >

            <input type="submit" value="Submit">
        </form>


    </div>

    <div class="container" >
     <h4>Delete Student Record</h4>
            <form action="delete" method="post" class="form-delete">
                <label for="id1">Enter Employee ID to Delete</label>
                <input type="text" id="id1" name="id1" required>
                <input type="submit" value="Delete">
            </form>
    </div>
</body>
</html>
