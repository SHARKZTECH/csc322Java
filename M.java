public class M{
   public static void main(String []args){
     MyThread t=new MyThread();
    t.start();
}
}
class MyThread extends Thread{
  public void run(){
    for(int i=1;i<=5;i++){
     System.out.println(i);
  }
 }
}
