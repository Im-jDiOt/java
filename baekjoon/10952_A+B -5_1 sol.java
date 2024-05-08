import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int res = 1;

        while(true){
            String str = scanner.nextLine();
            if (str.equals("0 0")){
                scanner.close();
                break;
            }
            else{
                String[] strNum = str.split(" ");
                res = Integer.parseInt(strNum[0]) + Integer.parseInt(strNum[1]);

                System.out.println(res);
            }

        }
    }
}
