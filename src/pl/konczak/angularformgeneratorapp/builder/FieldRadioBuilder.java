package pl.konczak.angularformgeneratorapp.builder;

import pl.konczak.angularformgeneratorapp.form.field.Field;
import pl.konczak.angularformgeneratorapp.form.field.FieldRadio;

public class FieldRadioBuilder {

    private static String name;

    private static boolean required;

    private static String mapOfValues;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        FieldRadioBuilder.name = name;
    }

    public static boolean isRequired() {
        return required;
    }

    public static void setRequired(boolean required) {
        FieldRadioBuilder.required = required;
    }

    public static String getMapOfValues() {
        return mapOfValues;
    }

    public static void setMapOfValues(String mapOfValues) {
        FieldRadioBuilder.mapOfValues = mapOfValues;
    }

    public static Field build() {
        Field field = new FieldRadio(name, required, mapOfValues);

        defaults();

        return field;
    }

    private static void defaults() {
        name = null;
        required = true;
        mapOfValues = null;
    }
}
