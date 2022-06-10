// Aluno: Lemersom Fernandes Filho    RA: 2410176
// ADS - 2022/1 - POO - Projeto Final

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class JanelaViolao extends javax.swing.JFrame {

    public Violao violao;
    private static GerViolao gerViolao = new GerViolao();
    
    private static JanelaViolao janelaViolao1;
    
    /**
     * Creates new form JanelaViolao
     */
    public JanelaViolao() {
        initComponents();
    }
    
    public static JanelaViolao getJanelaViolao(){
        if(janelaViolao1 == null){
            janelaViolao1 = new JanelaViolao();
        }
        return janelaViolao1;
    }
    
    public static GerViolao getGerViolao(){
        return gerViolao;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViolao = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtQtdCordas = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        btCad = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        lblQtdCordas = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        lblPreco = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        txtTipo = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabViolao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Janela Violão");

        lblViolao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblViolao.setText("Violão");

        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCodigo.setText("Codigo do Item:");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTipo.setText("Tipo: ");

        txtQtdCordas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMarca.setText("Marca:");

        txtPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblModelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModelo.setText("Modelo:");

        btCad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btCad.setText("Cadastrar");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        lblQtdCordas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblQtdCordas.setText("Quantidade de Cordas:");

        btConsultar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lblPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco.setText("Preço:");

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        txtTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tabViolao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Tipo", "Marca", "Modelo", "QtdCordas", "Preço"
            }
        ));
        jScrollPane1.setViewportView(tabViolao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCad)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btAlterar)))
                        .addGap(103, 103, 103)
                        .addComponent(btExcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addGap(74, 74, 74)
                .addComponent(btSair)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQtdCordas)
                            .addComponent(lblPreco))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtdCordas, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(lblViolao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblViolao)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipo))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarca))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelo))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQtdCordas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQtdCordas))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPreco))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btSair))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCad)
                            .addComponent(btConsultar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btExcluir)
                            .addComponent(btAlterar))
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        cadastrar();
        listarTab();
    }//GEN-LAST:event_btCadActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
        listarTab();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    public void excluir(){
        violao = new Violao();
        
        violao.setCodigo(txtCodigo.getText());
        
        violao = gerViolao.consultaCodigo(violao);
        
        if(violao != null){
            
            txtCodigo.setText(violao.getCodigo());
            txtTipo.setText(violao.getTipo());
            txtMarca.setText(violao.getMarca());
            txtModelo.setText(violao.getModelo());
            txtQtdCordas.setText(Integer.toString(violao.getQtdCordas()));
            txtPreco.setText(Integer.toString(violao.getVenda1().getPreco()));
            

            int perg = JOptionPane.showConfirmDialog(null, "Deseja excluir?", 
                                   "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
            if(perg == 0){
                gerViolao.excluirViolao(violao);
                JOptionPane.showMessageDialog(null, "Sucesso na exclusão", "Exclusão", 1);
                
            }
            
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Violão não cadastrado", "Erro na Consulta", 0);
            limpar();
        }
    }
    
    public void alterar(){
        violao = new Violao();
        
        violao.setCodigo(txtCodigo.getText());
        
        violao = gerViolao.alteraViolao(violao);
        
        if(violao != null){
            txtCodigo.setText(violao.getCodigo());
            txtTipo.setText(violao.getTipo());
            txtMarca.setText(violao.getMarca());
            txtModelo.setText(violao.getModelo());
            txtQtdCordas.setText(Integer.toString(violao.getQtdCordas()));
            txtPreco.setText(Integer.toString(violao.getVenda1().getPreco()));
            JOptionPane.showMessageDialog(null, "Sucesso na alteração de dados", "Alteração", 1);
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Violão não cadastrado", "Erro na Consulta", 0);
            limpar();
        }
    }
    
    public void listarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabViolao.getModel();
        int i = 0;
        
        modelo.setRowCount(i);
        
        for(Violao violao : gerViolao.getBdViolao()){
            modelo.insertRow(i, new Object[]{violao.getCodigo(), violao.getTipo(), violao.getMarca(), 
                    violao.getModelo(), violao.getQtdCordas(), violao.getVenda1().getPreco()});
            i++;
        }
    }
    
    public void consultar(){
        violao = new Violao();
        
        violao.setCodigo(txtCodigo.getText());
        
        violao = gerViolao.consultaCodigo(violao);
        
        if(violao != null){
            txtCodigo.setText(violao.getCodigo());
            txtTipo.setText(violao.getTipo());
            txtMarca.setText(violao.getMarca());
            txtModelo.setText(violao.getModelo());
            txtQtdCordas.setText(Integer.toString(violao.getQtdCordas()));
            txtPreco.setText(Integer.toString(violao.getVenda1().getPreco()));
            JOptionPane.showMessageDialog(null, "Sucesso na consulta", "Consulta", 1);
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Violão não cadastrado", "Erro na Consulta", 0);
            limpar();
        }
    }
    
    public void cadastrar(){
        violao = new Violao();
        
        
        violao.setCodigo(txtCodigo.getText());
        violao.setTipo(txtTipo.getText());
        violao.setMarca(txtMarca.getText());
        violao.setModelo(txtModelo.getText());
        violao.setQtdCordas(Integer.parseInt(txtQtdCordas.getText()));
        violao.getVenda1().setPreco(Integer.parseInt(txtPreco.getText()));
        
                
        violao = gerViolao.cadViolao(violao);
        
        if(violao != null){
            JOptionPane.showMessageDialog(null, "Violao cadastrado com sucesso", 
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Violao já possui cadastro", 
                        "Erro no cadastro", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, 
                "Deseja Sair?", 
                "Sair", 
                JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        txtCodigo.setText("");
        txtTipo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtQtdCordas.setText("");
        txtPreco.setText("");
        txtCodigo.requestFocus();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaViolao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaViolao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaViolao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaViolao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaViolao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCad;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQtdCordas;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblViolao;
    private static javax.swing.JTable tabViolao;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtdCordas;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
