import java.text.SimpleDateFormat;

/**
 * Function details
 *
 * @author: York Chow<york.chow@actionsky.com>
 * @since: 2014/10/28
 * Time: 14:34
 */
public class TimeStamp {
    public static void main(String[] args) {
        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
        String datetime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").format(timestamp);
        System.out.println(datetime);
    }
}
