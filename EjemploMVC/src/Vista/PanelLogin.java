package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class PanelLogin extends JPanel {

	public JTextField tFLoginUsuario;
	public JPasswordField pFLoginPassword;
	public JButton btnLoginAceptar;
	public JLabel lblPanelError;
	/**
	 * Create the panel.
	 */
	public PanelLogin() {
		setLayout(null);
		
		JLabel lblLoginUsuario = new JLabel("Usuario");
		lblLoginUsuario.setBounds(55, 94, 46, 14);
		add(lblLoginUsuario);
		
		JLabel lblLoginPassword = new JLabel("Password");
		lblLoginPassword.setBounds(55, 144, 46, 14);
		add(lblLoginPassword);
		
		tFLoginUsuario = new JTextField();
		tFLoginUsuario.setBounds(114, 91, 86, 20);
		add(tFLoginUsuario);
		tFLoginUsuario.setColumns(10);
		
		pFLoginPassword = new JPasswordField();
		pFLoginPassword.setBounds(114, 141, 86, 20);
		add(pFLoginPassword);
		
		btnLoginAceptar = new JButton("Aceptar");
		btnLoginAceptar.setBounds(114, 191, 89, 23);
		add(btnLoginAceptar);
		
		lblPanelError = new JLabel("");
		lblPanelError.setBounds(277, 94, 46, 14);
		add(lblPanelError);

	}
}
