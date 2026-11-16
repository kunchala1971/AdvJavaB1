import java.util.*;
import java.util.stream.*;
import java.util.Comparator.*;
import java.util.stream.Collectors.*;

//Divide numbers into even and odd
public class Main6 {
    public static void main(String[] args) {
     List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
    Map<Boolean,List<Integer>> result=list.stream()
                              .collect(Collectors.partitioningBy((arg)->arg%2!=0));
                              System.out.println(result);
     
    }
}