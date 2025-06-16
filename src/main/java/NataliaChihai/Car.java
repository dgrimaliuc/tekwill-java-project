package main.java.NataliaChihai;

public class Car {
    private String marca;
    private String model;
    private int an;
    public Car(String marca, String model, int an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

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

    public static void main(String[] args) {
        Car masina = new Car("Dacia", "Logan", 2018);
        masina.setModel("Duster");
        masina.setAn(2023);
        System.out.println("Marca: " + masina.getMarca());
        System.out.println("Model: " + masina.getModel());
        System.out.println("An: " + masina.getAn());
    }
}
