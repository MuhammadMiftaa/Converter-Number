public class DecimalHexadecimalClass extends InitialClass{

    DecimalHexadecimalClass(int choice){
        this.choice = choice;
    }


    // DECIMAL CONVERTING
    String toOctal(int x){
        if(isTrue(Integer.toString(x), this.choice)) {
            return Integer.toOctalString(x);
        } else {
            return "Input Invalid.";
        }
    }
    String toHexadecimal(int x){
        if(isTrue(Integer.toString(x), this.choice)) {
            return Integer.toHexString(x).toUpperCase();
        } else {
            return "Input Invalid.";
        }
    }
    String  toBinary(int x){
        if(isTrue(Integer.toString(x), this.choice)) {
            return Integer.toBinaryString(x);
        } else {
            return "Input Invalid.";
        }
    }
    String  toDecimal(int x){
        return Integer.toString(x);
    }
    // DECIMAL CONVERTING


    // HEXADECIMAL CONVERTING
    String toOctal(String  x){
        if(isTrue(x, this.choice)) {
            return Integer.toOctalString(Integer.parseInt(x, 16));
        } else {
            return "Input Invalid.";
        }
    }
    String toHexadecimal(String x){
        return x;
    }
    String  toBinary(String x){
        if(isTrue(x, this.choice)) {
            return Integer.toBinaryString(Integer.parseInt(x, 16));
        } else {
            return "Input Invalid.";
        }
    }
    String  toDecimal(String x){
        if(isTrue(x, this.choice)) {
            return Integer.toString(Integer.parseInt(x, 16));
        } else {
            return "Input Invalid.";
        }
    }
    // HEXADECIMAL CONVERTING
}
