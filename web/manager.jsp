<%-- 
    Document   : editbook
    Created on : Oct 29, 2022, 6:29:55 PM
    Author     : lenam
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Book</title>
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
            }
            * {
                box-sizing: border-box;
            }

            /* Button used to open the contact form - fixed at the bottom of the page */
            .open-button {
                background-color: #555;
                color: white;
                padding: 16px 20px;
                border: none;
                cursor: pointer;
                opacity: 0.8;
                position: fixed;
                bottom: 23px;
                right: 28px;
                width: 280px;
            }

            /* The popup form - hidden by default */
            .form-popup {
                display: none;
                position: fixed;
                bottom: 0;
                right: 15px;
                border: 3px solid #f1f1f1;
                z-index: 9;
            }

            /* Add styles to the form container */
            .form-container {
                max-width: 300px;
                padding: 10px;
                background-color: white;
            }

            /* Full-width input fields */
            .form-container input[type=text], .form-container input[type=number] {
                width: 100%;
                padding: 15px;
                margin: 5px 0 22px 0;
                border: none;
                background: #f1f1f1;
                height: 25px;
            }

            /* When the inputs get focus, do something */
            .form-container input[type=text]:focus, .form-container input[type=number]:focus {
                background-color: #ddd;
                outline: none;
            }

            /* Set a style for the submit/login button */
            .form-container .btn {
                background-color: #04AA6D;
                color: white;
                padding: 16px 20px;
                border: none;
                cursor: pointer;
                width: 100%;
                margin-bottom:10px;
                opacity: 0.8;
            }

            /* Add a red background color to the cancel button */
            .form-container .cancel {
                background-color: red;
            }

            /* Add some hover effects to buttons */
            .form-container .btn:hover, .open-button:hover {
                opacity: 1;
            }
            .home a{
                hover: none }
        </style>    
    </head>
    <body>
        <div class="home"><a href="home">Home</a></div>
        <h1>Edit Book</h1>
        <h3 style="color: red">${requestScope.error}</h3>
        <form class="example" action="searcheditbook"  style="margin:auto;max-width:300px">
            <input type="text" placeholder="Search.." name="txt">
            <button type="submit"><i class="fa fa-search"></i></button>
        </form>
        <br>
        <button class="open-button" onclick="openForm()">Add new</button>

        <div class="form-popup" id="myForm">

            <form action='addbook' class="form-container" method='post'>
                <input hidden="" type='number' name="bid">
                Book Title<input type='text' name='bname'>
                Author<input type='text' name='author'>
                Image <input type='text' name='image'>
                Describe <input type='text' name='describe'>
                Category <select name ='category'>
                    <c:forEach items="${requestScope.listC}" var = "o">
                        <option value ="${o.cid}">${o.cname}</option>
                    </c:forEach>

                </select> 
                Quantity <input type='number' name ='quantity'>
                Publisher <select name ='publisher'>
                    <c:forEach items="${requestScope.listP}" var = "o">
                        <option value ="${o.pid}">${o.pname}</option>
                    </c:forEach>

                </select> <br>
                Price <input type='number' name='price'>
                <button type="submit" class="btn" value="insert">Add</button>
                <button type="button" class="btn cancel" onclick="closeForm()">Close</button>

            </form>
        </div>

        <script>
            function openForm() {
                document.getElementById("myForm").style.display = "block";
            }

            function closeForm() {
                document.getElementById("myForm").style.display = "none";
            }
        </script>

        <table border="1px" width="80%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Image</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${requestScope.listB}" var = "b">
                <tr>
                    <td>${b.bid}</td>
                    <td>${b.bname}</td>
                    <td><img src="${b.image}" width="80px", height="100px" alt="" /></td>
                    <td>
                        <a href="delete?bid=${b.bid}" >Delete</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="updatebook?bid=${b.bid}">Update</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <!--        <script>
                    function doDelete(bid){
                        if(confirm("are you sure delete this product)){
                            window.location=";
                        }
                    }
                </script>-->
    </body>
</html>
