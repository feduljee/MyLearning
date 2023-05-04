package com.lowes.myExeptions;

public class Main {
  public static void main(String[] args) {
  int [] nums = new int[5];
  int [] numer = {4,8,16,32};
  int [] denom = {2,0,4,4};

  // try...catch block
  try {
    System.out.println("In try 1");
    extMethod(nums);
    System.out.println("In try 2");
  }
  catch (ArrayIndexOutOfBoundsException ex){
    System.out.println("In catch 1");
  }
  catch (Exception ex) {
    // handler for Exception
    System.out.println("In catch 2");
  }
  // Divide by 0 exception
  for(int i = 0; i < numer.length; i++){
    try{
      System.out.println("Dividing " + numer[i] / denom[i]);
    }
    catch (ArithmeticException ex){
      System.out.println("You can't devide by ZERO");
    }
  }

  // Using try with throw to
    try{
      System.out.println("Before throw");
      throw new ArithmeticException();
    }
    catch(ArithmeticException ex){
      System.out.println("You have thrown Arithmetic Exception!");
      System.out.println(ex);
    }
   // Finally block
    finally{
      System.out.println("Finally block");
    }
  }

  private static void extMethod(int[] nums){
    nums[7] = 25;
  }
}
