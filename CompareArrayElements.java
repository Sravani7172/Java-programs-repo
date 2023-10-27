import java.util.ArrayList;
import java.util.List;
public class CompareArrayElements {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        List.add(3);
        List.add(5);
        List.add(18);
        List.add(4);
        List.add(6);
        int minimumValue = Integer.MAX_VALUE;
        int maximumValue = Integer.MIN_VALUE;
        for (int i=0;i<List.size();i++) {
            int number=List.get(i);
            if (number < minimumValue) {
                minimumValue = number;
            }
            if (number > maximumValue) {
                maximumValue = number;
            }
        }
        System.out.println("Min value of our list: " + minimumValue);
        System.out.println("Max value of our list: " + maximumValue);
        //String Array
        List<String> stringList = new ArrayList<>();
        stringList.add(" a");
        stringList.add(" b");
        stringList.add(" a");
        boolean allElementsEqual = true;
        String firstElement = stringList.get(0);
        for (int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(i);
            if (!string.equals(firstElement)) {
                allElementsEqual = false;
                break;
            }
        }
        if (allElementsEqual) {
            System.out.println("All elements are equal in java");
        } else {
            System.out.println("Not all elements are equal in java");
        }
    }
}
    

    
