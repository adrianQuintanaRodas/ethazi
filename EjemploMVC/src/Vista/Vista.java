package Vista;

import javax.swing.JPanel;

public class Vista {

	public Ventana ventana = new Ventana();
	public PanelLogin panelLogin = new PanelLogin();
	public PanelPresentacion panelPresentacion = new PanelPresentacion();
	
	public Vista() {
		mostrarPanel(panelPresentacion);
	}
	
	//Metodo que recibe un panel
	//y lo muestra en el JFrame ventana
	public void mostrarPanel(JPanel panel) {
		ventana.setContentPane(panel);
		ventana.setVisible(true);
	}
}
