import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] unused) throws Exception {
        String tes = "__";
        List<String> test = new ArrayList<>(Stream.iterate(0, e -> e + 1).limit(tes.split("").length).map(String::valueOf).collect(Collectors.toList()));
        System.out.println(test.stream().count());
    }
}