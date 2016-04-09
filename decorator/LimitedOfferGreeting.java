public class LimitedOfferGreeting implements AddOn, Greeting {


    /**
     * Return the greeting description
     * @return The greeting description
     */
    public String getLines() {
        return "Please check out our limited time offer on stuff you don't need!";
    }
}