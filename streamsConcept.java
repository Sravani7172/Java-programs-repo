import java.util.*;
public class streamsConcept {
    public static void main(String[] args) {
    //distinct
        List<String>vehicles=Arrays.asList("Car","bus","bycle","train","Car","bus");
        vehicles.stream().distinct().forEach(System.out::println);
        System.out.println();
    //count
        Long count=vehicles.stream().distinct().count();
        System.out.println(count);
        System.out.println();
    //min
        List<Integer>numbers1=Arrays.asList(1,2,3,4,5);
        Optional<Integer>min=numbers1.stream().min((val1,val2)->{return val1.compareTo(val2);});
        System.out.println(min.get());
        System.out.println();
    //max
        List<Integer>numbers2=Arrays.asList(1,2,3,4,5);
        Optional<Integer>max=numbers2.stream().max((val1,val2)->{return val1.compareTo(val2);});
        System.out.println(max.get());
        System.out.println();
    //reduce
        List<String>list=Arrays.asList("A","B","C","D","1","2","3");
        Optional<String>reduce=list.stream().reduce((c,n)->{return c+n;}); 
        System.out.println(reduce.get());
        System.out.println();    
    //toArray
        Object arr[]=list.stream().toArray(); 
        System.out.println(arr.length);   
        for(Object o:list){
            System.out.println(o);
        } 
        System.out.println();
    //sorted in AO
        List<Integer>sort=Arrays.asList(7,3,4,5,9);
        sort.stream().sorted().forEach(System.out::print);
        System.out.println();
    //sorted in DO
        List<Integer>DO=Arrays.asList(7,3,4,5,9);
        sort.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();
    //anyMatch
        Set<String>fruits=new HashSet<String>();    
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        boolean result=fruits.stream().anyMatch(value->{return value.startsWith("grapes");});
        System.out.println(result);
        System.out.println();
    //allMatch
        Set<String>fruit=new HashSet<String>();    
        fruit.add("apple");
        fruit.add("apricot");
        fruit.add("amla");
        boolean result1=fruit.stream().allMatch(value->{return value.startsWith("a");});
        System.out.println(result1);
        System.out.println();    
    //findAny
        List<Integer>find=Arrays.asList(7,3,4,5,9);
        Optional<Integer>findAny=find.stream().findAny();
        System.out.println(findAny);
    }
    
}
