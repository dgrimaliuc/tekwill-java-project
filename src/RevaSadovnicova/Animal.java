package RevaSadovnicova;

public class Animal {
    private String name;
    private Integer age;
    private String sound;

    public Animal(String name,Integer age, String sound){
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }



}
