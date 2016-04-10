package pl.konczak.angularformgeneratorapp.form.field;

public class FieldRadio
        implements Field {

    private final String name;

    private final boolean required;

    private final String mapOfValues;

    public FieldRadio(String name, boolean required, String mapOfValues) {
        this.name = name;
        this.required = required;
        this.mapOfValues = mapOfValues;
    }

    @Override
    public FieldType getType() {
        return FieldType.RADIO;
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

        sb.append("<input type=\"radio\" ng-model=\"");
        sb.append(name);
        sb.append("\" ng-repeat=\"");
        sb.append(mapOfValues);
        sb.append("\"/>");

        //TODO add error display
        return sb.toString();
    }

    @Override
    public int compareTo(Field o) {
        return this.name.compareTo(o.getName());
    }
}
