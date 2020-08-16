public class Clazz {
    private String field;

    public Clazz(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "field='" + field + '\'' +
                '}';
    }
}
