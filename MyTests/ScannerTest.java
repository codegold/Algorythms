import java.util.Scanner;

public class ScannerTest {


    public static void main(String[] args) {

        //Persona persona1 = new Persona();
        Persona persona2 = new Persona("Jerry", 22, 50000, "Developer");
        Persona persona3 = new Persona("Jeff", 33, 100000, "boss");
//        persona1.setAge(55);
//        persona1.setName("Tony");
//        persona1.sayHello();
        persona2.sayHelloMore();
        persona3.sayHelloMore();


        System.out.println(persona2.getAge());

    }
}

class Persona {

    private int age;
    private String name;
    private String postion;
    private int income;


    public Persona(String name, int age, int income, String position) {
        this.name = name;
        this.age = age;
        this.income = income;
        this.postion = position;

    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Wrong age. ");
        }
        this.age = age;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("No name here.");
        } else
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello dear " + name + " you are " + age);
    }

    public void sayHelloMore() {
        System.out.println("Hello dear " + name + " you are " + age + " Your money are: " +
                " "+income+ " You work on position " +postion);
    }


}

//        int[][] arr = {{1, 2, 3}, {6, 4, 5}, {7, 8, 9}};
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr[i].length; j++){
//                    System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
//            }

//        int[] arr = new int[10];
//        int i;
//        for (i = 0; i < arr.length; i++){
//            arr[i] = i * 10;
//        }
//
//
//        for (int j = 0; j < arr.length; j++){
//            System.out.println(arr[j]);
//        }


//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = s.nextInt();
//        switch (num) {
//            case 1: {
//                System.out.println("Junior.");
//            } break;
//            case 2: {
//                System.out.println("Middle.");
//            }break;
//            case 3: {
//                System.out.println("Senior.");
//            }break;
//            default: {
//                System.out.println("Trainee");
//            }
//        }
//

//        Scanner s = new Scanner(System.in);
//        int value;
//        do {
//            System.out.println("Enter 5: ");
//            value = s.nextInt();
//            if (value != 5) {
//                System.out.println("It's not 5, try again!");
//            }
//        } while (value != 5);
//        System.out.println("Goog job! " + value);


//        int y = 0;
//        for (y = 0; y < 10; y++) {
//            if (y % 2 !=0) continue;
//            System.out.println(y);
//        }

//
//
//    }
//}
