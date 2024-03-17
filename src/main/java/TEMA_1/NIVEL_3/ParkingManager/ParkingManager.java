package TEMA_1.NIVEL_3.ParkingManager;

import TEMA_1.NIVEL_3.Interfaces.Command;

import java.util.HashMap;
import java.util.Map;

public class ParkingManager {
    private HashMap<String, Command> commands;

    public ParkingManager(HashMap<String, Command> commands) {
        this.commands = commands;
    }

    public void addCommand(String key, Command command) {
        commands.put(key, command);
    }

    public void executeCommand(String key) {
        Command command = commands.get(key);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("The command '" + key + " dont exist.");
        }
    }
    

    public Command getCommand(String key) {
        return commands.get(key);
    }
}
