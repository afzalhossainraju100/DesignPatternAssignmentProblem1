public class RocketService implements PaymentService {
    @Override
    public void sendMoney(double amount) {
        System.out.println("Rocket: Sending " + amount + " TK using account-based authentication.");
    }

    @Override
    public void checkBalance() {
        System.out.println("Rocket: Your balance is 5,000 TK.");
    }

    @Override
    public void getTransactionHistory() {
        System.out.println("Rocket: Last transaction - Sent 200 TK to 016XXXXXXXX.");
    }
}