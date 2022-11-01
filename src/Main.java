public class Main {
    public static void main(String[] args) {
        CreditPaymentService monthPay = new CreditPaymentService();
        double pay = monthPay.calculate(1000000, 1, 9.99);
        if (pay > 0) {
            System.out.println("Ваш ежемесячный платеж : " + pay);
        } else System.out.println("Выбран недопустимый срок кредита/Неверная сумма кредита/Неверная процентная ставка");
    }
}