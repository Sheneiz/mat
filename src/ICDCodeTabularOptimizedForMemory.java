import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ICDCodeTabularOptimizedForMemory implements ICDCodeTabular {
    private final String path;

    public ICDCodeTabularOptimizedForMemory(String path) {
        this.path = path;
    }

    @Override
    public String getDescription(String code) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line;
            int lineNum = 0;
            while ((line = br.readLine()) != null) {
                lineNum++;
                if (lineNum < 88) continue;
                String[] parts = line.trim().split("\\s+", 2);
                if (parts.length == 2 && parts[0].equals(code)) {
                    return parts[1];
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        throw new IndexOutOfBoundsException("Nie znaleziono kodu: " + code);
    }
}