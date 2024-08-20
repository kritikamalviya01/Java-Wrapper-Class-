# Java-Wrapper-Class-
Wrapper Class + Autoboxing + Unboxing


In Java, wrapper classes are used to encapsulate primitive data types in an object. This allows primitives to be treated as objects and provides useful methods to operate on them. The primary purpose of wrapper classes is to convert primitive types into objects and to provide methods for manipulating these objects.

1. byte -> Byte
2. short -> Short
3. int -> Integer
4. long -> Long
5. float -> Float
6. double -> Double
7. char -> Character
8. boolean -> Boolean

1. Primitive to Object - boxing - valueOf
2. Object to Primitive - unboxing - intValue
3. Primitive to String  - toString
4. String to primitive - parseByte
5. Object to String - 
6. String to Object


Autoboxing and Unboxing
Autoboxing and unboxing are features introduced in Java 5 to make it easier to work with primitives and their corresponding wrapper classes.

Autoboxing
Autoboxing is the automatic conversion that the Java compiler makes between primitive types and their corresponding wrapper classes. This occurs when you assign a primitive value to a variable of a wrapper class or when you pass a primitive value as an argument to a method that expects a wrapper class.

Unboxing
Unboxing is the reverse process where the Java compiler automatically converts a wrapper class object to its corresponding primitive type. This happens when you assign a wrapper object to a variable of a primitive type or when you pass a wrapper object as an argument to a method that expects a primitive type.

Autoboxing: Conversion from primitive type to wrapper class.
Unboxing: Conversion from wrapper class to primitive type.
