package main.java.Magda_Petrachi;

public class MP_fruits {
    String name;
    String color;
    Double calorii;

    public MP_fruits (String name, String color, Double calorii){
        this.name = name;
        this.color = color;
        this.calorii = calorii;
        System.out.println("Fruit " + name );
    }

    @Override
    public String toString() {
        return "MP_fruits{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", calorii=" + calorii +
                '}';
    }
}
