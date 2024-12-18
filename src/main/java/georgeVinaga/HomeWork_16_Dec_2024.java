package main.java.georgeVinaga;

public class HomeWork_16_Dec_2024 {
    public void main(String[] args) {

// from ChatGPT 1. While: Calculează suma numerelor de la 55 la 111 folosind o buclă do-while.
        int suma_totala = 0; // Declarăm o variabilă numită suma_totala, care va stoca suma tuturor numerelor
        int numar_curent = 55; // Declarăm o variabilă numită numar_curent și o inițializăm cu valoarea 55, reprezentând primul număr din interval
        do { // Începem o buclă de tip do-while
            suma_totala = suma_totala + numar_curent; // Adăugăm valoarea variabilei numar_curent la variabila suma_totala
            numar_curent = numar_curent + 1; // Incrementăm valoarea variabilei numar_curent cu 1
        } while (numar_curent <= 111); // Continuăm bucla cât timp valoarea variabilei numar_curent este mai mică sau egală cu 111
        System.out.println("Suma numerelor de la 55 la 111 este: " + suma_totala); // Afișăm rezultatul sumei totale pe ecran


// from ChatGPT 2. For: Calculează suma numerelor de la 1 la 100 folosind o buclă for.
        int sum = 0; // Variabilă pentru suma totală
        for (int i = 1; i <= 100; i = i + i) { // Buclă for pentru a itera de la 1 la 100
            sum += i; // Adăugăm valoarea curentă a lui i la sumă
        }
        System.out.println("Suma numerelor de la 1 la 100 este: " + sum); // Afișăm rezultatul final


// from ClassWork and Telegram 3. Arrays: Creează un program care găsește și afișează valoarea medie a tuturor elementelor dintr-un array de numere reale.
        double[] number = {1.22, 2.2, 3.1, 4.5, 5.20, 6.234, 11.7};
        double sum1 = 0;
        for (double i : number) {
            sum1 = sum1 + i; // sau poti scrie: sum += i;
        }
        System.out.println("Media aritmetica a numerelor din array este: " + sum1);


// 4. Array: Creează un program care afișează un array de tip String, definit în cadrul programului.
        String[] legume = {"Cartofi", "Roșii", "Ceapă", "Vinete"};
        for (int i = 0; i < legume.length; i++) {
            System.out.println("Legume: " + legume[i]);
        }


    }
}
