public interface Validate {
    default boolean isTrue(String x, int y){
        if(y == 1){     // DESIMAL CHECK
            try {
                Integer.parseInt(x);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else if (y == 2) {       // BINARY CHECK
            try {
                if (x.matches("[01]+")) {
                    Integer.parseInt(x, 2);
                    return true;
                } else {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        } else if (y == 3) {        // OCTAL CHECK
            try {
                int value = Integer.parseInt(x, 8);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else if (y == 4) {        // HEXADECIMAL CHECK
            try {
                if (x.matches("^[0-9A-Fa-f]+$")) {
                    Integer.parseInt(x, 16);
                    return true;
                } else {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        } else return false;
    }
}
