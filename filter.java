import java.util.*;
import java.util.stream.Collectors;
public class filter {
    public static void main(String[] args) {
        //filter
        List<Integer>list=Arrays.asList(1,2,3,4,5);
        list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        List<String>name=Arrays.asList("sravs","Hari","Bujji","Kanna");
        name.stream().filter(str->str.length()>4).forEach(System.out::println);
        List<String>words=Arrays.asList("Sravs","Hari",null,"Kanna",null,"Bujji");
        words.stream().filter(w->w!=null).forEach(System.out::println);
        //map
        List<String>vehicles=Arrays.asList("car","bike","train","bus");
        vehicles.stream().map(na->na.toUpperCase()).forEach(System.out::println);
        vehicles.stream().map(vname->vname.length()).forEach(System.out::println);
        //flatMap
        List<Integer>numbers1=Arrays.asList(1,2);
        List<Integer>numbers2=Arrays.asList(3,4);
        List<Integer>numbers3=Arrays.asList(5,6);
        List<List<Integer>>finallist=Arrays.asList(numbers1,numbers2,numbers3);
        List<Integer>finalresult=finallist.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(finalresult);

    }  
}
