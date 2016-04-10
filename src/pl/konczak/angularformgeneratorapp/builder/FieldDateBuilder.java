package pl.konczak.angularformgeneratorapp.builder;

import pl.konczak.angularformgeneratorapp.form.field.Field;
import pl.konczak.angularformgeneratorapp.form.field.FieldCheckbox;

public class FieldDateBuilder {

    private static String name;

    private static boolean required;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        FieldDateBuilder.name = name;
    }

    public static boolean isRequired() {
        return required;
    }

    public static void setRequired(boolean required) {
        FieldDateBuilder.required = required;
    }

    public static Field build() {
        Field field = new FieldCheckbox(name, required);

        defaults();

        return field;
    }

    private static void defaults() {
        name = null;
        required = false;
    }

}
