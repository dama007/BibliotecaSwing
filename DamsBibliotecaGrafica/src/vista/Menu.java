
package vista;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author kinky
 */
public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Nuevo libro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 11, 193, 23);

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Consultar datos de un  libro");
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 175, 193, 23);

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setText("Listado de libro por género");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 93, 193, 23);

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setText("Libro con más páginas");
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 216, 193, 23);

        jButton7.setBackground(new java.awt.Color(0, 255, 255));
        jButton7.setText("Total de libros");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(546, 11, 193, 23);

        jButton8.setText("Cerrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(10, 375, 111, 23);

        jButton9.setText("Aceptar");
        getContentPane().add(jButton9);
        jButton9.setBounds(626, 375, 113, 23);

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setText("Listado de libros");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 52, 193, 23);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Baja libro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 289, 193, 23);

        jButton10.setBackground(new java.awt.Color(0, 255, 255));
        jButton10.setText("Total libros propios");
        getContentPane().add(jButton10);
        jButton10.setBounds(546, 52, 193, 23);

        jButton11.setBackground(new java.awt.Color(0, 255, 255));
        jButton11.setText("Total libros préstamo");
        getContentPane().add(jButton11);
        jButton11.setBounds(546, 93, 193, 23);

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setText("Coste total de libros propios");
        getContentPane().add(jButton12);
        jButton12.setBounds(546, 175, 193, 23);

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setText("Coste total de libros prestados");
        getContentPane().add(jButton13);
        jButton13.setBounds(546, 216, 193, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/best_escaparate_libreria.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1100, 800));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -90, 810, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        JOptionPane.showMessageDialog(this, "Gracias por su visita, adiós!");
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NuevoLibro nl = new NuevoLibro(this, true);
        nl.setLocationRelativeTo(null);
        nl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ListadoLibros ll = new ListadoLibros(this, true);
        ll.setLocationRelativeTo(null);
        ll.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EscogerLibro el = new EscogerLibro(this, true);
        el.setLocationRelativeTo(null);
        el.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        EscogerGenero es = new EscogerGenero(this, true);
        es.setLocationRelativeTo(null);
        es.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
