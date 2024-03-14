//herencia
public class cliente extends persona{
    public String cuentaPorCobrar;
    
    //metodo vacio
    public cliente() {
    }
    
    //metod contructor
    public cliente(String cuentaPorCobrar, String Dui, String Nombre, String apellido) {
        super(Dui, Nombre, apellido);
        this.cuentaPorCobrar = cuentaPorCobrar;
    }
    
    //encapsulado

    public String getCuentaPorCobrar() {
        return cuentaPorCobrar;
    }

    public void setCuentaPorCobrar(String cuentaPorCobrar) {
        this.cuentaPorCobrar = cuentaPorCobrar;
    }
    
}
