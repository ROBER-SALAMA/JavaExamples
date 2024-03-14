
public class persona {
    private String Dui;
    public String Nombre;
    public String apellido;
    
    //contructor vacio
    public persona() {
    }
    //metodo constructor lleno
    public persona(String Dui, String Nombre, String apellido) {
        this.Dui = Dui;
        this.Nombre = Nombre;
        this.apellido = apellido;
    }
    
    //encapsulados

    public String getDui() {
        return Dui;
    }

    public void setDui(String Dui) {
        this.Dui = Dui;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
