// Aluno: Lemersom Fernandes Filho    RA: 2410176
// ADS - 2022/1 - POO - Projeto Final

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerBateria {
    private Bateria b1;
    private List<Bateria> bdBat = new ArrayList<Bateria>();
    
    public List<Bateria> getBdBat(){
        return bdBat;
    }
    
    public Bateria cadBat(Bateria b1){
        if(consultaCodigo(b1) == null){
            bdBat.add(b1);
            return b1;
        }
        else{
            return null;
        }
    }
    
    public Bateria consultaCodigo(Bateria b1){
        for(int i = 0; i < bdBat.size(); i++){
            if(b1.getCodigo().equals(bdBat.get(i).getCodigo())){
                return bdBat.get(i);
            }
        }
        return null;
    }
    
    public Bateria excluirBat(Bateria b1){
        b1 = consultaCodigo(b1);
        if(b1 != null){
            bdBat.remove(b1);
            return null;
        }
        else{
            return b1;
        }
    }
    
    public Bateria alteraBat(Bateria b1){
        for(int i = 0; i < bdBat.size(); i++){
            if(b1.getCodigo().equals(bdBat.get(i).getCodigo())){
                String codigo = JOptionPane.showInputDialog(null, "Novo codigo:", 
                                            "Alterar Bateria", JOptionPane.QUESTION_MESSAGE);
                b1.setCodigo(codigo);
                bdBat.set(i, b1);
                //
                String tipo = JOptionPane.showInputDialog(null, "Novo tipo:", 
                                            "Alterar Bateria", JOptionPane.QUESTION_MESSAGE);
                b1.setTipo(tipo);
                bdBat.set(i, b1);
                //
                String marca = JOptionPane.showInputDialog(null, "Nova marca:", 
                                           "Alterar Bateria", JOptionPane.QUESTION_MESSAGE);
                b1.setMarca(marca);
                bdBat.set(i, b1);
                //
                String qtdCaixa = JOptionPane.showInputDialog(null, "Nova quantidade de caixas:", 
                                            "Alterar Bateria", JOptionPane.QUESTION_MESSAGE);
                b1.setQtdCaixa(Integer.parseInt(qtdCaixa));
                bdBat.set(i, b1);
                //
                String qtdBulbo = JOptionPane.showInputDialog(null, "Nova quantidade de bulbos:", 
                                            "Alterar Bateria", JOptionPane.QUESTION_MESSAGE);
                b1.setQtdBulbo(Integer.parseInt(qtdBulbo));
                bdBat.set(i, b1);
                //
                String qtdTons = JOptionPane.showInputDialog(null, "Nova quantidade de tons:", 
                                            "Alterar Bateria", JOptionPane.QUESTION_MESSAGE);
                b1.setQtdTons(Integer.parseInt(qtdTons));
                bdBat.set(i, b1);
                //
                String qtdSurdo = JOptionPane.showInputDialog(null, "Nova quantidade de surdos:", 
                                            "Alterar Bateria", JOptionPane.QUESTION_MESSAGE);
                b1.setQtdSurdo(Integer.parseInt(qtdSurdo));
                bdBat.set(i, b1);
                //
                String qtdChimbal = JOptionPane.showInputDialog(null, "Nova quantidade de chimbal:", 
                                            "Alterar Bateria", JOptionPane.QUESTION_MESSAGE);
                b1.setQtdChimbal(Integer.parseInt(qtdChimbal));
                bdBat.set(i, b1);
                //
                String preco = JOptionPane.showInputDialog(null, "Novo preço:", 
                                            "Alterar Bateria", JOptionPane.QUESTION_MESSAGE);
                b1.getVenda1().setPreco(Integer.parseInt(preco));
                bdBat.set(i, b1);
                
                return bdBat.get(i);
            }
        }
        return null;
    }
}
