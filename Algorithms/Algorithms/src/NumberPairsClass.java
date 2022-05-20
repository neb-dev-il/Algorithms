import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class NumberPairsClass {

    static void NumberPairs(String line) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        while ((line = in.readLine()) != null) {

            boolean existAnyPair = false;
            String pairs = "";
            String[] tokens = line.split("[,;]");
            int[] numbers = new int[tokens.length - 1];
            int value = Integer.parseInt(tokens[numbers.length]);

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(tokens[i]);
            }

            for (int i = 0; i < numbers.length; i++) {

                for (int j = i + 1; j < numbers.length; j++) {

                    if ((numbers[i] + numbers[j]) == value) {
                        pairs = pairs.concat(numbers[i] + "," + numbers[j] + ";");
                        existAnyPair = true;
                    }

                }

            }

            if (existAnyPair) {
                System.out.println(pairs.substring(0, pairs.length() - 1));
            } else {
                System.out.println("NULL");
            }

        }
    }
}