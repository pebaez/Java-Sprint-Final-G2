package prevencionDeRiesgo;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {
	public void menuPrincipal(){

		Scanner leer = new Scanner(System.in);


		/***
		 *  Esta variable contenedor se conecta con la clase CONTENEDOR para ejecutar los metodos para registrar
		 *  en la lista usuarios y capacitacion
		 */

		Contenedor contenedor = new Contenedor();

		int contadorLista1 = 0;

		int contadorLista2 = 0;

		int opcion=0;

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

					Cliente cliente = new Cliente();

					cliente.setFechaDeNacimiento(cliente.getFechaDeNacimiento());
					cliente.setNombre(cliente.getNombre());
					cliente.setRun(cliente.getRun());
					cliente.setRut(cliente.getRut());
					cliente.setNombres(cliente.getNombres());
					cliente.setApellidos(cliente.getApellidos());
					cliente.setTelefono(cliente.getTelefono());
					cliente.setAfp(cliente.getAfp());
					cliente.setSistemaDeSalud(cliente.getSistemaDeSalud());
					cliente.setDireccion(cliente.getDireccion());
					cliente.setComuna(cliente.getComuna());
					cliente.setEdad(cliente.getEdad());

					contadorLista1 = contenedor.listaUsuario.size();

					contenedor.agregarCliente(cliente);

					contadorLista2 = contenedor.listaUsuario.size();

					if (contadorLista2 > contadorLista1 ) {

						System.out.println("Felicitaciones Datos de Usuario tipo Cliente ingresado correctamente");

					}




						break;
				case 2:

					Profesional profesional = new Profesional();


					/***
					 * Los tres primeros datos corresponden a la clase padre USUARIO  la cual hereda los atributos
					 * nombre, run y fecha de nacimiento a la clase hija PROFESIONAL
					 */
					profesional.setRun(profesional.getRun());

					profesional.setNombre(profesional.getNombre());

					profesional.setFechaDeNacimiento(profesional.getFechaDeNacimiento());

					profesional.setTituloProfesional(profesional.getTituloProfesional());

					profesional.setFechaIngreso(profesional.getFechaIngreso());

					/***
					 * esta llamada al metodo mediante el objeto contenedor lo que hace es guardar en la lista
					 *  array los datos de la instancia profesional
					 */



					contadorLista1 = contenedor.listaUsuario.size();

					contenedor.agregarProfesional(profesional);

					contadorLista2 = contenedor.listaUsuario.size();

					if (contadorLista2 > contadorLista1 ) {

						System.out.println("Felicitaciones Datos de Usuario tipo Profesional ingresado correctamente");
					}

					System.out.println("-------------- Verificacion que datos fueron ingresados --------------");
					System.out.println(profesional.toString());
					System.out.println();
					System.out.println();

					System.out.println("-------------- Profesional.analizarUsuario() --------------");

					profesional.analizarUsuario();

					System.out.print("<<Enter>> presione Enter para ir al menu principal");
					leer.nextLine();


					break;
				case 3:

					Administrativo admin = new Administrativo();

					admin.setRun(admin.getRun());

					admin.setNombre(admin.getNombre());

					admin.setFechaDeNacimiento(admin.getFechaDeNacimiento());

					admin.setArea(admin.getArea());

					admin.setExperienciaPrevia(admin.getExperienciaPrevia());

					contadorLista1 = contenedor.listaUsuario.size();

					contenedor.agregarAdministrativo(admin);

					contadorLista2 = contenedor.listaUsuario.size();

					if (contadorLista2 > contadorLista1 ) {

						System.out.println("Felicitaciones Datos de Usuario tipo Administrativo ingresado correctamente");
					}


					System.out.println("-------------- Verificación que datos fueron ingresados --------------");
					System.out.println(admin.toString());
					System.out.println();

					System.out.println("-------------- Admin.analizarUsuario() --------------");
					admin.analizarUsuario();

					System.out.print("<<Enter>> presione Enter para ir al menu principal");
					leer.nextLine();

					break;
				case 4:

					System.out.println("No se ha implementado este metodo");

					break;
				case 5:

					/***
					 * Codigo agregado por pbaez 19-11-2021 11:36
					 * Elimina Usuario segun el rut ingresado
					 */

					int runUsuario;

					boolean usuarioEliminado = false;

					int contadorUsuarios = contenedor.listaUsuario.size();

					if (contenedor.listaUsuario.size()>0)
					{

						contadorLista1 = contenedor.listaUsuario.size();


						System.out.println("Ingrese Rut del Cliente a eliminar ** Debe ingresar solo numeros, sin digito verificador," +
								" sin puntos Ejemplo: 99.999.999");

						System.out.println("+----------+------------------------------");
						System.out.print("|Rut a Eliminar : ");
						runUsuario = leer.nextInt();
						leer.nextLine();
						System.out.println("+----------+------------------------------");


						Iterator<Asesoria> datos = contenedor.listaUsuario.iterator();

						while (datos.hasNext()) {
							Usuario temp = (Usuario) datos.next();

							if (temp.getRun() == runUsuario) {
								temp = null;

								datos.remove();

								usuarioEliminado = true;

								break;

							}
							{
								usuarioEliminado = false;
							}

						}


						if (usuarioEliminado == true)
						{

							contadorLista2 = contenedor.listaUsuario.size();

							if (contadorLista2 < contadorLista1 ) {

								System.out.println("Felicitaciones Datos de Usuario tipo Administrativo ingresado correctamente");

								System.out.println("-----------------------Listado Despues de Eliminacion-------------------------------");

								contenedor.listaUsuario.parallelStream().forEachOrdered(System.out::println);
							}

						}

						if (usuarioEliminado == false)
						{

							System.out.println("Usuario no se ha eliminado debido que no existe un " +
									"Usuario Cliente; Administrativo o Profesional  relacionado ");

						}




					}else
					{

						System.out.println();

						System.out.println("No se han ingresado Registros de Información a la aplicación \n" +
								"Debe ingresar a lo menos un Usuario para poder eliminar del Sistema \n"+
								"en el menu principal seleccione la opción 1 ; 2 o 3 .-  \n");

						System.out.println();
					}

					System.out.print("<<Enter>> presione Enter para ir al menu principal");
					leer.nextLine();


					break;
				case 6:

					Contenedor listaContenedor = new Contenedor();

					listaContenedor.listaUsuarios();

					System.out.print("<<Enter>> presione Enter para ir al menu principal");
					leer.nextLine();

					break;
				case 7:

					Contenedor listaContenedorTipo = new Contenedor();

					listaContenedorTipo.listaUsuariosTipo();

					System.out.print("<<Enter>> presione Enter para ir al menu principal");
					leer.nextLine();

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