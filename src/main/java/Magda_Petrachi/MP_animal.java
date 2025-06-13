package main.java.Magda_Petrachi;

public class MP_animal {
    String NickName;
    String type;
    int age;
    String sound;

    public MP_animal(String NickName, String type, int age, String sound){
        this.NickName = NickName;
        this.type = type;
        this.age = age;
        this.sound = sound;
        System.out.println("Acesta este " + NickName );
    }

    @Override
    public String toString() {
        return "MP_animal{" +
                "NickName='" + NickName + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", sound='" + sound + '\'' +
                '}';
    }
}
