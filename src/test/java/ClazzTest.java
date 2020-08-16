import static org.junit.Assert.*;

public class ClazzTest {

    private static final String fieldToTest = "a field to test";
    private static final String setFieldToTest = "a set field to test";
    private static Clazz clazzToTest;

    @org.junit.Before
    public void setUp() throws Exception {
        clazzToTest = new Clazz(fieldToTest);
    }

    @org.junit.Test
    public void getField() {
        assertEquals(fieldToTest, clazzToTest.getField());
    }

    @org.junit.Test
    public void setField() {
        clazzToTest.setField(setFieldToTest);
        assertEquals(setFieldToTest, clazzToTest.getField());
    }

    @org.junit.Test
    public void toString1() {
        String clazzToTestToString = clazzToTest.toString();
        assertEquals(clazzToTestToString, clazzToTest.toString());
    }

    @org.junit.After
    public void tearDown() throws Exception {
        clazzToTest.setField(null);
        clazzToTest = null;
    }
}