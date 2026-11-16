import java.util.*;
import java.util.stream.*;
import java.util.Comparator.*;
import java.util.stream.Collectors.*;

//Find second highest number
public class Main5 {
    public static void main(String[] args) {
     List<Integer> list=new ArrayList<>(Arrays.asList(45,45,45,44,43));
     Optional <Integer> result=list.stream()
     .distinct().sorted(Comparator.reverseOrder())
     .skip(2).findFirst();
     if(result.isPresent())
     {
System.out.println(result.get());
     }
     else{
      System.out.println("Data is Not Existed");
     }
     
    }
}