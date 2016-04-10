package pl.konczak.angularformgeneratorapp.builder;

import pl.konczak.angularformgeneratorapp.form.field.Field;
import pl.konczak.angularformgeneratorapp.form.field.FieldCheckbox;

public class FieldCheckboxBuilder {

    private static String name;

    private static boolean defaultValue;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        FieldCheckboxBuilder.name = name;
    }

    public static boolean isDefaultValue() {
        return defaultValue;
    }

    public static void setDefaultValue(boolean defaultValue) {
        FieldCheckboxBuilder.defaultValue = defaultValue;
    }

    public static Field build() {
        Field field = new FieldCheckbox(name, defaultValue);

        defaults();

        return field;
    }

    private static void defaults() {
        name = null;
        defaultValue = false;
    }
}
