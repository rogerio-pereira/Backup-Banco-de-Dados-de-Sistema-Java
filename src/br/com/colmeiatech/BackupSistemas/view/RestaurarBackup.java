
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.colmeiatech.BackupSistemas.view;


import br.com.colmeiatech.BackupSistemas.control.ControladorBackup;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rogério Eduardo Pereira <rogerio@groupsofter.com.br>
 * @version 1.0
 */
public class RestaurarBackup extends javax.swing.JFrame {

    /** Creates new form RealizarBackup */
    public RestaurarBackup() {
        initComponents();
        addKeyAndContainerListenerRecursively(this);
        this.setLocationRelativeTo(null);
    }

    //BOTAO ESC E ENTER
    //LISTENERS DO FRAME
    //KEYLISTENER RECURSIVO (COLOCA EM TODOS OS COMPONENTES)
    private void addKeyAndContainerListenerRecursively(Component c) 
    {  
        try 
        {  
            c.addKeyListener((KeyListener) this);  
            if (c instanceof Container) 
            {  
                Container cont = (Container) c;  
                cont.addContainerListener((ContainerListener) this);  
                Component[] children = cont.getComponents();  
                for (int i = 0; i < children.length; i++) 
                {  
                    addKeyAndContainerListenerRecursively(children[i]);  
                }  
            }  
        } catch (Exception e) {  
            //Anuncie Aqui  
        }  
    }  
    
    //EVENTOS KEYLISTENER
    public void keyTyped(KeyEvent e) {}  
    public void keyReleased(KeyEvent e) {}  
    public void componentAdded(ContainerEvent e) {}  
    public void componentRemoved(ContainerEvent e) {}  
    public void keyPressed(KeyEvent e) 
    {
        //TECLA ESC
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            botaoRestaurar.doClick();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        janelaBusca = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        textoLocal = new javax.swing.JTextField();
        botaoProcurar = new javax.swing.JButton();
        progresso = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        botaoRestaurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restaurar Backup");

        jLabel1.setText("Local");

        botaoProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/colmeiatech/BackupSistemas/view/img/magnifier.png"))); // NOI18N
        botaoProcurar.setText("Procurar");
        botaoProcurar.setPreferredSize(new java.awt.Dimension(150, 32));
        botaoProcurar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botaoProcurarActionPerformed(evt);
            }
        });

        botaoRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/colmeiatech/BackupSistemas/view/img/dialog-accept.png"))); // NOI18N
        botaoRestaurar.setText("Restaurar Backup");
        botaoRestaurar.setPreferredSize(new java.awt.Dimension(150, 32));
        botaoRestaurar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                botaoRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoRestaurar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(botaoProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botaoProcurarActionPerformed
    {//GEN-HEADEREND:event_botaoProcurarActionPerformed
        FileNameExtensionFilter sqlfilter = new FileNameExtensionFilter	("SQL Files (*.sql)", "sql");
        
		janelaBusca.setVisible(true);  
		janelaBusca.setFileFilter(sqlfilter);
		
		int result = janelaBusca.showOpenDialog(null); 
		
		if(result == JFileChooser.OPEN_DIALOG)
			textoLocal.setText(janelaBusca.getSelectedFile().toString());
    }//GEN-LAST:event_botaoProcurarActionPerformed

    private void botaoRestaurarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_botaoRestaurarActionPerformed
    {//GEN-HEADEREND:event_botaoRestaurarActionPerformed
        try {
            progresso.setIndeterminate(true);

            controlador	= new ControladorBackup();

            controlador.restauraBackup(textoLocal.getText());

            this.progresso.setIndeterminate(false);

            //Backup Restaurado
            JOptionPane.showMessageDialog(
                                            this, 
                                            "Backup Restaurado com Sucesso!", 
                                            "Sucesso!", 
                                            JOptionPane.INFORMATION_MESSAGE
                                        );
           
            this.dispose();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(  
                                            this, 
                                            "Erro ao restaurar o backup"+
                                            "\nErro: "+e.getMessage()+
                                            "\nCausa: "+e.getCause(), 
                                            "Erro!", 
                                            JOptionPane.ERROR_MESSAGE
                                        );
        }
    }//GEN-LAST:event_botaoRestaurarActionPerformed

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
            java.util.logging.Logger.getLogger(RestaurarBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurarBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurarBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurarBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurarBackup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JButton botaoRestaurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFileChooser janelaBusca;
    private javax.swing.JProgressBar progresso;
    private javax.swing.JTextField textoLocal;
    // End of variables declaration//GEN-END:variables
    private ControladorBackup controlador;
}
