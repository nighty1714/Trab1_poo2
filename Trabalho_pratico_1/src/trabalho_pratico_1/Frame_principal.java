/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_pratico_1;

/**
 *
 * @author gabri
 */
public class Frame_principal extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame_principal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_veiculos_cadastrados = new javax.swing.JMenuItem();
        menu_cadastrar_veiculo_importado = new javax.swing.JMenuItem();
        menu_cadastrar_veiculo_nacional = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_funcionarios_cadastrados = new javax.swing.JMenuItem();
        menu_funcionario_mes = new javax.swing.JMenuItem();
        menu_clientes_cadastrados = new javax.swing.JMenuItem();
        menu_historico_locacao_cliente = new javax.swing.JMenuItem();
        menu_cadastrar_funcionario = new javax.swing.JMenuItem();
        menu_cadastrar_cliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_clientes_locacoes_atrasadas = new javax.swing.JMenuItem();
        menu_historico_locacoes = new javax.swing.JMenuItem();
        menu_locacao_mes_lucro = new javax.swing.JMenuItem();
        menu_locacoes_finalizadas = new javax.swing.JMenuItem();
        menu_locacoes_atrasadas = new javax.swing.JMenuItem();
        menu_locacoes_nao_finalizadas = new javax.swing.JMenuItem();
        menu_criar_locacao = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menu_seguros_cadastrados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("1337");

        jMenu1.setText("Veiculos");

        menu_veiculos_cadastrados.setText("Verificar veiculos");
        menu_veiculos_cadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_veiculos_cadastradosActionPerformed(evt);
            }
        });
        jMenu1.add(menu_veiculos_cadastrados);

        menu_cadastrar_veiculo_importado.setText("Cadastrar Veiculo importado");
        jMenu1.add(menu_cadastrar_veiculo_importado);

        menu_cadastrar_veiculo_nacional.setText("Cadastrar Veiculo nacional");
        jMenu1.add(menu_cadastrar_veiculo_nacional);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pessoas");

        menu_funcionarios_cadastrados.setText("Funcionarios cadastrados");
        jMenu2.add(menu_funcionarios_cadastrados);

        menu_funcionario_mes.setText("Funcionario do mes");
        jMenu2.add(menu_funcionario_mes);

        menu_clientes_cadastrados.setText("Clientes cadastrados");
        jMenu2.add(menu_clientes_cadastrados);

        menu_historico_locacao_cliente.setText("Historico de locação cliente");
        jMenu2.add(menu_historico_locacao_cliente);

        menu_cadastrar_funcionario.setText("Cadastrar Funcionario");
        jMenu2.add(menu_cadastrar_funcionario);

        menu_cadastrar_cliente.setText("Cadastrar Cliente");
        menu_cadastrar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastrar_clienteActionPerformed(evt);
            }
        });
        jMenu2.add(menu_cadastrar_cliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Locações");

        menu_clientes_locacoes_atrasadas.setText("Clientes com locações atrasadas");
        menu_clientes_locacoes_atrasadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clientes_locacoes_atrasadasActionPerformed(evt);
            }
        });
        jMenu3.add(menu_clientes_locacoes_atrasadas);

        menu_historico_locacoes.setText("Histórico de locações");
        jMenu3.add(menu_historico_locacoes);

        menu_locacao_mes_lucro.setText("Locação e lucro de um mês");
        jMenu3.add(menu_locacao_mes_lucro);

        menu_locacoes_finalizadas.setText("Locações finalizadas");
        jMenu3.add(menu_locacoes_finalizadas);

        menu_locacoes_atrasadas.setText("Locações atrasadas");
        jMenu3.add(menu_locacoes_atrasadas);

        menu_locacoes_nao_finalizadas.setText("Locações não finalizadas");
        jMenu3.add(menu_locacoes_nao_finalizadas);

        menu_criar_locacao.setText("Criar locação");
        jMenu3.add(menu_criar_locacao);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Tipos de seguro");

        menu_seguros_cadastrados.setText("Seguros cadastrados");
        jMenu4.add(menu_seguros_cadastrados);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_clientes_locacoes_atrasadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clientes_locacoes_atrasadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_clientes_locacoes_atrasadasActionPerformed

    private void menu_cadastrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastrar_clienteActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_cadastro_cliente().setVisible(true);
            }
        });
        
    }//GEN-LAST:event_menu_cadastrar_clienteActionPerformed

    private void menu_veiculos_cadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_veiculos_cadastradosActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_veiculos().setVisible(true);
            }
        });
    }//GEN-LAST:event_menu_veiculos_cadastradosActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menu_cadastrar_cliente;
    private javax.swing.JMenuItem menu_cadastrar_funcionario;
    private javax.swing.JMenuItem menu_cadastrar_veiculo_importado;
    private javax.swing.JMenuItem menu_cadastrar_veiculo_nacional;
    private javax.swing.JMenuItem menu_clientes_cadastrados;
    private javax.swing.JMenuItem menu_clientes_locacoes_atrasadas;
    private javax.swing.JMenuItem menu_criar_locacao;
    private javax.swing.JMenuItem menu_funcionario_mes;
    private javax.swing.JMenuItem menu_funcionarios_cadastrados;
    private javax.swing.JMenuItem menu_historico_locacao_cliente;
    private javax.swing.JMenuItem menu_historico_locacoes;
    private javax.swing.JMenuItem menu_locacao_mes_lucro;
    private javax.swing.JMenuItem menu_locacoes_atrasadas;
    private javax.swing.JMenuItem menu_locacoes_finalizadas;
    private javax.swing.JMenuItem menu_locacoes_nao_finalizadas;
    private javax.swing.JMenuItem menu_seguros_cadastrados;
    private javax.swing.JMenuItem menu_veiculos_cadastrados;
    // End of variables declaration//GEN-END:variables
}
