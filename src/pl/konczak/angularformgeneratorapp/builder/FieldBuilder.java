package pl.konczak.angularformgeneratorapp.builder;

import pl.konczak.angularformgeneratorapp.form.field.Field;
import pl.konczak.angularformgeneratorapp.form.field.FieldType;

public class FieldBuilder {

    private static FieldType fieldType;

    public static Field build() {
        Field field;
        switch (fieldType) {
            case TEXT:
                break;
            case TEXTAREA:
                break;
            case DATE:
                break;
            case DATETIME:
                break;
            case RADIO:
                break;
            case CHECKBOX:
                break;
            default:
                throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
}
