import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().strip().split(" ");
        LocalDateTime lDT = LocalDateTime.parse(numbers[0]).plusDays(Long.parseLong(numbers[1])).minusHours(Long.parseLong(numbers[2]));
        System.out.println(lDT);
    }
}