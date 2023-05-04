package com.lowes.MySingleton;

public class LoggerSingleton {

  /*
  // This is Eager Loading Example
  private static LoggerSingleton instance = new LoggerSingleton();

  private LoggerSingleton(){
  }

  public static LoggerSingleton getInstance(){
    return instance;
  }


  // This is Lazy Loading Example
  private static LoggerSingleton instance = null;

  private LoggerSingleton() {
  }

  public static LoggerSingleton getInstance() {
    if(instance == null) {
      System.out.println("The 1st Instance loaded here...");
      instance = new LoggerSingleton();
    }
    return instance;
  }

*/

  // This is using Thread-safety using synchronized keyword
  private static volatile LoggerSingleton instance = null;

  private LoggerSingleton() {
    if(instance != null) {
      throw new RuntimeException("Please don't try to be smart");
    }
  }

  public static LoggerSingleton getInstance() {
    if(instance == null) {
      synchronized (LoggerSingleton.class) {
        if(instance == null) {
          System.out.println("The 1st Instance loaded here...");
          instance = new LoggerSingleton();
        }
      }
    }
    return instance;
  }
}
