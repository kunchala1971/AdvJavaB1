import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;
import java.util.Comparator.*;
//Take a list of numbers remove duplicates sort
public class Main1 {
    public static void main(String[] args) {
      List<Integer> list=new ArrayList<>(Arrays.asList(5,3,2,4,1,7,8,6,4,3,2,1));
      List<Integer> result=list.stream()
      .distinct()
      .sorted(Comparator.reverseOrder())
      .collect(Collectors.toList());
      System.out.println(result);
    }
}