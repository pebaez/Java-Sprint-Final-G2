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
					System.out.println("No se ha implementado este metodo");
					break;
				case 2:
					System.out.println("No se ha implementado este metodo");

					break;
				case 3:

					System.out.println("No se ha implementado este metodo");

					break;
				case 4:
					System.out.println("No se ha implementado este metodo");
					break;
				case 5:
					System.out.println("No se ha implementado este metodo");
					break;
				case 6:

					System.out.println("No se ha implementado este metodo");

					break;
				case 7:

					System.out.println("No se ha implementado este metodo");

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