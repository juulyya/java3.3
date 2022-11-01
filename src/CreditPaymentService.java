public class CreditPaymentService {
    public double calculate(int credit, int period, double percent) {
        int month = 0;
        double pay = 0;
        double overpayment = 0;
        if (period >= 1 & period <= 3) {
            month = period * 12;
        } else {
            return pay;
        }
        if (percent < 0) {
            return pay;
        }
        overpayment = ((credit / 100) * percent) / 12;
        pay = (credit / month) + overpayment;
        return pay;
    }

}
