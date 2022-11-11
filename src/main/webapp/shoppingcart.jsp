<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:pagetemplate_user>
        <jsp:attribute name="header">
             SHOPPING CART
    </jsp:attribute>

    <jsp:body>

        Number of lines in cart: ${requestScope.cartsize}


    </jsp:body>

</t:pagetemplate_user>