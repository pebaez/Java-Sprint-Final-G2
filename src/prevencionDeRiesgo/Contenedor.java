package prevencionDeRiesgo;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

	List<Usuario> listaUsuario = new ArrayList <>();
	List<Capacitacion> listaCapacitacion = new ArrayList<>();

	public String mostrarUsuario() {
		return listaUsuario.toString();
		
		
	}

	public boolean agregarUsuario(Usuario usuario) {
			 boolean agregado = false;
			 boolean validar = false;
			 if(listaUsuario.size()>0) {
				 validar = true;
			 }
			 listaUsuario.remove(usuario);
			
			 return agregado;
	}
	
	public void agregarCliente(Cliente cliente) {
		
		listaUsuario.add(cliente);
	}
public void agregarProfesional(Profesional profesional) {
		
		listaUsuario.add(profesional);
	}
}
