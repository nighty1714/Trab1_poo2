/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.UI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalho.armazenamento.Armazenamento;
import trabalho.modeloDeDados.Cartao;
import trabalho.modeloDeDados.Configuracao;
import trabalho.modeloDeDados.Controle;
import trabalho.modeloDeDados.Dinheiro;
import trabalho.modeloDeDados.Locacao;
import trabalho.modeloDeDados.Veiculo;

/**
 *
 * @author gabri
 */
public class Frame_criar_locacao extends javax.swing.JFrame {
    
    Controle a = new Controle();

    /**
     * Creates new form Frame_criar_locacao
     */
    public Frame_criar_locacao() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        text_field_codigo_locacao = new javax.swing.JTextField();
        text_field_codigo_funcionario = new javax.swing.JTextField();
        text_field_data_devolucao = new javax.swing.JTextField();
        text_field_codigo_cliente = new javax.swing.JTextField();
        text_field_data_locacao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        text_field_valor = new javax.swing.JTextField();
        Button_criar_locacao = new javax.swing.JButton();
        Cartao = new javax.swing.JCheckBox();
        Dinheiro = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        Text_field_nome_cartao = new javax.swing.JTextField();
        Text_field_numero_cartao = new javax.swing.JTextField();
        Text_field_bandeira_cartao = new javax.swing.JTextField();
        Finalizada = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        codigo_veiculo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar locação");

        jLabel1.setText("Código locação:");

        jLabel2.setText("Código funcionario:");

        jLabel3.setText("Código cliente:");

        jLabel4.setText("Data locação");

        jLabel5.setText("Data devolução:");

        jLabel6.setText("Valor total:");

        jLabel7.setText("Forma pagamento:");

        Button_criar_locacao.setText("Cadastrar");
        Button_criar_locacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_criar_locacaoActionPerformed(evt);
            }
        });

        Cartao.setText("Cartão");

        Dinheiro.setText("Dinheiro");

        jLabel8.setText("Para o cartão:");

        Finalizada.setText("Finalizada");

        jLabel9.setText("Código do veiculo:");

        codigo_veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_veiculoActionPerformed(evt);
            }
        });

        jLabel10.setText("Nome:");

        jLabel11.setText("Bandeira");

        jLabel12.setText("Numero:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(text_field_codigo_funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(text_field_codigo_locacao))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_field_codigo_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_field_data_devolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(text_field_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Text_field_numero_cartao)
                                    .addComponent(text_field_data_locacao, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dinheiro)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(Cartao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(88, 88, 88))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Finalizada)
                            .addComponent(Button_criar_locacao)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Text_field_nome_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Text_field_bandeira_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(codigo_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_field_codigo_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(text_field_data_devolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_field_codigo_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(text_field_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(text_field_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(text_field_data_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Dinheiro)
                    .addComponent(Cartao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Text_field_nome_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Text_field_bandeira_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Text_field_numero_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigo_veiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(Finalizada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Button_criar_locacao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_criar_locacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_criar_locacaoActionPerformed
        try {
            // Locacao(int codigoLocacao, int codigoCliente, int codigoFuncionario, Calendar dataLocacao, Calendar dataDevolucao, float valorTotal, Pagamento formaPagamento, boolean finalizada, Veiculo veiculo) {
            
            int codigo = Integer.parseInt(text_field_codigo_locacao.getText());
            
            int codigo_u = Integer.parseInt(text_field_codigo_funcionario.getText());
            
            int codigo_c = Integer.parseInt(text_field_codigo_cliente.getText());
            
            String data_l = text_field_data_locacao.getText();
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            Calendar data_lo = Calendar.getInstance();
            
            data_lo.setTime(sdf.parse(data_l));
            
            String data_d = text_field_data_devolucao.getText();
            
            Calendar data_de = Calendar.getInstance();
            
            data_de.setTime(sdf.parse(data_d));
            
            float valor = Float.parseFloat(text_field_valor.getText());
            
            boolean finalizada = false;
            
            if (Finalizada.isSelected()){
                
                finalizada = true;
                
            }
            
            String nome_c = Text_field_nome_cartao.getText();
            
            String bandeira = Text_field_bandeira_cartao.getText();
            
            String numero = Text_field_numero_cartao.getText();
            
            Dinheiro d = new Dinheiro();
            
            Cartao cart = new Cartao(nome_c, bandeira, numero);
            
            //aqui
            
            int codigocarro = Integer.parseInt(codigo_veiculo.getText());
            
            ArrayList<Veiculo> ab = new ArrayList();
            
            ab = a.getVeiculos();
            
            for (int i = 0; i < ab.size(); i++){
     
            if(ab.get(i).getCodigoVeiculo() == codigocarro){
        
               if(Dinheiro.isSelected()){
                   
                   Locacao teste = new Locacao(codigo, codigo_c, codigo_u, data_lo, data_de, valor, d, finalizada, ab.get(i) );
           
                   Controle controle_loc = new Controle();
            
                   controle_loc.adicionarLocacao(teste);
            
                   controle_loc.salvarLocacoes();
                   
               }
               
               else{
                   
                   Locacao teste = new Locacao(codigo, codigo_c, codigo_u, data_lo, data_de, valor, cart, finalizada, ab.get(i) );
            
                   Controle controle_loc = new Controle();
            
                   controle_loc.adicionarLocacao(teste);
            
                   controle_loc.salvarLocacoes();
               }
               
               
        
            }
            
            else {
                
                //imprime carro não disponivel
                
            }
     
           }
               
        } catch (ParseException ex) {
            Logger.getLogger(Frame_criar_locacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_criar_locacaoActionPerformed

    private void codigo_veiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_veiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_veiculoActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_criar_locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_criar_locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_criar_locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_criar_locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_criar_locacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_criar_locacao;
    private javax.swing.JCheckBox Cartao;
    private javax.swing.JCheckBox Dinheiro;
    private javax.swing.JCheckBox Finalizada;
    private javax.swing.JTextField Text_field_bandeira_cartao;
    private javax.swing.JTextField Text_field_nome_cartao;
    private javax.swing.JTextField Text_field_numero_cartao;
    private javax.swing.JTextField codigo_veiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField text_field_codigo_cliente;
    private javax.swing.JTextField text_field_codigo_funcionario;
    private javax.swing.JTextField text_field_codigo_locacao;
    private javax.swing.JTextField text_field_data_devolucao;
    private javax.swing.JTextField text_field_data_locacao;
    private javax.swing.JTextField text_field_valor;
    // End of variables declaration//GEN-END:variables
}
