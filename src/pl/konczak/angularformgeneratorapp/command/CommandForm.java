package pl.konczak.angularformgeneratorapp.command;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

import pl.konczak.angularformgeneratorapp.command.form.CommandFormField;
import pl.konczak.angularformgeneratorapp.command.form.CommandFormGenerate;
import pl.konczak.angularformgeneratorapp.command.form.CommandFormModal;
import pl.konczak.angularformgeneratorapp.command.form.CommandFormName;

public class CommandForm
        implements Command {

    private final SortedMap<String, Command> commands;

    public CommandForm() {
        this.commands = new TreeMap<>();
        this.commands.put("a", new CommandFormField());
        this.commands.put("e", new CommandExit());
        this.commands.put("m", new CommandFormModal());
        this.commands.put("n", new CommandFormName());
        this.commands.put("g", new CommandFormGenerate());
    }

    @Override
    public void execute() {
        commands.entrySet()
                .stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().getDescription())
                .forEach(System.out::println);

        Scanner in = new Scanner(System.in);
        String cmd;
        do {
            cmd = in.nextLine();
            Command command = this.commands.get(cmd);

            if (command != null) {
                command.execute();
            } else {
                System.out.println("Command <" + cmd + "> is not supported");
            }

        } while (!"e".equals(cmd));

    }

    @Override
    public String getDescription() {
        return "handles form generation";
    }

}
