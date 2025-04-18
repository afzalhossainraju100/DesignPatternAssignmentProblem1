public class Main {
    public static void main(String[] args) {
        // Create the YouTube channel
        YouTubeChannel channel = new YouTubeChannel();

        // Create clients
        Observer mobileClient = new MobileClient("John");
        Observer webClient = new WebClient("Alice");

        // Subscribe clients
        channel.subscribe(mobileClient);
        channel.subscribe(webClient);

        // Upload a new video
        channel.uploadVideo("Design Patterns Tutorial");

        System.out.println("------");

        // Unsubscribe a client
        channel.unsubscribe(webClient);

        // Upload another video
        channel.uploadVideo("Java Multithreading Tutorial");
    }
}
