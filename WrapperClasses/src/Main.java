public class Main {
    public static void main(String[] args){

        //WRAPPER CLASSES -> Integer, Double, Character, Boolean

        //AUTOBOXING IN JAVA
        Integer a = 123;
        Double b = 3.14;
        Character c = 'c';
        Boolean d = true;

        //OUTBOXING IN JAVA
        int e = a;
        double f = b;
        char g = c;
        boolean h = d;

        //WRAPPER CLASSES HAVE TOSTRING() BUILTIN METHOD
        String test1 = a.toString();
        String test2 = b.toString();
        String test3 = c.toString();
        String test4 = d.toString();

        //NORMAL VARIABLE TYPE DONT HAVE TOSTRING() BUILTIN METHOD
        //String test5 = e.toString();  --> ERROR
        //String test6 = f.toString();  --> ERROR
        //String test7 = g.toString();  --> ERROR
        //String test8 = h.toString();  --> ERROR

        System.out.println(test1 + " " +  test2 + " " + test3 + " " + test4);

        //CONVERTING STRING VALUES TO OTHER TYPES
        Integer var1 = Integer.parseInt("12325");
        Double var2 = Double.parseDouble("3.1415");
        Character var3 = "TEST".charAt(0);
        Boolean var4 = Boolean.parseBoolean("false");

        int var5 = Integer.parseInt("14525");
        double var6 = Double.parseDouble("5.1518");
        char var7 = "TEST".charAt(1);
        boolean var8 = Boolean.parseBoolean("true");

        System.out.println(var1 + " " +  var2 + " " + var3 + " " + var4);
        System.out.println(var5 + " " +  var6 + " " + var7 + " " + var8);
    }
}
