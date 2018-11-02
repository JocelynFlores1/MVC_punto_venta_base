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
public class ViewClientes extends javax.swing.JPanel {

    /**
     * Creates new form ViewClientes
     */
    public ViewClientes() {
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
        jlIdCliente = new javax.swing.JLabel();
        jtf_id_cliente = new javax.swing.JTextField();
        jl_nombre_cliente = new javax.swing.JLabel();
        jtf_nombre_cliente = new javax.swing.JTextField();
        jl_apellido_paterno = new javax.swing.JLabel();
        jtf_apellido_paterno = new javax.swing.JTextField();
        jl_apellido_materno = new javax.swing.JLabel();
        jtf_apellido_materno = new javax.swing.JTextField();
        jl_teléfono = new javax.swing.JLabel();
        jtf_teléfono = new javax.swing.JTextField();
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
        jl_email = new javax.swing.JLabel();
        jtf_email = new javax.swing.JTextField();
        jl_ciudad = new javax.swing.JLabel();
        jtf_ciudad = new javax.swing.JTextField();
        jl_estado = new javax.swing.JLabel();
        jtf_estado = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        jl_titulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_titulo.setText("Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(567, 567, 567)
                .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(423, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGap(0, 69, Short.MAX_VALUE)
        );

        jlIdCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlIdCliente.setText("ID Cliente");

        jl_nombre_cliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_nombre_cliente.setText("Nombre (s)");

        jl_apellido_paterno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_apellido_paterno.setText("Apellido Paterno");

        jl_apellido_materno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_apellido_materno.setText("Apellido Materno");

        jl_teléfono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_teléfono.setText("Teléfono");

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

        jl_email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_email.setText("Email");

        jl_ciudad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_ciudad.setText("Ciudad");

        jl_estado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_estado.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIdCliente)
                    .addComponent(jl_nombre_cliente)
                    .addComponent(jl_apellido_paterno)
                    .addComponent(jl_apellido_materno)
                    .addComponent(jl_teléfono)
                    .addComponent(jl_rfc)
                    .addComponent(jl_calle))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_nombre_cliente)
                    .addComponent(jtf_apellido_paterno)
                    .addComponent(jtf_apellido_materno)
                    .addComponent(jtf_teléfono)
                    .addComponent(jtf_rfc)
                    .addComponent(jtf_calle, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jtf_id_cliente))
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_colonia)
                    .addComponent(jl_numero_interior)
                    .addComponent(jl_numero_exterior)
                    .addComponent(jl_codigo_postal)
                    .addComponent(jl_email)
                    .addComponent(jl_ciudad)
                    .addComponent(jl_estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_colonia)
                    .addComponent(jtf_numero_interior)
                    .addComponent(jtf_numero_exterior)
                    .addComponent(jtf_codigo_postal)
                    .addComponent(jtf_email)
                    .addComponent(jtf_ciudad)
                    .addComponent(jtf_estado, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre_cliente)
                    .addComponent(jtf_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_numero_interior)
                    .addComponent(jtf_numero_interior, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_apellido_paterno)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_numero_exterior)
                        .addComponent(jtf_numero_exterior, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_apellido_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_apellido_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_codigo_postal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_codigo_postal))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_teléfono, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jl_email))
                    .addComponent(jl_teléfono)
                    .addComponent(jtf_email, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_rfc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jl_ciudad)
                    .addComponent(jtf_ciudad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_rfc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_calle, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jl_calle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_estado)
                    .addComponent(jtf_estado))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlIdCliente;
    private javax.swing.JLabel jl_apellido_materno;
    private javax.swing.JLabel jl_apellido_paterno;
    private javax.swing.JLabel jl_calle;
    private javax.swing.JLabel jl_ciudad;
    private javax.swing.JLabel jl_codigo_postal;
    private javax.swing.JLabel jl_colonia;
    private javax.swing.JLabel jl_email;
    private javax.swing.JLabel jl_estado;
    private javax.swing.JLabel jl_nombre_cliente;
    private javax.swing.JLabel jl_numero_exterior;
    private javax.swing.JLabel jl_numero_interior;
    private javax.swing.JLabel jl_rfc;
    private javax.swing.JLabel jl_teléfono;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JTextField jtf_apellido_materno;
    private javax.swing.JTextField jtf_apellido_paterno;
    private javax.swing.JTextField jtf_calle;
    private javax.swing.JTextField jtf_ciudad;
    private javax.swing.JTextField jtf_codigo_postal;
    private javax.swing.JTextField jtf_colonia;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_estado;
    private javax.swing.JTextField jtf_id_cliente;
    private javax.swing.JTextField jtf_nombre_cliente;
    private javax.swing.JTextField jtf_numero_exterior;
    private javax.swing.JTextField jtf_numero_interior;
    private javax.swing.JTextField jtf_rfc;
    private javax.swing.JTextField jtf_teléfono;
    // End of variables declaration//GEN-END:variables
}