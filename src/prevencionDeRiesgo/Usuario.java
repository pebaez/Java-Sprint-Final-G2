package prevencionDeRiesgo;
import java.util.Scanner;
//import java.lang.Integer.valueOf;

public class Usuario implements Asesoria{
	Scanner sc = new Scanner(System.in);
	protected String nombre;
	protected String fechaDeNacimiento; //obligatorio formato DD/MM/AAAA
	protected Integer run; //numero menor a 99.999.999
	
	public Usuario() {}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", run=" + run + "]";
	}
	public String getNombre() { return nombre; }
	
	public void setNombre(String nombre ) {
	
		do{
			System.out.println("Ingrese el nombre:");
			nombre = sc.nextLine();
			this.nombre = nombre;
			
		} while (nombre.isBlank() || nombre.isEmpty() || nombre.length()<10 || nombre.length() > 50);
		
}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {

		 boolean valida = false;

		do {
			String mensaje = "";

			System.out.println("Ingrese la fecha de nacimiento. Recuerde que el formato es DD/MM/AAAA");

			fechaDeNacimiento = sc.nextLine();

			if(!fechaDeNacimiento.isBlank()) valida=true;

			if (!fechaDeNacimiento.isEmpty()) valida =true;

			if (!fechaDeNacimiento.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/[0-9][0-9]?[0-9][0-9]$")) valida =true;

			if(valida==false)
			{

				System.out.println(mensaje);

			}

		  	}while (!valida);


			this.fechaDeNacimiento = fechaDeNacimiento;

	/*	String mensaje = "";

		System.out.println("Ingrese la fecha de nacimiento. Recuerde que el formato es DD/MM/AAAA");

		fechaDeNacimiento = sc.nextLine();
		
		}while (fechaDeNacimiento.isBlank() || fechaDeNacimiento.isEmpty() || !fechaDeNacimiento.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/[0-9][0-9]?[0-9][0-9]$")); 

		this.fechaDeNacimiento = fechaDeNacimiento;*/


		}

	public Integer getRun() {
		return run;
	}

	public void setRun(Integer run) {

		System.out.println("Ingrese el run, sin digito verificador");

		run = sc.nextInt();

		while(run > 99999999) {

			System.out.println("Ingrese un run menor a 99999999");

		}if(run <= 99999999 && run >= 1000000);

		this.run = run;

		sc.nextLine();
	}
	

	public Usuario(String nombre, String fechaDeNacimiento, int run) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.run = run;
	}
	public void analizarUsuario() {
		System.out.println("El nombre del usuario es" + this.nombre + " y el run es: " + this.run);
	}
	
	
	/*public void mostrarEdad(String fechaDeNacimiento) {
		String descomponer = (this.fechaDeNacimiento).replace("/","");
		String anio= descomponer.substring(0,4); 
		int edad = 2021 - valueOf(anio);
		System.out.println("El usuario tiene" + edad  + "años");
	
	}*/

	
	}
	


