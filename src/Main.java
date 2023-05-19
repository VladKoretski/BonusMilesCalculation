import org.example.BonusMilesService;

public class Main {
    public static void main(String[] args) {
        BonusMilesService bonus = new BonusMilesService();

//Объявление переменных (стоимость билета и бонуса) и вывод на консоль
        int ticketCost = 123345;
        System.out.println("The cost of a ticket = " + ticketCost + " roubles");

//Объявление переменной для вывода, расчет и вывод на консоль
        int NumberOfFrequentFlyerMiles;
        NumberOfFrequentFlyerMiles = bonus.calculate(ticketCost);
        System.out.println("The bonus amount = " + NumberOfFrequentFlyerMiles + " free miles accrued");
    }
}
