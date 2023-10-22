public class BinaryClass extends DecimalHexadecimalClass{

    BinaryClass(int choice){
        super(choice);
    }

    String toOctal(int x){
        if(isTrue(Integer.toString(x), this.choice)) {
            int desimal = Integer.parseInt(this.toDecimal(x));
            return Integer.toOctalString(desimal);
        } else {
            return "Input Invalid.";
        }
    }
    String toHexadecimal(int x){
        if(isTrue(Integer.toString(x), this.choice)) {
            int desimal = Integer.parseInt(this.toDecimal(x));
            return Integer.toHexString(desimal).toUpperCase();
        } else {
            return "Input Invalid.";
        }
    }
    String  toBinary(int x){
        return Integer.toString(x);
    }
    String  toDecimal(int x){
        if(isTrue(Integer.toString(x), this.choice)) {
            String y = Integer.toString(x);
            int desimal = 0;
            for (int i = 0; i < y.length(); i++) {
                desimal = desimal * 2 + y.charAt(i) - '0';
            }
            return Integer.toString(desimal);
        } else {
            return "Input Invalid.";
        }
    }
}
