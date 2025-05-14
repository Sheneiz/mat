public class Przyklady {
    public static void main(String[] args) {
        // Tworzenie tablicy liczb całkowitych
        int[] liczby = {1, 2, 3, 4, 5};
        // Iteracja po elementach tablicy i ich wypisywanie
        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Liczba: " + liczby[i]);
        }
    }
}

public class Przyklady {
    public static void main(String[] args) {
        try {
            // Próba wykonania dzielenia przez zero
            int wynik = 10 / 0;
        } catch (ArithmeticException e) {
            // Obsługa wyjątku dzielenia przez zero
            System.out.println("Nie można dzielić przez zero!");
        }
    }
}

class Samochod {
    String marka; // Marka samochodu
    int rok;      // Rok produkcji

    // Konstruktor klasy Samochod
    public Samochod(String marka, int rok) {
        this.marka = marka;
        this.rok = rok;
    }

    // Metoda wyświetlająca informacje o samochodzie
    public void wyswietlInfo() {
        System.out.println("Marka: " + marka + ", Rok: " + rok);
    }
}

public class Przyklady {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Samochod
        Samochod auto = new Samochod("Toyota", 2020);
        // Wyświetlanie informacji o samochodzie
        auto.wyswietlInfo();
    }
}

public class Przyklady {
    // Metoda rekurencyjna obliczająca silnię
    public static int silnia(int n) {
        if (n == 0) {
            return 1; // Silnia z 0 to 1
        }
        return n * silnia(n - 1); // Rekurencyjne wywołanie
    }

    public static void main(String[] args) {
        // Wyświetlanie silni liczby 5
        System.out.println("Silnia 5: " + silnia(5));
    }
}

// Interfejs Zwierze
interface Zwierze {
    void dzwiek(); // Metoda abstrakcyjna
}

// Klasa Pies implementująca interfejs Zwierze
class Pies implements Zwierze {
    public void dzwiek() {
        // Implementacja metody dzwiek
        System.out.println("Hau hau!");
    }
}

public class Przyklady {
    public static void main(String[] args) {
        // Tworzenie obiektu klasy Pies i wywołanie metody dzwiek
        Zwierze pies = new Pies();
        pies.dzwiek();
    }
}

// Importowanie klasy ArrayList
import java.util.ArrayList;

public class Przyklady {
    public static void main(String[] args) {
        // Tworzenie listy i dodawanie elementów
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Jabłko");
        lista.add("Banan");
        lista.add("Gruszka");

        // Iteracja po liście i wypisywanie elementów
        for (String owoc : lista) {
            System.out.println(owoc);
        }
    }
}

// Importowanie klasy Arrays
import java.util.Arrays;

public class Przyklady {
    public static void main(String[] args) {
        // Tworzenie tablicy liczb i obliczanie ich sumy
        int[] liczby = {1, 2, 3, 4, 5};
        int suma = Arrays.stream(liczby).sum();
        System.out.println("Suma: " + suma);
    }
}

// Importowanie klas LocalDate i LocalTime
import java.time.LocalDate;
import java.time.LocalTime;

public class Przyklady {
    public static void main(String[] args) {
        // Pobieranie aktualnej daty i czasu
        LocalDate dzisiaj = LocalDate.now();
        LocalTime teraz = LocalTime.now();

        // Wyświetlanie daty i czasu
        System.out.println("Data: " + dzisiaj);
        System.out.println("Czas: " + teraz);
    }
}

// Importowanie klasy NumberFormat
import java.text.NumberFormat;

public class Przyklady {
    public static void main(String[] args) {
        // Formatowanie liczby jako waluty
        double liczba = 12345.678;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("Sformatowana liczba: " + nf.format(liczba));
    }
}

// Importowanie klasy Scanner
import java.util.Scanner;

public class Przyklady {
    public static void main(String[] args) {
        // Pobieranie danych od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String imie = scanner.nextLine();
        System.out.println("Witaj, " + imie + "!");
    }
}

// Importowanie klasy Arrays
import java.util.Arrays;

public class Przyklady {
    public static void main(String[] args) {
        // Sortowanie tablicy liczb
        int[] liczby = {5, 2, 8, 1, 3};
        Arrays.sort(liczby);
        System.out.println("Posortowane liczby: " + Arrays.toString(liczby));
    }
}

public class Przyklady {
    public static void main(String[] args) {
        // Zagnieżdżone pętle wypisujące wartości i oraz j
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}

// Importowanie klasy HashMap
import java.util.HashMap;

public class Przyklady {
    public static void main(String[] args) {
        // Tworzenie mapy i dodawanie par klucz-wartość
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Jabłko", 3);
        mapa.put("Banan", 5);
        mapa.put("Gruszka", 2);

        // Iteracja po kluczach mapy i wypisywanie wartości
        for (String klucz : mapa.keySet()) {
            System.out.println(klucz + ": " + mapa.get(klucz));
        }
    }
}

// Importowanie klasy Arrays
import java.util.Arrays;

public class Przyklady {
    public static void main(String[] args) {
        // Iteracja po tablicy liczb i wypisywanie ich wartości
        int[] liczby = {1, 2, 3, 4, 5};
        Arrays.stream(liczby).forEach(liczba -> System.out.println("Liczba: " + liczba));
    }
}

// Importowanie klasy Random
import java.util.Random;

public class Przyklady {
    public static void main(String[] args) {
        // Generowanie losowej liczby z zakresu 0-99
        Random random = new Random();
        int losowaLiczba = random.nextInt(100);
        System.out.println("Wylosowana liczba: " + losowaLiczba);
    }
}

public class Przyklady {
    public static void main(String[] args) {
        // Operacje na ciągu znaków
        String tekst = "Witaj, świecie!";
        System.out.println("Długość tekstu: " + tekst.length());
        System.out.println("Wielkie litery: " + tekst.toUpperCase());
        System.out.println("Zamiana: " + tekst.replace("świecie", "Java"));
    }
}

public class Przyklady {
    // Metoda obliczająca sumę trzech liczb
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Wyświetlanie sumy trzech liczb
        System.out.println("Suma: " + suma(1, 2, 3));
    }
}

public class Przyklady {
    public static void main(String[] args) {
        // Tworzenie i uruchamianie wątku
        Thread watek = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Wątek: " + i);
            }
        });
        watek.start();
    }
}