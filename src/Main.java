import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Podaj pierwsze trzy cyfry numeru konta: ");
            String accountPrefix = reader.readLine().trim();

            if (accountPrefix.length() != 3 || !accountPrefix.matches("\\d{3}")) {
                System.out.println("Niepoprawne dane. Wprowadź trzy cyfry.");
                return;
            }

            String bankInfo = BankAccountInfo.getBankInfo(accountPrefix);
            System.out.println(bankInfo);

        } catch (IOException e) {
            System.out.println("Wystąpił błąd przy wprowadzaniu danych.");
            e.printStackTrace();
        }
    }
}
