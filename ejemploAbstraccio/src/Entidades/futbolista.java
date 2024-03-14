package Entidades;
public class futbolista {
    public Integer id;
    public String Nombre;
    public String Apellidos;
    public Integer Edad;
    public String dorsal;
    public String demarcacion;
   
    //metodo vacio
    public futbolista() {
    }
    
    //metodo constructor lleno
    public futbolista(Integer id, String Nombre, String Apellidos, Integer Edad, String dorsal, String demarcacion) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    //encansuplado
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
//
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
 
}
