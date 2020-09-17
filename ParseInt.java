
public class ParseInt {
    public static int parseDigit (char d) {
        return (int)(d - '0');
    }
    
    public static int parseDigit (String s, int i) {
    	return parseDigit(s.charAt(i));
    }
    public static int parseInt(String x) {
    int result = 0;

    for (int i = 0; i <x.length();i++) {
        int num = parseDigit(x.charAt(i));
        result = result*10 + num;
    }

    return result;
}
}
