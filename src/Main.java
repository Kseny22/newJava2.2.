public class Main {
    public static void main(String[] args) {


        System.out.print("На счету у клиента: 100 рублей.");
        System.out.print("Сумма пополнения счета:1100 рублей.");


        int addend = 1100;
        int initialBalance = 100;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;


            int finalBalance = addend + bonus + initialBalance;


            System.out.println("Итоговая сумма на счету клиента: " + finalBalance + "рублей");
            System.out.println("Количество бонусных рублей: " + bonus + " рублей");


        } else {


            System.out.println("Бонусов нет");


            System.out.println("Итоговая сумма на счету клиента; " + addend + " рублей");


        }
    }
}
