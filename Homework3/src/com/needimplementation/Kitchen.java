package com.needimplementation;

// TODO Implement this class, do not modify the existing code but only add from it
public class Kitchen {
  public Thread t1;
  Thread[] th = new Thread[10];
  public int count = 0;

  public void cook(Order o) {
    t1 = new Thread(o);
    t1.setName(o.toString());
    th[count] = t1;
    count++;
    t1.start();
  }

  public boolean isAllOrderFinished() {
    if (t1.isAlive()) {
      return false;
    } else {
      return true;
    }

  }

  public Order[] getAllUnfinishedOrders() {
    String[] orders=new String[10];
    int alive=0;
    for(int i=0;i<count;i++){
      if(th[i].isAlive()){
        orders[i]=th[i].getName();
        alive++;
      }
    }
    Order[] temp= new Order[alive];
    int i=0;
    for(String a:orders){
      if(a!=null){
        temp[i]=new Order();
        temp[i].setName(a);
        i++;
      }
    }
    return temp;
  }
}
