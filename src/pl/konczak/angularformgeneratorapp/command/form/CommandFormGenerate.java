package pl.konczak.angularformgeneratorapp.command.form;

import pl.konczak.angularformgeneratorapp.builder.FormBuilder;
import pl.konczak.angularformgeneratorapp.command.Command;
import pl.konczak.angularformgeneratorapp.form.Form;

public class CommandFormGenerate
        implements Command {

    @Override
    public void execute() {
        Form form = FormBuilder.build();

        String html = form.render();

        //TODO replace printing file with save to file
        System.out.println(html);
    }

    @Override
    public String getDescription() {
        return "generates file from form";
    }

}
