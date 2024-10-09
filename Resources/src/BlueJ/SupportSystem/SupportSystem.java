public class SupportSystem {
  private InputReader inputReader;
  private Responder responder;

  public SupportSystem() {
    inputReader = new InputReader();
    responder = new Responder();
  }

  public void start() {
    System.out.println("Welcome to the DodgySoft Technical Support System.");
    System.out.println("Please tell us about your problem.");
    System.out.println("We will assist you with any problem you might have.");
    System.out.println("Please type 'bye' to exit our system.");

    boolean finished = false;
    while (!finished) {
      System.out.print("> ");
      String userInput = inputReader.getInput();
      if (userInput.equalsIgnoreCase("bye")) {
        finished = true;
        System.out.println("Goodbye! Thank you for using DodgySoft Technical Support.");
      } else {
        System.out.println(responder.generateResponse(userInput));
      }
    }
  }

  public static void main(String[] args) {
    SupportSystem supportSystem = new SupportSystem();
    supportSystem.start();
  }
}