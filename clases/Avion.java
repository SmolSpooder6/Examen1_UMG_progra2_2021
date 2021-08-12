
package clases;


public class Avion extends VehiculoAereo {
    private String Turbinas;
    
    public Avion() {
        
    }

    public Avion(String Turbinas, String modelo, String marca, String color, String placa) {
        super(modelo, marca, color, placa);
        this.Turbinas = Turbinas;
    }

    public String getTurbinas() {
        return Turbinas;
    }

    public void setTurbinas(String Turbinas) {
        this.Turbinas = Turbinas;
    }
    

    
    public void Detalles() {
        System.out.println("Cantidad de Turbinas = " + getTurbinas());
        System.out.println("Modelo = " + getModelo());
        System.out.println("Marca = " + getMarca());
        System.out.println("Color = " + getColor());
        System.out.println("Placa = " + getPlaca());
        
    }
}