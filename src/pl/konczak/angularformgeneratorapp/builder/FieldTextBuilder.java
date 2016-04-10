package pl.konczak.angularformgeneratorapp.builder;

import pl.konczak.angularformgeneratorapp.form.field.Field;
import pl.konczak.angularformgeneratorapp.form.field.FieldText;

public class FieldTextBuilder {

    private static String name;

    private static boolean required;

    private static Integer minLength;

    private static Integer maxLength;

    private static String placeholder;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        FieldTextBuilder.name = name;
    }

    public static boolean isRequired() {
        return required;
    }

    public static void setRequired(boolean required) {
        FieldTextBuilder.required = required;
    }

    public static Integer getMinLength() {
        return minLength;
    }

    public static void setMinLength(Integer minLength) {
        FieldTextBuilder.minLength = minLength;
    }

    public static Integer getMaxLength() {
        return maxLength;
    }

    public static void setMaxLength(Integer maxLength) {
        FieldTextBuilder.maxLength = maxLength;
    }

    public static String getPlaceholder() {
        return placeholder;
    }

    public static void setPlaceholder(String placeholder) {
        FieldTextBuilder.placeholder = placeholder;
    }

    public static Field build() {
        Field field = new FieldText(name, required, minLength, maxLength, placeholder);

        defaults();

        return field;
    }

    private static void defaults() {
        name = null;
        required = true;
        minLength = 5;
        maxLength = 255;
        placeholder = null;
    }

}
