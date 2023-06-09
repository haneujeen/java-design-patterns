public interface ControlTower {
    void registerAircraft(Plane plane);
    void broadcast(String message, Plane sender);
}
