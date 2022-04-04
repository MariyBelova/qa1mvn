public class ConditionsGame20 {
    public boolean isGreenLight = false;
    public int MAX_SPEED = 10;

    public ConditionsGame20(boolean isGreenLight, int MAX_SPEED) {
        this.isGreenLight = isGreenLight;
        this.MAX_SPEED = MAX_SPEED;
    }

    public String[] speedWin(String[] speedPlayers) {
        int cnt = 0;
        for (String text : speedPlayers) {
            String[] players = text.split(" ");
            String name = players[0];
            int speed = Integer.parseInt(players[1]);
            if (isGreenLight == false) {
                if (speed <= MAX_SPEED) {
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
            if (isGreenLight) {
                nameswinner[i] = name;
                i++;
            } else {
                if (isGreenLight == false && speed <= MAX_SPEED) {
                    nameswinner[i] = name;
                    i++;
                }
            }
        }
        return nameswinner;
    }
}

