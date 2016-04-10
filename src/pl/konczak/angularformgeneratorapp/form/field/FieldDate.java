package pl.konczak.angularformgeneratorapp.form.field;

public class FieldDate
        implements Field {

    private final String name;

    private final boolean required;

    public FieldDate(String name, boolean required) {
        this.name = name;
        this.required = required;
    }

    @Override
    public FieldType getType() {
        return FieldType.DATE;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        //TODO verify what CSS classes are required

        sb.append("<label for=\"");
        sb.append(name);
        //TODO fix label translation
        sb.append("\"></label>");
        if (required) {
            //TODO fix placement of asteriks
            sb.append("*");
        }

        //TODO how to setup proper input with datepicker?
        sb.append("<input type=\"text\" ng-model=\"");
        sb.append(name);
        sb.append("\"");

        if (required) {
            sb.append(" ng-required=\"true\"");
        }

        sb.append("/>");

        //TODO add error display
        return sb.toString();
    }

    @Override
    public int compareTo(Field o) {
        return this.name.compareTo(o.getName());
    }
}
