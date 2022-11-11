<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" isErrorPage="false" %>

<t:pagetemplate_user>
        <jsp:attribute name="header">
             ORDER CONFIRMATION
    </jsp:attribute>

    <jsp:body>

        <h3>Your order</h3>

        <div class="">
        <table>
        <tr>
            <th style="font-weight: bold">Order id</th>
            <th style="font-weight: bold">Customer id</th>
            <th style="font-weight: bold">Quantity</th>
        </tr>
        <c:forEach var="item" items="${sessionScope.cart.orderList}">
            <tr>
                <td><p>(${item.quantity}) cupcake: ${item.toppingID} + ${item.bottomID}</p></td>
                <td><p>${item.cupcakePrice}</p></td>
            </tr>
        </c:forEach>

        <p>Your order has been confirmed!</p>
        <p>You can now pick up your order at Olsker Cupcakes within 2 hours.</p>

    </jsp:body>

</t:pagetemplate_user>