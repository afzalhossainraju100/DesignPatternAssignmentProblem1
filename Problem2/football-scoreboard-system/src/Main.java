public class Main { 
    public static void main(String[] args) { 
        // Create the scoreboard (Subject) 
        FootballScoreboard scoreboard = new FootballScoreboard(); 

        // Create different platforms (Observers) 
        Observer mobileApp = new MobileApp("John's Phone");
        Observer tvChannel = new TVChannel("ESPN"); 
        Observer website = new Website("LiveScore.com"); 

        scoreboard.subscribe(mobileApp); 
        scoreboard.subscribe(tvChannel); 
        scoreboard.subscribe(website); 

        scoreboard.setScore("Team A 1 - 0 Team B"); 

        System.out.println("------"); 

        scoreboard.unsubscribe(tvChannel); 

        scoreboard.setScore("Team A 2 - 0 Team B"); 

        System.out.println("------"); 

        scoreboard.setMatchStatus("Full-Time");  
    }  
}