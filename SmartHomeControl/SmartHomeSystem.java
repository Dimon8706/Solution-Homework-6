package SmartHomeControl;

public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create devices (receivers)
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        // Create commands
        Command turnOnLight = new TurnOnLightCommand(light);
        Command setThermostat = new SetThermostatCommand(thermostat, 22);

        // Create remote control (Invoker)
        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();

        // Assign commands to buttons
        remote.assignCommand("button1", turnOnLight);
        remote.assignCommand("button2", setThermostat);

        // Execute and undo actions
        remote.pressButton("button1");
        remote.pressButton("button2");
        remote.undoButton("button2");
    }
}
