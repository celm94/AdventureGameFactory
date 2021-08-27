package Factory;

import Heroe.Heroe;
import Villano.Villano;
import Heroe.HeroeDC;
import Villano.VillanoDC;

public class DC implements AbstractFactory{
    @Override
    public Heroe getHeroe() { return new HeroeDC("Batman", "x", 5,5); }

    @Override
    public Villano getVillano() { return new VillanoDC("x","x", 5, 5); }
}
