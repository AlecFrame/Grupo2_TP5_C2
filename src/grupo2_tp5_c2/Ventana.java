
package grupo2_tp5_c2;

import java.util.TreeMap;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {
    TreeMap<Long, Cliente> lista;
    
    public Ventana(TreeMap<Long, Cliente> lista) {
        initComponents();
        this.lista = lista;
        this.setLocationRelativeTo(this);
        Desactivar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLbTitulo = new javax.swing.JLabel();
        jLbDNI = new javax.swing.JLabel();
        jLbName = new javax.swing.JLabel();
        jLbApellido = new javax.swing.JLabel();
        jLbDir = new javax.swing.JLabel();
        jLbCiudad = new javax.swing.JLabel();
        jTextDNI = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextDir = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jTextCiudad = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLbTel = new javax.swing.JLabel();
        jTextTel = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jBnuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLbTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLbTitulo.setForeground(new java.awt.Color(102, 102, 255));
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText("Formulario de contacto");

        jLbDNI.setText("DNI:");

        jLbName.setText("Nombre:");

        jLbApellido.setText("Apellido:");

        jLbDir.setText("Dirección:");

        jLbCiudad.setText("Ciudad:");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLbTel.setText("Teléfono:");

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBborrar.setText("Borrar");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        jBsalir.setBackground(new java.awt.Color(204, 0, 0));
        jBsalir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(255, 255, 255));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLbDir)
                                    .addComponent(jLbApellido)
                                    .addComponent(jLbCiudad)
                                    .addComponent(jLbName)
                                    .addComponent(jLbDNI))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextDir, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBnuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBborrar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLbTel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextTel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBbuscar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbTitulo)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbDNI)
                    .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbName)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbApellido)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbDir)
                    .addComponent(jTextDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbCiudad)
                    .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbTel)
                    .addComponent(jTextTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBborrar)
                    .addComponent(jBsalir))
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        Activar();
        Limpiar();
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            if (jTextDNI.getText().equalsIgnoreCase("")||
                        jTextName.getText().equalsIgnoreCase("")||
                        jTextApellido.getText().equalsIgnoreCase("")||
                        jTextCiudad.getText().equalsIgnoreCase("")||
                        jTextDir.getText().equalsIgnoreCase("")    
                            ) {
                        JOptionPane.showMessageDialog(this, "Falta rellenar datos","Error",JOptionPane.WARNING_MESSAGE);
                    }else{
                Long tel = Long.parseLong(jTextTel.getText());
                if (!lista.containsKey(tel)) {
                    String DNI = jTextDNI.getText();
                    String nombre = jTextName.getText();
                    String apellido = jTextApellido.getText();
                    String ciudad = jTextCiudad.getText();
                    String dir = jTextDir.getText();
                    Desactivar();
                    Limpiar();
                    lista.put(tel, new Cliente(DNI,nombre,apellido,ciudad,dir));
                }else
                    JOptionPane.showMessageDialog(this, "El número de teléfono ya existe","Error",JOptionPane.WARNING_MESSAGE);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Algunos de los datos son incorrectos","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
            try {
                Long tel = Long.parseLong(jTextTel.getText());
                if (lista.containsKey(tel)) {
                    lista.remove(tel);
                    JOptionPane.showMessageDialog(this, "Se borró el contacto de la lista");
                }else
                    JOptionPane.showMessageDialog(this, "No se encontró el número telefónico en la lista");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(this, "El dato en número de teléfono es incorrecto","Error",JOptionPane.WARNING_MESSAGE);
            }
            Limpiar();
    }//GEN-LAST:event_jBborrarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        try {
                Long tel = Long.parseLong(jTextTel.getText());
                if (lista.containsKey(tel)) {
                    Activar();
                    jTextDNI.setText(lista.get(tel).getDNI());
                    jTextName.setText(lista.get(tel).getNombre());
                    jTextApellido.setText(lista.get(tel).getApellido());
                    jTextCiudad.setText(lista.get(tel).getCiudad());
                    jTextDir.setText(lista.get(tel).getDireccion());
                }else
                    JOptionPane.showMessageDialog(this, "No se encontró el número telefónico en la lista");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(this, "El dato en número de teléfono es incorrecto","Error",JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_jBbuscarActionPerformed
    
    public void Desactivar() {
        jTextDNI.setEnabled(false);
        jTextName.setEnabled(false);
        jTextApellido.setEnabled(false);
        jTextDir.setEnabled(false);
        jTextCiudad.setEnabled(false);
        jBGuardar.setEnabled(false);
    }
    public void Activar() {
        jTextDNI.setEnabled(true);
        jTextName.setEnabled(true);
        jTextApellido.setEnabled(true);
        jTextDir.setEnabled(true);
        jTextCiudad.setEnabled(true);
        jBGuardar.setEnabled(true);
    }
    public void Limpiar() {
        jTextDNI.setText("");
        jTextName.setText("");
        jTextApellido.setText("");
        jTextDir.setText("");
        jTextCiudad.setText("");
        jTextTel.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLbApellido;
    private javax.swing.JLabel jLbCiudad;
    private javax.swing.JLabel jLbDNI;
    private javax.swing.JLabel jLbDir;
    private javax.swing.JLabel jLbName;
    private javax.swing.JLabel jLbTel;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextCiudad;
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JTextField jTextDir;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextTel;
    // End of variables declaration//GEN-END:variables
}
