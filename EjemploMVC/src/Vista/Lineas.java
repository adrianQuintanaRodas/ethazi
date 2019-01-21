package Vista;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;



import javax.swing.JLabel;

public class Lineas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Lineas() {
		setLayout(null);
		
		
		
		JButton btnLineaBilbaoMuskiz = new JButton("Linea Bilbao-Muskiz");
		btnLineaBilbaoMuskiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//click boton de bienvenida
				//Ocultar bienvenida
				//Mostrar productos
				MainWindow.ocultarLineas();
				MainWindow.mostrarEleccion();
				
			}
		});
		btnLineaBilbaoMuskiz.setBounds(28, 135, 158, 23);
		add(btnLineaBilbaoMuskiz);
		
		JButton btnLineaBibaoBalmaseda = new JButton("Linea Bilbao-Balmaseda");
		btnLineaBibaoBalmaseda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//click boton de bienvenida
				//Ocultar bienvenida
				//Mostrar productos
				MainWindow.ocultarLineas();
				MainWindow.mostrarEleccion();
				
			}
		});
		btnLineaBibaoBalmaseda.setBounds(28, 186, 158, 23);
		add(btnLineaBibaoBalmaseda);
		
		JButton btnLineaBilbaoplentzia = new JButton("Linea Bilbao-Plentzia");
		btnLineaBilbaoplentzia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//click boton de bienvenida
				//Ocultar bienvenida
				//Mostrar productos
				MainWindow.ocultarLineas();
				MainWindow.mostrarEleccion();
				
			}
		});
		btnLineaBilbaoplentzia.setBounds(28, 85, 158, 23);
		add(btnLineaBilbaoplentzia);
		
		JButton btnLineaBilbaodurango = new JButton("Linea Bilbao-Durango");
		btnLineaBilbaodurango.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//click boton de bienvenida
				//Ocultar bienvenida
				//Mostrar productos
				MainWindow.ocultarLineas();
				MainWindow.mostrarEleccion();
				
			}
		});
		btnLineaBilbaodurango.setBounds(28, 232, 158, 23);
		add(btnLineaBilbaodurango);
		
		JLabel lblLineas = new JLabel("LINEAS");
		lblLineas.setBounds(210, 29, 46, 14);
		add(lblLineas);

	}
}
