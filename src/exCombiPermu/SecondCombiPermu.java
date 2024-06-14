package exCombiPermu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
public class SecondCombiPermu {
    public static void main(String[] args) {
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        List<List<Integer>> combinations = new ArrayList<>();

//        List<Integer> temp = new ArrayList<>();

//        for (int i = 0; i < myList.size() - 1; i++) {
//            for (int j = i + 1; j < myList.size(); j++) {
//                //List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                combinations.add(temp);
//            }
//        }
//        System.out.println(combinations);
        //----------------------------------------------------------------------------------
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> answer = new ArrayList<>();
        combi(answer, new ArrayList<>(), myList, 2, 0);
        System.out.println(answer);
    }

    static void combi(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, int start){
        if(temp.size() == count){
            //answer.add(temp);
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            System.out.println("add 후 템프 : "+temp);
            combi(answer, temp, myList, count ,i+1);
            temp.remove(temp.size()-1);
            System.out.println("remove 후 템프 : " + temp);
        }

    }

}
