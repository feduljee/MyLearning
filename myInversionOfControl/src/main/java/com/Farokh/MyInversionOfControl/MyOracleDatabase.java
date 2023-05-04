package com.Farokh.MyInversionOfControl;

public class MyOracleDatabase implements Database{
  @Override
  public void persist(String data){
    System.out.println("\n\nOracle has persisted: " + data);
  }
}
