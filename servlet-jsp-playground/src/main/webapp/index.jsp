<html>
<head>
<link rel="stylesheet" href="<%=application.getContextPath()%>/css/style.css">
</head>
<body>
<div class="container">
     <%@include file="menu.jsp" %>
<h2>Hello World!</h2>
<!-- <jsp:include page="menu.jsp"/> -->
<form action="<%=application.getContextPath()%>/third" method="post">
    <div>
        Name: <input type="text" placeholder="Enter your message" name="message"/>
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>

</div>
</body>
</html>
