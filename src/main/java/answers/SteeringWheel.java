package answers;

public class SteeringWheel {

    public String steer(String direction, IWheels wheels) throws Exception {

        switch(direction.toLowerCase()) {
            case "left":
                return wheels.turnLeft();
            case "right":
                return wheels.turnRight();
            default:
                throw new Exception(String.format("Unexpected direction %s, please go left or right", direction));
        }
    }
}
