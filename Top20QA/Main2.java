import java.util.*;
import java.util.stream.*;

//1)Take a list of numbers remove duplicates sort
//2) From a list of numbers , find all the even numbers and return their squres
public class Main2 {
    public static void main(String[] args) {
       List<Integer> list=new ArrayList<>(Arrays.asList(5,3,2,4,1,7,8,6,4,3,2,1));
        List<Integer> result=list.stream()
      // .distinct()
      // .sorted(Comparator.reverseOrder())
      // .collect(Collectors.toList());
      // System.out.println(result);
      .filter((e)->e%2==0)
      .map((e)->e*e)
       .collect(Collectors.toList());
       System.out.println(result);
    }
}