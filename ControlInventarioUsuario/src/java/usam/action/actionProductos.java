package usam.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import usam.mantenimiento.ProductosMantenimiento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import usam.actionform.ProductosActionForm;
import usam.persistencia.Productos;

public class actionProductos extends org.apache.struts.action.Action {

    private static final String agregarPROD = "agregarPROD";
    private static final String consultarPROD = "consultarPROD";
    private static final String consultarIdPROD = "consultarIdPROD";
    private static final String modificarPROD = "modificarPROD";
    private static final String eliminarPROD = "eliminarPROD";
    private static final String errorPROD = "errorPROD";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ProductosActionForm formBean = (ProductosActionForm) form;
        int idProducto = formBean.getIdProducto();
        int idFabricante = formBean.getFabricantes().getIdFabricante();
        int idProveedor = formBean.getProveedores().getIdProveedor();
        String producto = formBean.getProducto();
        String action = formBean.getAction();

        if (formBean == null || action == null) {
            return mapping.findForward(errorPROD);
        }
        if (action.equals("Agregar")) {
            String adver = "";
            if (producto == null || producto.equals("")) {
                adver = "* Escriba el nombre del producto";
                return mapping.findForward(errorPROD);
            }
            if (!adver.equals("")) {
                formBean.setError("<div class='alert alert-danger'>" + adver + "</div>");
                return mapping.findForward(errorPROD);
            }
            ProductosMantenimiento mprod = new ProductosMantenimiento();
            Productos prod = mprod.consultarProducto(producto);
            if (prod != null) {
                formBean.setError("<div class='alert alert-danger'>Este Producto ya Existe</div>");
                return mapping.findForward(errorPROD);
            }
            int prod2 = mprod.guardarProductos(idFabricante, idProveedor, producto);
            System.out.println("Si es 1 Funcionó " + prod2);
            return mapping.findForward(agregarPROD);
        }

        if (action.equals("Consultar")) {
            ProductosMantenimiento mprod = new ProductosMantenimiento();
            List<Productos> listaProd = mprod.consultarTodosProductos();

            if (listaProd == null) {
                formBean.setError("<div class='alert alert-danger'>No hay Datos Guardados</div>");
                return mapping.findForward(errorPROD);
            } else {
                formBean.setListaProd(listaProd);
                return mapping.findForward(consultarPROD);
            }
        }

        return mapping.findForward(consultarPROD);
    }
}
