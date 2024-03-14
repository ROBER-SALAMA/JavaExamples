
public class empleado extends persona{
    public String cuentasPorPagar;
    
    //metodo vacio
    public empleado() {
    }
    
    //contructor
    public empleado(String cuentasPorPagar, String Dui, String Nombre, String apellido) {
        super(Dui, Nombre, apellido);
        this.cuentasPorPagar = cuentasPorPagar;
    }
    
    //encapsulado
    public String getCuentasPorPagar() {
        return cuentasPorPagar;
    }

    public void setCuentasPorPagar(String cuentasPorPagar) {
        this.cuentasPorPagar = cuentasPorPagar;
    }
    
}
