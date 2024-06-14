package exCombiPermu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class firstCombiPermu {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> combinations = new ArrayList<>();

        for (int i = 0; i < myList.size() - 1; i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(myList.get(i));
                temp.add(myList.get(j));
                combinations.add(temp);
            }
        }
        System.out.println(combinations);
    }
}
