public class CMDDisplaySpecials implements Command {

    Aggregator agg;

    public CMDDisplaySpecials(Aggregator agg) {
        this.agg = agg;
    }

    public Specials execute() {

        // Get inventory
        Inventory inventory = agg.getInventory();

        // Build today's special
        SpecialBuilder dsb = new DailySpecialBuilder(inventory);
        Director dailyDirector = new Director(dsb);
        dailyDirector.build();
        Special todaySpecial = dailyDirector.getSpecial();

        // // Build this week's special
        // SpecialBuilder wsb = new WeeklySpecialBuilder(inventory);
        // Director weeklyDirector = new Director(wsb);
        // weeklyDirector.build();
        // Special weekSpecial = weeklyDirector.getSpecial();

        // Put specials into Specials object
        Specials specials = new Specials();
        specials.addSpecial(todaySpecial);
        // specials.addSpecial(weekSpecial);

        return specials;
    }
}