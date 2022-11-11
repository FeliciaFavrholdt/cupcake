package dat.backend.model.entities;

public class Cupcake {

    private int toppingID;
    private int bottomID;
    private int quantity;

    public Cupcake(int toppingID, int bottomID, int quantity) {
        this.toppingID = toppingID;
        this.bottomID = bottomID;
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "Cupcake{" +
                "toppingID=" + toppingID +
                ", bottomID=" + bottomID +
                ", quantity=" + quantity +
                '}';
    }
}
