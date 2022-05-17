
class StringChallenge2 {
    static String StringChallenge(String str) {
        // code goes here
        String[] parts = str.split("[:\\-]");
        int firstHour = Integer.parseInt(parts[0]);
        int firstMinutes = Integer.parseInt(parts[1].substring(0, 2));
        int secondHour = Integer.parseInt(parts[2]);
        int secondMinutes = Integer.parseInt(parts[3].substring(0, 2));
        String time = parts[1].substring(2, 4).concat(parts[3].substring(2, 4));
        int minutes = (secondHour - firstHour) * 60 - ((secondMinutes - firstMinutes) - (2 * (secondMinutes - firstMinutes)));
        switch (time) {
            case "ampm":
            case "pmam":
                minutes += 720;
                break;
            case "amam":
            case "pmpm":
                if (firstHour >= secondHour) {
                    minutes += 1440;
                }
                break;
        }

        return Integer.toString(minutes);

    }
}