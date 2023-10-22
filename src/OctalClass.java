public class OctalClass extends BinaryClass{

    OctalClass(int choice){
        super(choice);
    }

    String toOctal(int x){
        return Integer.toString(x);
    }
    String toHexadecimal(int x){
        if(isTrue(Integer.toString(x), this.choice)) {
            String y = Integer.toString(x);
            int decimal = Integer.parseInt(y, 8);
            return Integer.toHexString(decimal).toUpperCase();
        } else {
            return "Input Invalid.";
        }
    }
    String  toBinary(int x){
        if(isTrue(Integer.toString(x), this.choice)) {
            String y = Integer.toString(x);
            int decimal = Integer.parseInt(y, 8);
            return Integer.toBinaryString(decimal);
        } else {
            return "Input Invalid.";
        }
    }
    String  toDecimal(int x){
        if(isTrue(Integer.toString(x), this.choice)) {
            int decimal = 0;
            int base = 1;

            while (x > 0) {
                int digit = x % 10;
                decimal += digit * base;
                base *= 8;
                x /= 10;
            }

            return Integer.toString(decimal);
        } else {
            return "Input Invalid.";
        }
    }
}
