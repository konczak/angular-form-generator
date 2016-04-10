package pl.konczak.angularformgeneratorapp.command.form;

import java.util.Scanner;

import pl.konczak.angularformgeneratorapp.builder.FormBuilder;
import pl.konczak.angularformgeneratorapp.command.Command;

public class CommandFormModal
        implements Command {

    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        boolean cmd;

        cmd = in.nextBoolean();

        FormBuilder.setModal(cmd);
    }

    @Override
    public String getDescription() {
        return "switchs form wrapper between modal and normal";
    }

}
