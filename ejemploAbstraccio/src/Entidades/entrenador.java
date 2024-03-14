package Entidades;
public class entrenador extends futbolista{
      public String idFederacio;
      
      //metodo vacio
    public entrenador() {
    }
      
    //constructor lleno
    public entrenador(String idFederacio, Integer id, String Nombre, String Apellidos, Integer Edad, String dorsal, String demarcacion) {
        super(id, Nombre, Apellidos, Edad, dorsal, demarcacion);
        this.idFederacio = idFederacio;
    }
    
    //encapsulado
    public String getIdFederacio() {
        return idFederacio;
    }

    public void setIdFederacio(String idFederacio) {
        this.idFederacio = idFederacio;
    }
    
}
