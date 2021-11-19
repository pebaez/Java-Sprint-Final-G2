package prevencionDeRiesgo;

import java.util.Scanner;

public class Profesional extends Usuario{
	Scanner sc = new Scanner(System.in);
	private String tituloProfesional; //min 10 max 50carac
	private String fechaIngreso; //DD/MM/AAAA


	public Profesional() {

	}


	public String getTituloProfesional() {
		return tituloProfesional;
	}


	public void setTituloProfesional(String tituloProfesional) {
		do{
				System.out.println("Ingrese el titulo del profesional:");

				tituloProfesional = sc.nextLine();



			} while (tituloProfesional.isBlank() || tituloProfesional.isEmpty() || tituloProfesional.length()<10 || tituloProfesional.length() > 50);

			this.tituloProfesional = tituloProfesional;

	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {

			do {
				System.out.println("Ingrese la fecha de nacimiento. Recuerde que el formato es DD/MM/AAAA");

				fechaIngreso = sc.nextLine();

			}while (fechaIngreso.isBlank() || fechaIngreso.isEmpty() || !fechaIngreso.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/[0-9][0-9]?[0-9][0-9]$"));

			this.fechaIngreso = fechaIngreso;
		}




	public Profesional(String nombre, String fechaDeNacimiento, int run, String tituloProfesional,
			String fechaIngreso) {
		super(nombre, fechaDeNacimiento, run);
		this.tituloProfesional = tituloProfesional;
		this.fechaIngreso = fechaIngreso;
	}


	@Override
	public String toString() {
		return "Profesional [tituloProfesional=" + tituloProfesional + ", fechaIngreso=" + fechaIngreso + ", nombre="
				+ nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", run=" + run + "]";
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Titulo: "+tituloProfesional+". Fecha ingreso profesional: "+fechaIngreso);
	}


}
