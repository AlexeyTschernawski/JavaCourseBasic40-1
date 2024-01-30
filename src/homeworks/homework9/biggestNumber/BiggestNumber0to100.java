package homeworks.homework9.biggestNumber;

public class BiggestNumber0to100 {

    int a;
    int b;
    int c;
    int d;

    public BiggestNumber0to100(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }



    public void printBiggestNumber() {
        if (a >= b && a >= c && a >= d) {
            System.out.println("the biggest number: " + a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println("the biggest number: " + b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println("the biggest number: " + c);
        } else {
            System.out.println("the biggest number: " + d);
        }
    }

    public void Max(){
        int maxNumber = Math.max(Math.max(a,b), Math.max(c,d));
        System.out.println(maxNumber);
    }
}

