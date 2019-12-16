import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateTime = sc.nextLine();
        Long add = sc.nextLong();
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime).plusMinutes(add);

    }
}