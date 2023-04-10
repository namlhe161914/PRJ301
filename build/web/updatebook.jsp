<%-- 
    Document   : updatebook
    Created on : Oct 29, 2022, 10:01:05 PM
    Author     : lenam
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
            }
            * {
                box-sizing: border-box;
            }


            .form-container {
                max-width: 300px;
                padding: 10px;
                background-color: white;
            }
            .form-popup{
                padding-left: 550px;
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
        </style>  
    </head>
    <body>


        <div class="form-popup" id="myForm">

            <form action="updatebook" class="form-container" method="post">
                
                ID <input type='text' readonly name='bid' value="${listB.bid}">
                Book Title<input type='text' name='bname' value="${listB.bname}">
                Author<input type='text' name='author' value="${listB.author}">
                Image <input type='text' name='image' value="${listB.image}">
                Describe <input type='text' name='describe' value="${listB.describe}">
                Category <select name ='category'>
                    
                    <option hidden="" value ="${listB.category.cid}">${listB.category.cname}</option>
                    
                    <c:forEach items="${requestScope.listC}" var = "o">
                        
                        <option value ="${o.cid}">${o.cname}</option>
                    </c:forEach>    
                </select><br>
                Quantity <input type='number' name ='quantity' value="${listB.quantity}">
                Publisher <select name ='publisher'>
                    <option hidden=""value ="${listB.publisher.pid}">${listB.publisher.pname}</option>
                    <c:forEach items="${requestScope.listP}" var = "o">
                        <option value ="${o.pid}">${o.pname}</option>
                    </c:forEach>

                </select> <br>
                Price <input type='number' name='price' value="${listB.price}">
                <button type="submit" class="btn" value="update">Update</button>

            </form>
        </div>


    </body>
</html>
