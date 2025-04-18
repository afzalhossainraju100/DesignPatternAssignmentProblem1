public class BkashService implements PaymentService {
    @Override
    public void sendMoney(double amount) {
        System.out.println("Bkash: Sending " + amount + " TK using PIN-based authentication.");
    }

    @Override
    public void checkBalance() {
        System.out.println("Bkash: Your balance is 10,000 TK.");
    }

    @Override
    public void getTransactionHistory() {
        System.out.println("Bkash: Last transaction - Sent 500 TK to 017XXXXXXXX.");
    }
}