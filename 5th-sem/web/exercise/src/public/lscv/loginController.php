<?php

session_start();
include "connection.php";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = $_POST["username"];
    $password = $_POST["password"];

    $errors = [];

    if(empty($username)) {
        $errors["username"] = "Username is required";
    }

    if(empty($password)) {
        $errors["password"] = "Password is required";
    }

    if(!empty($username) && !empty($password)) {
        $query = "SELECT * FROM users WHERE username='$username' AND password='$password'";
        $result = mysqli_query($connect, $query);

        if (mysqli_num_rows($result) > 0) {
            $_SESSION["username"] = $username;
            header("location:home.php");
        } else {
            header("location:login.php?err=true");
        }

    }
}
