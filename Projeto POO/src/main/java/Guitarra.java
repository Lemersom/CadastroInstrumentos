// Aluno: Lemersom Fernandes Filho    RA: 2410176
// ADS - 2022/1 - POO - Projeto Final

public class Guitarra extends InstrumentoMusical{

	private String modelo = "";
	private String captador = "";
	private int qtdCordas = 0;
	

	public String getModelo(){
		return modelo;
	}

	public int getQtdCordas(){
		return qtdCordas;
	}

	public String getCaptador(){
		return captador;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public void setQtdCordas(int qtdCordas){
		this.qtdCordas = qtdCordas;
	}

	public void setCaptador(String captador){
		this.captador = captador;
	}

}