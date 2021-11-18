package prevencionDeRiesgo;

public class Principal {

	public static void main(String[] args) {
	
		Usuario usuario = new Usuario();
		
	//	usuario.setNombre(usuario.getNombre());
		//usuario.setFechaDeNacimiento(usuario.getFechaDeNacimiento());
		//usuario.setRun(usuario.getRun());
	//	System.out.println(usuario.mostrarEdad());
		
		Cliente cliente = new Cliente();
		
		//cliente.setFechaDeNacimiento(cliente.getFechaDeNacimiento());
	//	cliente.setNombre(cliente.getNombre());
	//	cliente.setRun(cliente.getRun());
	//	cliente.setRut(cliente.getRut());
	//	cliente.setNombres(cliente.getNombres());
		cliente.setApellidos(cliente.getApellidos());
		cliente.setTelefono(cliente.getTelefono());
		cliente.setAfp(cliente.getAfp());
		cliente.setSistemaDeSalud(cliente.getSistemaDeSalud());
		cliente.setDireccion(cliente.getDireccion());
		cliente.setComuna(cliente.getComuna());
		cliente.setEdad(cliente.getEdad());
		
		System.out.println(cliente.toString());
		
		Contenedor contenedor = new Contenedor();
		
		int contador1 = contenedor.listaUsuario.size();
		
		contenedor.agregarUsuario(cliente);
		
		int contador2 = contenedor.listaUsuario.size();
		
		if (contador2 > contador1 )
		{
			
			System.out.println("Felicitaciones Datos de Usuario tipo Cliente ingresaros correctamente");
			
			
		}
		
		Profesional profesional = new Profesional();
		contenedor.agregarUsuario(profesional);
		profesional.setTituloProfesional(profesional.getTituloProfesional());
		profesional.setFechaIngreso(profesional.getFechaIngreso());
	
		/*Administrativo admin = new Administrativo();
		admin.setArea(admin.getArea());
		admin.setExperienciaPrevia(admin.getExperienciaPrevia());
		*/
		
		Capacitacion cap = new Capacitacion();
	//	cap.setIdentificador(cap.getIdentificador());
	//	cap.setRutCliente(cap.getRutCliente());
	//	cap.setDiaDeLaSemana(cap.getDiaDeLaSemana());
	//	cap.setHoraCapacitacion(cap.getHoraCapacitacion());
	//	cap.setLugarCapacitacion(cap.getLugarCapacitacion());
		//NO FUNCIONA	cap.setDuracionCapacitacion(cap.getDuracionCapacitacion());
		//cap.setCantidadDeAsistentes(cap.getCantidadDeAsistentes());
		
		Accidente acc = new Accidente();
	//Noingresado	acc.setIdentificadorAccidente(acc.getIdentificadorAccidente());
	//	acc.setRutCliente(acc.getRutCliente());
	//NoIngresado	acc.setDiaAccidente(acc.getDiaAccidente());
	//NoIngresado	acc.setHoraAccidente(acc.getHoraAccidente());
	//	acc.setLugarAccidente(acc.getLugarAccidente());
	//	acc.setOrigenAccidente(acc.getOrigenAccidente());
	//	acc.setConsecuencias(acc.getOrigenAccidente());
		
		
		Visita visita = new Visita();
	//Noingresado visita.setIdentificadorVisita(visita.getIdentificadorVisita());
	//	visita.setRutCliente(visita.getRutCliente());
	//NoIngresado	visita.setDiaVisita(visita.getDiaVisita());
	//NoIngresado	visita.setHoraVisita(visita.getHoraVisita());
	//	visita.setLugar(visita.getLugar());
	//Nofuncionabien	visita.setComentarios(visita.getComentarios());
		
		Revision rev = new Revision();
	//	rev.setIdentificadorRevision(rev.getIdentificadorRevision());
	//NoIngresado rev.setIdentificadorVisita(rev.getIdentificadorVisita());
	//	rev.setNombreRevision(rev.getNombreRevision());
	
		//rev.setDetalleRevision(rev.getDetalleRevision());
		//rev.setEstadoRevision(rev.getEstadoRevision());
	}
	
		
}
