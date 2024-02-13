import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConverter {

    private static final String API_KEY = "YOUR_API_KEY_HERE";

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("\nEnter the base currency (e.g., USD,PKR,EUR,NZD,ZAR,MXN,JPY): ");
            String baseCurrency = reader.readLine().toUpperCase();

            System.out.print("Enter the target currency (e.g., EUR,PKR,USD,NZD,ZAR,MXN,JPY): ");
            String targetCurrency = reader.readLine().toUpperCase();

            System.out.print("Enter the amount to convert: ");
            double amount = Double.parseDouble(reader.readLine());

            double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);

            if (exchangeRate != -1) {
                double convertedAmount = amount * exchangeRate;
                System.out.printf("%.2f %s is equivalent to %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
            } else {
                System.out.println("Invalid currency code or conversion not supported.");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
        try {
            URL url = new URL("https://open.er-api.com/v6/latest/" + baseCurrency + "?app_id=" + API_KEY);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("\"" + targetCurrency + "\":")) {
                    int startIndex = line.indexOf(":") + 1;
                    int endIndex = line.indexOf(",");
                    return Double.parseDouble(line.substring(startIndex, endIndex));
                }
            }
            return -1;
        } catch (IOException e) {
            System.out.println("Error fetching exchange rate: " + e.getMessage());
            return -1;
        }
    }
}
