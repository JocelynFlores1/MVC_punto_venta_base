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
 * @author Dany
 */
public class ModelEmpleados {

    public Connection conexion;
    public Statement st;
    public ResultSet rs;
    public PreparedStatement ps;

    public String id_empleado;
    public String nombre_empleado;
    public String apellido_paterno;
    public String apellido_materno;
    public String telefono;
    public String calle;
    public String colonia;
    public String numero_exterior;
    public String numero_interior;
    public String rfc;
    public String no_cueta;
    public String no_seguro;
    public String banco;
    public String curp;
    public String tipo_empleado;
    public String usuario;
    public String contrasena;
    public String codigo_postal;

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

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String Calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.calle = calle;
    }

    public String getNumero_exterior() {
        return numero_exterior;
    }

    public void setNumero_exterior(String numero_exterior) {
        this.numero_exterior = numero_exterior;
    }

    public String getNumero_interior() {
        return numero_interior;
    }

    public void setNumero_interior(String numero_interior) {
        this.numero_interior = numero_interior;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNo_cueta() {
        return no_cueta;
    }

    public void setNo_cueta(String no_cueta) {
        this.no_cueta = no_cueta;
    }

    public String getNo_seguro() {
        return no_seguro;
    }

    public void setNo_seguro(String no_seguro) {
        this.no_seguro = no_seguro;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void modificarDatos() {
        try {
            setId_empleado(rs.getString(1));
            setNombre_empleado(rs.getString(2));
            setApellido_paterno(rs.getString(3));
            setApellido_materno(rs.getString(4));
            setTelefono(rs.getString(5));
            setCalle(rs.getString(6));
            setColonia(rs.getString(7));
            setNumero_exterior(rs.getString(8));
            setNumero_interior(rs.getString(9));
            setRfc(rs.getString(10));
            setNo_cueta(rs.getString(11));
            setNo_seguro(rs.getString(12));
            setBanco(rs.getString(13));
            setCurp(rs.getString(14));
            setTipo_empleado(rs.getString(15));
            setUsuario(rs.getString(16));
            setContrasena(rs.getString(17));
            setCodigo_postal(rs.getString(18));

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
            String consultaString = "select * from empleados";
            ps = (PreparedStatement) loginConexion.getConexion().prepareStatement(consultaString);
            rs = ps.executeQuery();

            if (rs.next()) {
                modificarDatos();
            } else {
                System.out.println("Error de consulta");
            }
        } catch (SQLException e) {
            System.out.println("Error 02: tabla empleados" + e);
        }
    }

    public void insertarNuevoEmpleado() {
        ModelConexion loginConexion = new ModelConexion();
        //Se obtiene la conexion para la clase

        String sqlInsertarEmpleado = "insert into empleado (id_empleado, nombre_empleado, apellido_paterno_cliente, apellido_materno_cliente, telefono, calle, colonia, numero_exterior, numero_interior, rfc, no_cueta, no_seguro, banco, curp, tipo_empleado, usuario, contrasena, codigo_postal) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = (PreparedStatement) loginConexion.getConexion().prepareStatement(sqlInsertarEmpleado); //con este comando se podra hacer la modificacion a la tabla en la base de datos
            System.out.println(getId_empleado());
            ps.setString(1, getId_empleado());
            ps.setString(2, getNombre_empleado());
            ps.setString(3, getApellido_paterno());
            ps.setString(4, getApellido_materno());
            ps.setString(5, getTelefono());
            ps.setString(6, getCalle());
            ps.setString(7, getColonia());
            ps.setString(8, getNumero_exterior());
            ps.setString(9, getNumero_interior());
            ps.setString(10, getRfc());
            ps.setString(11, getNo_cueta());
            ps.setString(12, getNo_seguro());
            ps.setString(13, getBanco());
            ps.setString(14, getCurp());
            ps.setString(15, getTipo_empleado());
            ps.setString(16, getUsuario());
            ps.setString(17, getContrasena());
            ps.setString(18, getCodigo_postal());

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error 03: Insertar nuevo empleado" + ex);
        }
    }

}
