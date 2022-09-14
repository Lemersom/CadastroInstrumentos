// Aluno: Lemersom Fernandes Filho    RA: 2410176
// ADS - 2022/1 - POO - Projeto Final

public class Violao extends InstrumentoMusical{

	private String modelo = "";
	private int qtdCordas = 0;


        

	public String getModelo(){
		return modelo;
	}

	public int getQtdCordas(){
		return qtdCordas;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public void setQtdCordas(int qtdCordas){
		this.qtdCordas = qtdCordas;
	}

}