package prevencionDeRiesgo;

import java.util.Scanner;

public class Menu {
	public void menuPrincipal(){

		Scanner leer = new Scanner(System.in);

		int opcion;



		do {

			System.out.println("*****************************************************");
			System.out.println("* System Asesoria y Consultoria                     *");
			System.out.println("* Developed Sapo SYSTEM Ltda.                       *");
			System.out.println("* Grupo 2 - Bootcamp Java Awakelab.                 *");
			System.out.println("* Credits 2021 - Grupo2                           . *");
			System.out.println("* Pedro Baez / Daniela Herrera/ Dandaly Morales   . *");
			System.out.println("*****************************************************");

			System.out.println(
					"""
                            ¿Que desea hacer?\s
                            1) Almacenar Cliente\s
                            2) Almacenar Profesional\s
                            3) Almacenar Administrativo\s
                            4) Almacenar Capacitación\s
                            5) Eliminar Usuario\s
                            6) Listar Usuarios\s
                            7) Listar Usuarios por tipo\s
                            8) Listar Capacitaciones\s
                            9) Salir""");

			System.out.println();
			System.out.print("Ingrese Opcion: ");
			opcion =  leer.nextInt();

			leer.nextLine();

			switch (opcion) {

				case 1:
					System.out.println("No se ha implementado este metodo");
					break;
				case 2:
					Profesional profesional = new Profesional();
					profesional.formulario();

					profesional.toString();


					break;
				case 3:

					//Instancio la clase
					Administrativo administrativo = new Administrativo();
					//utilizo le metodo formulario de la clase Administrativo el cual hereda de la clase
					//Padre "Usuario" el mismo metodo y toma los atributos con el metodo super de la clase padre
					administrativo.formulario();
					// Seteo los datos obteniendo como quedaron los atributos en cada clase segun herencia

					administrativo.setRun(administrativo.run);
					administrativo.setNombre(administrativo.nombre);
					administrativo.setFechaDeNacimiento(administrativo.fechaDeNacimiento);
					administrativo.setArea(administrativo.area);
					administrativo.setExperienciaPrevia(administrativo.experienciaPrevia);

					// llamo la clase contenedor para guardar los datos ya almacenado en la instancia administrativo

					Contenedor contenedor = new Contenedor();

					//guardo en la variable contador el total de usuarios existentes

					int contador = Contenedor.listaUsuarios.size();

					//llamo a la clase almacenarAdministrativo para que guarde la lista <<listaUsuarios>> en la <<Clase Contenedor>>

					contenedor.almacenarAdministrativo(administrativo);

					//utilizo la variable contenedor y la comparo nuevamente el tamaño de la lista ya actualizada
					if (Contenedor.listaUsuarios.size()>contador){

						System.out.println("Datos de Administrativos Ingresados Correctamente");
					}

					System.out.println("-------------- Administrativo.toString();  ---------------");
					System.out.println(administrativo.toString());
					System.out.println("-------------- analizarUsuario.toString();  ---------------");
					administrativo.analizarUsuario();

					break;
				case 4:
					System.out.println("No se ha implementado este metodo");
					break;
				case 5:
					System.out.println("No se ha implementado este metodo");
					break;
				case 6:

					Contenedor listaContenedor = new Contenedor();

					listaContenedor.listaUsuarios();

					break;
				case 7:

					Contenedor listaContenedorTipo = new Contenedor();

					listaContenedorTipo.listaUsuariosTipo();

					break;
				case 8:
					System.out.println("No se ha implementado este metodo");
					break;
				case 9:
					System.out.println("Has salido del Sistema");
					break;
				default:
					System.out.println("Dato no valido");

			}
		} while (opcion  > 0 && opcion  < 9);
	}
}