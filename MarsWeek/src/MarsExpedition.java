import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Expedition prep program starting...");
        Thread.sleep(250);
        System.out.println("Booting up...");
        Thread.sleep(250);
        System.out.println("...");
        Thread.sleep(250);
        System.out.println("...");
        Thread.sleep(250);
        System.out.println("...");
        Thread.sleep(250);
        System.out.println("Ready");
        Thread.sleep(250);

        // Introduction
        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Hi, " + name + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String readyResponse = input.nextLine();

        if (readyResponse.equalsIgnoreCase("Y")){
            System.out.println("I knew you would say that. You are team leader for a reason");
        } else {
            System.out.println("Too bad, your are team leader. You have to go.");
        }

        // Team Size
        Thread.sleep(250);
        System.out.println("How many people do you want on your expedition team?");
        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            System.out.println("That's way too many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That is not enough people. We will send you with two team members.");
            teamSize = 2;
        } else {
            System.out.println("Okay, we will send you with 2 team members.");
        }

        // Snacks
        Thread.sleep(250);
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        Thread.sleep(250);
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        // Vehicle
        Thread.sleep(250);
        System.out.println("Choose a vehicle");
        System.out.println("A: Rover");
        System.out.println("B: Mars Bike");
        System.out.println("C: Jet Packs");
        System.out.println("Enter a letter to choose.");
        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")){
            vehicleChoice = "Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")){
            vehicleChoice = "Mars Bike";
        } else if (vehicleChoice.equalsIgnoreCase("C")){
            vehicleChoice = "Jet Packs";
        } else {
            vehicleChoice = "nothing";
        }

        // Send off message
        System.out.println("It's time to get ready to leave.");
        Thread.sleep(250);
        System.out.println("The expedition team will be led by " + name + ". There will be two additional members.");
        Thread.sleep(250);
        System.out.println("They will explore the surface of Mars driving " + vehicleChoice + ".");
        Thread.sleep(250);
        System.out.println("Departure in 5...");
        Thread.sleep(250);
        System.out.println("4...");
        Thread.sleep(250);
        System.out.println("3...");
        Thread.sleep(250);
        System.out.println("2...");
        Thread.sleep(250);
        System.out.println("1...");
        Thread.sleep(250);
        System.out.println("Good Luck!");
    }
}
