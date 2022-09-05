import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        Function<String, List<String>> function = (a) -> Arrays
                        .stream(a.split(" "))
                        .sorted().distinct()
                        .toList();
        function.apply(text).forEach(System.out::println);
    }
}