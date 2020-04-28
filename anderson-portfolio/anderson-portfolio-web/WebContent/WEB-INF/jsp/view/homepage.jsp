<%@ page session="false" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Anderson's Portfolio</title>
  </head>
  <body>
    <h1>Homepage</h1>
    
    <!-- Goes to Who Am I page -->
    <a href="<c:url value="/welcome"><c:param name="action" value="who" /></c:url>">
    	<button>Who Am I?</button>    
    </a>
    
    <!-- Goes to Projects Page -->
    <a href="<c:url value="/welcome"><c:param name="action" value="job" /></c:url>">
    	<button>Projects</button>
    </a>
    
    <!-- Goes to Contact Page -->
    <a href="<c:url value="/welcome"><c:param name="action" value="pho" /></c:url>">
    	<button>Give me a call!</button>
    </a>

  </body>
</html>
