abstract public class InitialClass implements Validate {

    int intNumber;
    String strNumber;

    int choice;

    abstract String toOctal(int x);
    abstract String toHexadecimal(int x);
    abstract String toBinary(int x);
    abstract String toDecimal(int x);

    abstract String toOctal(String x);
    abstract String toHexadecimal(String x);
    abstract String toBinary(String x);
    abstract String toDecimal(String x);
}
