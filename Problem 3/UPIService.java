import java.util.HashMap;
import java.util.Map;
public class UPIService {
    private Map<String, PaymentService> paymentServices = new HashMap<>();
    public UPIService() {
        paymentServices.put("Bkash", new BkashService());
        paymentServices.put("Nagad", new NagadService());
        paymentServices.put("Rocket", new RocketService());
    }
    public void sendMoney(String serviceName, double amount) {
        PaymentService service = paymentServices.get(serviceName);
        if (service != null) {
            service.sendMoney(amount);
        } else {
            System.out.println(serviceName + " service is not available.");
        }
    }
    public void checkBalance(String serviceName) {
        PaymentService service = paymentServices.get(serviceName);
        if (service != null) {
            service.checkBalance();
        } else {
            System.out.println(serviceName + " service is not available.");
        }
    }
    public void getTransactionHistory(String serviceName) {
        PaymentService service = paymentServices.get(serviceName);
        if (service != null) {
            service.getTransactionHistory();
        } else {
            System.out.println(serviceName + " service is not available.");
        }
    }
    public void addPaymentService(String serviceName, PaymentService service) {
        paymentServices.put(serviceName, service);
    }
}