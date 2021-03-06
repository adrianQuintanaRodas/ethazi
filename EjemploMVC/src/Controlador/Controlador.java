package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Vista vista, Modelo modelo) {
		this.vista=vista;
		this.modelo=modelo;
		InitializeEvents();
	}
	
	private void InitializeEvents() {
		//panel eleccion y va a lineas
		vista.eleccion.btnlineas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.lineas);
			}
		});
		//panel lineas y va a eleccion
		vista.lineas.btnLineaBibaoBalmaseda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//click boton de bienvenida
				//Ocultar bienvenida
				//Mostrar productos
				vista.mostrarPanel(vista.eleccion);
			}
		});
		
		vista.lineas.btnLineaBilbaoplentzia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//click boton de bienvenida
				//Ocultar bienvenida
				//Mostrar productos
				vista.mostrarPanel(vista.eleccion);
				
			}
		});
		vista.lineas.btnLineaBilbaodurango.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//click boton de bienvenida
				//Ocultar bienvenida
				//Mostrar productos
				vista.mostrarPanel(vista.eleccion);
				
			}
		});
		vista.lineas.btnLineaBilbaoMuskiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//click boton de bienvenida
				//Ocultar bienvenida
				//Mostrar productos
				vista.mostrarPanel(vista.eleccion);
				
			}
		});

		vista.panelPresentacion.btnPresentacionTermibus.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				//Cambia el panel de presentacion a Login
				vista.mostrarPanel(vista.panelLogin);
			}
		});
		
		vista.panelLogin.btnLoginAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Leer el usuario y password que han introducido en PanelLogin
				//Ir a la BBDD y ver si existe ese usuario
				//Si no existe, borrar datos y dar mensaje de error
				//si existe cambiar el Panel a PanelLineas
				
				String usuario = vista.panelLogin.tFLoginUsuario.getText();
				String password = vista.panelLogin.pFLoginPassword.getText();
				
				//Llamar a una metodo del modelo con usuario y password
				//y que me devuelva un boolean
				Boolean existeusuario = modelo.consultasBBDD.obtenerUsuario(usuario, password);
				
				if (existeusuario == false){
					vista.panelLogin.lblPanelError.setText("ERROR!!!!!!");
				}else {
					vista.mostrarPanel(vista.eleccion);
				}
				
				
				
			}
		});
		
	}
}
