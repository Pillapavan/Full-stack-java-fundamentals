package com.java.loops;public class ArmStrongNumber {
    static void ArmStrong(int Value){
        int Length=String.valueOf(Value).length();
        int ReverseNum=0;
        int Temp=Value;
        for (int i=0;i<Length;i++){
            int Remindar=Temp%10;
            ReverseNum=ReverseNum*10+Remindar;
            Temp=Temp / 10;
        }
        if(Value==ReverseNum){
            System.out.println("The number "+Value +" is :ArmStrong");

        }
        else{
            System.out.println("The number "+Value +" is not ArmStrong");
        }
    }

    public static void main(String[] args) {
        ArmStrong(454);
    }
}
