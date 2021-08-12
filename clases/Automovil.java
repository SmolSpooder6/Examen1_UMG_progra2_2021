
package clases;

public class Automovil extends VehiculoTerrestre {
    private String cantPuertas;
    
    public Automovil() {
        
    }

    public Automovil(String modelo, String marca, String color, String placa, String cc, String cantPuertas) {
        super(modelo, marca, color, placa);
        this.cantPuertas = cantPuertas;
    }
    public String getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(String cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    public void Detalles() {
        
        System.out.println("Modelo = " + getModelo());
        System.out.println("Marca = " + getMarca());
        System.out.println("Color = " + getColor());
        System.out.println("Placa = " + getPlaca());
        System.out.println("Placa = " + getPlaca());
    }
}
