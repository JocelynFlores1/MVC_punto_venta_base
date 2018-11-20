/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jocelyn
 */
public class ModelProveedores {

    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;

    private String id_proveedor;
    private String nombre_proveedor;
    private String calle_proveedor;
    private Integer numero_exterior_proveedor;
    private String colonia_proveedor;
    private Integer codigo_postal_proveedor;
    private String telefono_proveedor;
    private String email_proveedor;
    private String ciudad_proveedor;
    private String estado_proveedor;

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

    public String getCalle_proveedor() {
        return calle_proveedor;
    }

    public void setCalle_proveedor(String calle_proveedor) {
        this.calle_proveedor = calle_proveedor;
    }

    public Integer getNumero_exterior_proveedor() {
        return numero_exterior_proveedor;
    }

    public void setNumero_exterior_proveedor(Integer numero_exterior_proveedor) {
        this.numero_exterior_proveedor = numero_exterior_proveedor;
    }

    public String getColonia_proveedor() {
        return colonia_proveedor;
    }

    public void setColonia_proveedor(String colonia_proveedor) {
        this.colonia_proveedor = colonia_proveedor;
    }

    public Integer getCodigo_postal_proveedor() {
        return codigo_postal_proveedor;
    }

    public void setCodigo_postal_proveedor(Integer codigo_postal_proveedor) {
        this.codigo_postal_proveedor = codigo_postal_proveedor;
    }

    public String getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setTelefono_proveedor(String telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }

    public String getEmail_proveedor() {
        return email_proveedor;
    }

    public void setEmail_proveedor(String email_proveedor) {
        this.email_proveedor = email_proveedor;
    }

    public String getCiudad_proveedor() {
        return ciudad_proveedor;
    }

    public void setCiudad_proveedor(String ciudad_proveedor) {
        this.ciudad_proveedor = ciudad_proveedor;
    }

    public String getEstado_proveedor() {
        return estado_proveedor;
    }

    public void setEstado_proveedor(String estao_proveedor) {
        this.estado_proveedor = estao_proveedor;
    }

    public void modificarDatos() {
        try {
            setId_proveedor(rs.getString(1));
            setNombre_proveedor(rs.getString(2));
            setCalle_proveedor(rs.getString(3));
            setNumero_exterior_proveedor(Integer.parseInt(rs.getString(4)));
            setColonia_proveedor(rs.getString(5));
            setCodigo_postal_proveedor(Integer.parseInt(rs.getString(6)));
            setTelefono_proveedor(rs.getString(7));
            setEmail_proveedor(rs.getString(8));
            setCiudad_proveedor(rs.getString(9));
            setEstado_proveedor(rs.getString(10));
        } catch (SQLException e) {
            System.out.println("Error 01: modificar datos" + e);
        }
    }
    
        /**
     * Método que realiza las siguietnes acciones: 1.- Conecta con la base 2.-
     * Consulta todo los registros .
     */
    public void conectarDB() {
        ModelConexion loginConexion = new ModelConexion();
        loginConexion.getConexion();
        try {
            String consultaString = "select * from proveedores";
            ps = (PreparedStatement) loginConexion.getConexion().prepareStatement(consultaString);
            rs = ps.executeQuery();

            if (rs.next()) {
                modificarDatos();
            } else {
                System.out.println("Error de consulta");
            }
        } catch (SQLException e) {
            System.out.println("Error 02: tabla proveedores" + e);
        }
    }
    
    
}
