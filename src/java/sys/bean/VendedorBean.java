
package sys.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import sys.dao.VendedorDAO;
import sys.impl.VendedorDAOImpl;
import sys.modelo.Vendedor;

@ManagedBean
@Named(value = "vendedorBean")
@ViewScoped
public class VendedorBean {
    
    private Vendedor vendedor=null;
    private List<Vendedor> vendedores=null;
    
    public VendedorBean() {
    }
    
    public List<Vendedor> getVendedores() {
        VendedorDAO datos=new VendedorDAOImpl();
        this.vendedores=datos.select();
        return vendedores;
    }
    
    public void prepareVendedor(){
        this.vendedor=new Vendedor();
    }
    
    public void insertVendedor(){
        VendedorDAO datos=new VendedorDAOImpl();
        datos.insert(vendedor);
    }
    
    public void updateVendedor(){
        VendedorDAO datos=new VendedorDAOImpl();
        datos.update(vendedor);
        this.vendedor=new Vendedor();
    }
    
    public void deleteVendedor(){
        VendedorDAO datos=new VendedorDAOImpl();
        datos.delete(vendedor);
        this.vendedor=new Vendedor();
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }


    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
    
    
}
