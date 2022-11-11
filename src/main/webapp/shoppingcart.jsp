<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:pagetemplate_user>
        <jsp:attribute name="header">
             SHOPPING CART
    </jsp:attribute>

    <jsp:body>

        <p>Number of lines in cart: ${requestScope.cartsize}</p>

        <br>
        <br>

        <h3>Items in cart</h3>

        <div class="">
            <table>
                <tr>
                    <th style="font-weight: bold">Cupcakes</th>
                    <th style="font-weight: bold">Price</th>
                </tr>
                <tr>
                    <td>
                        <c:forEach var="item" items="${sessionScope.cart.cupcakeList}">
                            <p>(${item.quantity}) cupcake: ${item.toppingID} + ${item.bottomID}</p>
                            <br>
                        </c:forEach>
                    </td>
                    <td>
                        <c:forEach var="item" items="${sessionScope.cart.cupcakeList}">
                            <p>${item.cupcakePrice}</p>
                            <br>
                        </c:forEach>
                    </td>
                    <td><input type="submit" value="Delete"></td>
                </tr>
                <tr>
                    <td style="font-weight: bold">Total price</td>
                    <td>Total price</td>
                </tr>
            </table>
        </div>

        <div class="">
            <input type="submit" value="Checkout">
        </div>


    </jsp:body>

</t:pagetemplate_user>