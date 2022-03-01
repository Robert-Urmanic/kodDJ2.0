<%-- 
    Document   : objFormJsp
    Created on : 22. 2. 2022, 15:34:36
    Author     : urman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Objednávkový formulář</h1>
        <form action="ObjService" method="post">
            <p>
                <label for="jmeno">Jmeno: </label>
                <input type="text" id="jmeno" name="jmeno" required="required" autofocus="autofocus"/>
            </p>
            <p>
                <label for="prijmení">Prijmeni: </label>
                <input type="text" id="prijmeni" name="prijmeni" required="required"/>
            </p> 
            <p>
                <input type="submit" value="Odeslat"/>
            </p>
            <p>
                <input type="reset" value="Vynulovat"/>
            </p>
        </form>
    </body>
</html>
