public class Plane implements Aircraft {
    private final ControlTower controlTower;
    private final String callSign;

    public Plane(ControlTower controlTower, String callSign) {
        this.controlTower = controlTower;
        this.callSign = callSign;
        this.controlTower.registerAircraft(this);
    }

    @Override
    public void send(String message) {
        System.out.println(callSign + " sends message: " + message);
        controlTower.broadcast(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(callSign + " received message: " + message);
    }

    public String getCallSign() {
        return callSign;
    }
}
