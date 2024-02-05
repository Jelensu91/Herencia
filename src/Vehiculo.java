public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa = 0.0;
    private boolean disponible;

    public Vehiculo(String matricula,
                    String marca,
                    String modelo,
                    String color,
                    double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }
    public String getAtributos() {
        return "Matrícula: " + this.matricula +
                " Modelo: " + this.marca + " " + this.modelo +
                " Color: " + this.color +
                " Tarifa: " + this.tarifa +
                " Disponible: " + this.disponible;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
