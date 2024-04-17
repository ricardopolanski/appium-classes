package appium_test;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 1;
        array[4] = 2;
        int size = array.length;
        System.out.println("size: " + size );
        // for(int x = 0; x <= size; x++){
        //     System.out.println(array[x]);
        // }

        // for(int a: array){
        //     System.out.println(a);
        // }
        
        // String[] name = new String[3];
        // name[0] = "Ricardo";
        // name[1] = "Polanski";
        // name[2] = "Alves";
        // System.out.println(name[0].length());
        // System.out.println(name.length);

        ArrayList<String> a = new ArrayList();
        System.out.println(a);
        a.add("Ricardo");
        System.out.println(a);
        a.add("Polanski");
        System.out.println(a);
        a.add("Alves");

        System.out.println(a.get(2));

    }

    
}
