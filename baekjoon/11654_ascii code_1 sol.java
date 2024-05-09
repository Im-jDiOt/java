import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        char chr = scanner.nextLine().charAt(0);
        scanner.close();
      
        int ascii = (int) chr;
        System.out.println(ascii);
    }
}
