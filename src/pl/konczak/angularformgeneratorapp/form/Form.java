package pl.konczak.angularformgeneratorapp.form;

import java.util.Set;

import pl.konczak.angularformgeneratorapp.form.field.Field;

public class Form {

    private final String name;

    private final boolean modal;

    private final Set<Field> fields;

    public Form(String name, boolean modal, Set<Field> fields) {
        this.name = name;
        this.modal = modal;
        this.fields = fields;
    }

    public String render() {
        StringBuffer sb = new StringBuffer();

        if (modal) {

        }

        sb.append("<form name=\"");
        sb.append(name);
        sb.append("\">");

        fields.stream()
                .map(Field::render)
                .forEach(sb::append);

        sb.append("</form>");

        if (modal) {

        }

        return sb.toString();
    }
}
