package alexandr_samohvalov.Inheritance;
//Create a subclass called "Dog" that inherits from "Animal" and includes additional instance variables such as breed and weight, create constructors to initialize all variables.
public class Dog extends Animal {

        private String breed;
        private double weight;

        public Dog(String name, int age, String sound, String breed, double weight) {
            super(name, age, sound);
            this.breed = breed;
            this.weight = weight;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }

