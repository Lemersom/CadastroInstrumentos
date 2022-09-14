
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
public class JanelaServico extends javax.swing.JFrame {

    public Servico servico;
    private static GerServico gerServ = new GerServico();
    
    /**
     * Creates new form JanelaServico
     */
    public JanelaServico() {
        initComponents();
    }
    
    public static GerServico getGerServ(){
        return gerServ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCodigo = new javax.swing.JLabel();
        lbLuthier = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbServico = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtLuthier = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JToggleButton();
        btConsultar = new javax.swing.JToggleButton();
        btExcluir = new javax.swing.JToggleButton();
        btConcluir = new javax.swing.JToggleButton();
        btLimpar = new javax.swing.JToggleButton();
        btSair = new javax.swing.JToggleButton();
        lbValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        TxtDescricao = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        TabServico1 = new javax.swing.JScrollPane();
        tabServico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCodigo.setText("Código:");

        lbLuthier.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbLuthier.setText("Luthier:");

        lbStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbStatus.setText("Status:");

        lbDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDescricao.setText("Descrição:");

        lbServico.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbServico.setText("Serviço");

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtLuthier.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btConcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btConcluir.setText("Concluir");
        btConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConcluirActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbValor.setText("Valor:");

        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        TxtDescricao.setViewportView(txtDescricao);

        tabServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Luthier", "Status", "Valor", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabServico1.setViewportView(tabServico);
        if (tabServico.getColumnModel().getColumnCount() > 0) {
            tabServico.getColumnModel().getColumn(4).setPreferredWidth(300);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsultar)
                    .addComponent(btConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(74, 74, 74)
                .addComponent(btLimpar)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lbDescricao))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbCodigo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lbServico))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbLuthier)
                            .addComponent(lbStatus)
                            .addComponent(lbValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLuthier, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(TabServico1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbServico)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCodigo))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLuthier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLuthier))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbStatus))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDescricao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(TxtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                    .addComponent(TabServico1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btConsultar)
                            .addComponent(btCadastrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btExcluir)
                            .addComponent(btConcluir))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btSair))
                        .addGap(44, 44, 44))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
        listarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConcluirActionPerformed
        concluir();
        listarTab();
    }//GEN-LAST:event_btConcluirActionPerformed

    
    public static void listarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabServico.getModel();
        int i = 0;
        
        modelo.setRowCount(i);
        
        for(Servico serv : gerServ.getbdServ()){
            modelo.insertRow(i, new Object[]{serv.getCodigo(), serv.getLuthier(), serv.getStatus(), 
                    serv.getValor(), serv.getDescricao()});
            i++;
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
        txtLuthier.setText("");
        txtStatus.setText("");
        txtValor.setText("");
        txtDescricao.setText("");
        txtCodigo.requestFocus();
    }
    
    public void cadastrar(){
        Servico serv = new Servico();
        
        
        serv.setCodigo(txtCodigo.getText());
        serv.setLuthier(txtLuthier.getText());
        serv.setStatus(txtStatus.getText());
        serv.setValor(Float.parseFloat(txtValor.getText()));
        serv.setDescricao(txtDescricao.getText());
        
                
        serv = gerServ.cadServ(serv);
        
        if(serv != null){
            JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso", 
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Serviço já possui cadastro", 
                        "Erro no cadastro", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void consultar(){
        Servico serv = new Servico();
        
        serv.setCodigo(txtCodigo.getText());
        
        serv = gerServ.consultaCodigo(serv);
        
        if(serv != null){
            txtCodigo.setText(serv.getCodigo());
            txtLuthier.setText(serv.getLuthier());
            txtStatus.setText(serv.getStatus());
            txtValor.setText(Float.toString(serv.getValor()));
            txtDescricao.setText(serv.getDescricao());
            JOptionPane.showMessageDialog(null, "Sucesso na consulta", "Consulta", 1);
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Serviço não cadastrada", "Erro na Consulta", 0);
            limpar();
        }
    }
    
    public void excluir(){
        Servico serv = new Servico();
        
        serv.setCodigo(txtCodigo.getText());
        
        serv = gerServ.consultaCodigo(serv);
        
        if(serv != null){
            
            txtCodigo.setText(serv.getCodigo());
            txtLuthier.setText(serv.getLuthier());
            txtStatus.setText(serv.getStatus());
            txtValor.setText(Float.toString(serv.getValor()));
            txtDescricao.setText(serv.getDescricao());
        
            

            int perg = JOptionPane.showConfirmDialog(null, "Deseja excluir?", 
                                   "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
            if(perg == 0){
                gerServ.excluirServ(serv);
                JOptionPane.showMessageDialog(null, "Sucesso na exclusão", "Exclusão", 1);
                
            }
            
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Serviço não cadastrado", "Erro na Consulta", 0);
            limpar();
        }
    }
    
    public void concluir(){
        Servico serv = new Servico();
        
        serv.setCodigo(txtCodigo.getText());
        
        serv = gerServ.consultaCodigo(serv);
        
        if(serv != null){
            
            txtCodigo.setText(serv.getCodigo());
            txtLuthier.setText(serv.getLuthier());
            txtStatus.setText(serv.getStatus());
            txtValor.setText(Float.toString(serv.getValor()));
            txtDescricao.setText(serv.getDescricao());
        
            

            int perg = JOptionPane.showConfirmDialog(null, "Deseja concluir o serviço?", 
                                   "Confirmação de Conclusão", JOptionPane.YES_NO_OPTION);
            if(perg == 0){
                gerServ.concluirServ(serv);
                JOptionPane.showMessageDialog(null, "Sucesso na conclusão", "Conclusão", 1);
                
            }
            
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Serviço não cadastrado", "Erro na Consulta", 0);
            limpar();
        }
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
            java.util.logging.Logger.getLogger(JanelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TabServico1;
    private javax.swing.JScrollPane TxtDescricao;
    private javax.swing.JToggleButton btCadastrar;
    private javax.swing.JToggleButton btConcluir;
    private javax.swing.JToggleButton btConsultar;
    private javax.swing.JToggleButton btExcluir;
    private javax.swing.JToggleButton btLimpar;
    private javax.swing.JToggleButton btSair;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbLuthier;
    private javax.swing.JLabel lbServico;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbValor;
    private static javax.swing.JTable tabServico;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtLuthier;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
