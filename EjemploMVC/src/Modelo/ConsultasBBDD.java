package Modelo;

public class ConsultasBBDD {

	public boolean obtenerUsuario(String usuario, String password) {
		//Metodo que recibe el usuario y la password
		//mira si existe en la BBDD y devuelve true o false
		if(usuario.equals("roman")&&password.equals("roman")) {
			return true;
		}else {
			return false;
		}
	}
}
