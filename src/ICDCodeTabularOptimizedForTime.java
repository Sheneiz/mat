import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ICDCodeTabularOptimizedForTime implements ICDCodeTabular {
    private final Map<String, String> codeToDescription = new HashMap<>();

    public ICDCodeTabularOptimizedForTime(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            int lineNum = 0;
            while ((line = br.readLine()) != null) {
                lineNum++;
                if (lineNum < 88) continue;
                String[] parts = line.trim().split("\\s+", 2);
                if (parts.length == 2 && parts[0].matches("^[A-Za-z]\\d{2}(?:\\.\\d+)?$")) {
                    codeToDescription.put(parts[0], parts[1]);
                }
            }
        }
    }

    @Override
    public String getDescription(String code) {
        String desc = codeToDescription.get(code);
        if (desc == null) throw new IndexOutOfBoundsException("Nie znaleziono kodu: " + code);
        return desc;
    }
}