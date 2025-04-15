package SmartHomeControl;

import java.util.HashMap;

public class SmartHomeRemoteControl {
    private HashMap<String, Command> commandSlots = new HashMap<>();

    public void assignCommand(String slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(String slot) {
        if (commandSlots.containsKey(slot)) {
            commandSlots.get(slot).execute();
        } else {
            System.out.println("No command assigned to this slot");
        }
    }

    public void undoButton(String slot) {
        if (commandSlots.containsKey(slot)) {
            commandSlots.get(slot).undo();
        } else {
            System.out.println("No command assigned to this slot");
        }
    }
}
