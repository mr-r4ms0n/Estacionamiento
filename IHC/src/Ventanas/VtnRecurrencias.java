/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Window;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import metodosBaseDatos.MetodosCRUD;

/**
 *
 * @author Kevin Benitez
 */
public class VtnRecurrencias extends javax.swing.JFrame implements Runnable
{

    Thread hilo;
    private boolean estado;
    String hora_sin_espacios;

    private String minutos;
    private String segundos;
    private String horas;

    public static Window vtn;

    @Override
    public void run()
    {
        while (estado == true)
        {
            hora_sin_espacios = "";
            Calendar fecha = new GregorianCalendar();
            Date sistfecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd - MM - YYYY");
            SimpleDateFormat formatoorarios = new SimpleDateFormat("YYYY-MM-dd");

            int h = fecha.get(Calendar.HOUR_OF_DAY);
            int m = fecha.get(Calendar.MINUTE);
            int s = fecha.get(Calendar.SECOND);

            if (h == 0 || h == 1 || h == 2 || h == 3 || h == 4 || h == 5 || h == 6 || h == 7 || h == 8 || h == 9)
            {
                horas = "0" + Integer.toString(h);
            } else
            {
                horas = Integer.toString(h);
            }
            if (m == 0 || m == 1 || m == 2 || m == 3 || m == 4 || m == 5 || m == 6 || m == 7 || m == 8 || m == 9)
            {
                minutos = "0" + Integer.toString(m);
            } else
            {
                minutos = Integer.toString(m);
            }
            if (s == 0 || s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s == 6 || s == 7 || s == 8 || s == 9)
            {
                segundos = "0" + Integer.toString(s);
            } else
            {
                segundos = Integer.toString(s);
            }
            jTHora.setText("  " + horas + " : " + minutos + " : " + segundos);
            jTFecha.setText("  " + formato.format(sistfecha));
            hora_sin_espacios = horas + ":" + minutos + ":" + segundos; // nos ayudara a meter la hora en la base de datos

            try
            {
                Thread.sleep(1000);

            } catch (InterruptedException ex)
            {
                Logger.getLogger(VtnRecurrencias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void iniciar()
    {
        hilo = new Thread(this);
        estado = true;
        hilo.start();
        
    }

    /**
     * Creates new form VtnConsultas
     */
    public VtnRecurrencias()
    {
        initComponents();
        vtn = this;
        setLocationRelativeTo(null);
        jBSalir1.setBackground(new Color(0, 0, 0, 0));
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBSalir1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableIncidencias = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jTFecha = new javax.swing.JTextField();
        jTHora = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Recurrencias registradas");

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
        jLabel14.setToolTipText("Ventana para Consultar las incidencias");

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

        jTNombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(51, 109, 57));
        jTNombre.setText("Ingrese aqui su busqueda");
        jTNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTNombre.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTNombreFocusLost(evt);
            }
        });

        jTableIncidencias.setBackground(new java.awt.Color(51, 109, 57));
        jTableIncidencias.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTableIncidencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String []
            {
                "Nombre del Incorporado", "Placas del Vehiculo", "Marca del Vehiculo", "Color del Vehiculo", "Tamaño", "Hora de Entrada", "Hora de Salida"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableIncidencias);

        jButton7.setBackground(new java.awt.Color(0, 80, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Agregar registro invitado");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton7ActionPerformed(evt);
            }
        });

        jTFecha.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jTFecha.setForeground(new java.awt.Color(139, 116, 1));
        jTFecha.setText("DD-MM-AAAA");
        jTFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 80, 0), 2));

        jTHora.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jTHora.setForeground(new java.awt.Color(139, 116, 1));
        jTHora.setText("HH:MM:SS");
        jTHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 80, 0), 2));
        jTHora.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTHoraActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(139, 116, 1));
        jButton8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Generar reporte");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jButton8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 80, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Meter xd");
        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jButton9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton9ActionPerformed(evt);
            }
        });

        jTCodigo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTCodigo.setForeground(new java.awt.Color(51, 109, 57));
        jTCodigo.setText("Ingrese aqui su busqueda");
        jTCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTCodigo.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTCodigoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(333, Short.MAX_VALUE)
                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTHora, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTHora, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton7ActionPerformed
    {//GEN-HEADEREND:event_jButton7ActionPerformed
        VtnConsultasInvitados inv = new VtnConsultasInvitados();
        //inv.setModal(true);
        inv.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTHoraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTHoraActionPerformed
    {//GEN-HEADEREND:event_jTHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTHoraActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton8ActionPerformed
    {//GEN-HEADEREND:event_jButton8ActionPerformed
        opaco();
        ConfirmacionRPDF epdf = new ConfirmacionRPDF(this, true);
        epdf.setVisible(true);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTNombreFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTNombreFocusGained
    {//GEN-HEADEREND:event_jTNombreFocusGained
        jTNombre.setText(null);
    }//GEN-LAST:event_jTNombreFocusGained

    private void jTNombreFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTNombreFocusLost
    {//GEN-HEADEREND:event_jTNombreFocusLost
        jTNombre.setText("Ingrese aqui su busqueda");
    }//GEN-LAST:event_jTNombreFocusLost

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton9ActionPerformed
    {//GEN-HEADEREND:event_jButton9ActionPerformed
        MetodosCRUD.guardaBD(jTCodigo.getText(), jTHora.getText(), jTFecha.getText());
        jTableIncidencias.setModel(MetodosCRUD.consultaBD(3));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTCodigoFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTCodigoFocusGained
    {//GEN-HEADEREND:event_jTCodigoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoFocusGained

    private void jTCodigoFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTCodigoFocusLost
    {//GEN-HEADEREND:event_jTCodigoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        jTableIncidencias.setModel(MetodosCRUD.consultaBD(3));
    }//GEN-LAST:event_formWindowOpened

    public static void opaco()
    {
        vtn.setOpacity(0.0f);
    }

    public static void opaco2()
    {
        vtn.setOpacity(1f);
    }

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
            java.util.logging.Logger.getLogger(VtnRecurrencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnRecurrencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnRecurrencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnRecurrencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnRecurrencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodigo;
    public static javax.swing.JTextField jTFecha;
    private javax.swing.JTextField jTHora;
    private javax.swing.JTextField jTNombre;
    public static javax.swing.JTable jTableIncidencias;
    // End of variables declaration//GEN-END:variables
}
