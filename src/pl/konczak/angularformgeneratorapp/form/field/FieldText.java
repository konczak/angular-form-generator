package pl.konczak.angularformgeneratorapp.form.field;

public class FieldText
        implements Field {

    //TODO how to nicely handle pattern?
    private final String name;

    private final boolean required;

    private final Integer minLength;

    private final Integer maxLength;

    private final String placeholder;

    public FieldText(String name, boolean required, Integer minLength, Integer maxLength, String placeholder) {
        this.name = name;
        this.required = required;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.placeholder = placeholder;
    }

    @Override
    public FieldType getType() {
        return FieldType.TEXT;
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

        sb.append("<input type=\"text\" ng-model=\"");
        sb.append(name);
        sb.append("\"");

        if (required) {
            sb.append(" ng-required=\"true\"");
        }

        if (minLength != null) {
            sb.append(" ng-minlength=\"");
            sb.append(minLength);
            sb.append("\"");
        }

        if (maxLength != null) {
            sb.append(" ng-maxlength=\"");
            sb.append(maxLength);
            sb.append("\"");
        }

        if (placeholder != null) {
            sb.append(" placeholder=\"");
            sb.append(placeholder);
            sb.append("\"");
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
