  public class Q5{
    private int sum;
    private int y;
    public int x;
    public Q5(){
      sum = 3;
      x = 1;
      y = 6;
    }
    public void methodA(){
      int x=1, y=1;
      msgClass [] msg = new msgClass[1];
      msgClass myMsg = new msgClass();
      myMsg.content = this.x;
      msg[0] = myMsg;
      msg[0].content = this.y + myMsg.content;
      this.y = this.y + methodB(msg[0]);
      y = methodB(msg[0]) + this.y;
      x = y + methodB(msg, msg[0]);
      sum = x + y + msg[0].content;
      System.out.println(x + " " + y+ " " + sum);
    }
    private int methodB(msgClass [] mg2, msgClass mg1){
      int x = 1;
      y = y + mg2[0].content;
      mg2[0].content = y + mg1.content;
      x = x + 3 + mg1.content;
      sum = sum + x + y;
      mg1.content = sum - mg2[0].content ;
      System.out.println(this.x + " " + this.y+ " " + sum);
      return sum;
    }
    private int methodB(msgClass mg1){
      int x = 1, y = 1;
 y = sum + mg1.content;
this.y = y + mg1.content;
x = this.x + 3 + mg1.content;
sum = sum + x + y;
this.x = mg1.content + x + 2;
System.out.println(x + " " + y+ " " + sum);
return y;
}

  public static void main(String[] c){
Q5 q = new Q5();
q.methodA();}}