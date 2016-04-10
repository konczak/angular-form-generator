package pl.konczak.angularformgeneratorapp.builder;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import pl.konczak.angularformgeneratorapp.form.Form;
import pl.konczak.angularformgeneratorapp.form.field.Field;

public class FormBuilder {

    private static String name;

    private static boolean modal;

    private static Set<Field> fields;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        FormBuilder.name = name;
    }

    public static boolean isModal() {
        return modal;
    }

    public static void setModal(boolean modal) {
        FormBuilder.modal = modal;
    }

    public static Set<Field> getFields() {
        SortedSet<Field> sortedSet = new TreeSet<>(fields);
        return Collections.unmodifiableSortedSet(sortedSet);
    }

    public static void setFields(Set<Field> fields) {
        FormBuilder.fields = fields;
    }

    public static void addField(Field newField) {
        if (fields == null) {
            fields = new HashSet<>();
        }
        fields.add(newField);
    }

    public static Form build() {
        Form form = new Form(name, modal, fields);

        defaults();

        return form;
    }

    private static void defaults() {
        name = null;
        modal = true;
        fields = null;
    }
}
