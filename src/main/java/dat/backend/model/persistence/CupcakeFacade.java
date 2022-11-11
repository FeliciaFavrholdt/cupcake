package dat.backend.model.persistence;

import dat.backend.model.entities.Bottom;
import dat.backend.model.entities.Topping;

public class CupcakeFacade {
    public static Topping getToppingByID(int toppingID) {
        return CupcakeMapper.getToppingByID(toppingID);
    }

    public static Bottom getBottomByID(int bottomID) {
        return CupcakeMapper.getBottomID(bottomID);
    }
}
