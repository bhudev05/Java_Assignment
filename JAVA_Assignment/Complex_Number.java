import java.util.*;

class complex {
    int real;
    int img;

    public complex(int real , int img){
        this.real = real;
        this.img = img;
    }
    public complex add(complex b){
        return new complex(this.real+b.real,this.img+b.img);
    }
    public complex sub(complex b){
        return new complex(this.real-b.real,this.img-b.img);
    }
    public complex mul(complex b){
        return new complex(this.real*b.real,this.img*b.img);
    }
    public complex div(complex b){
        return new complex(this.real/b.real,this.img/b.img);
    }
}

public class Complex_Number {

    Complex_Number(){
        Scanner sc = new Scanner(System.in);
        try {
            complex a = new complex(sc.nextInt(),sc.nextInt());
            complex b = new complex(sc.nextInt(),sc.nextInt());
            System.out.println(a.add(b));
            System.out.println(a.sub(b));
            System.out.println(a.mul(b));
            System.out.println(a.div(b));
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Complex_Number cmlex = new Complex_Number();
    }
}