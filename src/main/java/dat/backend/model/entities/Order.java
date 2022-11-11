package dat.backend.model.entities;

import java.sql.Timestamp;

public class Order {
    private int orderID;
    private int customerID;
    private Timestamp created;

    public Order(int orderID, int customerID, Timestamp created) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.created = created;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customerID=" + customerID +
                ", created=" + created +
                '}';
    }
}
