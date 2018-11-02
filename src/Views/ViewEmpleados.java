/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Norberto
 */
public class ViewEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmpleados
     */
    public ViewEmpleados() {
        initComponents();
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
        jl_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_id_empleado = new javax.swing.JLabel();
        jtf_id_empleado = new javax.swing.JTextField();
        jl_nombre_empleado = new javax.swing.JLabel();
        jtf_nombre_empleado = new javax.swing.JTextField();
        jl_apellido_paterno = new javax.swing.JLabel();
        jtf_apellido_paterno = new javax.swing.JTextField();
        jl_apellido_materno = new javax.swing.JLabel();
        jtf_apellido_materno = new javax.swing.JTextField();
        jl_telefono = new javax.swing.JLabel();
        jtf_telefono = new javax.swing.JTextField();
        jl_rfc = new javax.swing.JLabel();
        jtf_rfc = new javax.swing.JTextField();
        jl_calle = new javax.swing.JLabel();
        jtf_calle = new javax.swing.JTextField();
        jl_colonia = new javax.swing.JLabel();
        jtf_colonia = new javax.swing.JTextField();
        jl_numero_interior = new javax.swing.JLabel();
        jtf_numero_interior = new javax.swing.JTextField();
        jl_numero_exterior = new javax.swing.JLabel();
        jtf_numero_exterior = new javax.swing.JTextField();
        jl_codigo_postal = new javax.swing.JLabel();
        jtf_codigo_postal = new javax.swing.JTextField();
        jl_no_cueta = new javax.swing.JLabel();
        jtf_no_cueta = new javax.swing.JTextField();
        jl_no_seguro = new javax.swing.JLabel();
        jtf_no_seguro = new javax.swing.JTextField();
        jl_banco = new javax.swing.JLabel();
        jtf_banco = new javax.swing.JTextField();
        jl_curp = new javax.swing.JLabel();
        jtf_curp = new javax.swing.JTextField();
        jl_tipo_empleado = new javax.swing.JLabel();
        jtf_tipo_empleado = new javax.swing.JTextField();
        jl_usuario = new javax.swing.JLabel();
        jtf_usuario = new javax.swing.JTextField();
        jl_contrasena = new javax.swing.JLabel();
        jtf_contrasena = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        jl_titulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_titulo.setText("Empleados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(513, 513, 513)
                .addComponent(jl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jl_titulo)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jl_id_empleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_id_empleado.setText("Id_empleado");

        jl_nombre_empleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_nombre_empleado.setText("Nombre_empleado");

        jl_apellido_paterno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_apellido_paterno.setText("Apellido_paterno");

        jl_apellido_materno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_apellido_materno.setText("Apellido_materno");

        jl_telefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_telefono.setText("Teléfono");

        jtf_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_telefonoActionPerformed(evt);
            }
        });

        jl_rfc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_rfc.setText("RFC");

        jl_calle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_calle.setText("Calle");

        jl_colonia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_colonia.setText("Colonia");

        jl_numero_interior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_numero_interior.setText("Número_interior");

        jl_numero_exterior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_numero_exterior.setText("Número_exterior");

        jl_codigo_postal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_codigo_postal.setText("Codigo_postal");

        jl_no_cueta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_no_cueta.setText("No_cueta");

        jl_no_seguro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_no_seguro.setText("No_seguro");

        jl_banco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_banco.setText("Banco");

        jl_curp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_curp.setText("Curp");

        jl_tipo_empleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_tipo_empleado.setText("Tipo_empleado");

        jl_usuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_usuario.setText("Usuario");

        jl_contrasena.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_contrasena.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_nombre_empleado)
                    .addComponent(jl_id_empleado)
                    .addComponent(jl_apellido_paterno)
                    .addComponent(jl_apellido_materno)
                    .addComponent(jl_telefono)
                    .addComponent(jl_rfc)
                    .addComponent(jl_calle)
                    .addComponent(jl_colonia)
                    .addComponent(jl_numero_interior))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtf_numero_interior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(jtf_colonia, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_calle, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_rfc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_apellido_materno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_apellido_paterno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_nombre_empleado, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_numero_exterior)
                    .addComponent(jl_codigo_postal)
                    .addComponent(jl_no_cueta)
                    .addComponent(jl_no_seguro)
                    .addComponent(jl_banco)
                    .addComponent(jl_curp)
                    .addComponent(jl_tipo_empleado)
                    .addComponent(jl_usuario)
                    .addComponent(jl_contrasena))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_numero_exterior)
                    .addComponent(jtf_codigo_postal)
                    .addComponent(jtf_no_cueta)
                    .addComponent(jtf_no_seguro)
                    .addComponent(jtf_banco)
                    .addComponent(jtf_curp)
                    .addComponent(jtf_tipo_empleado)
                    .addComponent(jtf_usuario)
                    .addComponent(jtf_contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_id_empleado)
                    .addComponent(jtf_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_numero_exterior)
                    .addComponent(jtf_numero_exterior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtf_nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtf_codigo_postal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jl_nombre_empleado))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_codigo_postal)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtf_apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_apellido_paterno))
                    .addComponent(jtf_no_cueta)
                    .addComponent(jl_no_cueta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtf_apellido_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtf_no_seguro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jl_apellido_materno))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_no_seguro)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_telefono))
                    .addComponent(jtf_banco)
                    .addComponent(jl_banco, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_curp)
                        .addComponent(jtf_curp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl_rfc))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_tipo_empleado)
                        .addComponent(jtf_tipo_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl_calle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_colonia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtf_colonia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jtf_usuario)
                    .addComponent(jl_usuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_numero_interior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_contrasena)
                        .addComponent(jtf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl_numero_interior))
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_telefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jl_apellido_materno;
    private javax.swing.JLabel jl_apellido_paterno;
    private javax.swing.JLabel jl_banco;
    private javax.swing.JLabel jl_calle;
    private javax.swing.JLabel jl_codigo_postal;
    private javax.swing.JLabel jl_colonia;
    private javax.swing.JLabel jl_contrasena;
    private javax.swing.JLabel jl_curp;
    private javax.swing.JLabel jl_id_empleado;
    private javax.swing.JLabel jl_no_cueta;
    private javax.swing.JLabel jl_no_seguro;
    private javax.swing.JLabel jl_nombre_empleado;
    private javax.swing.JLabel jl_numero_exterior;
    private javax.swing.JLabel jl_numero_interior;
    private javax.swing.JLabel jl_rfc;
    private javax.swing.JLabel jl_telefono;
    private javax.swing.JLabel jl_tipo_empleado;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JTextField jtf_apellido_materno;
    private javax.swing.JTextField jtf_apellido_paterno;
    private javax.swing.JTextField jtf_banco;
    private javax.swing.JTextField jtf_calle;
    private javax.swing.JTextField jtf_codigo_postal;
    private javax.swing.JTextField jtf_colonia;
    private javax.swing.JTextField jtf_contrasena;
    private javax.swing.JTextField jtf_curp;
    private javax.swing.JTextField jtf_id_empleado;
    private javax.swing.JTextField jtf_no_cueta;
    private javax.swing.JTextField jtf_no_seguro;
    private javax.swing.JTextField jtf_nombre_empleado;
    private javax.swing.JTextField jtf_numero_exterior;
    private javax.swing.JTextField jtf_numero_interior;
    private javax.swing.JTextField jtf_rfc;
    private javax.swing.JTextField jtf_telefono;
    private javax.swing.JTextField jtf_tipo_empleado;
    private javax.swing.JTextField jtf_usuario;
    // End of variables declaration//GEN-END:variables
}