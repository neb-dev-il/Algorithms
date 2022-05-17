import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(StringChallenge1.StringChallenge(s.nextLine()));
        System.out.println(StringChallenge2.StringChallenge(s.nextLine()));
        System.out.println(ArrayChallengeClass.ArrayChallenge(convertToArray(s.nextLine())));
    }

    private static int[] convertToArray(String nextLine) {
        nextLine = nextLine.replace("new int[] {", "").replace(",", " ").replace("}", "");
        String[] stringArray = nextLine.split(" ");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        return intArray;

    }
}