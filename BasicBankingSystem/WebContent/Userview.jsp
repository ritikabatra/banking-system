<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.banking.Controller.*" %>
<%@ page import="com.banking.Model.*" %>

<%@ page import="java.util.List" %>
<%
List<AddUser> UserBean=(List<AddUser>) request.getAttribute("UserList");
%>

<!DOCTYPE html>
<html>
<head>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 50%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}


#customers tr:hover {background-color: #ddd;}
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



#customers th {
  padding-top: 6px;
  padding-bottom: 5px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
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
</style>
</head>
<body>
<div class="bg-img">
<button class="btn"><a href="Home.jsp">Home</a></button>
<table id="customers">
  <tr>
    <th>AccountId</th>
    <th>Name</th>
    <th>Email</th>
    <th>Credit</th>
    <th>View</th>
  </tr>
  <% 
    for(AddUser bean : UserBean)
    {
    	String ViewUserAction="ViewUserAction?AccountId="+bean.getAccountId();
    	%>
      <tr>
      <td><%=bean.getAccountId()%></td>
        <td><%=bean.getName()%></td>
        <td><%=bean.getEmail()%></td>
        <td><%=bean.getCredit()%></td>
        <td><a href="<%=ViewUserAction%>">View</a></td>
      </tr>
      <%
    }
      %>
    
  
  </table>

</body>
</html>
