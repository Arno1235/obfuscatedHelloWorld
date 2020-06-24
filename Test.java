import java.io.ByteArrayOutputStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] unused) throws Exception {
        ByteArrayOutputStream stoned = new ByteArrayOutputStream(20480);
        int[] magic = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33};
        for (int weird : magic) stoned.write(weird);
        int crazy, unknown = 0;
        //java.io.InputStream wtf = new java.net.URL(stoned.toString()).openStream();
        //while((crazy = wtf.read()) != -1) stoned.write(crazy);
        for (int strange : stoned.toByteArray()) {
            unknown = 2;
            if (unknown == 2) {
                if (strange == 38) break;
                System.out.print((char) strange);
            } else if (17 + (unknown + 1) * 21 == strange) {
                unknown++;
            }
        }
    }
}