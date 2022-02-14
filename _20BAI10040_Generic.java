/*
20BAI10040 Shankar Lohar CSE3002 Programming in Java
To create basic 5 airthmetic Type using generic class and method
 */
class GenericArithmetic <Type extends Number> {
    public void add(Type a, Type b) {
        System.out.println((Integer)a + (Integer)b);
    }

    public void sub(Type a, Type b) {
        System.out.println((Integer)a - (Integer)b);
    }

    public void mul(Type a, Type b) {
        System.out.println((Integer)a * (Integer)b);
    }

    public void div(Type a, Type b) {
        System.out.println((Integer)a / (Integer)b);
    }

    public void rem(Type a, Type b) {
        System.out.println((Integer)a % (Integer)b);
    }
}
public class _20BAI10040_Generic {
    public static void main(String[] args) {
        GenericArithmetic<Integer> shankar20BAI10040 = new GenericArithmetic<>();
        System.out.println("Basic 5 airthmetic Type using generic class and method! Addition - Subtraction - Multiplication - Division - Remainder on Variable a = 5 , b = 5 \n\n");
        shankar20BAI10040.add(5, 5);
        shankar20BAI10040.sub(5, 5);
        shankar20BAI10040.mul(5, 5);
        shankar20BAI10040.div(5, 5);
        shankar20BAI10040.rem(5, 5);
    }

}