import java.util.*;
public class Calculator {
    interface add{
        public int add(int a,int b);
    }
    interface diff{
        public int diff(int a,int b);
    }
    interface product{
        public int product(int a,int b);
    }
    interface div{
        public double divide(double a, double b);
    }

    public static void main(String[] args) {

        add add = (int a,int b)-> a+b;
        diff diff = (int a,int b) -> a-b;
        product product = (int a,int b)->a*b;
        div divide = (double a,double b)-> {
            try {
                if (b == 0) {
                    throw new ArithmeticException();
                }
                return a/b;
            }catch (Exception e){
                System.out.println(e);
                e.printStackTrace();
            }
            return 0;
        };
        System.out.println(add.add(5,7));
        System.out.println(diff.diff(25,18));
        System.out.println(divide.divide(15.2,9.26));
        System.out.println(product.product(458,57));
    }

}