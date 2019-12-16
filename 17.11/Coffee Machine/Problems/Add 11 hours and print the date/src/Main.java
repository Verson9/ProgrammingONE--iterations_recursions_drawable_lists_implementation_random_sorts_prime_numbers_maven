import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateTime = sc.nextLine();
        LocalDateTime dTF = LocalDateTime.parse(dateTime);
        dTF = dTF.plusHours(11);
        LocalDate date = LocalDate.from(dTF);
        System.out.println(date);
    }
}