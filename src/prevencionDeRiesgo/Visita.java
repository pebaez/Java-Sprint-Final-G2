package prevencionDeRiesgo;

import java.util.Scanner;

public class Visita {
	Scanner sc = new Scanner(System.in);
	protected int identificadorVisita; //oblig
	protected  Integer rutCliente; //oblig
	protected  String diaVisita; //DD/MM/AAAA
	protected  String horaVisita; //HH:00
	protected  String lugar; // max 100 carac
	protected  String comentarios; //max 100 carac


	public Visita(){}


	public Visita(int identificadorVisita, Integer rutCliente, String diaVisita, String horaVisita, String lugar,
			String comentarios) {
		super();
		this.identificadorVisita = identificadorVisita;
		this.rutCliente = rutCliente;
		this.diaVisita = diaVisita;
		this.horaVisita = horaVisita;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}


	public int getIdentificadorVisita() {
		return identificadorVisita;
	}


	public void setIdentificadorVisita(int identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
	}


	public Integer getRutCliente() {
		return rutCliente;
	}


	public void setRutCliente(Integer rutCliente) {
		System.out.println("Ingrese el rut, sin digito verificador");
		rutCliente = sc.nextInt();
		while(rutCliente> 99999999) {
			
		}if(rutCliente <= 99999999 && rutCliente >= 1000000);
		this.rutCliente = rutCliente;
		System.out.println("El rut es correcto");
	}


	public String getDiaVisita() {
		return diaVisita;
	}


	public void setDiaVisita(String diaVisita) {
		this.diaVisita = diaVisita;
	}


	public String getHoraVisita() {
		return horaVisita;
	}


	public void setHoraVisita(String horaVisita) {
		this.horaVisita = horaVisita;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		do{
			System.out.println("Ingrese el lugar de la visita:");
			lugar = sc.nextLine();
			this.lugar = lugar;
			} while (lugar.isBlank() || lugar.isEmpty() || lugar.length()<10|| lugar.length() > 50);
			System.out.println("Campo ingresado correctamente");
		
	}

	public String getComentarios() {
		return comentarios;
	}


	public void setComentarios(String comentarios) {
		do {
			System.out.println("Ingrese comentarios de la visita.");
			comentarios = sc.nextLine();
			this.comentarios= comentarios;
		}while (comentarios.length() >= 50);
		System.out.println("Campo ingresado con exito");
	}


	@Override
	public String toString() {
		return "Visita [identificadorVisita=" + identificadorVisita + ", rutCliente=" + rutCliente + ", diaVisita="
				+ diaVisita + ", horaVisita=" + horaVisita + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}

}
