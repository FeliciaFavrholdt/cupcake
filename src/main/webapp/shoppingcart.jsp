<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:pagetemplate_user>
        <jsp:attribute name="header">
             SHOPPING CART
    </jsp:attribute>

    <jsp:body>

        <p>Number of lines in the shoppingcart: ${requestScope.cartsize}</p>

        <c:forEach var="item" items="${sessionScope.cart.cupcakeList}">
            Topping: ${item.toppingID} Bottom: ${item.bottomID} Amount: ${item.quantity}
        </c:forEach>



    </jsp:body>

</t:pagetemplate_user>