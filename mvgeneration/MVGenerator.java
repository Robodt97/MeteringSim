package mvgeneration;

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.lang.Thread;

public class MVGenerator extends Thread {
    static DateTimeFormatter mvDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void generate(int power) {
        LocalDateTime timestamp = LocalDateTime.now();
        String timestamp_form = timestamp.format(mvDateTimeFormatter);
        System.out.println(timestamp_form + ": " + power + "W");
    }

    public void run() {
        System.out.println("Start generating");
        while (true) {
            if (LocalDateTime.now().getSecond() % 5 == 0) {
                generate(80);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }

    // public static void main() {
    // MVGenerator thread = new MVGenerator();
    // thread.start();

    // }

}
