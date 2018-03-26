<%-- 
    Document   : index
    Created on : 24-Mar-2018, 10:32:51 PM
    Author     : dhruvinparikh.byethost24.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            div{
                border: 2px solid black;
                width:  800px;
                padding: 20px;
            }
            h3{
                background-color: lightblue;
            }
            input[type=text]{
                margin-left: 60px;
            }
            label{
                float:left;
                width:9em;
                text-align: right;
            }
            #button{
                margin-left: 20em;
                margin-top: 1em;
                background: blue;
                color: white;
            }
        </style>
    </head>
    <body>
        <form action="MortgageCalcServlet" method="post">
            <div>
                <h3>Please Enter following information:</h3>
                <label>Mortgage Amount :</label><input type="text" name="mortgage_amount" id="mortgage_amount"><br/><br/>
                <label>Interest Rate:</label><input type="text" name="interest_rate" id="interest_rate"><br/><br/>
                <label>Interest Term:</label><input type="text" name="years" id ="years">Years 
                <input type="text" value="0" name ="months" id="months">Months<br/><br/>
            </div>
            <input type="reset" value="Reset" id="button"> 
            <input type="submit" value="Submit" id="button">
        </form>
            
    </body>
</html>
