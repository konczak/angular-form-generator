package pl.konczak.angularformgeneratorapp.form.field;

public class FieldCheckbox
        implements Field {

    private final String name;

    private final boolean defaultValue;

    public FieldCheckbox(String name, boolean defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
    }

    @Override
    public FieldType getType() {
        return FieldType.CHECKBOX;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        //TODO verify what CSS classes are required

        //TODO fix checbox to match Bootstrap styles and make label clickable as well
        sb.append("<label for=\"");
        sb.append(name);
        //TODO fix label translation
        sb.append("\"></label>");

        sb.append("<input type=\"checkbox\" ng-model=\"");
        sb.append(name);
        sb.append("\"");

        if (defaultValue) {
            sb.append(" checked=\"true\"");
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
