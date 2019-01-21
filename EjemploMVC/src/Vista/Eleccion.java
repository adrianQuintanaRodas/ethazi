package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;




public class Eleccion extends JPanel {

	public JButton btnlineas;
	public JButton btnComprar;
	public JComboBox comboBox = new JComboBox();
	public JComboBox comboBox_1 = new JComboBox();
	public JRadioButton rdbtnIda;
	public JRadioButton rdbtnIdaYVuelta;
	/**
	 * Create the panel.
	 */
	public Eleccion() {
		setLayout(null);
		
		
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Origen"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(46, 87, 70, 20);
		add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Destino"}));
		comboBox_1.setBounds(46, 165, 70, 20);
		add(comboBox_1);
		
		rdbtnIda = new JRadioButton("IDA");
		rdbtnIda.setSelected(true);
		rdbtnIda.setBounds(46, 211, 109, 23);
		add(rdbtnIda);
		
		rdbtnIdaYVuelta = new JRadioButton("IDA Y VUELTA");
		rdbtnIdaYVuelta.setBounds(46, 249, 109, 23);
		add(rdbtnIdaYVuelta);

		
		btnlineas = new JButton("LINEAS");
		btnlineas.setBounds(157, 32, 89, 23);
		add(btnlineas);
		
		btnComprar = new JButton("COMPRAR");
		btnComprar.setBounds(221, 130, 89, 23);
		add(btnComprar);
		
		
		
				
			
		}
}
