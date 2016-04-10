package pl.konczak.angularformgeneratorapp.command;

public class CommandExit
        implements Command {

    @Override
    public void execute() {
        //do nothing
    }

    @Override
    public String getDescription() {
        return "completes actual command";
    }

}
