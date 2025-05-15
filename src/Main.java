
public class Main {
    public static void main(String[] args) {
        String path = "zgony.csv";
        String testCode = "J12.81";



        try {
            ICDCodeTabular fast = new ICDCodeTabularOptimizedForTime(path);
            ICDCodeTabular memory = new ICDCodeTabularOptimizedForMemory(path);

            System.out.println("Szybka implementacja: " + fast.getDescription(testCode));
            System.out.println("Oszczędna implementacja: " + memory.getDescription(testCode));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nie znaleziono kodu: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}