/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.UI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalho.armazenamento.Armazenamento;
import trabalho.modeloDeDados.Cliente;
import trabalho.modeloDeDados.Configuracao;
import trabalho.modeloDeDados.Controle;
import trabalho.modeloDeDados.Funcionario;

/**
 *
 * @author gabri
 */
public class Frame_cadastro_usuario extends javax.swing.JFrame  {

    /**
     * Creates new form Frame_cadastro_cliente
     */
    public Frame_cadastro_usuario() {
        initComponents();
        
        this.setTitle("Cadastro de cliente");
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
        Text_cadastro_cliente_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Text_cadastro_cliente_CPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Text_cadastro_cliente_RG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Text_cadastro_cliente_Codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Text_cadastro_cliente_data_nascimento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Text_cadastro_cliente_endereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Text_cadastro_cliente_CEP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Text_cadastro_cliente_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Text_cadastro_cliente_Categoria_CNH = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Text_cadastro_cliente_Numero_CNH = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Text_cadastro_cliente_validade_CNH = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Button_cadastrar_cliente = new javax.swing.JButton();
        Cadastro_cliente_text_resultado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Cadastro_usuario_salario = new javax.swing.JTextField();
        Cadastro_usuario_PIS = new javax.swing.JTextField();
        Cadastro_usuario_adimicao = new javax.swing.JTextField();
        button_cadastrar_funcionario = new javax.swing.JButton();
        jCheckBox_sim = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        jLabel4.setText("Codigo:");

        jLabel5.setText("Data de nascimento:");

        jLabel6.setText("Endereço:");

        jLabel7.setText("CEP:");

        jLabel8.setText("Email:");

        jLabel9.setText("Categoria CNH:");

        jLabel10.setText("Numero CNH:");

        Text_cadastro_cliente_Numero_CNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_cadastro_cliente_Numero_CNHActionPerformed(evt);
            }
        });

        jLabel11.setText("Validade CNH:");

        jLabel12.setText("Dados comuns para o cadastro");

        jLabel13.setText("Cliente Ouro?");

        Button_cadastrar_cliente.setText("Cadastrar cliente");
        Button_cadastrar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cadastrar_clienteActionPerformed(evt);
            }
        });

        jLabel14.setText("Dados para o cadastro de clientes:");

        jLabel15.setText("Dados para o cadastro de funcionarios:");

        jLabel16.setText("Salario:");

        jLabel17.setText("PIS:");

        jLabel18.setText("Data de adimição:");

        button_cadastrar_funcionario.setText("Cadastrar funcionario");
        button_cadastrar_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cadastrar_funcionarioActionPerformed(evt);
            }
        });

        jCheckBox_sim.setText("Sim");
        jCheckBox_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_simActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Text_cadastro_cliente_Categoria_CNH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Text_cadastro_cliente_Numero_CNH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Text_cadastro_cliente_validade_CNH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jCheckBox_sim, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)))
                                        .addGap(82, 82, 82))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addGap(66, 66, 66)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Text_cadastro_cliente_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Text_cadastro_cliente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Text_cadastro_cliente_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Text_cadastro_cliente_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel14))
                                        .addGap(48, 48, 48)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Text_cadastro_cliente_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(86, 86, 86)
                                                .addComponent(Text_cadastro_cliente_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel8))
                                                .addGap(59, 59, 59)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Text_cadastro_cliente_email, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Text_cadastro_cliente_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel15)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Cadastro_usuario_salario)
                                            .addComponent(Cadastro_usuario_PIS)
                                            .addComponent(Cadastro_usuario_adimicao, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))))
                            .addComponent(Cadastro_cliente_text_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Button_cadastrar_cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_cadastrar_funcionario)
                                .addGap(74, 74, 74))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Text_cadastro_cliente_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Text_cadastro_cliente_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Text_cadastro_cliente_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Text_cadastro_cliente_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Text_cadastro_cliente_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Text_cadastro_cliente_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Text_cadastro_cliente_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Text_cadastro_cliente_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(Cadastro_usuario_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_sim))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Text_cadastro_cliente_Categoria_CNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(Cadastro_usuario_PIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Text_cadastro_cliente_Numero_CNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(Cadastro_usuario_adimicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Text_cadastro_cliente_validade_CNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cadastrar_cliente)
                    .addComponent(button_cadastrar_funcionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cadastro_cliente_text_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_cadastro_cliente_Numero_CNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_cadastro_cliente_Numero_CNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_cadastro_cliente_Numero_CNHActionPerformed

    private void Button_cadastrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cadastrar_clienteActionPerformed
          
        try {                                                         
            
            String nome_conta_cliente = Text_cadastro_cliente_nome.getText();
            
            String cpf_conta_cliente = Text_cadastro_cliente_CPF.getText();
            
            String rg_conta_cliente = Text_cadastro_cliente_RG.getText();
            
            int codigo_conta_cliente = Integer.parseInt(Text_cadastro_cliente_Codigo.getText());
            
            String data_nascimento_conta_cliente = Text_cadastro_cliente_data_nascimento.getText();
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            Calendar cal = Calendar.getInstance();
            
            cal.setTime(sdf.parse(data_nascimento_conta_cliente));
            
            String CEP_conta_cliente = Text_cadastro_cliente_CEP.getText();
            
            String Categoria_CNH_conta_cliente = Text_cadastro_cliente_Categoria_CNH.getText();
            
            String Numero_CNH_conta_cliente = Text_cadastro_cliente_Numero_CNH.getText();
            
            String Validade_CNH_conta_cliente = Text_cadastro_cliente_validade_CNH.getText();
            
            Calendar cal2 = Calendar.getInstance();
            
            cal2.setTime(sdf.parse(Validade_CNH_conta_cliente));
            
            String Endereco_conta_cliente = Text_cadastro_cliente_endereco.getText();
            
            String Email_conta_cliente = Text_cadastro_cliente_email.getText();
            
            boolean ouro = false;
            
            if (jCheckBox_sim.isSelected()){
                
                ouro = true;
            }
            
            System.out.println(nome_conta_cliente + cpf_conta_cliente + rg_conta_cliente + codigo_conta_cliente + data_nascimento_conta_cliente + CEP_conta_cliente + Categoria_CNH_conta_cliente + Numero_CNH_conta_cliente + Validade_CNH_conta_cliente + Endereco_conta_cliente + Email_conta_cliente + ouro);
            
            Cadastro_cliente_text_resultado.setText(nome_conta_cliente + cpf_conta_cliente + rg_conta_cliente + codigo_conta_cliente + data_nascimento_conta_cliente + CEP_conta_cliente + Categoria_CNH_conta_cliente + Numero_CNH_conta_cliente + Validade_CNH_conta_cliente + Endereco_conta_cliente + Email_conta_cliente + ouro);
            
            //(String categoriaCNH, String numeroCNH, Calendar vencimentoCNH, boolean clienteOuro, int codigoUsuario, String nome, String cpf, String rg, Calendar data_nascimento, String endereco, String cep, String email)
            
            Cliente teste = new Cliente(Categoria_CNH_conta_cliente, Numero_CNH_conta_cliente, cal2, ouro, codigo_conta_cliente, nome_conta_cliente, cpf_conta_cliente, rg_conta_cliente, cal, Endereco_conta_cliente, CEP_conta_cliente, Email_conta_cliente);
            
            Configuracao config_cliente = new Configuracao();
            
            config_cliente.setArquivoClientes(teste.toString());
            
            Controle controle_cliente = new Controle();
            
            controle_cliente.adicionarCliente(teste);
            
            controle_cliente.setConfiguracoes(config_cliente);
            
            controle_cliente.salvar_cliente();
            
        } catch (ParseException ex) {
            Logger.getLogger(Frame_cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Button_cadastrar_clienteActionPerformed

    private void jCheckBox_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_simActionPerformed
        
        
    }//GEN-LAST:event_jCheckBox_simActionPerformed

    private void button_cadastrar_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cadastrar_funcionarioActionPerformed
        try {
            //Funcionario(float salario, String pis, Calendar dataAdmissao, int codigoUsuario, String nome, String cpf, String rg, Calendar data_nascimento, String endereco, String cep, String email)
            
            float salario = Float.parseFloat(Cadastro_usuario_salario.getText());
            
            String pis = Cadastro_usuario_PIS.getText();
            
            String adimicao = Cadastro_usuario_adimicao.getText();
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            Calendar adimi = Calendar.getInstance();
            
            int codigo_conta_cliente = Integer.parseInt(Text_cadastro_cliente_Codigo.getText());
            
            String nome_conta_cliente = Text_cadastro_cliente_nome.getText();
            
            String cpf_conta_cliente = Text_cadastro_cliente_CPF.getText();
            
            String rg_conta_cliente = Text_cadastro_cliente_RG.getText();
            
            String data_nascimento_conta_cliente = Text_cadastro_cliente_data_nascimento.getText();
            
            Calendar nascimento = Calendar.getInstance();
            
            nascimento.setTime(sdf.parse(data_nascimento_conta_cliente));
            
            String CEP_conta_cliente = Text_cadastro_cliente_CEP.getText();
            
            String Endereco_conta_cliente = Text_cadastro_cliente_endereco.getText();
            
            String Email_conta_cliente = Text_cadastro_cliente_email.getText();
            
            Funcionario teste = new Funcionario(salario, pis, adimi, codigo_conta_cliente, nome_conta_cliente, cpf_conta_cliente, rg_conta_cliente, nascimento, Endereco_conta_cliente, CEP_conta_cliente, Email_conta_cliente  );
            
            Configuracao config_funcionario = new Configuracao();
            
            config_funcionario.setArquivoFuncionarios(teste.toString());
            
            Controle controle_cliente = new Controle();
            
            controle_cliente.adicionarFuncionario(teste);
            
            controle_cliente.setConfiguracoes(config_funcionario);
            
            controle_cliente.salvar_funcionario();
            
            adimi.setTime(sdf.parse(adimicao));
        } catch (ParseException ex) {
            Logger.getLogger(Frame_cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_cadastrar_funcionarioActionPerformed

    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_cadastro_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_cadastrar_cliente;
    private javax.swing.JTextField Cadastro_cliente_text_resultado;
    private javax.swing.JTextField Cadastro_usuario_PIS;
    private javax.swing.JTextField Cadastro_usuario_adimicao;
    private javax.swing.JTextField Cadastro_usuario_salario;
    private javax.swing.JTextField Text_cadastro_cliente_CEP;
    private javax.swing.JTextField Text_cadastro_cliente_CPF;
    private javax.swing.JTextField Text_cadastro_cliente_Categoria_CNH;
    private javax.swing.JTextField Text_cadastro_cliente_Codigo;
    private javax.swing.JTextField Text_cadastro_cliente_Numero_CNH;
    private javax.swing.JTextField Text_cadastro_cliente_RG;
    private javax.swing.JTextField Text_cadastro_cliente_data_nascimento;
    private javax.swing.JTextField Text_cadastro_cliente_email;
    private javax.swing.JTextField Text_cadastro_cliente_endereco;
    private javax.swing.JTextField Text_cadastro_cliente_nome;
    private javax.swing.JTextField Text_cadastro_cliente_validade_CNH;
    private javax.swing.JButton button_cadastrar_funcionario;
    private javax.swing.JCheckBox jCheckBox_sim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
