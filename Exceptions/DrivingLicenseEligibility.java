package com.java.Exceptions;

public class DrivingLicenseEligibility {
    public static void main(String[] args) {
        try{
            EligiablilityCheck(16);
        }catch (UnderageException e){
            System.out.println("Exception :"+e.getMessage());
        }
        finally {
            System.out.println("finally block is executeted...");
        }

    }
    static void EligiablilityCheck(int age) throws UnderageException{
        if (age<18){
            throw new UnderageException("Eligibility age is 18");
        }
        else{
            System.out.println("Eligiable for DrivingLicenseEligibility");
        }
     }
}
