package util;

public class Base32 {
    public static String encode(final long value) {
        return Long.toString(value, 32);
    }
}
