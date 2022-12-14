public class CarTriviaGame {
  public static void main(String[] args) {
    // Set up the game
    String[] questions = {
      "What company was the first to mass-produce cars?",
      "What was the first car to have air conditioning?",
      "What was the first car to have power steering?",
      "What was the fastest production car in the world in the 1960s?"
    };
    String[] answers = {
      "Ford",
      "1939 Packard",
      "1951 Chrysler Imperial",
      "1963 Shelby Cobra"
    };
    int score = 0;
    Scanner scanner = new Scanner(System.in);
    
    // Ask the player each question
    for (int i = 0; i < questions.length; i++) {
      System.out.println("Question: " + questions[i]);
      String answer = scanner.nextLine();
      if (answer.equalsIgnoreCase(answers[i])) {
        System.out.println("Correct!");
        score++;
      } else {
        System.out.println("Incorrect. The correct answer was: " + answers[i]);
      }
    }
    
    // Tell the player their final score
    System.out.println("Your final score was: " + score + "/" + questions.length);
  }
}
