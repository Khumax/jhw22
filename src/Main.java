public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        double startbalance = 100; //начальный баланс
        double addtobalance = 1500; //сумма пополнения
        double bonus = 0;
        if (addtobalance > 1000) {//условия зачисления бонусов
            bonus = addtobalance / 100; //расчет бонусов
        }
        double totalbalance = startbalance + addtobalance + bonus;

        System.out.println("На Вашем счету: " + totalbalance + " рублей");
        System.out.println("Из них " + bonus + " бонусых рублей");
    }
}