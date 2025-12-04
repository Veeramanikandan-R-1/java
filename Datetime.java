import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDateTime dateObj = LocalDateTime.now();
        System.out.println("before format" + dateObj);

        DateTimeFormatter formatPattern = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
        String formattedDate = dateObj.format(formatPattern);
        System.out.println("after format" + formattedDate);
    }
}