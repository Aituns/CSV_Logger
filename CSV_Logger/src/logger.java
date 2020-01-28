import javax.print.DocFlavor;
import java.io.File;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.IOException;

public class logger {
    enum Levels {
        FATAL,
        NORMAL,
        OTHER

    }

    public void log(String level, String stufftolog) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String logStuff = (dtf.format(now) + ',' + level + ',' + stufftolog);

        FileWriter fileWriter = new FileWriter("log.csv", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logStuff);
        printWriter.close();
    }
    public void fatal(String level, String stufftolog) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String logStuff = (dtf.format(now) + ',' + level + ',' + stufftolog);

        FileWriter fileWriter = new FileWriter("fatal.csv", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logStuff);
        printWriter.close();
    }
    public void normal(String level, String stufftolog) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String logStuff = (dtf.format(now) + ',' + level + ',' + stufftolog);

        FileWriter fileWriter = new FileWriter("normal.csv", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(logStuff);
        printWriter.close();
    }


}
