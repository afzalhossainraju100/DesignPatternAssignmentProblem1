public class SmartHomeFacade {
    private Lights lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private TV tv;
    private MusicSystem musicSystem;
    public SmartHomeFacade() {
        this.lights = new Lights();
        this.thermostat = new Thermostat();
        this.securitySystem = new SecuritySystem();
        this.tv = new TV();
        this.musicSystem = new MusicSystem();
    }
    public void leaveHome() {
        System.out.println("Leaving home...");
        lights.turnOff();
        thermostat.setTemperature(18); 
        securitySystem.arm();
        tv.turnOffTV();
        System.out.println("You have left the house.");
    }
    public void returnHome() {
        System.out.println("Returning home...");
        lights.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
        musicSystem.playMusic("Welcome Home Song");
        System.out.println("Welcome back home!");
    }
}