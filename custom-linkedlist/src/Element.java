import java.io.Serializable;

public class Element implements Cloneable, Serializable {

    private int intValue;

    private long longValue;

    public Element(int intValue, long longValue) {
        this.intValue = intValue;
        this.longValue = longValue;
    }

    public Element(Element element) {
        this(element.intValue, element.longValue);
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    @Override
    public String toString() {
        return "Element{" +
                "intValue=" + intValue +
                ", longValue=" + longValue +
                "}" + "\n";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
