package dat.backend.model.entities;

public class Cupcake {
    private Topping topping;
    private Bottom bottom;
    private int toppingID;
    private int bottomID;
    private int quantity;
    private double cupcakePrice;

    //constructor
    public Cupcake(int toppingID, int bottomID, int quantity) {
        this.toppingID = toppingID;
        this.bottomID = bottomID;
        this.quantity = quantity;
    }

    //overloaded constructor
    public Cupcake(Topping topping, Bottom bottom, int toppingID, int bottomID, int quantity, double totalPrice) {
        this.topping = topping;
        this.bottom = bottom;
        this.toppingID = toppingID;
        this.bottomID = bottomID;
        this.quantity = quantity;
        this.cupcakePrice = cupcakePrice;
    }

    public int getToppingID() {
        return toppingID;
    }

    public void setToppingID(int toppingID) {
        this.toppingID = toppingID;
    }

    public int getBottomID() {
        return bottomID;
    }

    public void setBottomID(int bottomID) {
        this.bottomID = bottomID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public Bottom getBottom() {
        return bottom;
    }

    public void setBottom(Bottom bottom) {
        this.bottom = bottom;
    }

    public double getCupcakePrice() {
        return cupcakePrice;
    }

    public void setCupcakePrice(double cupcakePrice) {
        this.cupcakePrice = cupcakePrice;
    }

    @Override
    public String toString() {
        return "Cupcake{" +
                "topping=" + topping +
                ", bottom=" + bottom +
                ", toppingID=" + toppingID +
                ", bottomID=" + bottomID +
                ", quantity=" + quantity +
                ", cupcakePrice=" + cupcakePrice +
                '}';
    }
}
