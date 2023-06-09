import java.util.ArrayList;
import java.util.List;

public class AirTrafficControlTower implements ControlTower {
    private final List<Plane> planes = new ArrayList<>();

    @Override
    public void registerAircraft(Plane plane) {
        if (!planes.contains(plane)) {
            planes.add(plane);
        }
    }

    @Override
    public void broadcast(String message, Plane sender) {
        for (Plane plane : planes) {
            // Don't send the message to the sender
            if (plane != sender) {
                plane.receive(message);
            }
        }
    }
}
