import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        String userLetter = null;
        while (b){
            System.out.println("Введіть вашу букву");
            userLetter = scanner.nextLine();
            if(userLetter.length()>1){
                System.out.println("Введіть 1 букву");
            }else {
                b=false;
            }
        }
        System.out.println("Введіть ваш рядок");
        String userLine = scanner.nextLine();
        String replace = userLine.replaceAll(userLetter, "*");
        System.out.println(replace);

    }
}




