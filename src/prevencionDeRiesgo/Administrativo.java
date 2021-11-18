package prevencionDeRiesgo;

public class Administrativo extends Usuario {

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", nombre=" + nombre
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + ", run=" + run + "]";
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		do{
			System.out.println("Ingrese el area:");
			area = sc.nextLine();
			this.area = area;
			} while (area.isBlank() || area.isEmpty() || area.length()<5 || area.length() > 20);
			System.out.println("Campo ingresado correctamente");
		System.out.println("Gracias");
}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}


	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}


	public Administrativo(String nombre, String fechaDeNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaDeNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}


	private String area; // obligatorio min 5 max 20 carac
	private String experienciaPrevia; // max 100 caracteres
	
	
	public Administrativo() {
		
	}
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Area: "+area+". Experiencia previa: "+experienciaPrevia);
		
}
	}
