package prevencionDeRiesgo;

import java.util.Scanner;

public class Cliente extends Usuario{
	Scanner sc = new Scanner(System.in);
	private Integer rut; //numero menor a 99.999.999	
	private	String nombres; //min 5 carac max 30
	private String apellidos; // min5 max30
	private String telefono; //obligatorio
	private String afp; //min 4 max 30 carac
	private Integer sistemaDeSalud; //1fonasa,2isapre
	private String direccion; //max 70 carac
	private String comuna; // max 50 carac
	private Integer edad;// mayor a 0 y menor 150
	private String tipo;
	


	public Cliente() {}

	public Cliente(String nombre, String fechaDeNacimiento, int run, Integer rut, String nombres, String apellidos,
			String telefono, String afp, Integer sistemaDeSalud, String direccion, String comuna, Integer edad) {
		super(nombre, fechaDeNacimiento, run);
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaDeSalud = sistemaDeSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}


	public Integer getRut() {
		return rut;
	}


	public void setRut(Integer rut) {

		do {

			System.out.println("Ingrese el rut, sin digito verificador");

			rut = sc.nextInt();

			} while (rut > 99999999 );

			System.out.println("Ingrese un run menor a 99999999");

			if(rut <= 99999999 && rut >= 99999999);


			this.rut = rut;
		
			sc.nextLine();
	}



	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		do{
			System.out.println("Ingrese el nombre:");

			nombres = sc.nextLine();


			
		} while (nombres.isBlank() || nombres.isEmpty() || nombres.length()<10 || nombres.length() > 50);

		this.nombres = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		do {
			System.out.println("Ingrese los apellidos");

			apellidos = sc.nextLine();

			if (apellidos.length() >5){

				if (apellidos.length() <30){

					if (!apellidos.isEmpty()) {

						this.apellidos = apellidos;
						
					}
				}
			}
		} while (apellidos.isBlank() || apellidos.isEmpty() || apellidos.length()<10 || apellidos.length() > 50);
		this.apellidos = apellidos;
	}
		/*do{
			System.out.println("Ingrese los apellidos:");
			apellidos = sc.nextLine();
			this.apellidos = apellidos;
			} while (apellidos.isBlank() || apellidos.isEmpty() || apellidos.length()<10 || apellidos.length() > 50);
			System.out.println("Campo ingresado con exito");
		
	}*/


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		
		do {
			System.out.println("Ingrese su telefono.");
			telefono = sc.nextLine();
			
		
		}while (telefono.isEmpty() || telefono.isBlank());
	
		this.telefono = telefono;
	}


	public String getAfp() {
		return afp;
	}


	public void setAfp(String afp) {

		do {

			System.out.println("Ingrese su AFP.");

			afp = sc.nextLine();

			this.afp = afp;

		}while (afp.length() < 4 || afp.length() > 30);

	}
	


	public Integer getSistemaDeSalud() {
		return sistemaDeSalud;
	}


	public void setSistemaDeSalud(Integer sistemaDeSalud) {
		
		boolean valida=false;
		do {
			
			System.out.println("Ingrese sistema de salud correspondiente");

			System.out.println("1. Fonasa");

			System.out.println("2. Isapre");

			sistemaDeSalud = sc.nextInt();
		
			
			
			if (sistemaDeSalud==1 || sistemaDeSalud==2)
			{
				valida=true;
			}
			else
			{
				System.out.println("Opción Incorrecta debe ingresar 1 o 2");

				valida=false;
			}	
				
			
		}while(!valida);
		
		
		this.sistemaDeSalud = sistemaDeSalud;
		sc.nextLine();
		}
	
		
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		do {
			System.out.println("Ingrese dirección.");

			direccion = sc.nextLine();


		}while (direccion.length() >70 || direccion.isEmpty() || direccion.isBlank());
		
		this.direccion = direccion;
	}

	


	public String getComuna() {
		return comuna;
	}


	public void setComuna(String comuna) {
		do {

			System.out.println("Ingrese comuna.");

			comuna = sc.nextLine();
			
		}while (comuna.length() >50 || comuna.isEmpty() || comuna.isBlank());
		
		this.comuna = comuna;
	}
	


	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {

		do{

		System.out.println("Ingrese edad");

		edad= sc.nextInt();

		if(edad >= 0 && edad <150){

			this.edad = edad;

		}

		}while(edad.equals(null));

		this.edad = edad;

		sc.nextLine();
	}

	public String getTipo() {
		return null;
	}
	
	public void setTipo(String tipo) {
		this.tipo = "Cliente";
	}

	 @Override
		public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Direccion del cliente: "+direccion+", "+comuna);
	}


	@Override
	public String toString() {
		return "Cliente [sc=" + sc + ", rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", telefono=" + telefono + ", afp=" + afp + ", sistemaDeSalud=" + sistemaDeSalud + ", direccion="
				+ direccion + ", comuna=" + comuna + ", edad=" + edad + ", nombre=" + nombre + ", fechaDeNacimiento="
				+ fechaDeNacimiento + ", run=" + run + "]";
	}
	
}
