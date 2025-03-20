import java.util.Random;
import java.util.Scanner;

public class VirtualDiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("🎲 Welcome to the Virtual Dice Roller! 🎲");
        
        while (true) {
            System.out.print("Enter the number of sides on the dice (or type 'exit' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye! 👋");
                break;
            }
            
            try {
                int sides = Integer.parseInt(input);
                if (sides < 2) {
                    System.out.println("A dice must have at least 2 sides. Try again.");
                    continue;
                }
                
                int result = random.nextInt(sides) + 1;
                System.out.println("🎲 You rolled a " + result + "!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        
        scanner.close();
    }
}