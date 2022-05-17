
class StringChallenge1 {
    static String StringChallenge(String str) {
        // code goes here
        String output = str;
        str = "";

        for (int j = 0; j < output.length();) {

            int counter = 0;

            for (int i = j; i < output.length(); i++) {

                if (output.charAt(j) != output.charAt(i)) {
                    break;
                }

                ++counter;

            }

            str = str.concat(String.valueOf(counter)).concat(String.valueOf(output.charAt(j)));
            j += counter;

        }

        return str;

    }
}