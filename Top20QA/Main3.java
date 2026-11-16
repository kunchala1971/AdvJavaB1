import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50));

List <Integer> result= list.stream()
.skip(1)
.limit(2)
.collect(Collectors.toList());

System.out.println(result);
    }
}
