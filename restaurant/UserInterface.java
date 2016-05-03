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
                        System.out.println(SystemInterface.displayMenu());
                        break;
                    case "2":
                        try {
                            System.out.println(SystemInterface.displaySpecials());
                        } catch (UnimplementedSpecialException e) {
                            System.out.println(e);
                        }
                        break;
                    case "3":
                        System.out.println(SystemInterface.submitOrder());
                        break;
                    case "4":
                        System.out.println(SystemInterface.displayTab());
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
        System.out.println("\t2: Display Specials");
        System.out.println("\t3: Submit Order");
        System.out.println("\t4: Display Tab");
        System.out.println("\tEnter q to quit\n");
    }
}