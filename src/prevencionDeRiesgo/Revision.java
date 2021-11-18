package prevencionDeRiesgo;

public class Revision extends Visita {
	private int identificadorRevision;
	private int identificadorVisita; //numero de la visita asociada a la revision
	private String nombreRevision;// min 10 max 50
	private String detalleRevision; //max 100
	private int estadoRevision; //1 sin problemas,2con observaciones, 3 noaprueba.
	
	
	public Revision() {}


	public Revision(int identificadorVisita, Integer rutCliente, String diaVisita, String horaVisita, String lugar,
			String comentarios, int identificadorRevision, int identificadorVisita2, String nombreRevision,
			String detalleRevision, int estadoRevision) {
		super(identificadorVisita, rutCliente, diaVisita, horaVisita, lugar, comentarios);
		this.identificadorRevision = identificadorRevision;
		identificadorVisita = identificadorVisita2;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estadoRevision = estadoRevision;
	}


	public int getIdentificadorRevision() {
		return identificadorRevision;
	}


	@Override
	public String toString() {
		return "Revision [identificadorRevision=" + identificadorRevision + ", identificadorVisita="
				+ identificadorVisita + ", nombreRevision=" + nombreRevision + ", detalleRevision=" + detalleRevision
				+ ", estadoRevision=" + estadoRevision + ", rutCliente=" + rutCliente + ", diaVisita=" + diaVisita
				+ ", horaVisita=" + horaVisita + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}


	public void setIdentificadorRevision(int identificadorRevision) {
		this.identificadorRevision = identificadorRevision;
	}


	public int getIdentificadorVisita() {
		return identificadorVisita;
	}


	public void setIdentificadorVisita(int identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
	}


	public String getNombreRevision() {
		return nombreRevision;
	}


	public void setNombreRevision(String nombreRevision) {
		do{
			System.out.println("Ingrese el nombre asociado a la revisión:");
			nombreRevision = sc.nextLine();
			this.nombreRevision = nombreRevision;
			} while (nombreRevision.isBlank() || nombreRevision.isEmpty() || nombreRevision.length()<10 || nombreRevision.length() > 50);
			System.out.println("Campo ingresado correctamente");
		
}
	

	public String getDetalleRevision() {
		return detalleRevision;
	}


	public void setDetalleRevision(String detalleRevision) {
		boolean valida=false;
		
		
		
		do {
			
			String mensaje="";
			

			System.out.println("Ingrese detalles de la revisión.");
			detalleRevision = sc.nextLine();
			this.detalleRevision= detalleRevision;
			
			if (!detalleRevision.isBlank()) valida=true;
			
			if(detalleRevision.isBlank())
			{
				mensaje +="El dato no debe estar vacio\n";
				valida=false;
				
			}	
			
			if (detalleRevision.length() > 100) {
				mensaje +="El dato no debe superar los 100 caracteres\n";
				valida=false;	
			}
			
			if (detalleRevision.length() < 5) {
				mensaje +="El dato no debe ser menor a 5 caracteres\n";
				valida=false;	
			}
			
			
			if(valida==false)
			{
			
				System.out.println(mensaje);
				
			}
			
		}while (!valida);

	}



	public int getEstadoRevision() {
		return estadoRevision;
	}


	 //corre eternamente
	public void setEstadoRevision(int estadoRevision) {
		System.out.println("Estado de la revisión");
		System.out.println("1. Sin problemas.");
		System.out.println("2. Con observaciones.");
		System.out.println("3. No aprueba.");
		System.out.println("");
		System.out.println("Ingrese la opción");
		estadoRevision = sc.nextInt();
		do {
			switch(estadoRevision) {
			//this.estadoRevision = estadoRevision;
			case 1:
				System.out.println("La revisión se aprueba sin problemas");;
			break;
			case 2:
			System.out.println("Revisión con observaciones");
			break;
			case 3:
				System.out.println("No aprueba");
			//this.estadoRevision = estadoRevision;
		break;
		//	default:
		
			}//		System.out.println("No aprueba la revisión");	
		}while(estadoRevision  !=1 && estadoRevision != 2 && estadoRevision != 3);
		sc.nextLine();
		}
	}

	