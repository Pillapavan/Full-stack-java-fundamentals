package com.java.java8features;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
      //Lambda  expression is used to create instance of the functional interface
        /*
        syntax: () -> { logic }
         */
        MathOperation operation = (a,b) -> {return a+b;};
        int result = operation.operate(5,4);
        System.out.println("Adding two numbers:"+result);

        //StringModifier interface
        StringModifier modifier= str -> {return str.reverse().toString();};
        System.out.println(modifier.modify(new StringBuffer("pavan")));

        List<String> list= Arrays.asList("pavan","tataji","praveen");
        //Consumer Interface
        //Consumer<String> uppercase= item -> System.out.println(item.toUpperCase());
        //list.forEach(uppercase);
        list.forEach(items-> System.out.println(items.toUpperCase()) );

        //Method reference
        list.forEach(Main::upperCase);

        //Functional interface
        Function<String,String> uppercase=item -> {
            item=item.toUpperCase();
            return item;
        };
        list.forEach(item -> System.out.println(uppercase.apply(item)));


    }

      //method reference
      static void upperCase(String str){
          System.out.println(str.toUpperCase());
      }



}