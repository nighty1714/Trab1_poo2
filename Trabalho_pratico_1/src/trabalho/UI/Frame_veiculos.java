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
public class Frame_veiculos extends javax.swing.JFrame {
    Controle controle = new Controle();
    /**
     * Creates new form Frame_veiculos_cadastrados
     */
    public Frame_veiculos() {
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
        Veiculos_cadastrados_buttom = new javax.swing.JButton();
        textVeiculos = new javax.swing.JTextField();
        Veiculos_button_veiculos_disponiveis = new javax.swing.JButton();
        Veiculos_button_nacionais = new javax.swing.JButton();
        Veiculos_button_internacionais = new javax.swing.JButton();
        Veiculos_button_veiculos_alocados = new javax.swing.JButton();
        Veiculos_button_atraso = new javax.swing.JButton();
        Veiculos_button_veiculos_cliente = new javax.swing.JButton();
        Text_field_nome_cliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veiculos cadastrados");

        Veiculos_cadastrados_buttom.setText("Verificar veículos cadastrados");
        Veiculos_cadastrados_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Veiculos_cadastrados_buttomActionPerformed(evt);
            }
        });

        Veiculos_button_veiculos_disponiveis.setText("Verificar veículos disponíveis para locação");
        Veiculos_button_veiculos_disponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Veiculos_button_veiculos_disponiveisActionPerformed(evt);
            }
        });

        Veiculos_button_nacionais.setText("Verificar veículos nacionais");
        Veiculos_button_nacionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Veiculos_button_nacionaisActionPerformed(evt);
            }
        });

        Veiculos_button_internacionais.setText("Verificar veículos internacionais");
        Veiculos_button_internacionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Veiculos_button_internacionaisActionPerformed(evt);
            }
        });

        Veiculos_button_veiculos_alocados.setText("Verificar veículos já alocados");
        Veiculos_button_veiculos_alocados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Veiculos_button_veiculos_alocadosActionPerformed(evt);
            }
        });

        Veiculos_button_atraso.setText("Verificar veículos em atraso");
        Veiculos_button_atraso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Veiculos_button_atrasoActionPerformed(evt);
            }
        });

        Veiculos_button_veiculos_cliente.setText("Verificar veículos de um cliente");
        Veiculos_button_veiculos_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Veiculos_button_veiculos_clienteActionPerformed(evt);
            }
        });

        Text_field_nome_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_field_nome_clienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Veiculos_button_veiculos_disponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Veiculos_cadastrados_buttom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Veiculos_button_nacionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Veiculos_button_internacionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Veiculos_button_veiculos_alocados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Veiculos_button_atraso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Veiculos_button_veiculos_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Text_field_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Veiculos_cadastrados_buttom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Veiculos_button_veiculos_disponiveis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Veiculos_button_nacionais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Veiculos_button_internacionais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Veiculos_button_veiculos_alocados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Veiculos_button_atraso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_field_nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(13, 13, 13)
                        .addComponent(Veiculos_button_veiculos_cliente)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Veiculos_button_veiculos_disponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Veiculos_button_veiculos_disponiveisActionPerformed
        String veiculos = "";
        for(Veiculo veiculo: controle.getVeiculos()){
            if(!veiculo.isAlugado()){
                veiculos += veiculo.toString();
            }
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_Veiculos_button_veiculos_disponiveisActionPerformed

    private void Veiculos_cadastrados_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Veiculos_cadastrados_buttomActionPerformed
        String veiculos = "";
        for(Veiculo veiculo: controle.getVeiculos()){
            veiculos += veiculo.toString();
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_Veiculos_cadastrados_buttomActionPerformed

    private void Veiculos_button_nacionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Veiculos_button_nacionaisActionPerformed
        String veiculos = "";
        for(Veiculo veiculo: controle.getVeiculos()){
            if(veiculo instanceof VeiculoNacional){
                veiculos += veiculo.toString();
            }
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_Veiculos_button_nacionaisActionPerformed

    private void Veiculos_button_internacionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Veiculos_button_internacionaisActionPerformed
        String veiculos = "";
        for(Veiculo veiculo: controle.getVeiculos()){
            if(veiculo instanceof VeiculoImportado){
                veiculos += veiculo.toString();
            }
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_Veiculos_button_internacionaisActionPerformed

    private void Veiculos_button_veiculos_alocadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Veiculos_button_veiculos_alocadosActionPerformed
        String veiculos = "";
        for(Veiculo veiculo: controle.getVeiculos()){
            if(veiculo.isAlugado()){
                veiculos += veiculo.toString();
            }
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_Veiculos_button_veiculos_alocadosActionPerformed

    private void Veiculos_button_atrasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Veiculos_button_atrasoActionPerformed
        String veiculos = "";
        for(Locacao locacao: controle.getLocacoes()){
            if(!locacao.isFinalizada()){
                if(!locacao.verificarAtraso()){
                    veiculos += locacao.getVeiculo().toString();
                }
            }
        }
        textVeiculos.setText(veiculos);
    }//GEN-LAST:event_Veiculos_button_atrasoActionPerformed

    private void Veiculos_button_veiculos_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Veiculos_button_veiculos_clienteActionPerformed
        
        String nome = Text_field_nome_cliente.getText();
                
    }//GEN-LAST:event_Veiculos_button_veiculos_clienteActionPerformed

    private void Text_field_nome_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_field_nome_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_field_nome_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_veiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_veiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text_field_nome_cliente;
    private javax.swing.JButton Veiculos_button_atraso;
    private javax.swing.JButton Veiculos_button_internacionais;
    private javax.swing.JButton Veiculos_button_nacionais;
    private javax.swing.JButton Veiculos_button_veiculos_alocados;
    private javax.swing.JButton Veiculos_button_veiculos_cliente;
    private javax.swing.JButton Veiculos_button_veiculos_disponiveis;
    private javax.swing.JButton Veiculos_cadastrados_buttom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField textVeiculos;
    // End of variables declaration//GEN-END:variables
}
