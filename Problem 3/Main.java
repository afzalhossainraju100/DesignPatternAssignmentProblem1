public class Main {
    public static void main(String[] args) {
        UPIService upiService = new UPIService();
        System.out.println("---- Bkash Transaction ----");
        upiService.sendMoney("Bkash", 500);
        upiService.checkBalance("Bkash");
        upiService.getTransactionHistory("Bkash");
        System.out.println("---- Nagad Transaction ----");
        upiService.sendMoney("Nagad", 1000);
        upiService.checkBalance("Nagad");
        upiService.getTransactionHistory("Nagad");
        System.out.println("---- Rocket Transaction ----");
        upiService.sendMoney("Rocket", 200);
        upiService.checkBalance("Rocket");
        upiService.getTransactionHistory("Rocket");
    }
}