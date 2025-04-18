public interface PaymentService {
    void sendMoney(double amount);
    void checkBalance();
    void getTransactionHistory();
}