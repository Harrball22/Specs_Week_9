public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Distant colony";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals -= (shipPopulation * 0.75);
        meals -= (shipPopulation * 0.75);
        System.out.println(meals);
        meals += (meals * 0.5);
        shipPopulation += 5;

        String landingLocation = "The Plain";
        if (landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bbzzz landing on the Plain");
        } else {
            System.out.println("ERROR!!! Plight plan already set. Landing on The Plain");
        }

        landing = landingCheck(13);

        new GuessingGame();

        new MarsExpedition();

        new FindingsList();
    }

    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
