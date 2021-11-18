package prevencionDeRiesgo;

import java.util.Scanner;

public class Profesional extends Usuario{
	Scanner sc = new Scanner(System.in);
	private String tituloProfesional; //min 10 max 50carac
	private String fechaIngreso; //DD/MM/AAAA


	public Profesional() {

	}

	public Profesional(String nombre, String fechaDeNacimiento, int run, String tituloProfesional,
					   String fechaIngreso) {
		super(nombre, fechaDeNacimiento, run);
		this.tituloProfesional = tituloProfesional;
		this.fechaIngreso = fechaIngreso;
	}



	public String getTituloProfesional() {
		return tituloProfesional;
	}


	public void setTituloProfesional(String tituloProfesional) {
		do{
				System.out.println("Ingrese el titulo del profesional:");

				tituloProfesional = sc.nextLine();

				this.tituloProfesional = tituloProfesional;

			} while (tituloProfesional.isBlank() || tituloProfesional.isEmpty() || tituloProfesional.length()<10 || tituloProfesional.length() > 50);

		System.out.println("Campo ingresado con exito");

	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		System.out.println("Fecha de ingreso. Recuerde que debe ingresar este formato DD/MM/AAAA");
		fechaIngreso = sc.nextLine();
		System.out.println("Campo ingresado con exito");
	}

	@Override
	public String toString() {
		return "\nProfesional{" +
				", tituloProfesional='" + tituloProfesional + '\'' +
				", fechaIngreso='" + fechaIngreso + '\'' +
				", nombre='" + nombre + '\'' +
				", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
				", run=" + run +
				"}\n " + super.toString();
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Titulo: "+tituloProfesional+". Fecha ingreso profesional: "+fechaIngreso);
	}


}
