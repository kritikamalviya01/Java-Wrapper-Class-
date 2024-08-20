//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrimitiveAndObject {
    public static void main(String[] args) {
        int i = 10;
        float f = 1.2f;
        //boxing
        Integer i1 = Integer.valueOf(i);
        // unboxing
        int y = i1.intValue();
        System.out.println(i);
        System.out.println(i1);
        System.out.println(y);

        Float f1 = Float.valueOf(f);
        float f2 = f1.floatValue();

        byte b = 123;
        Byte b1 = Byte.valueOf(b);
        byte b2 = b1.byteValue();

        short s = 12345;
        Short s1 = Short.valueOf(s);
        short s2 = s1.shortValue();

        int a = 100000;
        Integer a1 = Integer.valueOf(a);
        int a2 = a1.intValue();

        long l = 12345678;
        Long l1 = Long.valueOf(l);
        long l2 = l1.longValue();

        double d = 123456.1245;
        Double d1 = Double.valueOf(d);
        double d2 = d1.doubleValue();

        char c = 'A';
        Character c1 = Character.valueOf(c);
        char c2 = c1.charValue();

    }
}