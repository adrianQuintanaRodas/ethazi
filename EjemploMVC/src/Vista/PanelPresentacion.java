package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPresentacion extends JPanel {

	public JButton btnPresentacionTermibus;
	
	public PanelPresentacion() {
		setLayout(null);
		
		btnPresentacionTermibus = new JButton("Termibus");
		btnPresentacionTermibus.setBounds(163, 185, 89, 23);
		add(btnPresentacionTermibus);

	}
}
