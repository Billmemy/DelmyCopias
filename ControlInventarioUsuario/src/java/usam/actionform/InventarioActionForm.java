
package usam.actionform;

import usam.persistencia.Productos;
import usam.persistencia.Proveedores;
import usam.persistencia.Sucursales;


public class InventarioActionForm extends org.apache.struts.action.ActionForm {
     private Integer idInventario;
     private Productos productos;
     private Proveedores proveedores;
     private Sucursales sucursales;
     private Integer cant;
     private Integer stock;
     private String estado;
    private String error;
    private String action; 

    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public Sucursales getSucursales() {
        return sucursales;
    }

    public void setSucursales(Sucursales sucursales) {
        this.sucursales = sucursales;
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "InventarioActionForm{" + "idInventario=" + idInventario + ", productos=" + productos + ", proveedores=" + proveedores + ", sucursales=" + sucursales + ", cant=" + cant + ", stock=" + stock + ", estado=" + estado + ", error=" + error + ", action=" + action + '}';
    }
    
    
    
    
}
