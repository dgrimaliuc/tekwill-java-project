package AnastasiaGoncear.Lesson7AnastasiaGoncear.Interface;

public class Main {
    public static void main(String[] args) {
        Playable myGuitar = new Guitar();
        Playable myPiano = new Piano();
        Playable myDrums = new Drums();
        myGuitar.play();
        myPiano.play();
        myDrums.play();
    }
}