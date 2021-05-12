<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.banking.Controller.*" %>
<%@ page import="com.banking.Model.*" %>
   

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
  background-image: url("images/home.png");

  min-height: 700px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin: 60px;
  max-width: 400px;
  padding: 20px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=email],input[type=number]{
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus,input[type=email]:focus,input[type=number]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>
</head>
<body>
<%
AddUser bean = (AddUser)request.getAttribute("AddUser");
%>

<button class="btn"><a href="Home.jsp">Home</a></button>
<div class="bg-img">
  <div class="container">
    <h1>User Details</h1>
    <label for="Id"><b></b></label>
     <input type="hidden" placeholder="Enter Name" name="Id" value='<%=bean.getAccountId() %>' readonly>
    
    <label for="name"><b>Name</b></label>
    <input type="text" value='<%=bean.getName()%>' readonly>
    <label for="email"><b>Email</b></label><br><br>
    <input type="email" name="uemail" value='<%=bean.getEmail() %>' readonly >
      <label for="credit"><b>Credit</b></label>
    <input type="number" name="uamount" value='<%=bean.getCredit() %>' readonly>
<button class="btn"><a href="Viewallname">Transfer To</a></button>    
  </div>

</div>
</body>
</html>
