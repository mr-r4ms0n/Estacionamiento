/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Validaciones.Caracteres;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import metodosBaseDatos.MetodosCRUD;

public class VtnConsultasIncorporados extends javax.swing.JFrame
{
    public VtnConsultasIncorporados()
    {
        initComponents();
        jBSalir1.setBackground(new Color(0, 0, 0, 0));
        tblVhIncorporados.setModel(MetodosCRUD.consultaBD(1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBSalir1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVhIncorporados = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        cBTipoBusq = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Vehiculos registrados");

        jBSalir1.setBackground(new java.awt.Color(0, 0, 0));
        jBSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cross-symbol_icon-icons.com_74149.png"))); // NOI18N
        jBSalir1.setBorder(null);
        jBSalir1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBSalir1ActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/about_3697.png"))); // NOI18N
        jLabel14.setToolTipText("Ventana para Consultar los vehiculos registrados");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTBusqueda.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jTBusqueda.setForeground(new java.awt.Color(51, 109, 57));
        jTBusqueda.setText("Ingrese su busqueda aqui");
        jTBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTBusqueda.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTBusquedaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTBusquedaFocusLost(evt);
            }
        });
        jTBusqueda.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTBusquedaActionPerformed(evt);
            }
        });
        jTBusqueda.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTBusquedaKeyReleased(evt);
            }
        });

        tblVhIncorporados.setBackground(new java.awt.Color(51, 109, 57));
        tblVhIncorporados.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        tblVhIncorporados.setForeground(new java.awt.Color(255, 255, 255));
        tblVhIncorporados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Numero de Registro", "Nombre del Incorporado", "Placas del Vehiculo", "Color del Vehiculo", "Marca del Vehiculo", "Tamaño", ""
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblVhIncorporados.setGridColor(new java.awt.Color(102, 255, 255));
        jScrollPane1.setViewportView(tblVhIncorporados);
        if (tblVhIncorporados.getColumnModel().getColumnCount() > 0)
        {
            tblVhIncorporados.getColumnModel().getColumn(0).setResizable(false);
            tblVhIncorporados.getColumnModel().getColumn(6).setResizable(false);
        }

        btnEliminar.setBackground(new java.awt.Color(139, 116, 1));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        btnEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(139, 116, 1));
        btnModificar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        btnModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModificarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(0, 80, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        btnAgregar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAgregarActionPerformed(evt);
            }
        });

        cBTipoBusq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cBTipoBusq.setForeground(new java.awt.Color(255, 255, 255));
        cBTipoBusq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar por", "Nombre", "Placas", "Color", "Marca", "Tamanio", "General" }));
        cBTipoBusq.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cBTipoBusqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jTBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBTipoBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBTipoBusq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalir1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBSalir1ActionPerformed
    {//GEN-HEADEREND:event_jBSalir1ActionPerformed
        this.dispose();
        VtnIngreso ing = new VtnIngreso();
        ing.setVisible(true);
    }//GEN-LAST:event_jBSalir1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        ConfirmacionEliminarV eli = new ConfirmacionEliminarV(this, true);
        eli.setMdl((DefaultTableModel) tblVhIncorporados.getModel());
        eli.setOpc(1);
        eli.setVisible(true);
        tblVhIncorporados.setModel(MetodosCRUD.consultaBD(1));
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
       MetodosCRUD.actualizaBD(1, tblVhIncorporados.getModel());
       tblVhIncorporados.setModel(MetodosCRUD.consultaBD(1));
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAgregarActionPerformed
    {//GEN-HEADEREND:event_btnAgregarActionPerformed
        VtnRegistroVhIncorp reg = new VtnRegistroVhIncorp();
        reg.setModal(true);
        reg.setVisible(true);
        this.dispose();
        VtnConsultasIncorporados vtn = new VtnConsultasIncorporados();
        vtn.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jTBusquedaFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTBusquedaFocusGained
    {//GEN-HEADEREND:event_jTBusquedaFocusGained
        if (!Caracteres.comparacion(jTBusqueda.getText(), "Ingrese su busqueda aqui"))
        {
            jTBusqueda.setText(null);
        }
    }//GEN-LAST:event_jTBusquedaFocusGained

    private void jTBusquedaFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTBusquedaFocusLost
    {//GEN-HEADEREND:event_jTBusquedaFocusLost
        if (!Caracteres.comparacion(jTBusqueda.getText(), "Ingrese su busqueda aqui"))
        {
            jTBusqueda.setText("Ingrese su busqueda aqui");
        }

    }//GEN-LAST:event_jTBusquedaFocusLost

    private void jTBusquedaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTBusquedaActionPerformed
    {//GEN-HEADEREND:event_jTBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTBusquedaActionPerformed

    private void jTBusquedaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTBusquedaKeyReleased
    {//GEN-HEADEREND:event_jTBusquedaKeyReleased
        if (!jTBusqueda.getText().isEmpty())
        {
            if (((String) cBTipoBusq.getSelectedItem()).equals("General") || ((String) cBTipoBusq.getSelectedItem()).equals("Buscar por"))
            {
                tblVhIncorporados.setModel(MetodosCRUD.consultaBD(1, jTBusqueda.getText()));
            } else
            {
                tblVhIncorporados.setModel(MetodosCRUD.consultaBD(1, jTBusqueda.getText(), (String) cBTipoBusq.getSelectedItem()));
            }
        } else
        {
            tblVhIncorporados.setModel(MetodosCRUD.consultaBD(1));
        }
    }//GEN-LAST:event_jTBusquedaKeyReleased

    private void cBTipoBusqActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cBTipoBusqActionPerformed
    {//GEN-HEADEREND:event_cBTipoBusqActionPerformed
        if ((((String) cBTipoBusq.getSelectedItem()).equals("General") || ((String) cBTipoBusq.getSelectedItem()).equals("Buscar por")) && !jTBusqueda.getText().equals("Ingrese su busqueda aqui"))
        {
            System.out.println("1");
            MetodosCRUD.consultaBD(1, jTBusqueda.getText());
        } else if ((((String) cBTipoBusq.getSelectedItem()).equals("General") || ((String) cBTipoBusq.getSelectedItem()).equals("Buscar por")) && (jTBusqueda.getText().equals("Ingrese su busqueda aqui")))
        {
            System.out.println("2");
            MetodosCRUD.consultaBD(1);
        } else if (!(((String) cBTipoBusq.getSelectedItem()).equals("General") || ((String) cBTipoBusq.getSelectedItem()).equals("Buscar por")) && (jTBusqueda.getText().equals("Ingrese su busqueda aqui")))
        {
            System.out.println("3");
            MetodosCRUD.consultaBD(1);
        } else
        {
            System.out.println("4");
            MetodosCRUD.consultaBD(1, jTBusqueda.getText(), ((String) cBTipoBusq.getSelectedItem()));
        }
    }//GEN-LAST:event_cBTipoBusqActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultasIncorporados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultasIncorporados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultasIncorporados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultasIncorporados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnConsultasIncorporados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cBTipoBusq;
    private javax.swing.JButton jBSalir1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBusqueda;
    public static javax.swing.JTable tblVhIncorporados;
    // End of variables declaration//GEN-END:variables
}
