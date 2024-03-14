package Entidades;
public class masajista extends futbolista{
    public String Titulacio;
    public Integer aniosExperiencia;
    
    //metodo vacio
    public masajista() {
    }
    
    //constructor lleno
    public masajista(String Titulacio, Integer aniosExperiencia, Integer id, 
        String Nombre, String Apellidos, Integer Edad, String dorsal, String demarcacion) {
        super(id, Nombre, Apellidos, Edad, dorsal, demarcacion);
        this.Titulacio = Titulacio;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    //encapsulamiento
    public String getTitulacio() {
        return Titulacio;
    }

    public void setTitulacio(String Titulacio) {
        this.Titulacio = Titulacio;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
}
