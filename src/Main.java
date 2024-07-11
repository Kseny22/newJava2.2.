public class Main {
    public static void main(String[] args) {

        System.out.print("На счету у клиента: 100 рублей.");
        System.out.print("Сумма пополнения счета: 1100 рублей.");

        int initialBalance = 100;
        int addend = 1100;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }

        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый баланс" + finalBalance + "рублей");
        System.out.println("Бонус" + bonus + "рублей");
    }
}