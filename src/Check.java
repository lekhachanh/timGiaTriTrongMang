import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a name's students: ");
        String input_name = sc.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("vi tri sinh vien " + input_name + " la " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found " + input_name + " in the list");
        }
    }

}

