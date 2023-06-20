package com.needimplementation;

import com.Main;

import java.util.Scanner;

// TODO Implement this class, do not modify the existing code but only add from it
public class Order implements Runnable {
  private String name;
  private String food[];
  private int foodNum;

  public static Order[] loadOrder(Scanner scanner) {
      int n= Integer.parseInt(scanner.nextLine());
      int countName=0;
      Order[] order=new Order[n];
      for(int i=0;i<n;i++){
        order[i]=new Order();
      }

      while (countName < n) {
        order[countName].name = scanner.nextLine();
        order[countName].foodNum = Integer.parseInt(scanner.nextLine());
        order[countName].food = new String[order[countName].foodNum];
        for (int i = 0; i < order[countName].foodNum; i++) {
          order[countName].food[i] = scanner.nextLine();
        }
        countName++;
      }
      return order;
  }
  @Override
  public void run() {
    try {

      for(int i=0;i<this.foodNum;i++) {
        cook(this.food[i]);
      }
      Main.println(">>Order from [" + this + "] finished");
    } catch (InterruptedException ignored) {
      // Should never ever happen if program is implemented as requested
    }
  }
  public String toString(){
    return this.name;
  }
  public void setName(String name_){
    this.name=name_;
  }

  private void cook(String dish) throws InterruptedException {
    switch (dish) {
      case "egg":
        Thread.sleep(50);
        break;
      case "ramen":
        Thread.sleep(100);
        break;
      case "friedrice":
        Thread.sleep(150);
        break;
      case "ovenroast":
        Thread.sleep(200);
        break;
      case "bibimmyon":
        Thread.sleep(250);
        break;
      default:
        break;
    }
  }
}
