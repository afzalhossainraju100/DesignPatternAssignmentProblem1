import java.util.ArrayList;
import java.util.List;

public class FootballScoreboard {
    private List<Observer> observers = new ArrayList<>();
    private String score;
    private String matchStatus;

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setScore(String score) {
        this.score = score;
        notifyObservers("New score update - " + score);
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
        notifyObservers("Match status - " + matchStatus);
    }
}