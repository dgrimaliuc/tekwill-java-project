package main.java.georgeVinaga;

public class ClassWork_18_Dec_2024 {
    public void main(String[] args) {
//-------------------------------------------------------------------------------------------------------------------
// ArrayList: Se folosește când ai nevoie de acces rapid la elemente prin index și adăugări la sfârșit. E mai eficient pentru citire decât modificări.

//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        cars.add("Mercedes");
//        cars.add("Honda");
//        cars.set(0, "Opel"); // Inlocueste Opel cu Volvo
//        cars.remove(0); // Sterge pe Opel
//        System.out.println(cars);
//        }
//-------------------------------------------------------------------------------------------------------------------
//        // Cum se foloseste ArrayList cu un ciclu for.
//        ArrayList<String> cars2 = new ArrayList<String>();
//        cars2.add("Volvo");
//        cars2.add("BMW");
//        cars2.add("Ford");
//        cars2.add("Mazda");
//        for (int i = 0; i < cars2.size(); i++) {  // Daca schimbam 1 in loc de 0, Volvo nu se va afisa.
//            System.out.println(cars2.get(i));
//        }
//
//        // Cum se foloseste ArrayList cu un ciclu foreach.
//        ArrayList<String> cars3 = new ArrayList<String>();
//        cars3.add("Volvo");
//        cars3.add("BMW");
//        cars3.add("Ford");
//        cars3.add("Mazda");
//        for (String i : cars3) {
//            System.out.println(i);
//        }
//-------------------------------------------------------------------------------------------------------------------
        // Creează un ArrayList de numere întregi și adaugă câteva numere în el, folosind forech.
        // Afișează elementele din ArrayList în ordine inversă de la 1 la 4.
//        ArrayList<Integer> numbers1 = new ArrayList<>();
//        numbers1.add(1);
//        numbers1.add(2);
//        numbers1.add(3);
//        numbers1.add(4);
//        for (int number : numbers1) {
//            System.out.println(number);
//        }


        // Creează un ArrayList de numere întregi și adaugă câteva numere în el, folosind for int.
        // Afișează elementele din ArrayList în ordine inversă de la 4 la 1.
//        ArrayList<Integer> numbers2 = new ArrayList<>();
//        numbers2.add(1);
//        numbers2.add(2);
//        numbers2.add(3);
//        numbers2.add(4);
//        for (int i = numbers2.size() - 1; i >= 0; i--)
//            System.out.println(numbers2.get(i));

//-------------------------------------------------------------------------------------------------------------------
        // Scrie un program care ia input de la utilizator și îl stochează într-un ArrayList.
        // Continuă să ceri input până când utilizatorul introduce "done" și apoi afișează conținutul ArrayList-ului.
//        ArrayList<String> input = new ArrayList<>();
//        String word;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Introduceti un cuvant sau 'done' pentru a iesi: ");
//            word = sc.nextLine();
//            input.add(word);
//        } while (!word.equals("done"));
//        System.out.println("Cuvintele introduse sunt: " + input);

//-------------------------------------------------------------------------------------------------------------------


        // 1. Creează un ArrayList de Integer și afișează elementele sale folosind foreach.


        // 2. Creează un ArrayList de String și adună toate elementele într-un singur șir, afișează rezultatul.
//        ArrayList<String> input = new ArrayList<>();
//        String word;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Introduceti un cuvant sau 'done' pentru a iesi: ");
//            word = sc.nextLine();
//            input.add(word);
//        } while (!word.equals("done"));
//        String sum = "";
//        for (String s : input) {
//            sum += s + " ";
//        }
//        System.out.println("Cuvintele introduse sunt: " + input);

//----------------------------------------------------------------------------------------------------------------------
// LinkedList: Se folosește când ai nevoie de inserări/ștergeri frecvente în interiorul listei. E mai lent la accesarea prin index.

//        LinkedList<String> cars3 = new LinkedList<String>();
//        cars3.add("Volvo");
//        cars3.add("BMW");
//        cars3.add("Ford");
//        cars3.add("Mazda");
//        System.out.println(cars3);

//----------------------------------------------------------------------------------------------------------------------
//HashMap: Stochează elemente sub formă de perechi. Un obiect este utilizat ca cheie (index) și altul ca valoare. Poate stoca tipuri diferite: chei String și valori Integer sau același tip, de exemplu: chei String și valori String.

//        HashMap<String, String> capitalCities = new HashMap<>();
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norwey", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities);

//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norwey", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities);
//
//        HashMap<String, String> capitalCities = new HashMap<>();
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norwey", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities.get("England"));
//
//        HashMap<String, String> capitalCities = new HashMap<>();
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norwey", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities.keySet());
//
//        HashMap<String, String> capitalCities = new HashMap<>();
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norwey", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        for (String key : capitalCities.keySet()) { // seteaza valoarea
//            System.out.println(key); // se afiseaza doar keile adica, Englanda, Germany, Norwey si USA
//        }
//
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norwey", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        for (String key : capitalCities.keySet()) {
//            System.out.println(key + " : " + capitalCities.get(key)); // se afiseaza keile si valorile adica, Englanda : London, etc.
//        }

//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norwey", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        for (String i : capitalCities.values()) { // seteaza valoarea
//            System.out.println(i); // se afiseaza doar valoarea
//        }

//        HashMap<String, Integer> people = new HashMap<String, Integer>();
//        people.put("John", 32); // Adauga key: Name. Si age: Ani.
//        people.put("Steve", 30);
//        people.put("Angie", 33);
//        for (String i : people.keySet()) {
//            System.out.println("key: " + i + " value : " + people.get(i));
//        }

        // Creaza un Map care stocheaza abrevierile ca chei si numele tarilor ca valori, afiseazale pe toate.
//        HashMap<String, String> countryMap = new HashMap<String, String>();
//        countryMap.put("USA", "United States of America");
//        countryMap.put("UK", "United Kingdom");
//        countryMap.put("CAN", "Canada");
//        countryMap.put("GER", "Germany");
//        countryMap.put("FRA", "France");
//        for (String key : countryMap.keySet()) {
//            System.out.println(key + " : " + countryMap.get(key));
//        }

//----------------------------------------------------------------------------------------------------------------------
//HashSet: HashSet este o colecție de elemente în care fiecare element este unic. Acest interfață reprezintă un Array în care nu există elemente identice și indecși. HashSet permite eliminarea eficientă a duplicatelor dintr-un array sau ArrayList deja creat.

//        HashSet<String> cars = new HashSet<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("BMW");
//        cars.add("Mazda");
//        System.out.println(cars); // o sa afiseze doar o data elementele, de exemplu BMW


//        HashSet<Integer> numbers = new HashSet<Integer>();
//        numbers.add(4);
//        numbers.add(7);
//        numbers.add(8);
//        for (int i = 1; i <= 10; i++) { // Numara de la 1 pina la 10 si arata fiecare numar dintre 1 si 10 din set.
//            if (numbers.contains(i)) {
//                System.out.println(i + " Sa gasit in set.");
//            } else {
//                System.out.println(i + " Sa gasit in set.");
//            }
//        }


    }
}
