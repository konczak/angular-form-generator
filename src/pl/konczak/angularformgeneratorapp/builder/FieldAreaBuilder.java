package pl.konczak.angularformgeneratorapp.builder;

import pl.konczak.angularformgeneratorapp.form.field.Field;
import pl.konczak.angularformgeneratorapp.form.field.FieldArea;

public class FieldAreaBuilder {

    private static String name;

    private static boolean elastic;

    private static boolean required;

    private static Integer minLength;

    private static Integer maxLength;

    private static String placeholder;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        FieldAreaBuilder.name = name;
    }

    public static boolean isElastic() {
        return elastic;
    }

    public static void setElastic(boolean elastic) {
        FieldAreaBuilder.elastic = elastic;
    }

    public static boolean isRequired() {
        return required;
    }

    public static void setRequired(boolean required) {
        FieldAreaBuilder.required = required;
    }

    public static Integer getMinLength() {
        return minLength;
    }

    public static void setMinLength(Integer minLength) {
        FieldAreaBuilder.minLength = minLength;
    }

    public static Integer getMaxLength() {
        return maxLength;
    }

    public static void setMaxLength(Integer maxLength) {
        FieldAreaBuilder.maxLength = maxLength;
    }

    public static String getPlaceholder() {
        return placeholder;
    }

    public static void setPlaceholder(String placeholder) {
        FieldAreaBuilder.placeholder = placeholder;
    }

    public static Field build() {
        Field field = new FieldArea(name, elastic, required, minLength, maxLength, placeholder);

        defaults();

        return field;
    }

    private static void defaults() {
        name = null;
        elastic = true;
        required = false;
        minLength = 5;
        //TODO define default max length for textarea
        maxLength = 65000;
        placeholder = null;
    }
}
