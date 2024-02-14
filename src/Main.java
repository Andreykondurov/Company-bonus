public class Main {
    public static void main(String[] args) {

        int initialAmount = 186;
        int replenishmentAmount = 1964;

        int bonus;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Общий баланс счета: " + (initialAmount + replenishmentAmount + bonus) + " руб.");
        System.out.println("Бонусный счет: " + bonus + " руб.");
    }
}