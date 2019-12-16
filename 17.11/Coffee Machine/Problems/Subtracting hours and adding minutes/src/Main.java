import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       LocalDateTime dateTime = LocalDateTime.parse(sc.nextLine());
       Long subH = sc.nextLong();
       Long addM = sc.nextLong();
       dateTime = dateTime.minusHours(subH).plusMinutes(addM);
        System.out.println(dateTime);
    }
}