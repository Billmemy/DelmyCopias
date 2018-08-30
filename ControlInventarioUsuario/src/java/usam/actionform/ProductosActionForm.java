
package usam.actionform;

import java.util.List;
import usam.persistencia.Fabricantes;
import usam.persistencia.Productos;
import usam.persistencia.Proveedores;


public class ProductosActionForm  extends org.apache.struts.action.ActionForm{
     private Integer idProducto;
     private Fabricantes fabricantes;
     private Proveedores proveedores;
     private String producto;
     private String error;
     private String action;
     private List<Productos> listaProd;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Fabricantes getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(Fabricantes fabricantes) {
        this.fabricantes = fabricantes;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
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

    public List<Productos> getListaProd() {
        return listaProd;
    }

    public void setListaProd(List<Productos> listaProd) {
        this.listaProd = listaProd;
    }
    
    @Override
    public String toString() {
        return "ProductosActionForm{" + "idProducto=" + idProducto + ", fabricantes=" + fabricantes + ", proveedores=" + proveedores + ", producto=" + producto + ", error=" + error + ", action=" + action + '}';
    }
     
     
     
}
