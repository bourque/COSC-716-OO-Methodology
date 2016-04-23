import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInterface {

    public void runInterface() {

        // Print out options for the user
        displayOptions();

        // Let user decide what to do
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String option = br.readLine();

            while(!option.equals("q")) {

                switch(option) {
                    case "1":
                        String menu = SystemInterface.displayMenu();
                        System.out.println(menu);
                        break;
                    case "2":
                        SystemInterface.placeOrder();
                        break;
                    case "3":
                        System.out.println("here3");
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                }

                // Get next selection
                displayOptions();
                option = br.readLine();
            }

        } catch(IOException e) {
            System.out.println("Error " + e.toString());
            System.exit(1);
        }
    }

    private void displayOptions() {

        System.out.println("\nMain Menu:\n");
        System.out.println("\t1: Display Menu");
        System.out.println("\t2: Submit Order");
        System.out.println("\t3: Display Tab");
        System.out.println("\tEnter q to quit\n");
    }
}