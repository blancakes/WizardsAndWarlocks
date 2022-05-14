public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------------");
        System.out.println("--------- Wizards and Warlocks--------");
        System.out.println("--------------------------------------");

        Wizard Adam = new Wizard("Adam");
        Warlock Ender = new Warlock("Ender");
        Adam.CollosusPunch(Ender);
        Adam.SteelKnee(Ender);
        Ender.SoulStare(Adam);
        Adam.TorchOfJustice(Ender);
        Ender.Crash(Adam);
        Adam.DragonBreath(Ender);
        Ender.Wrath(Adam);
        Adam.SneakyRaid(Ender);

    }
}