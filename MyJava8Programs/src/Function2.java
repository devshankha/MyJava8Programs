import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function2 {
    static <T,R> List<R> transform(List<T> list, Function<T,R> func) {
        List<R> result = new ArrayList<>();
        for (T t : list) {

            result.add(func.apply(t));
        }
        return result;



    }

    public static void main(String[] args) {
        Function<String,Integer> func = (s) -> s.length();
        List<String> kk = Arrays.asList("abc","gf","abcdfr");
        List<Integer> items = Function2.transform(kk,func);
        System.out.println(items);


        }

    }

