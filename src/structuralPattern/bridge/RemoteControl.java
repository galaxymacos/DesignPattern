package structuralPattern.bridge;

// Basic Remote Control (turnOn, turnOff)
// Sony Remote Control
// Advanced Remote Control (setChannel)
// Sony Advanced Remote Control (play, pause, rewind)
public class RemoteControl {
    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }
}
