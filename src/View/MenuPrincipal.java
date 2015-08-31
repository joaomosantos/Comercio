/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ImageIcon;
import Object.Pessoa;
import Controller.ControllerSistema;
import javax.swing.JTextField;
import javax.swing.JLabel;

/**
 *
 * @author Max Oliveira
 */
public class MenuPrincipal extends javax.swing.JFrame {
    /**
     * Creates new form menuPrincipal
     */ 
    public MenuPrincipal() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
        hideFull();
    }
    
    public void UserAtual(Pessoa usuario) { 
        jlUsuarioAtual.setText(usuario.getNome());
    }
    
    public void hideFull() {
        jtpAdministrarAcesso.hide();
    }
    
    public void showAdministrarAcesso(boolean b) {
        jtpAdministrarAcesso.setVisible(b);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jlUsuarioAtual = new javax.swing.JLabel();
        jpMenu = new javax.swing.JPanel();
        jtpAdministrarAcesso = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfSobrenome = new javax.swing.JTextField();
        jtfemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jcbAtivo = new javax.swing.JCheckBox();
        jlErro1 = new javax.swing.JLabel();
        jlErro2 = new javax.swing.JLabel();
        jlErro3 = new javax.swing.JLabel();
        jlErro4 = new javax.swing.JLabel();
        jlErro5 = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jmbMenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiMenu = new javax.swing.JMenuItem();
        jmConfiguracao = new javax.swing.JMenu();
        jmiAdministrarAcesso = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Comercio");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Sair");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlUsuarioAtual.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jlUsuarioAtual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlUsuarioAtual)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlUsuarioAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpMenu.setMinimumSize(new java.awt.Dimension(0, 611));

        jtpAdministrarAcesso.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usuario"));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel1.setText("Nome*:");

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setText("Sobrenome*:");

        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setText("Email*:");

        jtfNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtfSobrenome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtfemail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel4.setText("Usuario*:");

        jtfUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel5.setText("Senha*:");

        jpfSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jcbAtivo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jcbAtivo.setSelected(true);
        jcbAtivo.setText("Ativar Conta");
        jcbAtivo.setEnabled(false);

        jlErro1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jlErro1.setForeground(new java.awt.Color(255, 0, 0));
        jlErro1.setText("Não é permitido caracter especial ou campo em branco");

        jlErro2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jlErro2.setForeground(new java.awt.Color(255, 0, 0));
        jlErro2.setText("Não é permitido caracter especial ou campo em branco");

        jlErro3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jlErro3.setForeground(new java.awt.Color(255, 0, 0));
        jlErro3.setText("Não é permitido caracter especial ou campo em branco");

        jlErro4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jlErro4.setForeground(new java.awt.Color(255, 0, 0));
        jlErro4.setText("Não é permitido caracter especial ou campo em branco");

        jlErro5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jlErro5.setForeground(new java.awt.Color(255, 0, 0));
        jlErro5.setText("Não é permitido caracter especial ou campo em branco");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbAtivo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlErro5))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlErro3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlErro4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlErro2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlErro1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlErro1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlErro2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlErro3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlErro4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlErro5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jcbAtivo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jbSalvar.setText("Salvar");
        jbSalvar.setFocusPainted(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.setFocusPainted(false);
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 812, Short.MAX_VALUE)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbLimpar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jtpAdministrarAcesso.addTab("Cadastrar Acesso", jPanel3);

        jPanel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        jtpAdministrarAcesso.addTab("Gerenciar Acesso", jPanel4);

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpAdministrarAcesso)
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtpAdministrarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmiMenu.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jmiMenu.setText("Menu");
        jmiMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMenuActionPerformed(evt);
            }
        });
        jMenu1.add(jmiMenu);

        jmbMenuPrincipal.add(jMenu1);

        jmConfiguracao.setText("Configuração");
        jmConfiguracao.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N

        jmiAdministrarAcesso.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jmiAdministrarAcesso.setText("Administrar Acesso");
        jmiAdministrarAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdministrarAcessoActionPerformed(evt);
            }
        });
        jmConfiguracao.add(jmiAdministrarAcesso);

        jmbMenuPrincipal.add(jmConfiguracao);

        setJMenuBar(jmbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAdministrarAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdministrarAcessoActionPerformed
        hideFull();
        showAdministrarAcesso(true);
        hideLabel();
    }//GEN-LAST:event_jmiAdministrarAcessoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean status;
        ControllerSistema controllerSistema = new ControllerSistema();
        status = controllerSistema.logoffUsuario();
        if(status == true) {
            this.dispose();
            TelaLogin login = new TelaLogin();
            login.show();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmiMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMenuActionPerformed
        hideFull();
    }//GEN-LAST:event_jmiMenuActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        JTextField [] tf = {jtfNome, jtfSobrenome, jtfemail, jtfUsuario, jpfSenha};
        JLabel [] l = {jlErro1, jlErro2, jlErro3, jlErro4, jlErro5};
        Pessoa acesso = new Pessoa();
        acesso.setNome(jtfNome.getText().toUpperCase());
        acesso.setSobrenome(jtfSobrenome.getText().toUpperCase());
        acesso.setEmail(jtfemail.getText().toUpperCase());
        acesso.setUsuario(jtfUsuario.getText().toUpperCase());
        acesso.setSenha(jpfSenha.getText().toUpperCase());
        acesso.setAtivo(jcbAtivo.isSelected());
        ControllerSistema controllerSistema = new ControllerSistema();
        controllerSistema.salvarUsuario(acesso, tf, l);
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtfNome.setText(null);
        jtfSobrenome.setText(null);
        jtfemail.setText(null);
        jtfUsuario.setText(null);
        jpfSenha.setText(null);  
    }//GEN-LAST:event_jbLimparActionPerformed

    public void hideLabel() {
        JLabel [] l = {jlErro1, jlErro2, jlErro3, jlErro4, jlErro5};
        for(int i = 0; i < l.length; i++) {
            l[i].setVisible(false);
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JCheckBox jcbAtivo;
    private javax.swing.JLabel jlErro1;
    private javax.swing.JLabel jlErro2;
    private javax.swing.JLabel jlErro3;
    private javax.swing.JLabel jlErro4;
    private javax.swing.JLabel jlErro5;
    private javax.swing.JLabel jlUsuarioAtual;
    private javax.swing.JMenu jmConfiguracao;
    private javax.swing.JMenuBar jmbMenuPrincipal;
    private javax.swing.JMenuItem jmiAdministrarAcesso;
    private javax.swing.JMenuItem jmiMenu;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfSobrenome;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JTextField jtfemail;
    private javax.swing.JTabbedPane jtpAdministrarAcesso;
    // End of variables declaration//GEN-END:variables
}
