package main.java.lilia_toma;

/**
 * Proiectați o clasă numită “Car” cu variabile de instanță private
 * pentru marcă, model și an. Oferiți metode getter și setter pentru fiecare variabilă.
 */
public class Car {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    private String model;
    private int an;
}
