<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.banking.Controller.*" %>
<%@ page import="com.banking.Model.*" %>
   <%@ page import="java.util.List" %>
<%
List<AddUser> UserBean=(List<AddUser>) request.getAttribute("AddUser1");
%>
   
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function myBalance1() {
	var amount=document.forms["transferto"]["amount"];
	  if (amount.value<0) {
	    alert("Entered amount should be positive");
	    return false;
	  }
	  var sname=document.forms["transferto"]["Sname"];
		  var rname=document.forms["transferto"]["Rname"];
	  if(sname.value==rname.value)
		  {
		  alert("Sender and recceiver should be diiferent");
		  return false;
		  }
return true;
}



</script>
<title>Home Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.btn {
  border: 2px solid black;
  background-color: white;
  color: black;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
}
.success {
  border-color: #04AA6D;
  color: green;
}

.success:hover {
  background-color: #04AA6D;
  color: white;
}

/* Blue */
.info {
  border-color: #2196F3;
  color: dodgerblue;
}

.info:hover {
  background: #2196F3;
  color: white;
}

/* Orange */
.warning {
  border-color: #ff9800;
  color: orange;
}

.warning:hover {
  background: #ff9800;
  color: white;
}
.danger {
  border-color: #f44336;
  color: red;
}

.danger:hover {
  background: #f44336;
  color: white;
}



body, html {
  height: 100%;
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-image {
  /* The image used */
  background-image: url("images/home.png");
  
  /* Add the blur effect */
  filter: blur(10px);
  -webkit-filter: blur(8px);
  
  /* Full height */
  height: 90%; 
  
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

/* Position text in the middle of the page/image */
.bg-text {
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
  color: white;
  font-weight: bold;
  border: 3px solid #f1f1f1;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
  width: 80%;
  padding: 20px;
  text-align: center;
}
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
.btn1
{
background-color:#04AA6D;
color:white;
padding:10px 12px;
border:none;
cursor:pointer;
width:40%;
opacity:0.9;
}
.btn1:hover{
opacity:1;
}
.container {
  width: 400px;
  clear: both;
  position:center;
}

.container input {
  width: 70%;
  clear: both;
}
</style>
</head>
<body>
<div class="bg-image"></div>
<button class="btn"><a href="Home.jsp">Home</a></button>
<div class="bg-text">
<form action="Transfer" name="transferto" onsubmit="return myBalance1()">
<div class="form-group">
<br>
 <div class="col-sm-8">
 Sender Name&nbsp;&nbsp;&nbsp;
<select name="Sname">
<%
for(AddUser bean : UserBean)
{%>
	<option><%=bean.getName()%></option>
<% }%>
</select>
<br>
<br>



 Receiver Name&nbsp;&nbsp;&nbsp;
<select name="Rname">
<%
for(AddUser bean : UserBean)
{%>
	<option><%=bean.getName()%></option>
<% }%>
</select>
<br>
<br>
 </div>
 </div>
     <label for="credit"><b>Credit&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
    <input type="number"  placeholder="Enter Amount" name="amount" required>
    <br>
    <br>
    <button class="btn1">Transfer</button>
    <br>
    <br>
    <button class="btn1"><a href="ViewUserServlet">Back</a></button>
</form>
</div>
</body>
</html>
