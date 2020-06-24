import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] unused) throws Exception {
        String tes = "____";
        List<String> test = new ArrayList<>(Stream.iterate(0, e -> e + 1).limit(tes.split("").length).map(String::valueOf).collect(Collectors.toList()));
        final Consumer<List> beuh = e -> System.out.println(e);
        test.stream().forEach(e -> System.out.println(e));
    }
}