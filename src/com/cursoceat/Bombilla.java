package com.cursoceat;

public class Bombilla {
	static public boolean interruptorGeneral=true;
	private boolean interruptor;
	
	//Construtor vacio, para crear el objeto bombilla en estado apagado
	public Bombilla() {
		this.interruptor = false;
	}
	
	//Metodo que enciende o apaga según como este el interruptor
	public void encenderOapagar() {
		if (this.interruptor) {
			this.interruptor=false;
		}else {
			this.interruptor=true;
		}
	}
	
	
	////////////////////////////////////////////
	
	//Metodo para encender bombilla
	public void encender() {
		this.interruptor=true;
	}
	
	//Metoso para apagar la bombilla
	public void apagar() {
		this.interruptor=false;
		
	}
	//Metodo para cambiar estado
	public boolean estado() {
		return interruptorGeneral && this.interruptor;
	}
	
	//Metodo para mostrar estado
	public String mostrarEstado() {
		return estado() ? "Encendida" : "Apagada";
	}
	

}
