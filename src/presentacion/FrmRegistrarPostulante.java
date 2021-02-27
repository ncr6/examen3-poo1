package presentacion;

import entidades.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class FrmRegistrarPostulante extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistrarPostulante
     */
    public FrmRegistrarPostulante() {
        initComponents();
    }
    
    public FrmRegistrarPostulante(ArrayList<Postulante> postulantes) {
        initComponents();
        this.postulantes = postulantes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpTipoCol = new javax.swing.ButtonGroup();
        btngrpPostulacion = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblNombreCol = new javax.swing.JLabel();
        lblAnioEgreso = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombreCol = new javax.swing.JTextField();
        txtAnioEgreso = new javax.swing.JTextField();
        lblTipoColegio = new javax.swing.JLabel();
        btnEstatal = new javax.swing.JRadioButton();
        btnSemi = new javax.swing.JRadioButton();
        btnPrivado = new javax.swing.JRadioButton();
        lblTipoColegio1 = new javax.swing.JLabel();
        txtAnioReg = new javax.swing.JTextField();
        txtMesReg = new javax.swing.JTextField();
        txtDiaReg = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblTipoColegio2 = new javax.swing.JLabel();
        btnCepunt = new javax.swing.JRadioButton();
        btnExcelencia = new javax.swing.JRadioButton();
        btnOrdinario = new javax.swing.JRadioButton();
        btnDeportista = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Postulante");

        lblTitulo.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        lblTitulo.setText("Registrar Postulante");

        lblDni.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        lblDni.setText("DNI:");

        lblNombre.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        lblNombre.setText("Nombres:");

        lblApellidos.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        lblApellidos.setText("Apellidos:");

        lblNombreCol.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        lblNombreCol.setText("Colegio:");

        lblAnioEgreso.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        lblAnioEgreso.setText("Año de Egreso:");

        txtDni.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N

        txtNombreCol.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N

        txtAnioEgreso.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N

        lblTipoColegio.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        lblTipoColegio.setText("Tipo Colegio:");

        btngrpTipoCol.add(btnEstatal);
        btnEstatal.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        btnEstatal.setSelected(true);
        btnEstatal.setText("Estatal");
        btnEstatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstatalActionPerformed(evt);
            }
        });

        btngrpTipoCol.add(btnSemi);
        btnSemi.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        btnSemi.setText("Semi-Estatal");
        btnSemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemiActionPerformed(evt);
            }
        });

        btngrpTipoCol.add(btnPrivado);
        btnPrivado.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        btnPrivado.setText("Privado");
        btnPrivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrivadoActionPerformed(evt);
            }
        });

        lblTipoColegio1.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        lblTipoColegio1.setText("Fecha de Registro:");

        txtAnioReg.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        txtAnioReg.setText("AAAA");

        txtMesReg.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        txtMesReg.setText("MM");

        txtDiaReg.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        txtDiaReg.setText("DD");

        btnRegistrar.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblTipoColegio2.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        lblTipoColegio2.setText("Tipo Postulación:");

        btngrpPostulacion.add(btnCepunt);
        btnCepunt.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        btnCepunt.setSelected(true);
        btnCepunt.setText("CEPUNT");
        btnCepunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCepuntActionPerformed(evt);
            }
        });

        btngrpPostulacion.add(btnExcelencia);
        btnExcelencia.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        btnExcelencia.setText("Excelencia");
        btnExcelencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelenciaActionPerformed(evt);
            }
        });

        btngrpPostulacion.add(btnOrdinario);
        btnOrdinario.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        btnOrdinario.setText("Ordinario");
        btnOrdinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdinarioActionPerformed(evt);
            }
        });

        btngrpPostulacion.add(btnDeportista);
        btnDeportista.setFont(new java.awt.Font("Fira Sans", 0, 16)); // NOI18N
        btnDeportista.setText("Deportista");
        btnDeportista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeportistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDni)
                                    .addComponent(lblNombre)
                                    .addComponent(lblApellidos)
                                    .addComponent(lblNombreCol)
                                    .addComponent(lblAnioEgreso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAnioEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                                    .addComponent(txtDni)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)
                                    .addComponent(txtNombreCol)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTipoColegio)
                                    .addComponent(lblTipoColegio1)
                                    .addComponent(lblTipoColegio2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEstatal)
                                            .addComponent(btnCepunt))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addComponent(btnSemi))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(btnExcelencia)
                                                .addGap(46, 46, 46)
                                                .addComponent(btnOrdinario)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDeportista)
                                            .addComponent(btnPrivado, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(txtAnioReg, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(txtMesReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDiaReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addGap(485, 485, 485)
                                .addComponent(btnVolver)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCol)
                    .addComponent(txtNombreCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnioEgreso)
                    .addComponent(txtAnioEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoColegio)
                    .addComponent(btnEstatal)
                    .addComponent(btnSemi)
                    .addComponent(btnPrivado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoColegio2)
                    .addComponent(btnCepunt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcelencia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdinario)
                    .addComponent(btnDeportista))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoColegio1)
                    .addComponent(txtAnioReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMesReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        try{
            DatosColegio posdc = new DatosColegio(txtNombreCol.getText(), Integer.parseInt(txtAnioEgreso.getText()), getTipocol());
            LocalDate fecha = LocalDate.of(Integer.parseInt(txtAnioReg.getText()),
                                           Integer.parseInt(txtMesReg.getText()),
                                           Integer.parseInt(txtDiaReg.getText()));
            Postulante p = new Postulante(txtDni.getText(), txtNombre.getText(), txtApellido.getText(), posdc, fecha, getTpost());
            postulantes.add(p);
            JOptionPane.showMessageDialog(null, "Se registró el postulante correctamente", "Operación exitosa", 1);
        
        } catch (HeadlessException | NumberFormatException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Rellene todos los campos y verifique la validez de los datos ingresados", "Datos vacíos o inválidos", 2);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEstatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstatalActionPerformed
        setTipocol(TipoColegio.ESTATAL);
    }//GEN-LAST:event_btnEstatalActionPerformed

    private void btnSemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemiActionPerformed
        setTipocol(TipoColegio.SEMIESTATAL);
    }//GEN-LAST:event_btnSemiActionPerformed

    private void btnPrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrivadoActionPerformed
        setTipocol(TipoColegio.PRIVADO);
    }//GEN-LAST:event_btnPrivadoActionPerformed

    private void btnCepuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCepuntActionPerformed
        setTpost(TPostulacion.CEPUNT);
    }//GEN-LAST:event_btnCepuntActionPerformed

    private void btnExcelenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelenciaActionPerformed
        setTpost(TPostulacion.EXCELENCIA);
    }//GEN-LAST:event_btnExcelenciaActionPerformed

    private void btnOrdinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdinarioActionPerformed
        setTpost(TPostulacion.ORDINARIO);
    }//GEN-LAST:event_btnOrdinarioActionPerformed

    private void btnDeportistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeportistaActionPerformed
        setTpost(TPostulacion.DEPORTISTA);
    }//GEN-LAST:event_btnDeportistaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the FlatLaf Light look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try{
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new FrmRegistrarPostulante().setVisible(true);
                }
            });
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Verifique la validez de los valores de fecha","Fecha inválida",2);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnCepunt;
    private javax.swing.JRadioButton btnDeportista;
    private javax.swing.JRadioButton btnEstatal;
    private javax.swing.JRadioButton btnExcelencia;
    private javax.swing.JRadioButton btnOrdinario;
    private javax.swing.JRadioButton btnPrivado;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JRadioButton btnSemi;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup btngrpPostulacion;
    private javax.swing.ButtonGroup btngrpTipoCol;
    private javax.swing.JLabel lblAnioEgreso;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreCol;
    private javax.swing.JLabel lblTipoColegio;
    private javax.swing.JLabel lblTipoColegio1;
    private javax.swing.JLabel lblTipoColegio2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAnioEgreso;
    private javax.swing.JTextField txtAnioReg;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDiaReg;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMesReg;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCol;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Postulante> postulantes;

    public TipoColegio getTipocol() {
        return tipocol;
    }

    public void setTipocol(TipoColegio tipocol) {
        this.tipocol = tipocol;
    }

    public TPostulacion getTpost() {
        return tpost;
    }

    public void setTpost(TPostulacion tpost) {
        this.tpost = tpost;
    }
    
    //Valores predeterminados    
    private TipoColegio tipocol = TipoColegio.ESTATAL;
    private TPostulacion tpost = TPostulacion.CEPUNT;
    
}
