public class ObjectAndString {
    public static void main(String[] args) {
        long l = 1234;

        // converting to Object
        Long l1 = Long.valueOf(l);

        // Converting object to String
        String str = l1.toString();

        // Converting string to object
        Long l2 = Long.valueOf(str);

        // Converting object to primitive
        long l3 = l2.longValue();
    }
}
