import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime d1 = LocalDateTime.parse(sc.nextLine());
        LocalDateTime d2 = LocalDateTime.parse(sc.nextLine());
        int diference = d2.withHour();
        System.out.println(diference);
    }
}