public class Methods {
    public static void MyMethod(String fname, int age) {
        if (age >= 18) {
            System.out.println("Hey " + fname + " u are already " + age + " years old!");
        } else {
            System.out.println("Sorry, but u are not old enough!");
        }


    }

    public static void main(String[] args) {
        MyMethod("John", 10);
        MyMethod("Sasha", 18);
    }
}