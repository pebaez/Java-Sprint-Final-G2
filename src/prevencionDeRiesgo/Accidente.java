package prevencionDeRiesgo;

import java.util.Scanner;

 	public class Accidente implements Registros
{
	Scanner sc = new Scanner(System.in);
	private int identificadorAccidente; //obligatorio
	private Integer rutCliente; //obligatorio
	private String diaAccidente; //DD/MM/AAAA
	private String horaAccidente; //HH:MM
	private String lugarAccidente; //min 10 max 50 carac
	private String origenAccidente; // 100 carac max
	private String consecuencias;//max 100 caracteres


	public Accidente() {}


 	public Accidente(int identificadorAccidente, Integer rutCliente, String diaAccidente, String horaAccidente,
		String lugarAccidente, String origenAccidente, String consecuencias) {
	super();
	this.identificadorAccidente = identificadorAccidente;
	this.rutCliente = rutCliente;
	this.diaAccidente = diaAccidente;
	this.horaAccidente = horaAccidente;
	this.lugarAccidente = lugarAccidente;
	this.origenAccidente = origenAccidente;
	this.consecuencias = consecuencias;
}


	public int getIdentificadorAccidente() {
	return identificadorAccidente;
}


	public void setIdentificadorAccidente(int identificadorAccidente) {
	this.identificadorAccidente = identificadorAccidente;
}


	public Integer getRutCliente() {
	return rutCliente;
}


	public void setRutCliente(Integer rutCliente) {
	System.out.println("Ingrese el rut, sin digito verificador");
	rutCliente = sc.nextInt();
	while(rutCliente > 99999999) {
		
	}if(rutCliente <= 99999999 && rutCliente >= 1000000);
	this.rutCliente = rutCliente;

}


	public String getDiaAccidente() {
	return diaAccidente;
}


	public void setDiaAccidente(String diaAccidente) {
	
	this.diaAccidente = diaAccidente;
}


	public String getHoraAccidente() {
	return horaAccidente;
}


	public void setHoraAccidente(String horaAccidente) {
	this.horaAccidente = horaAccidente;
}


	public String getLugarAccidente() {
	return lugarAccidente;
}


	public void setLugarAccidente(String lugarAccidente) {

		do{

			System.out.println("Ingrese el lugar donde se produjo el accidente:");

			lugarAccidente = sc.nextLine();


			} while (lugarAccidente.isBlank() || lugarAccidente.isEmpty() || lugarAccidente.length()<10|| lugarAccidente.length() > 50);

			this.lugarAccidente = lugarAccidente;

	}


	public String getOrigenAccidente() {
	return origenAccidente;
}


	public void setOrigenAccidente(String origenAccidente) {

		do {
		System.out.println("Ingrese el origen del accidente.");
		origenAccidente = sc.nextLine();
		this.origenAccidente = origenAccidente;
	}while (origenAccidente.length() > 100);
	System.out.println("Campo ingresado con exito");
}



public String getConsecuencias() {
	return consecuencias;
}


public void setConsecuencias(String consecuencias) {
	do {
		System.out.println("Ingrese las consecuencias del accidente.");
		consecuencias = sc.nextLine();
		this.consecuencias= consecuencias;
	}while (consecuencias.length() > 100);
	System.out.println("Campo ingresado con exito");
}


@Override
public String toString() {
	return "Accidente [identificadorAccidente=" + identificadorAccidente + ", rutCliente=" + rutCliente
			+ ", diaAccidente=" + diaAccidente + ", horaAccidente=" + horaAccidente + ", lugarAccidente="
			+ lugarAccidente + ", origenAccidente=" + origenAccidente + ", consecuencias=" + consecuencias + "]";
}


}
