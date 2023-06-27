package ana_raetcaia;

public class InstrumentTest {
    public static void main(String[]args){
  Instrument guitarObj = new Guitar();
  Instrument pianoObj = new Piano();
  Instrument violinObj = new Violin();

  guitarObj.PlaySound();
  pianoObj.PlaySound();
  violinObj.PlaySound();

  System.out.println(guitarObj);
  System.out.println(pianoObj);
  System.out.println(violinObj);


    }
}
