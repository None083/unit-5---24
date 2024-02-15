/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package coro;

/**
 *
 * @author FX506
 */
public enum Voz {
    
    CONTRATENOR("Contratenor", "Masculino"),
    TENOR("Tenor", "Masculino"),
    BARITONO("Baritono", "Masculino"),
    SOPRANO("Soprano", "Femenino"),
    MEZZOSOPRANO("Mezzosoprano", "Femenino"),
    CONTRALTO("Contralto", "Femenino");
    
    private final String tipo;
    private final String genero;

    private Voz(String tipo, String genero) {
        this.tipo = tipo;
        this.genero = genero;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Voz{");
        sb.append("tipo=").append(tipo);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
    
    

}
