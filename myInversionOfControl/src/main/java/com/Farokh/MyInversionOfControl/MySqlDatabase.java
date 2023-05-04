package com.Farokh.MyInversionOfControl;

public class MySqlDatabase implements Database{
  @Override
  public void persist(String data){
    System.out.println("\n\nMySql has persisted: " + data);
  }
}
