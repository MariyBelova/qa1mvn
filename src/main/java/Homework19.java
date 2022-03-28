public class Homework19 {
    public static String[] speedWin(String[] speedPlayers) {
        int cnt = 0;
        for (String text : speedPlayers) {
            String[] players = text.split(" ");
            String name = players[0];
            int speed = Integer.parseInt(players[1]);
            if (Main.isGreenLight == false) {
                if (speed <= Main.MAX_SPEED) {
                    cnt++;
                }
            } else {
                cnt = speedPlayers.length;
            }
        }

        String[] nameswinner = new String[cnt];
        int i = 0;
        for (String text : speedPlayers) {
            String[] players = text.split(" ");
            String name = players[0];
            int speed = Integer.parseInt(players[1]);
            if (Main.isGreenLight) {
                nameswinner[i] = name;
                i++;
            } else {
                if (Main.isGreenLight == false && speed <= Main.MAX_SPEED) {
                    nameswinner[i] = name;
                    i++;
                }
            }
        }
        return nameswinner;
    }
}


