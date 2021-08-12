
package clases;

public class Moto extends VehiculoTerrestre {
    
    public Moto() {
        
    }

    public Moto(String modelo, String marca, String color, String placa) {
        super(modelo, marca, color, placa);
        
    }


    public void mostrarDetalles() {
        System.out.println("Marca = " + getMarca());
        System.out.println("Modelo = " + getModelo());
        System.out.println("Color = " + getColor());
        System.out.println("Placa = " + getPlaca());
    }
}
