package usam.persistencia;
// Generated 08-30-2018 09:15:49 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Sucursales generated by hbm2java
 */
public class Sucursales  implements java.io.Serializable {


     private Integer idSucursal;
     private String sucursal;
     private String direccion;
     private String municipio;
     private String departamento;
     private String telefono;
     private Set inventarios = new HashSet(0);
     private Set facturases = new HashSet(0);

    public Sucursales() {
    }

    public Sucursales(String sucursal, String direccion, String municipio, String departamento, String telefono, Set inventarios, Set facturases) {
       this.sucursal = sucursal;
       this.direccion = direccion;
       this.municipio = municipio;
       this.departamento = departamento;
       this.telefono = telefono;
       this.inventarios = inventarios;
       this.facturases = facturases;
    }
   
    public Integer getIdSucursal() {
        return this.idSucursal;
    }
    
    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }
    public String getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Set getInventarios() {
        return this.inventarios;
    }
    
    public void setInventarios(Set inventarios) {
        this.inventarios = inventarios;
    }
    public Set getFacturases() {
        return this.facturases;
    }
    
    public void setFacturases(Set facturases) {
        this.facturases = facturases;
    }




}

