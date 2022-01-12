/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.UI;
import trabalho.modeloDeDados.Controle;
import trabalho.modeloDeDados.Locacao;
import trabalho.modeloDeDados.Veiculo;
import trabalho.modeloDeDados.VeiculoNacional;
import trabalho.modeloDeDados.VeiculoImportado;
/**
 *
 * @author gabri
 */
public class FrameVeiculos extends javax.swing.JFrame {
    Controle controle = new Controle();
    /**
     * Creates new form Frame_veiculos_cadastrados
     */
    public FrameVeiculos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        VeiculosCadastradosButtom = new javax.swing.JButton();
        textVeiculos = new javax.swing.JTextField();
        VeiculosButtonVeiculosDisponiveis = new javax.swing.JButton();
        VeiculosButtonNacionais = new javax.swing.JButton();
        VeiculosButtonInternacionais = new javax.swing.JButton();
        VeiculosButtonVeiculosAlocados = new javax.swing.JButton();
        VeiculosButtonAtraso = new javax.swing.JButton();
        VeiculosButtonVeiculosCliente = new javax.swing.JButton();
        TextFieldNomeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veiculos cadastrados");

        VeiculosCadastradosButtom.setText("Verificar veículos cadastrados");
        VeiculosCadastradosButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiculosCadastradosButtomActionPerformed(evt);
            }
        });

        VeiculosButtonVeiculosDisponiveis.setText("Verificar veículos disponíveis para locação");
        VeiculosButtonVeiculosDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiculosButtonVeiculosDisponiveisActionPerformed(evt);
            }
        });

        VeiculosButtonNacionais.setText("Verificar veículos nacionais");
        VeiculosButtonNacionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiculosButtonNacionaisActionPerformed(evt);
            }
        });

        VeiculosButtonInternacionais.setText("Verificar veículos internacionais");
        VeiculosButtonInternacionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiculosButtonInternacionaisActionPerformed(evt);
            }
        });

        VeiculosButtonVeiculosAlocados.setText("Verificar veículos já alocados");
        VeiculosButtonVeiculosAlocados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiculosButtonVeiculosAlocadosActionPerformed(evt);
            }
        });

        VeiculosButtonAtraso.setText("Verificar veículos em atraso");
        VeiculosButtonAtraso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiculosButtonAtrasoActionPerformed(evt);
            }
        });

        VeiculosButtonVeiculosCliente.setText("Verificar veículos de um cliente");
        VeiculosButtonVeiculosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiculosButtonVeiculosClienteActionPerformed(evt);
            }
        });

        TextFieldNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNomeClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Código do Cliente:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Relatório de veículos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(VeiculosButtonVeiculosDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VeiculosCadastradosButtom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VeiculosButtonNacionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VeiculosButtonInternacionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VeiculosButtonVeiculosAlocados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VeiculosButtonAtraso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VeiculosButtonVeiculosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldNomeCliente))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(VeiculosCadastradosButtom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VeiculosButtonVeiculosDisponiveis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VeiculosButtonNacionais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VeiculosButtonInternacionais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VeiculosButtonVeiculosAlocados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VeiculosButtonAtraso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VeiculosButtonVeiculosCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(textVeiculos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VeiculosButtonVeiculosDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiculosButtonVeiculosDisponiveisActionPerformed
        String veiculos = "";
        for(Veiculo veiculo: controle.getVeiculos()){
            if(!veiculo.isAlugado()){
                veiculos += veiculo.toString();
            }
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_VeiculosButtonVeiculosDisponiveisActionPerformed

    private void VeiculosCadastradosButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiculosCadastradosButtomActionPerformed
        String veiculos = "";
        for(Veiculo veiculo: controle.getVeiculos()){
            veiculos += veiculo.toString();
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_VeiculosCadastradosButtomActionPerformed

    private void VeiculosButtonNacionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiculosButtonNacionaisActionPerformed
        String veiculos = "";
        for(Veiculo veiculo: controle.getVeiculos()){
            if(veiculo instanceof VeiculoNacional){
                veiculos += veiculo.toString();
            }
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_VeiculosButtonNacionaisActionPerformed

    private void VeiculosButtonInternacionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiculosButtonInternacionaisActionPerformed
        String veiculos = "";
        for(Veiculo veiculo: controle.getVeiculos()){
            if(veiculo instanceof VeiculoImportado){
                veiculos += veiculo.toString();
            }
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_VeiculosButtonInternacionaisActionPerformed

    private void VeiculosButtonVeiculosAlocadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiculosButtonVeiculosAlocadosActionPerformed
        String veiculos = "";
        for(Veiculo veiculo: controle.getVeiculos()){
            if(veiculo.isAlugado()){
                veiculos += veiculo.toString();
            }
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_VeiculosButtonVeiculosAlocadosActionPerformed

    private void VeiculosButtonAtrasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiculosButtonAtrasoActionPerformed
        String veiculos = "";
        for(Locacao locacao: controle.getLocacoes()){
            if(!locacao.isFinalizada()){
                if(!locacao.verificarAtraso()){
                    veiculos += locacao.getVeiculo().toString() + "\n";
                }
            }
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_VeiculosButtonAtrasoActionPerformed

    private void VeiculosButtonVeiculosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiculosButtonVeiculosClienteActionPerformed
        
        String nome = TextFieldNomeCliente.getText();
                
    }//GEN-LAST:event_VeiculosButtonVeiculosClienteActionPerformed

    private void TextFieldNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNomeClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldNomeCliente;
    private javax.swing.JButton VeiculosButtonAtraso;
    private javax.swing.JButton VeiculosButtonInternacionais;
    private javax.swing.JButton VeiculosButtonNacionais;
    private javax.swing.JButton VeiculosButtonVeiculosAlocados;
    private javax.swing.JButton VeiculosButtonVeiculosCliente;
    private javax.swing.JButton VeiculosButtonVeiculosDisponiveis;
    private javax.swing.JButton VeiculosCadastradosButtom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField textVeiculos;
    // End of variables declaration//GEN-END:variables
}
