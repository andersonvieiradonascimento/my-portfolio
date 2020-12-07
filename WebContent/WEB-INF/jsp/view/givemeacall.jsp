<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="js/menu-toggle.js"></script>
  <link rel="stylesheet" href="css/style.css" type="text/css">
  <link rel="stylesheet" href="css/contact.css" type="text/css">
  <title>Anderson's Portfolio</title>
</head>
<body>
<nav class="menu">
  <ul class="active">
    <li><a href="<c:url value="/welcome"></c:url>">Home</a></li>
    <li><a href="<c:url value="/welcome"><c:param name="action" value="who" /></c:url>">Who Am I?</a></li>
    <li><a href="<c:url value="/welcome"><c:param name="action" value="job" /></c:url>">Projects</a></li>
    <li class="current-item"><a href="#">Contact</a></li>
  </ul>
  <a class="toggle-nav" href="#">
    <b style="font-size: 20px">MENU</b><br/>
    &#9776;
  </a>
</nav>
<div id="content-wrap">
</div>
<footer id="footer">
  <h5>Web page by Anderson Vieira do Nascimento &copy;</h5>
</footer>
</body>
</html>