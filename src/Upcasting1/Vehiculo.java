package Upcasting1;

/**
 *
  */
public class Vehiculo {

    private String marca;
    private String modelo;
    private String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frenar() {
        System.out.println("Frenando...");
    }

    private void chequearMotor() {
        System.out.println("Chequeando motor...");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String nuevaMarca) {
        if (nuevaMarca != null) {
            this.marca = nuevaMarca;
        }
    }

    public void encender() {
        chequearMotor();
        System.out.println("Encendiendo...");
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + '}';
    }

}
