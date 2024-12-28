import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

public class BankAccountInfo {

    public static String getBankInfo(String accountPrefix) {
        try {
            URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;

            while ((line = in.readLine()) != null) {
                // Szukamy wiersza, który zaczyna się od podanych 3 cyfr
                if (line.startsWith(accountPrefix)) {
                    String[] parts = line.split("\\s+"); // Rozdzielenie po białych znakach
                    if (parts.length >= 4) {
                        String bankNumber = parts[0].trim();
                        String bankName = parts[1] + " " + parts[2] + " " + parts[3];
                        return "Twoje konto należy do banku: " + bankName + " (Numer banku: " + bankNumber + ")";
                    }
                }
            }
            in.close();
            return "Nie znaleziono banku dla podanych trzech cyfr.";
        } catch (IOException e) {
            return "Wystąpił błąd przy połączeniu z serwerem lub odczycie danych.";
        }
    }
}