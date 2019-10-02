package Factory;

import java.awt.Point;

import Aliado.Hulk;
import Entidad.Personaje;

public class FabricaConcretaHulk extends FabricaConcretaPersonajes {

	@Override
	public Personaje crearPersonaje(Point p) {
		return new Hulk(p);
	}

}
