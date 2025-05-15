import java.util.Objects;


public class DeathCauseStatistic {
    private String ICD10;
    private int[] DeathCount;


        public static DeathCauseStatistic fromCsvLine(String line) {
            DeathCauseStatistic stat = new DeathCauseStatistic();
            String[] parts = line.split("\t", -1); // rozdziel po tabulatorze
            stat.ICD10 = parts[0].trim();
            String[] numbers = parts[1].split(",", -1); // liczby zgonów po przecinku
            stat.DeathCount = new int[20];
            for (int i = 0; i < 20; i++) {
                if (numbers[i + 1].equals("-")) {
                    stat.DeathCount[i] = 0;
                } else {
                    stat.DeathCount[i] = Integer.parseInt(numbers[i + 1]);
                }
            }
            return stat;
        }

        public String getICD10() {
            return ICD10;
        }

        public static class AgeBracketDeaths {
            public final int young, old, deathCount;

            public AgeBracketDeaths(int young, int old, int deathCount) {
                this.young = young;
                this.old = old;
                this.deathCount = deathCount;
            }
        }

        public AgeBracketDeaths getDeathCauseStatistic(int age) {
            int index = age / 5;
            if (index >= 20) index = 19;
            return new AgeBracketDeaths(index * 5, index * 5 + 4, this.DeathCount[index]);
        }
    public static boolean isValidICD10(String code) {
        return code != null && code.matches("^[A-Za-z]\\d{2}$");
    }
}


