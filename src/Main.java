public class Main {
    public static void main(String[] args) {


        System.out.print("На счету у клиента: 300 рублей." );
        System.out.print("Сумма пополнения счета: 1700 рублей." );


        double amount = 1700;
        double initialAccount = 300;


        if (amount > 1000) {

        int fullHundreds = (int) Math.floor(amount / 100);
        double bonus = fullHundreds * 1;


        double totalAmount = amount + bonus + initialAccount;


        System.out.println("Итоговая сумма на счету клиента: " + totalAmount + "рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");


        } else {


        System.out.println("Бонусов нет");


        System.out.println("Итоговая сумма на счету клиента; " + amount + " рублей");



        }
    }
}
