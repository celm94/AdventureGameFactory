package Factory;

import Heroe.Heroe;
import Villano.Villano;

public class Marvel implements AbstractFactory{

    @Override
    public Heroe getHeroe() {
        return null;
    }

    @Override
    public Villano getVillano() {
        return null;
    }
}
