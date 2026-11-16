
import java.util.*;
import java.util.stream.*;
import java.util.Comparator.*;
import java.util.stream.Collectors.*;

//Find second highest number
public class Main4 {
    public static void main(String[] args) {
     List<Integer> list=new ArrayList<>(Arrays.asList(20,10,10,45,30,45,5,20));
     List<Integer> result=list.stream()
     .distinct().sorted(Comparator.reverseOrder())
     .skip(2).limit(1).collect(Collectors.toList());
     System.out.println(result);
    }
}