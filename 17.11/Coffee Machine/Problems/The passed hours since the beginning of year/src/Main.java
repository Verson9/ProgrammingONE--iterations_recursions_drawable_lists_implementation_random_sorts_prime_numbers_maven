import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        LocalDateTime dateTime = LocalDateTime.parse(sc.nextLine());
        LocalDateTime dateTime = LocalDateTime.parse("2017-12-31T23:59:59");
        LocalDateTime dateTimeToCompare = LocalDateTime.parse(dateTime.getYear() + "-01-01T00:00:00");
        System.out.println(dateTime);
    }
}