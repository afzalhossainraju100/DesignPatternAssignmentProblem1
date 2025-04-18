public class SmartHomeTest {
    public static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();
        smartHome.leaveHome();
        System.out.println();
        smartHome.returnHome();
    }
}