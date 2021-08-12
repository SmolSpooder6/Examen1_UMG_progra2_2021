
package clases;

abstract public class Vehiculo {
    private String modelo, marca, color, placa;
        public Vehiculo() {
        
    }

    public Vehiculo(String modelo, String marca, String color, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
    }

     public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void getMatricula(String matrícula) {
        this.placa = matrícula;
    }
}