import java.util.*;
import java.util.stream.*;
import java.util.Comparator.*;
import java.util.stream.Collectors.*;

//Find the Longest String in a List
public class Main7 {
    public static void main(String[] args) {
     List<String> list=
     new ArrayList<>(Arrays.asList("C","Java","Python","React","SpringBoot"));
    Optional<String> result=list.stream()
    .max(Comparator.comparing((course)->course.length()));
 
    if(result.isPresent())
    {
      System.out.println(result.get());
    }
    else{
       System.out.println("Data is not Existed");
    }
     
    }
}