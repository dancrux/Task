import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question1 {
     static ArrayList arrayList = new ArrayList();


    public static void main(String[] args) {
        for(int index = 0; index<2; index ++ ){
            arrayList.add(index, 0);
            System.out.println(arrayList);
        }

    }
}
