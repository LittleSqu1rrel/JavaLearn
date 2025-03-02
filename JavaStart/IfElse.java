public class IfElse {
    public static void main(String[] args) {
        int code = 1337;
        if (code == 1337) {
            System.out.println("Right code!");
        } else {
            System.out.println("Wrong code!");
        }

        int doorCode = 1688;
        int result = (doorCode == 1688) ? 1 : 0;
        System.out.println("Good!");

    }
}