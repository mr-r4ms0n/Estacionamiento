package Ventanas;

import Validaciones.Caracteres;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.JDialog;
import jbarcodebean.JBarcodeBean;

public class VtnInvitado extends javax.swing.JDialog
{

    String nombre = "";
    String placas = "";
    String color = "";
    String marca = "";
    String tamanio = "";
    public static JDialog vtn;
    JBarcodeBean barcode = new JBarcodeBean();
    public static BufferedImage imagen = null;

    public VtnInvitado()
    {
        initComponents();
        lblNoRegistro.setText(String.valueOf(metodosBaseDatos.MetodosCRUD.ultimoRegistro(2) + 1));
        vtn = this;
        jBSalir.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblNoRegistro = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTPlacas = new javax.swing.JTextField();
        jTMarca = new javax.swing.JTextField();
        jTColor = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnGdInvitado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Registro de nuevo vehiculo");

        jBSalir.setBackground(new java.awt.Color(0, 0, 0));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cross-symbol_icon-icons.com_74149.png"))); // NOI18N
        jBSalir.setToolTipText("");
        jBSalir.setBorder(null);
        jBSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/about_3697.png"))); // NOI18N
        jLabel14.setToolTipText("Ventana para Agregar un Nuevo Invitado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Datos del incorporado");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jTNombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(0, 80, 0));
        jTNombre.setText("Ingrese nombre completo aqui");
        jTNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 80, 0), 2));
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
        jTNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTNombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("No. Registro");

        lblNoRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblNoRegistro.setText("-----");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setText("Datos del vehiculo");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setText("Placas:");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setText("Marca:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setText("Color:");

        jTPlacas.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTPlacas.setForeground(new java.awt.Color(0, 80, 0));
        jTPlacas.setText("Ingrese el numero de placas");
        jTPlacas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 80, 0), 2));
        jTPlacas.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTPlacasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTPlacasFocusLost(evt);
            }
        });
        jTPlacas.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTPlacasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTPlacasKeyTyped(evt);
            }
        });

        jTMarca.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTMarca.setForeground(new java.awt.Color(0, 80, 0));
        jTMarca.setText("Ingrese la marca");
        jTMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 80, 0), 2));
        jTMarca.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTMarcaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTMarcaFocusLost(evt);
            }
        });
        jTMarca.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTMarcaActionPerformed(evt);
            }
        });
        jTMarca.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTMarcaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTMarcaKeyTyped(evt);
            }
        });

        jTColor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTColor.setForeground(new java.awt.Color(0, 80, 0));
        jTColor.setText("Ingrese el color");
        jTColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 80, 0), 2));
        jTColor.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTColorFocusLost(evt);
            }
        });
        jTColor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTColorActionPerformed(evt);
            }
        });
        jTColor.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                jTColorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTColorKeyTyped(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tamaño", "Pequeño", "Mediano", "Grande" }));

        btnCancelar.setBackground(new java.awt.Color(139, 116, 1));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGdInvitado.setBackground(new java.awt.Color(0, 80, 0));
        btnGdInvitado.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnGdInvitado.setForeground(new java.awt.Color(255, 255, 255));
        btnGdInvitado.setText("Guardar Invitado");
        btnGdInvitado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        btnGdInvitado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnGdInvitadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTColor, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 210, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnGdInvitado, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNoRegistro)
                        .addGap(23, 23, 23)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(lblNoRegistro))
                    .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTPlacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGdInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBSalirActionPerformed
    {//GEN-HEADEREND:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGdInvitadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnGdInvitadoActionPerformed
    {//GEN-HEADEREND:event_btnGdInvitadoActionPerformed
        tamanio = (String) jComboBox1.getSelectedItem();
        if (!jTNombre.getText().isEmpty()
                && (!jTPlacas.getText().isEmpty() && !jTPlacas.getText().equals("Ingrese nombre completo aqui"))
                && (!jTMarca.getText().isEmpty() && (!jTMarca.getText().equals("Ingrese la marca"))
                && (!jTColor.getText().isEmpty() && !jTColor.getText().equals("Ingrese el color"))
                && (jComboBox1.getSelectedItem().equals("Pequeño")
                || jComboBox1.getSelectedItem().equals("Mediano")
                || jComboBox1.getSelectedItem().equals("Grande"))))
        {
            //Guardado en BD vehiculos invitados
            metodosBaseDatos.MetodosCRUD.guardaBD(,nombre, placas, color, marca, tamanio);
            /////////////////////////////////////////////////////////////////////////////
            VtnCBarras codigo = new VtnCBarras(null, true);
            codigo.setModal(true);
            codigo.setVisible(true);
        } else
        {
            ErrorCampos codigo = new ErrorCampos(null, true);
            codigo.setModal(true);
            codigo.setVisible(true);
        }

    }//GEN-LAST:event_btnGdInvitadoActionPerformed

    private void jTNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTNombreKeyTyped
    {//GEN-HEADEREND:event_jTNombreKeyTyped
        if (jTNombre.getText().length() == 30)
        {
            evt.consume();
        } else
        {
            Caracteres.va(evt);
        }
    }//GEN-LAST:event_jTNombreKeyTyped

    private void jTPlacasKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTPlacasKeyTyped
    {//GEN-HEADEREND:event_jTPlacasKeyTyped
        if (jTPlacas.getText().length() == 9)
        {
            evt.consume();
        } else
        {
            Character c = evt.getKeyChar();
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_jTPlacasKeyTyped

    private void jTMarcaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTMarcaKeyTyped
    {//GEN-HEADEREND:event_jTMarcaKeyTyped
        if (jTMarca.getText().length() == 15)
        {
            evt.consume();
        } else
        {
            Caracteres.va(evt);
        }
    }//GEN-LAST:event_jTMarcaKeyTyped

    private void jTColorKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTColorKeyTyped
    {//GEN-HEADEREND:event_jTColorKeyTyped
        if (jTColor.getText().length() == 15)
        {
            evt.consume();
        } else
        {
            Caracteres.va(evt);
        }
    }//GEN-LAST:event_jTColorKeyTyped

    private void jTNombreFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTNombreFocusGained
    {//GEN-HEADEREND:event_jTNombreFocusGained
        if (!Caracteres.comparacion(jTNombre.getText(), "Ingrese nombre completo aqui"))
        {
            jTNombre.setText(null);
        }
    }//GEN-LAST:event_jTNombreFocusGained

    private void jTNombreFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTNombreFocusLost
    {//GEN-HEADEREND:event_jTNombreFocusLost
        nombre = jTNombre.getText();
        if (!Caracteres.comparacion(nombre, "Ingrese nombre completo aqui"))
        {
            jTNombre.setText("Ingrese nombre completo aqui");
        }
    }//GEN-LAST:event_jTNombreFocusLost

    private void jTPlacasFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTPlacasFocusGained
    {//GEN-HEADEREND:event_jTPlacasFocusGained
        if (!Caracteres.comparacion(placas, "Ingrese el numero de placas"))
        {
            jTPlacas.setText(null);
        }
    }//GEN-LAST:event_jTPlacasFocusGained

    private void jTPlacasFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTPlacasFocusLost
    {//GEN-HEADEREND:event_jTPlacasFocusLost
        if (!Caracteres.comparacion(placas, "Ingrese el numero de placas"))
        {
            jTPlacas.setText("Ingrese el numero de placas");
        }
    }//GEN-LAST:event_jTPlacasFocusLost

    private void jTMarcaFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTMarcaFocusGained
    {//GEN-HEADEREND:event_jTMarcaFocusGained
        if (!Caracteres.comparacion(marca, "Ingrese la marca"))
        {
            jTMarca.setText(null);
        }
    }//GEN-LAST:event_jTMarcaFocusGained

    private void jTMarcaFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTMarcaFocusLost
    {//GEN-HEADEREND:event_jTMarcaFocusLost
        if (!Caracteres.comparacion(marca, "Ingrese la marca"))
        {
            jTMarca.setText("Ingrese la marca");
        }
    }//GEN-LAST:event_jTMarcaFocusLost

    private void jTColorFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTColorFocusGained
    {//GEN-HEADEREND:event_jTColorFocusGained
        if (!Caracteres.comparacion(color, "Ingrese el color"))
        {
            jTColor.setText(null);
        }
    }//GEN-LAST:event_jTColorFocusGained

    private void jTColorFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTColorFocusLost
    {//GEN-HEADEREND:event_jTColorFocusLost
        if (!Caracteres.comparacion(color, "Ingrese el color"))
        {
            jTColor.setText("Ingrese el color");
        }
    }//GEN-LAST:event_jTColorFocusLost

    private void jTMarcaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTMarcaActionPerformed
    {//GEN-HEADEREND:event_jTMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMarcaActionPerformed

    private void jTNombreKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTNombreKeyReleased
    {//GEN-HEADEREND:event_jTNombreKeyReleased
        nombre = jTNombre.getText();
    }//GEN-LAST:event_jTNombreKeyReleased

    private void jTPlacasKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTPlacasKeyReleased
    {//GEN-HEADEREND:event_jTPlacasKeyReleased
        placas = jTPlacas.getText();
    }//GEN-LAST:event_jTPlacasKeyReleased

    private void jTMarcaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTMarcaKeyReleased
    {//GEN-HEADEREND:event_jTMarcaKeyReleased
        marca = jTMarca.getText();
    }//GEN-LAST:event_jTMarcaKeyReleased

    private void jTColorKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTColorKeyReleased
    {//GEN-HEADEREND:event_jTColorKeyReleased
        color = jTColor.getText();
    }//GEN-LAST:event_jTColorKeyReleased

    private void jTColorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTColorActionPerformed
    {//GEN-HEADEREND:event_jTColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTColorActionPerformed

    public static void destruye()
    {
        vtn.dispose();
    }

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
            java.util.logging.Logger.getLogger(VtnInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VtnInvitado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGdInvitado;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTColor;
    private javax.swing.JTextField jTMarca;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPlacas;
    private javax.swing.JLabel lblNoRegistro;
    // End of variables declaration//GEN-END:variables
}
