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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jpClientesTitulo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jpAdministracionClientes = new javax.swing.JPanel();
        jl_id_Cliente = new javax.swing.JLabel();
        jtf_id_cliente = new javax.swing.JTextField();
        jl_nombre_cliente = new javax.swing.JLabel();
        jtf_nombre_cliente = new javax.swing.JTextField();
        jl_apellido_paterno = new javax.swing.JLabel();
        jtf_apellido_paterno = new javax.swing.JTextField();
        jl_apellido_materno = new javax.swing.JLabel();
        jtf_apellido_materno = new javax.swing.JTextField();
        jl_teléfono = new javax.swing.JLabel();
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
        jl_email = new javax.swing.JLabel();
        jtf_email = new javax.swing.JTextField();
        jl_ciudad = new javax.swing.JLabel();
        jtf_ciudad = new javax.swing.JTextField();
        jl_estado = new javax.swing.JLabel();
        jtf_estado = new javax.swing.JTextField();
        jb_insertar = new javax.swing.JButton();
        jb_nuevo = new javax.swing.JButton();
        jb_eliminar_cliente = new javax.swing.JButton();
        jb_modificar_cliente = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jpPieDePagina = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jpBorde = new javax.swing.JPanel();
        jpPieDePagina1 = new javax.swing.JPanel();
        jpClientesTitulo1 = new javax.swing.JPanel();
        jpBordeTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_clientes = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1200, 600));

        jpClientesTitulo.setBackground(new java.awt.Color(204, 51, 0));
        jpClientesTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpClientesTitulo.setPreferredSize(new java.awt.Dimension(425, 60));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Administración de clientes");

        javax.swing.GroupLayout jpClientesTituloLayout = new javax.swing.GroupLayout(jpClientesTitulo);
        jpClientesTitulo.setLayout(jpClientesTituloLayout);
        jpClientesTituloLayout.setHorizontalGroup(
            jpClientesTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClientesTituloLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpClientesTituloLayout.setVerticalGroup(
            jpClientesTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClientesTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpAdministracionClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos personales clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jpAdministracionClientes.setOpaque(false);

        jl_id_Cliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_id_Cliente.setText("ID Cliente");

        jtf_id_cliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_nombre_cliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_nombre_cliente.setText("Nombre (s)");

        jtf_nombre_cliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_apellido_paterno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_apellido_paterno.setText("Apellido Paterno");

        jtf_apellido_paterno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_apellido_materno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_apellido_materno.setText("Apellido Materno");

        jtf_apellido_materno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_teléfono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_teléfono.setText("Teléfono");

        jtf_telefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_rfc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_rfc.setText("RFC");

        jtf_rfc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_calle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_calle.setText("Calle");

        jtf_calle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_colonia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_colonia.setText("Colonia");

        jtf_colonia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_numero_interior.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_numero_interior.setText("Número interior");

        jtf_numero_interior.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_numero_exterior.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_numero_exterior.setText("Número exterior");

        jtf_numero_exterior.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_codigo_postal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_codigo_postal.setText("Codigo Postal");

        jtf_codigo_postal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_email.setText("Email");

        jtf_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_ciudad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_ciudad.setText("Ciudad");

        jtf_ciudad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jl_estado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_estado.setText("Estado");

        jtf_estado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jb_insertar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_insertar.setText("Guardar");

        jb_nuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_nuevo.setText("Nuevo");

        jb_eliminar_cliente.setText("Eliminar registro");

        jb_modificar_cliente.setText("Modificar registro");

        jb_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jb_cancelar.setText("Cancelar");

        javax.swing.GroupLayout jpAdministracionClientesLayout = new javax.swing.GroupLayout(jpAdministracionClientes);
        jpAdministracionClientes.setLayout(jpAdministracionClientesLayout);
        jpAdministracionClientesLayout.setHorizontalGroup(
            jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAdministracionClientesLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_id_Cliente)
                    .addComponent(jl_nombre_cliente)
                    .addComponent(jl_apellido_paterno)
                    .addComponent(jl_apellido_materno)
                    .addComponent(jl_teléfono)
                    .addComponent(jl_rfc)
                    .addComponent(jl_calle))
                .addGap(20, 20, 20)
                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_nombre_cliente)
                    .addComponent(jtf_apellido_paterno)
                    .addComponent(jtf_apellido_materno)
                    .addComponent(jtf_telefono)
                    .addComponent(jtf_rfc)
                    .addComponent(jtf_calle)
                    .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpAdministracionClientesLayout.createSequentialGroup()
                        .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpAdministracionClientesLayout.createSequentialGroup()
                        .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_colonia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_numero_interior, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_numero_exterior, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_codigo_postal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_ciudad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_estado, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_colonia)
                            .addComponent(jtf_numero_interior)
                            .addComponent(jtf_numero_exterior)
                            .addComponent(jtf_codigo_postal)
                            .addComponent(jtf_email)
                            .addComponent(jtf_ciudad)
                            .addComponent(jtf_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAdministracionClientesLayout.createSequentialGroup()
                        .addComponent(jb_eliminar_cliente)
                        .addGap(18, 18, 18)
                        .addComponent(jb_modificar_cliente)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jpAdministracionClientesLayout.setVerticalGroup(
            jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAdministracionClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAdministracionClientesLayout.createSequentialGroup()
                        .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jtf_numero_interior, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jtf_numero_exterior, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jtf_codigo_postal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jtf_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(jtf_estado, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                    .addGroup(jpAdministracionClientesLayout.createSequentialGroup()
                        .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAdministracionClientesLayout.createSequentialGroup()
                                .addComponent(jl_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jl_numero_interior, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jl_numero_exterior, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jl_codigo_postal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jl_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jl_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpAdministracionClientesLayout.createSequentialGroup()
                                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jl_id_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jl_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_apellido_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jl_apellido_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_apellido_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtf_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl_teléfono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_rfc, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_rfc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_calle)
                                    .addComponent(jl_calle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_eliminar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jpAdministracionClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_modificar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        jpPieDePagina.setBackground(new java.awt.Color(204, 51, 0));
        jpPieDePagina.setPreferredSize(new java.awt.Dimension(452, 60));

        javax.swing.GroupLayout jpPieDePaginaLayout = new javax.swing.GroupLayout(jpPieDePagina);
        jpPieDePagina.setLayout(jpPieDePaginaLayout);
        jpPieDePaginaLayout.setHorizontalGroup(
            jpPieDePaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpPieDePaginaLayout.setVerticalGroup(
            jpPieDePaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(jpClientesTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpAdministracionClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpPieDePagina, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpClientesTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1186, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpAdministracionClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpPieDePagina, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpClientesTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpAdministracionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPieDePagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", jLayeredPane1);

        jpBorde.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jpBorde.setOpaque(false);

        jpPieDePagina1.setBackground(new java.awt.Color(204, 51, 0));
        jpPieDePagina1.setPreferredSize(new java.awt.Dimension(452, 60));

        javax.swing.GroupLayout jpPieDePagina1Layout = new javax.swing.GroupLayout(jpPieDePagina1);
        jpPieDePagina1.setLayout(jpPieDePagina1Layout);
        jpPieDePagina1Layout.setHorizontalGroup(
            jpPieDePagina1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpPieDePagina1Layout.setVerticalGroup(
            jpPieDePagina1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jpClientesTitulo1.setBackground(new java.awt.Color(204, 51, 0));
        jpClientesTitulo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpClientesTitulo1.setPreferredSize(new java.awt.Dimension(425, 60));

        javax.swing.GroupLayout jpClientesTitulo1Layout = new javax.swing.GroupLayout(jpClientesTitulo1);
        jpClientesTitulo1.setLayout(jpClientesTitulo1Layout);
        jpClientesTitulo1Layout.setHorizontalGroup(
            jpClientesTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpClientesTitulo1Layout.setVerticalGroup(
            jpClientesTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jpBordeTabla.setBackground(new java.awt.Color(204, 51, 0));
        jpBordeTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jtable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Ap. Paterno", "Ap. Materno", "Télefono", "R.F.C", "Calle", "Colonia", "No. Ext.", "No. Int.", "Código P.", "Email", "Ciudad", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jtable_clientes);

        javax.swing.GroupLayout jpBordeTablaLayout = new javax.swing.GroupLayout(jpBordeTabla);
        jpBordeTabla.setLayout(jpBordeTablaLayout);
        jpBordeTablaLayout.setHorizontalGroup(
            jpBordeTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBordeTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpBordeTablaLayout.setVerticalGroup(
            jpBordeTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBordeTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout jpBordeLayout = new javax.swing.GroupLayout(jpBorde);
        jpBorde.setLayout(jpBordeLayout);
        jpBordeLayout.setHorizontalGroup(
            jpBordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBordeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpPieDePagina1, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
                    .addComponent(jpClientesTitulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
                    .addComponent(jpBordeTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpBordeLayout.setVerticalGroup(
            jpBordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBordeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpClientesTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBordeTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpPieDePagina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane2.setLayer(jpBorde, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBorde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBorde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registros", jLayeredPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton jb_cancelar;
    public javax.swing.JButton jb_eliminar_cliente;
    public javax.swing.JButton jb_insertar;
    public javax.swing.JButton jb_modificar_cliente;
    public javax.swing.JButton jb_nuevo;
    public javax.swing.JLabel jl_apellido_materno;
    public javax.swing.JLabel jl_apellido_paterno;
    public javax.swing.JLabel jl_calle;
    public javax.swing.JLabel jl_ciudad;
    public javax.swing.JLabel jl_codigo_postal;
    public javax.swing.JLabel jl_colonia;
    public javax.swing.JLabel jl_email;
    public javax.swing.JLabel jl_estado;
    public javax.swing.JLabel jl_id_Cliente;
    public javax.swing.JLabel jl_nombre_cliente;
    public javax.swing.JLabel jl_numero_exterior;
    public javax.swing.JLabel jl_numero_interior;
    public javax.swing.JLabel jl_rfc;
    public javax.swing.JLabel jl_teléfono;
    private javax.swing.JPanel jpAdministracionClientes;
    private javax.swing.JPanel jpBorde;
    private javax.swing.JPanel jpBordeTabla;
    private javax.swing.JPanel jpClientesTitulo;
    private javax.swing.JPanel jpClientesTitulo1;
    private javax.swing.JPanel jpPieDePagina;
    private javax.swing.JPanel jpPieDePagina1;
    public javax.swing.JTable jtable_clientes;
    public javax.swing.JTextField jtf_apellido_materno;
    public javax.swing.JTextField jtf_apellido_paterno;
    public javax.swing.JTextField jtf_calle;
    public javax.swing.JTextField jtf_ciudad;
    public javax.swing.JTextField jtf_codigo_postal;
    public javax.swing.JTextField jtf_colonia;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_estado;
    public javax.swing.JTextField jtf_id_cliente;
    public javax.swing.JTextField jtf_nombre_cliente;
    public javax.swing.JTextField jtf_numero_exterior;
    public javax.swing.JTextField jtf_numero_interior;
    public javax.swing.JTextField jtf_rfc;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables

}
