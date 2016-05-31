
package vista;

import damsbibliotecagrafica.Biblioteca;
import java.util.Collections;
import javax.swing.JOptionPane;
import modelo.Libro;
import modelo.ListaLibros;

/**
 *
 * @author kinky
 */
public class EscogerLibro extends javax.swing.JDialog {
    
    private ListaLibros libros;    
    private Libro libroEscogido;

    public Libro getLibroEscogido() {
        return libroEscogido;
    }

    public void setLibroEscogido(Libro libroEscogido) {
        this.libroEscogido = libroEscogido;
    }


    public ListaLibros getLibros() {
        return libros;
    }

    public void setLibros(ListaLibros libros) {
        this.libros = libros;
    }


    /**
     * Creates new form EscogerLibro
     */
    public EscogerLibro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        libros = Biblioteca.misLibros;

        libroEscogido = new Libro();
        
        Libro aux = new Libro();
        aux.setTitulo("---Escoge un libro---");
        libros.altaLibro(aux);
//        Collections.sort(libros.getLista());
        initComponents();
//        jComboBox1.addItem("---Escoge un libro");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Escoger un libro");
        getContentPane().setLayout(null);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 122, 114, 23);

        jButton2.setText("Modificar datos de un libro");
        getContentPane().add(jButton2);
        jButton2.setBounds(385, 11, 169, 23);

        jButton3.setText("Consultar datos de un libro");
        getContentPane().add(jButton3);
        jButton3.setBounds(385, 52, 169, 23);

        jButton4.setText("Dar de baja a un libro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(385, 93, 169, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escoge un libro" }));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${libros.lista}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${libroEscogido}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(10, 12, 314, 20);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (libroEscogido.equals(new Libro()) || jComboBox1.getSelectedIndex() == 0) { 
         JOptionPane.showMessageDialog(this, "Debes de seleccionar un libro");
     } else {
         Biblioteca.misLibros.borrarLibro(libroEscogido);
         Biblioteca.miFichero.grabar(Biblioteca.misLibros);
         JOptionPane.showMessageDialog(this, "Libro dado de baja");
         dispose();
     }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
