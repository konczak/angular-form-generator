package pl.konczak.angularformgeneratorapp.form.field;

public interface Field
        extends Comparable<Field> {

    FieldType getType();

    String getName();

    String render();
}
