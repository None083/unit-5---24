/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06ejer1;

/**
 *
 * @author FX506
 */
public class Calefactor {
    
    private int temperatura;
    private EstadoCalefactor estado;

    public Calefactor(int temperatura) {
        this.temperatura = temperatura;
        this.estado = EstadoCalefactor.APAGADO;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public EstadoCalefactor getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calefactor{");
        sb.append("temperatura=").append(temperatura);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
    public void encender(){
        this.estado = EstadoCalefactor.ENCENDIDO;
    }
    
    public void apagar(){
        this.estado = EstadoCalefactor.APAGADO;
    }
    
    public void fijarTemperatura(int temperatura){
        if(this.estado.equals(EstadoCalefactor.ENCENDIDO)){
            this.temperatura = temperatura;
        }else {
            System.out.println("Debes encender el calefactor primero");
        }
        
    }
    
}
