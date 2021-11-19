package prevencionDeRiesgo;

import java.util.Scanner;

public class Capacitacion {
	Scanner sc = new Scanner(System.in);
	private String identificador; //obligatorio
	private Integer rutCliente; //obligatorio
	private String diaDeLaSemana; //entre "Lunes" y "Domingo" Een este formate
	private String horaCapacitacion; // formato HH:MM
	private String lugarCapacitacion; //obligatorio min 10 max 50 carac
	private String duracionCapacitacion; //70 caracteres
	private int cantidadDeAsistentes; //obligatorio menor que 1000
	
	public Capacitacion() {
		
	}

	public Capacitacion(String identificador, Integer rutCliente, String diaDeLaSemana, String horaCapacitacion,
			String lugarCapacitacion, String duracionCapacitacion, int cantidadDeAsistentes) {
		super();
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.diaDeLaSemana = diaDeLaSemana;
		this.horaCapacitacion = horaCapacitacion;
		this.lugarCapacitacion = lugarCapacitacion;
		this.duracionCapacitacion = duracionCapacitacion;
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Integer getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Integer rutCliente) {
		System.out.println("Ingrese el rut, sin digito verificador");

		rutCliente = sc.nextInt();

		while(rutCliente> 99999999) {
			
		}if(rutCliente <= 99999999 && rutCliente >= 1000000);


		System.out.println("El rut es correcto");

		this.rutCliente = rutCliente;

		sc.nextLine();
	
	}

	public String getDiaDeLaSemana() {
		return diaDeLaSemana;
	}

	public void setDiaDeLaSemana(String diaDeLaSemana) {

		System.out.println("Ingrese el dia de la semana en que se realizara la capacitacion. Lunes a Domingo");

		this.diaDeLaSemana = diaDeLaSemana;

		System.out.println(this.diaDeLaSemana);
	}	

	public String getHoraCapacitacion() {
		return horaCapacitacion;
	}

	public void setHoraCapacitacion(String horaCapacitacion) {
		this.horaCapacitacion = horaCapacitacion;
	}

	public String getLugarCapacitacion() {
		return lugarCapacitacion;
	}

	public void setLugarCapacitacion(String lugarCapacitacion) {
		do{
			System.out.println("Ingrese el donde se realiza la capacitaci�n:");

			lugarCapacitacion = sc.nextLine();

			this.lugarCapacitacion = lugarCapacitacion;

			} while (lugarCapacitacion.isBlank() || lugarCapacitacion.isEmpty() || lugarCapacitacion.length()<10|| lugarCapacitacion.length() > 50);

			System.out.println("Campo ingresado correctamente");
		
}

	public String getDuracionCapacitacion() {
		return duracionCapacitacion;
	}

	public void setDuracionCapacitacion(String duracionCapacitacion) {

		do {
			System.out.println("Ingrese la duraci�n de la capacitaci�n.");

			duracionCapacitacion = sc.nextLine();

		}while (duracionCapacitacion.length()> 0 || duracionCapacitacion.length()<70 );

		this.duracionCapacitacion = duracionCapacitacion;
	}
	

	public int getCantidadDeAsistentes() {
		return cantidadDeAsistentes;
	}

	public void setCantidadDeAsistentes(int cantidadDeAsistentes) {

		do {

			System.out.println("Ingrese la cantidad de asistentes.");

			cantidadDeAsistentes = sc.nextInt();

			}while (cantidadDeAsistentes > 100);


			this.cantidadDeAsistentes = cantidadDeAsistentes;
	}
		

	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", diaDeLaSemana="
				+ diaDeLaSemana + ", horaCapacitacion=" + horaCapacitacion + ", lugarCapacitacion=" + lugarCapacitacion
				+ ", duracionCapacitacion=" + duracionCapacitacion + ", cantidadDeAsistentes=" + cantidadDeAsistentes
				+ "]";
	}
		
			public String mostrarDetalle() {
				return "La capacitaci�n se realizar� en "+lugarCapacitacion+" a las "+horaCapacitacion+" horas, del d�a "+diaDeLaSemana+" y tendr� una duraci�n de"+duracionCapacitacion+" \n"
						+duracionCapacitacion+" minutos.";
}
		}


	

