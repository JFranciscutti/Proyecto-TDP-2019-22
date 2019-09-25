package Mapa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entidad.Personaje;
import Herramientas.FabricaPersonajesConcreta;

public class Tienda extends JPanel {

	private static final long serialVersionUID = 1L;

	private Juego j;
	private int monedas, puntaje;
	private ImageIcon imgTienda = new ImageIcon(this.getClass().getResource("/Imagenes/Fondo/metal.png"));
	private JButton btnIronMan, btnHawkeye, btnCapAmerica, btnHulk, btnThor, btnStrange, btnSalir, btnPausa;
	private GUI g;
	private JLabel lblMonedas, lblPuntaje, totalPuntaje, totalMonedas;
	private FabricaPersonajesConcreta f;

	public Tienda(GUI graf) {
		j = graf.j;
		this.g = graf;
		JLabel fondoTienda = new JLabel(imgTienda);
		agregarBotones();
		fondoTienda.setBounds(-30, 1, 703, 98);
		g.getContentPane().add(fondoTienda);

	}

	private void agregarBotones() {

		btnIronMan = new JButton();
		btnIronMan.setBackground(Color.LIGHT_GRAY);
		btnIronMan.setOpaque(true);
		btnIronMan.setBounds(10, 10, 73, 81);
		btnIronMan
				.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/IronMan/estatico.png")));
		g.getContentPane().add(btnIronMan);

		btnHawkeye = new JButton();
		btnHawkeye.setBounds(93, 10, 73, 81);
		btnHawkeye.setOpaque(true);
		btnHawkeye.setBackground(Color.LIGHT_GRAY);
		btnHawkeye
				.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Hawkeye/estatico.png")));
		g.getContentPane().add(btnHawkeye);

		btnHulk = new JButton();
		btnHulk.setOpaque(true);
		btnHulk.setBackground(Color.LIGHT_GRAY);
		btnHulk.setBounds(175, 10, 73, 81);
		btnHulk.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Hulk/h estatico.png")));
		g.getContentPane().add(btnHulk);

		btnCapAmerica = new JButton();
		btnCapAmerica.setOpaque(true);
		btnCapAmerica.setBounds(260, 10, 73, 81);
		btnCapAmerica.setBackground(Color.LIGHT_GRAY);
		btnCapAmerica.setIcon(
				new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Cap America/estatico.png")));
		g.getContentPane().add(btnCapAmerica);

		btnCapAmerica.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				j.getGUI().getContentPane().addMouseListener(new MouseAdapter() {

					public void MouseClicked(MouseEvent e) {
						int ejeX = e.getX();
						int ejeY = e.getY();
						Celda cel = new Celda((ejeX / 92) * 92, (ejeY / 92) * 92, j.getMapa());
						Personaje a = f.crearCapAmerica(cel);
						cel.agregarEntidad(a);
						cel.setEstado(true);
					}

				});
			}
		});

		btnStrange = new JButton();
		btnStrange.setBackground(Color.LIGHT_GRAY);
		btnStrange.setOpaque(true);
		btnStrange.setBounds(350, 10, 73, 81);
		btnStrange
				.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Dr Strange/tienda.png")));
		g.getContentPane().add(btnStrange);

		btnThor = new JButton();
		btnThor.setBackground(Color.LIGHT_GRAY);
		btnThor.setOpaque(true);
		btnThor.setBounds(440, 10, 73, 81);
		btnThor.setIcon(new ImageIcon(this.getClass().getResource("/Imagenes/Sprites/Aliados/Thor/estatico.png")));
		g.getContentPane().add(btnThor);

		btnPausa = new JButton("Pausa");
		btnPausa.setBounds(804, 1, 89, 23);
		g.getContentPane().add(btnPausa);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(804, 34, 89, 23);
		g.getContentPane().add(btnSalir);

		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		lblPuntaje = new JLabel("PUNTAJE:");
		lblPuntaje.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblPuntaje.setBounds(674, 1, 57, 28);
		g.getContentPane().add(lblPuntaje);

		lblMonedas = new JLabel("MONEDAS: ");
		lblMonedas.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblMonedas.setBounds(674, 31, 73, 27);
		g.getContentPane().add(lblMonedas);

		totalPuntaje = new JLabel("" + j.getPuntos());
		totalPuntaje.setBounds(740, 1, 57, 28);
		totalPuntaje.setFont(new Font("Tahoma", Font.ITALIC, 12));
		g.getContentPane().add(totalPuntaje);

		totalMonedas = new JLabel("" + j.getMonedas());
		totalMonedas.setBounds(740, 31, 57, 28);
		totalMonedas.setFont(new Font("Tahoma", Font.ITALIC, 12));
		g.getContentPane().add(totalMonedas);

	}
}
