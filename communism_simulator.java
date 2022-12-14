import java.util.Scanner;

public class CommunismSimulator {
  public static void main(String[] args) {
    // Set up the game
    int startingMoney = 100;
    int startingResources = 100;

    // Create a scanner object for reading user input
    Scanner scanner = new Scanner(System.in);

    // Print the starting game state
    System.out.println("Starting game:");
    System.out.println("Money: " + startingMoney);
    System.out.println("Resources: " + startingResources);

    // Main game loop
    while (true) {
      // Prompt the player to distribute resources
      System.out.println("Enter the number of resources to distribute: ");
      int resourcesToDistribute = scanner.nextInt();

      // Check if the player has enough resources to distribute
      if (resourcesToDistribute > startingResources) {
        System.out.println("Not enough resources to distribute!");
        continue;
      }

      // Calculate the amount of resources each person gets
      int resourcesPerPerson = resourcesToDistribute / startingResources;

      // Print the current game state
      System.out.println("Resources distributed: " + resourcesToDistribute);
      System.out.println("Resources per person: " + resourcesPerPerson);
      System.out.println("Total resources remaining: " + (startingResources - resourcesToDistribute));
    }
  }
}
