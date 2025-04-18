public class WebClient implements Observer {
    private String name;

    public WebClient(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("Notification to " + name + ": New video uploaded - " + videoTitle);
    }
}