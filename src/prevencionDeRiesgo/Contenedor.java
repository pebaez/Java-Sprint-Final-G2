package prevencionDeRiesgo;

import java.util.*;

public class Contenedor extends Usuario {

	Scanner leer = new Scanner(System.in);

	public static ArrayList<Asesoria> listaUsuario = new ArrayList <Asesoria>();
	public static ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();

	public String mostrarUsuario() {
		return listaUsuario.toString();
		
		
	}

	public void listaUsuarios(){

		System.out.println("-------LISTADO USUARIOS------------");

		Iterator<Asesoria> it = listaUsuario.iterator();

		Usuario tmp;

		while(it.hasNext())
		{
			tmp = (Usuario) it.next();
			System.out.println("Usuario: " + tmp.getRun() + ". Nombre: " + tmp.nombre + "  Fecha Nacimiento " + tmp.fechaDeNacimiento);
		}


		System.out.println("---------OTRA FORMA-------------");


		for(Asesoria p1: listaUsuario){
			Usuario p2 = (Usuario) p1;
			if (p2.getRun()>0){

				System.out.println(p2.nombre + p2.run + p2.fechaDeNacimiento);

				System.out.println("------------------------------------");

				System.out.println(p2.getRun() + p2.getNombre() + p2.getFechaDeNacimiento());


			}
		}




		//    listaUsuarios.parallelStream().forEachOrdered(System.out::println);
//

	}

	public void listaUsuariosTipo(){

		try{

			if (listaUsuario.size()>0)
			{

				System.out.println("-------------------------------------------");

				System.out.println("+----------+----------------------------------");
				System.out.println("|** Seleccione 1.- Cliente 2.-Profesional 3.- Administrativo ");
				System.out.print("|Indique el numero del tipo de Usuario :");
				int tipoUsuario =  leer.nextInt();
				leer.nextLine();
				System.out.println("+----------+----------------------------------");

				if (tipoUsuario == 1 || tipoUsuario == 2 || tipoUsuario == 3  )
				{

					if (tipoUsuario==1){

						Iterator<Asesoria> it = listaUsuario.iterator();

						Cliente tmp;

						while(it.hasNext())
						{
							tmp = (Cliente) it.next();
							System.out.println("Rut Cliente: " + tmp.getRun() + ". Nombre: " + tmp.nombre + "  Fecha Nacimiento " + tmp.fechaDeNacimiento);
						}

					}

					if (tipoUsuario==2){

						Iterator<Asesoria> it = listaUsuario.iterator();

						Profesional tmp;

						while(it.hasNext())
						{
							tmp = (Profesional) it.next();
							System.out.println("Rut Profesional: " + tmp.getRun() + ". Nombre Profesional: " +
											tmp.getNombre() + "  Fecha Nacimiento " + tmp.getFechaDeNacimiento() +
											"Titulo Profesional =" + tmp.getTituloProfesional() + " Fecha de Ingreso =" +
									 		tmp.getFechaIngreso());
						}

					}

					if (tipoUsuario==3){

						Iterator<Asesoria> it = listaUsuario.iterator();

						Administrativo tmp;

						while(it.hasNext())
						{
							tmp = (Administrativo) it.next();
							System.out.println("Rut Administrativo: " + tmp.getRun() + ". Nombre: " + tmp.getNombre() + "  Fecha Nacimiento " + tmp.getFechaDeNacimiento());
						}

					}

				}

			}

		}catch (InputMismatchException e){

			System.out.println(e.getMessage());

		}


	}

	
	public void agregarCliente(Cliente cliente) {
		
		listaUsuario.add(cliente);
	}

	public void agregarProfesional(Profesional profesional) {
		
		listaUsuario.add(profesional);
	}

	public void agregarAdministrativo(Administrativo administrativo) {

		listaUsuario.add(administrativo);

	}


}
