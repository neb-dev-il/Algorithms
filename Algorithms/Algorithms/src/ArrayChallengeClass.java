
class ArrayChallengeClass {

    static int ArrayChallenge(int[] arr) {
        // code goes here
        int value = -1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int currentValue = arr[j] - arr[i];

                if (currentValue > value) {
                    value = currentValue;
                }

            }

        }

        arr[0] = value;
        return arr[0];

    }
}