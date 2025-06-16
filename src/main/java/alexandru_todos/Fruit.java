package main.java.alexandru_todos;

public class Fruit {
    String fruitName;
    String color;
    int calories;

    Fruit(String fruitName, String color, int calories) {
            this.fruitName = fruitName;
            this.color = color;
            this.calories = calories;
        }

        public void getInfo(){
            System.out.println("Fruit name: " + fruitName + ", color: " + color + ", calories per 100g: " + calories);
        }

    }
