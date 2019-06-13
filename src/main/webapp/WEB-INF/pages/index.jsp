<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="stylesheet" href="style.css" />
        <!--[if lt IE 9]>
        <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
        <title>Abid Anjum - Portfolio</title>
    </head>
    
    <!--[if IE 6 ]><body class="ie6 old_ie"><![endif]-->
    <!--[if IE 7 ]><body class="ie7 old_ie"><![endif]-->
    <!--[if IE 8 ]><body class="ie8"><![endif]-->
    <!--[if IE 9 ]><body class="ie9"><![endif]-->
    <!--[if !IE]><!--><body><!--<![endif]-->
        <div id="main_wrapper">
                     
           <%@include file="header.jsp" %>
            
            <div id="banner_image">
                <div id="banner_description">
                    Reflections on my holiday in the United States...
                    <a href="#" class="red_button">See article <img src="images/small_arrow.png" alt="" /></a>
                </div>
            </div>
            
        	<%@include file="body.jsp" %>
            
           <%@include file="footer.jsp" %>

        </div>
    </body>
</html>
