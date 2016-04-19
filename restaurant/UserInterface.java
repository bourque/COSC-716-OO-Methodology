import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInterface {

    // SystemInterface si;

    // public UserInterface() {
    //     this.si = new SystemInterface();
    // }

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
                        String fullMenu = SystemInterface.getFullMenu();
                        System.out.println(fullMenu);
                        break;
                    case "2":
                        System.out.println("here2");
                        break;
                    case "3":
                        System.out.println("here3");
                        break;
                    case "4":
                        System.out.println("here4");
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
        System.out.println("\t1: Display Full Menu");
        System.out.println("\t2: Display Specific Menu");
        System.out.println("\t3: Place Order");
        System.out.println("\t4: Get Tab");
        System.out.println("\tEnter q to quit\n");
    }
}