public class NotificationUtils {

    public static String formatScoreUpdate(String score) {
        return "New score update - " + score;
    }

    public static String formatMatchStatus(String status) {
        return "Match status - " + status;
    }

    public static void sendNotification(String platformName, String message) {
        System.out.println("Notification to " + platformName + ": " + message);
    }
}