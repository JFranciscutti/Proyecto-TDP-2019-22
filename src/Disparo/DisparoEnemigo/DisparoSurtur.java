package Disparo.DisparoEnemigo;

import javax.swing.JLabel;

import Disparo.Disparo;

public class DisparoSurtur extends DisparoEnemigo {
	
	public DisparoSurtur(int danio, int rango, int x, int y) {
		super(danio,rango,x,y);
		grafico = new JLabel();
	}

}
