import java.util.*;
public class Collections {
    public static void main(String[] args) {
//Lists
        ArrayList<String>list=new ArrayList<>();   
        list.add("Sravs");
        list.add("Hari");
        list.add("Hema");        
        list.add("Aisha");
        list.add("Jyoshna");
        System.out.println("List of Students:"+list);
        System.out.println("Size of the list:");
        System.out.println(list.size());
        System.out.println("Removed:"+list.remove(4));
        System.out.println("List of Students:"+list);

        LinkedList<Integer>referenceid=new LinkedList<>(); 
        referenceid.add(71);
        referenceid.add(72);
        referenceid.add(73);
        referenceid.add(73);
        referenceid.add(74);
        System.out.println("Student referenceid:"+referenceid);
        System.out.println("Remove :"+referenceid.remove(3));
        System.out.println("Student referenceid:"+referenceid);

        Stack<String>stack=new Stack<>();
        stack.push("first student");
        stack.push("second student");
        stack.push("third student");
        stack.push("fourth student");
        stack.push("fifth student");
        System.out.println("List of stack elements:"+stack);
        
    //sets   
        Set<Integer>number=new HashSet<>();                 
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(3);
        number.add(4);
        System.out.println("Set of numbers"+number);
        System.out.println(number.contains(3));
        System.out.println(number.contains(5));

        Set<String>colors=new LinkedHashSet();
        colors.add("Red");
        colors.add("White");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Yellow");
        System.out.println("Linked hashset of colors:"+colors);
        System.out.println("Size of the colors:"+colors.size());

        TreeSet<Integer>set=new TreeSet();
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(15);
        set.add(25);
        System.out.println("TreeSet of numbers:"+set);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(25));
        System.out.println(set.tailSet(25));
    //Maps
        Map<String,Integer>map=new HashMap<>();
        map.put("Sravs",71);
        map.put("Hari",72);
        map.put("Hema",73);
        map.put("Aisha",73);
        map.put("Jyoshna",74);
        System.out.println("List of hashmap"+map);

        Map<String,Integer>treemap=new TreeMap<>(map);
        treemap.put("Sravs",3);
        treemap.put("Hari",1);
        treemap.put("Hema",4);
        treemap.put("Aisha",2);
        treemap.put("Jyoshna",5);
        System.out.println("TreeMap:"+treemap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Sravs",3);
        linkedHashMap.put("Hari",1);
        linkedHashMap.put("Hema",4);
        linkedHashMap.put("Aisha",2);
        linkedHashMap.put("Jyoshna",5);
        System.out.println("LinkedHashmap:"+linkedHashMap);
    //Queue    
        PriorityQueue<Integer>priority=new PriorityQueue<>();
        priority.offer(5);
        priority.offer(1);
        priority.offer(4);
        priority.offer(2);
        priority.offer(3);
        System.out.println("PriorityQueue:"+priority);
        priority.remove(3);       
        System.out.println(priority);

        Deque<Character> deque = new ArrayDeque<>();
        deque.add('A');
        deque.add('B');
        deque.add('C');
        deque.add('C');
        System.out.println("Deque:"+deque); 
        System.out.println("Size of deque:"+deque.size());
    }
}
