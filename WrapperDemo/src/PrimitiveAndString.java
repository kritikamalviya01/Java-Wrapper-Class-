public class PrimitiveAndString {
    public static void main(String[] args) {
        byte b = 100;

        // converting byte to string
        String str = Byte.toString(b);
        System.out.println(str);

        //converting string to byte
        byte c = Byte.parseByte(str);
        System.out.println(c);

        byte a = 123;
        String s1 = Byte.toString(a);
        byte a1 = Byte.parseByte(s1);

        short s = 12345;
        String s2 = Short.toString(s);
        short s3 = Short.parseShort(s1);

        int i = 1000000;
        String s4 = Integer.toString(i);
        int i2 = Integer.parseInt(s4);

        long l1 = 10000000;
        String s5 = Long.toString(l1);
        long l2 = Long.parseLong(s5);

        char ch = 'A';
        String s6 = Character.toString(ch);
        char ch1 = s6.charAt(0);
    }
}
