package pl.konczak.angularformgeneratorapp.command.form;

import java.util.Scanner;

import pl.konczak.angularformgeneratorapp.builder.FormBuilder;
import pl.konczak.angularformgeneratorapp.command.Command;

public class CommandFormName
        implements Command {

    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        String cmd;

        do {
            cmd = in.nextLine();
        } while (cmd.isEmpty());

        FormBuilder.setName(cmd);
    }

    @Override
    public String getDescription() {
        return "changes form name";
    }

}
