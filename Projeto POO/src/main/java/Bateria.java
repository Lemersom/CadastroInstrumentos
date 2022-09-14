// Aluno: Lemersom Fernandes Filho    RA: 2410176
// ADS - 2022/1 - POO - Projeto Final

public class Bateria extends InstrumentoMusical{

	private int qtdCaixa = 0;
	private int qtdBulbo = 0;
	private int qtdTons = 0;
	private int qtdSurdo = 0;
	private int qtdChimbal = 0;
        public String produto = "Bateria";



//Polimorfismo Sobrescrita	


	public int getQtdCaixa(){
		return qtdCaixa;
	}

	public int getQtdBulbo(){
		return qtdBulbo;
	}

	public int getQtdTons(){
		return qtdTons;
	}

	public int getQtdSurdo(){
		return qtdSurdo;
	}
	
	public int getQtdChimbal(){
		return qtdChimbal;
	}

	public void setQtdCaixa(int qtdCaixa){
		this.qtdCaixa = qtdCaixa;
	}

	public void setQtdBulbo(int qtdBulbo){
		this.qtdBulbo = qtdBulbo;
	}

	public void setQtdTons(int qtdTons){
		this.qtdTons = qtdTons;
	}
	
	public void setQtdSurdo(int qtdSurdo){
		this.qtdSurdo = qtdSurdo;
	}

	public void setQtdChimbal(int qtdChimbal){
		this.qtdChimbal = qtdChimbal;
	}

}