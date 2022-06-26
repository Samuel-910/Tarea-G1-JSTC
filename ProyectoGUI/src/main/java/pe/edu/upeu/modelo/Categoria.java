package pe.edu.upeu.modelo;

/**
 * CategoriaTO
 */
public class Categoria {
   public String idCat;
   public String nombreCat;

    public Categoria(String idCat, String nombreCat) {
        this.idCat = idCat;
        this.nombreCat = nombreCat;
    }


    public String getIdCat() {
        return idCat;
    }
    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }
    public String getNombreCat() {
        return nombreCat;
    }
    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }


}