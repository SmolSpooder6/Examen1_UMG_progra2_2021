
package clases;



public class Helicoptero extends VehiculoAereo {
    private String Helices;
    
    public Helicoptero() {
        
    }

    public Helicoptero(String Helices, String modelo, String marca, String color, String placa) {
        super(modelo, marca, color, placa);
        this.Helices = Helices;
    }

    public String getHelices() {
        return Helices;
    }

    public void setHelices(String cantHelices) {
        this.Helices = cantHelices;
    }
    
    
    public void mostrarDetalles() {
        System.out.println("Marca = " + getMarca());
        System.out.println("Modelo = " + getModelo());
        System.out.println("Color = " + getColor());
        System.out.println("Placa = " + getPlaca());
        System.out.println("Cantidad de Hélices = " + getHelices());
    }
}
