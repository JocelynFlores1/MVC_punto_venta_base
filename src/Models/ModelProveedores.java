/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Norberto
 */
public class ModelProveedores {
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    
    private String id_proveedor;
    private String nombre_proveedor;
    private String calle;
    private String colonia;
    private Integer numero_exterior;
    private Integer codigo_postal;

    public Integer getNumero_exterior() {
        return numero_exterior;
    }

    public void setNumero_exterior(Integer numero_exterior) {
        this.numero_exterior = numero_exterior;
    }

    public Integer getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(Integer codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    private String ciudad;
    private String telefono;


    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Statement getSt() {
        return st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
     
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void modificarDatos() {
        try {
            this.setId_proveedor(rs.getString("id_proveedor"));
            this.setNombre_proveedor(rs.getString("nombre_proveedor"));
            this.setCalle(rs.getString("calle"));
            this.setColonia(rs.getString("colonia"));
            this.setNumero_exterior(rs.getInt("numero_exterior"));
            this.setCodigo_postal(rs.getInt("codigo_postal"));
            this.setCiudad(rs.getString("ciudad"));
            this.setTelefono(rs.getString("telefono"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ModelProveedores 001: \n" + e.getMessage());
        }
    }
    /**
     * Método que realiza las siguietnes acciones: 
     * 1.- Conecta con la base
     * 2.- Consulta todo los registros .
     */
    public void conectarDB() {
        try {
            conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dagasoft", "daga", "daga.2018");
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM contactos;");
            rs.next();
            id_proveedor = rs.getString("id_proveedor");
            nombre_proveedor = rs.getString("nombre_proveedor");
            calle = rs.getString("calle");
            colonia = rs.getString("colonia");
            numero_exterior = rs.getInt("numero_exterior");
            codigo_postal = rs.getInt("codigo_postal");
            ciudad = rs.getString("ciudad");
            telefono = rs.getString("colonia");
            this.setId_proveedor(id_proveedor);
            this.setNombre_proveedor(nombre_proveedor);
            this.setCalle(calle);
            this.setColonia(colonia);
            this.setNumero_exterior(numero_exterior);
            this.setCodigo_postal(codigo_postal);
            this.setCiudad(ciudad);
            this.setTelefono(telefono);
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelProveedores 002: " + sql.getMessage());
        }

    }
    /**
     * Método que realiza las siguiente acciones: 
     * 1.- Moverse al primer registro
     * 2.- obtener el valor del id_proveedor de rs y guardarlo en la variable id_proveedor
     * 3.- obtener el valor del nombre_proveedor de rs y guardarlo en la variable nombre_proveedor
     * etc.
     */
    public void moverPrimerRegistro() {
        System.out.print(" accion moverPrimerRegistro");
        try {
            rs.first();
            modificarDatos();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelProveedores 004: " + sql.getMessage());
        }
    }
    public void moverSiguienteRegistro() {

        try {
            if (!rs.isLast()) {
                rs.next();
                modificarDatos();
                System.out.print("accion moverSiguienteRegistro");
            }

        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelProveedores 005: " + sql.getMessage());
        }
    }
    public void moverAnteriorRegistro() {

        try {
            if (!rs.isFirst()) {
                rs.previous();
                modificarDatos();
                System.out.print("accion moverAnteriorRegistro");

            }

        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelProveedores 006: " + sql.getMessage());
        }
    }
    public void moverUltimoRegistro() {
        try{
            rs.last();
            modificarDatos();
        }catch(SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelProveedores 007: " + sql.getMessage());
        }
    }
    public void nuevoRegistro() {
        System.out.println("Insertar nuevo proveedor");
        try {
            String sql = "INSERT INTO proveedores(id_proveedor,nombre_proveedor,calle,colonia,numero_exterior,codigo_postal,ciudad,telefono) VALUES " + "('" +id_proveedor + "','" + nombre_proveedor + "','" + calle + "','" + colonia + "','" + numero_exterior + "','" + codigo_postal + "','" + ciudad + "','" + telefono + "');";
            System.out.println(sql);
            st.executeUpdate(sql);
            this.conectarDB();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelProveedores 008: " + sql.getMessage());
      }
    }
    public void modificarRegistro(String id_proveedor, String nombre_proveedor,String calle,String colonia,Integer numero_exterior,Integer codigo_postal,String ciudad,String telefono) {
        System.out.println("Modificar proveedor");
        try {
            String sql = "UPDATE proveedores SET nombre_proveedor= '" + nombre_proveedor + "',calle='" + calle + "',colonia='" + colonia + "',numero_exterior='" + numero_exterior + "',codigo_postal='" + codigo_postal + "',ciudad='" + ciudad + "',telefono='" + telefono +"' WHERE id_contacto='" + id_proveedor + "';";
            st.executeUpdate(sql);
            this.conectarDB();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error ModelProveedores 009: " + sql.getMessage());
        }
    }
     public void borrarRegistro(Integer id) {
        System.out.println("Eliminar proveedor");
        try {
            String sql = "DELETE FROM proveedore WHERE id_proveedor = '" + id_proveedor + "';";
            st.executeUpdate(sql);
            this.conectarDB();
        } catch (SQLException sql) {
             JOptionPane.showMessageDialog(null, "Error ModelAgenda 010: " + sql.getMessage());
        }
    }

    
}
