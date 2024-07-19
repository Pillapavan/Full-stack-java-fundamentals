package com.java.Collections.Lists;
/*ArrayList is a resizable array implementation of the List interface. It allows fast random access to
elements but slow insertion and deletion*/
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();

        // adding elements to the list
        arrayList.add("Apple");
        arrayList.add("orange");
        arrayList.add("banana");
        arrayList.add("mango");
        arrayList.add("grapes");

        arrayList.set(2,String.valueOf("Draganfriut"));
        arrayList.remove(4);

        for (int i=0;i<arrayList.size();i++){
            System.out.println("Elements:"+arrayList.get(i));
        }


        System.out.println();

        /*Check if the ArrayList contains a specific element (e.g., "apple").
• Print "Found" if it exists, otherwise print "Not found".*/
        boolean Flag=false;
        for (int i=0;i<arrayList.size();i++){
             if("apple".equalsIgnoreCase(arrayList.get(i))){
                 Flag=true;
                 break;
             }
        }
        if (Flag){
            System.out.println("apple is Found");
        }
        else{
            System.out.println("apple is Not Found");
        }
    }
}
