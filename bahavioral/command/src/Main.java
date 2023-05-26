/**
 * This example is generated with ChatGPT by OpenAI
 * It's an example for the Command Design Pattern and for study purposes
 *
 * In this example, a Drone represents the Receiver,
 * Commands defined in the ConcreteCommands.java including FirePaintballCommand
 * are the ConcreteCommands, and RemoteController is the Invoker
 *
 * Each ConcreteCommand encapsulates a request to the drone as an object
 * The RemoteController can be given such a command object and invoke its execute() method to carry out the request
 * The drone (the Receiver) itself knows how to perform the requested operation
 *
 * Happy coding
 */
public class Main {
    public static void main(String[] args) {
        Drone drone = new Drone();
        Command takeOff = new TakeOffCommand(drone);
        Command moveLeft = new MoveLeftCommand(drone);
        Command moveRight = new MoveRightCommand(drone);
        Command fireSnowball = new FireSnowballCommand(drone);

        RemoteController controller = new RemoteController();

        // Take off the drone
        controller.setCommand(takeOff);
        controller.pressButton();

        // Move the drone to the left
        controller.setCommand(moveLeft);
        controller.pressButton();

        // Move the drone to the right
        controller.setCommand(moveRight);
        controller.pressButton();

        System.out.println();

        // Fire a snowball
        controller.setCommand(fireSnowball);
        controller.pressButton();
    }
}