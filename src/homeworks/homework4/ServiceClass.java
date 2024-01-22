package homeworks.homework4;

//Task 1 Private data
public class ServiceClass {
String name;
int age;
String PlaceOfResidence;


    public ServiceClass(String name, int age, String placeOfResidence) {
        this.name = name;
        this.age = age;
        PlaceOfResidence = placeOfResidence;
    }

    public void printData() {
        System.out.println("about me: ");
        System.out.println("name: " + name);
        System.out.println("I am " + age + " old");
        System.out.println("I am from " + PlaceOfResidence);
    }


//Task 2 Arithmetic Mean
    int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
    public ServiceClass(int a, int b, int c, int d, int e, int f, int g, int j, int k, int m) {
        this.n1 = a;
        this.n2 = b;
        this.n3 = c;
        this.n4 = d;
        this.n5 = e;
        this.n6 = f;
        this.n7 = g;
        this.n8 = j;
        this.n9 = k;
        this.n10 = m;
    }

    public void printArithmeticMean(){

        int summe = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
        int ArithmeticMean = summe / 10;
        System.out.println("the Arithmetic mean of the numbers 0,1,2,3,4,5,6,7,8,9: " + ArithmeticMean);
        // Вычисление остатка от деления суммы на 10 (число, отброшенное в дробной части)
        int remainder = summe % 10;
        System.out.println("Отброшено в дробной части: " + remainder);
    }

    //Task 3 Discount 100 €





    }


