package wq.muke.lianxiyichang;

import java.util.Arrays;

public class ArrarysTest {
    public static void main(String[] args){
        String[] names = {"zhou","wu","zheng","wang","zhao"};
        //Arrays.sort(names);
        for (String name:names){
            System.out.println(name);
        }
//        Arrays.binarySearch(names,0,3,"wq");
        System.out.println(Arrays.binarySearch(names,"wu"));
//
    }
}
