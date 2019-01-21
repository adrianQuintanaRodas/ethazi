package Vista;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;



import javax.swing.JLabel;

public class Lineas extends JPanel {

	public JButton btnLineaBilbaoMuskiz;
	public JButton btnLineaBibaoBalmaseda;
	public JButton btnLineaBilbaoplentzia;
	public JButton btnLineaBilbaodurango;
	public JLabel lblLineas;
	/**
	 * Create the panel.
	 */
	public Lineas() {
		setLayout(null);
		
		
		
		btnLineaBilbaoMuskiz = new JButton("Linea Bilbao-Muskiz");
		btnLineaBilbaoMuskiz.setBounds(28, 135, 158, 23);
		add(btnLineaBilbaoMuskiz);
		
		btnLineaBibaoBalmaseda = new JButton("Linea Bilbao-Balmaseda");
		btnLineaBibaoBalmaseda.setBounds(28, 186, 158, 23);
		add(btnLineaBibaoBalmaseda);
		
		btnLineaBilbaoplentzia = new JButton("Linea Bilbao-Plentzia");
		btnLineaBilbaoplentzia.setBounds(28, 85, 158, 23);
		add(btnLineaBilbaoplentzia);
		
		btnLineaBilbaodurango = new JButton("Linea Bilbao-Durango");
		btnLineaBilbaodurango.setBounds(28, 232, 158, 23);
		add(btnLineaBilbaodurango);
		
		lblLineas = new JLabel("LINEAS");
		lblLineas.setBounds(210, 29, 46, 14);
		add(lblLineas);

	}
}
