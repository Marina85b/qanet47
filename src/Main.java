public class Main {
    public static void main(String[] args) {
        int amount = 100;
        boolean isBought = true;

        int mile;
        if (isBought) {
            mile = 5;
        } else {
            mile = 1;
        }
        int bonus = amount / 20;

        if (bonus > 20) {
            bonus = 20;
        }
        System.out.println("Итоговый бонус: " + bonus);

}
}