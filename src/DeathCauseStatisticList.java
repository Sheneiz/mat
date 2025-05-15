import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeathCauseStatisticList {
    private final ArrayList<DeathCauseStatistic> statistics = new ArrayList<>();

    public void repopulate(String path){
        statistics.clear();
        try (BufferedReader br= new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null) {
                if(line.trim().isEmpty()) continue;
                statistics.add(DeathCauseStatistic.fromCsvLine(line));
            }

        }   catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    public ArrayList<DeathCauseStatistic> getStatistics(){
        return statistics;
    }

    public List<DeathCauseStatistic> mostDeadlyDeseases (int age, int n){
        int index = age/5;
        if(index >= 20)index = 19;
        return statistics.stream()
                .sorted((a, b) -> Integer.compare(
                    b.getDeathCauseStatistic(age).deathCount,
                    a.getDeathCauseStatistic(age).deathCount))
                .limit(n)
                .toList();
    }
}
