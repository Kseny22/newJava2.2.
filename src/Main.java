public class Main {
    public static void main(String[] args) {

        System.out.print("На счету у клиента: 100 рублей.");
        System.out.print("Сумма пополнения счета: 300 рублей.");

        int initialBalance = 100;
        int addend = 300;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }

        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый баланс" + finalBalance);
        System.out.println("Бонус" + bonus);
    }
}