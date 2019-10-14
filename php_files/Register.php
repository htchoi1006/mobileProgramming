<?php 
    $con = mysqli_connect("localhost", "htchoi1006", "css9711492#", "htchoi1006");
    mysqli_query($con,'SET NAMES utf8');
 
    $userID = $_POST["userID"];
    $userPassword = $_POST["userPassword"];
    $userName = $_POST["userName"];
    $userAddress = $_POST["userAddress"];
    $userPhone = $_POST["userPhone"];
 
    $statement = mysqli_prepare($con, "INSERT INTO USERS VALUES (?,?,?,?,?)");
    mysqli_stmt_bind_param($statement, "ssssi", $userID, $userPassword, $userName, $userAddress, $userPhone);
    mysqli_stmt_execute($statement);
 
 
    $response = array();
    $response["success"] = true;
 
   
    echo json_encode($response);
?>