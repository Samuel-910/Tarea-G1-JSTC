package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class ProductoTO {
    public String idproducto, nombrepro;
    public String unidMed, idCad, idMod;
    public Double percioUnid, utilidad, spock, cantMayor;
}
