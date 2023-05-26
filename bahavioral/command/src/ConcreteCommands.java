class TakeOffCommand implements Command {
    private Drone drone;

    public TakeOffCommand(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void execute() {
        drone.takeOff();
    }
}

class MoveLeftCommand implements Command {
    private Drone drone;

    public MoveLeftCommand(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void execute() {
        drone.moveLeft();
    }
}

class MoveRightCommand implements Command {
    private Drone drone;

    public MoveRightCommand(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void execute() {
        drone.moveRight();
    }
}

class FireSnowballCommand implements Command {
    private Drone drone;

    public FireSnowballCommand(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void execute() {
        drone.getClearShot();
        drone.fireSnowball();
    }
}
