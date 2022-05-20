import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class AlterCaseClass {

    static void AlterCase(String line) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        while ((line = in.readLine()) != null) {

            char[] chars = line.toLowerCase().toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);

            for (int i = 1; i < chars.length; i++) {

                if (Character.isWhitespace(chars[i]) && Character.isLetter(chars[i + 1])) {
                    if (Character.isLowerCase(chars[i - 1])) {
                        chars[i + 1] = Character.toUpperCase(chars[i + 1]);
                    }
                } else {
                    if (Character.isLowerCase(chars[i - 1])) {
                        chars[i] = Character.toUpperCase(chars[i]);
                    }
                }

            }

            System.out.println(chars);

        }
    }
}