/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import gerenciapenalti.Jogador;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Juliano
 */
public class JFrameExibeJogadores extends javax.swing.JFrame {
    
    public static String nomeTime1;
    public static Jogador jogadores1[] = new Jogador[11];
    /**
     * Creates new form JFrameExibeJogadores
     */
    public JFrameExibeJogadores(String endereco, String nomeTime, Jogador jogadores[]) {
        initComponents();
        
        jLabelNomeDoTime.setText(nomeTime);
        ImageIcon icon = new ImageIcon(getClass().getResource(endereco));
        Image imageIcon = icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        jLabelFotoTime.setIcon(new ImageIcon(imageIcon));
        int i = 1;
        for(Jogador j: jogadores){
            if(i == 1){
                jTextAreaMostrarJogadores.setText("Nome\t\tFunção\n\n");
                jTextAreaMostrarJogadores.setText(this.jTextAreaMostrarJogadores.getText() + j.getNome() + "\t\tGoleiro\n");
                i++;
            } else{
                jTextAreaMostrarJogadores.setText(this.jTextAreaMostrarJogadores.getText() + j.getNome() + "\t\tBatedor\n");
            }
        }
        jogadores1 = jogadores;
        nomeTime1 = nomeTime;
    }

    private JFrameExibeJogadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNomeDoTime = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jLabelFotoTime = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMostrarJogadores = new javax.swing.JTextArea();
        jButtonSelecionarTime = new javax.swing.JButton();
        jLabelInstrucao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelNomeDoTime.setText("NomeDoTime");

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelFotoTime.setLabelFor(jLabelFotoTime);

        jTextAreaMostrarJogadores.setEditable(false);
        jTextAreaMostrarJogadores.setColumns(20);
        jTextAreaMostrarJogadores.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMostrarJogadores);

        jButtonSelecionarTime.setText("Confirmar");
        jButtonSelecionarTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarTimeActionPerformed(evt);
            }
        });

        jLabelInstrucao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelInstrucao.setForeground(new java.awt.Color(0, 102, 102));
        jLabelInstrucao.setText("Esses são os jogadores do time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFotoTime, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabelNomeDoTime)))
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelInstrucao)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSelecionarTime)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelFotoTime, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNomeDoTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelInstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonSelecionarTime))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        JFrameSelecionaTime jFrameSelecionaTime = new JFrameSelecionaTime();
        this.setVisible(false);
        jFrameSelecionaTime.setLocationRelativeTo(null);
        jFrameSelecionaTime.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonSelecionarTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarTimeActionPerformed
        // TODO add your handling code here:
        JFrameMeuTime jFrameMeuTime = new JFrameMeuTime(nomeTime1, jogadores1);
        this.setVisible(false);
        jFrameMeuTime.setLocationRelativeTo(null);
        jFrameMeuTime.setVisible(true);
    }//GEN-LAST:event_jButtonSelecionarTimeActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameExibeJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameExibeJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameExibeJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameExibeJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameExibeJogadores().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSelecionarTime;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelFotoTime;
    private javax.swing.JLabel jLabelInstrucao;
    private javax.swing.JLabel jLabelNomeDoTime;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaMostrarJogadores;
    // End of variables declaration//GEN-END:variables
}