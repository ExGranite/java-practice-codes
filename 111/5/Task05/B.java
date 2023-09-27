class B{
  public int y=1;
  public int temp=-3;
  public int x = 1;
  public static int sum = 2;
  public B(){
    y = temp + 1 ;
    x = 3 + temp + x;
    temp-=2;
 
  }  
  public B(B b){
    sum = b.sum + this.sum;
    x = b.x + x;
    b.methodB(3,5);
  }
  public void methodA(int m, int [] n){
    int x = 0;
    y = y + m + (temp++);
    x = x + 2 +  (++n[0]);
    sum = sum + x + y;
    n[0] = sum + 2;
    System.out.println(temp + x + " " + y+ " " + sum + temp);  
  }
  public void methodB(int m, int n){    
    int [] y = {0};
    this.y = y[0] + this.y + m; 
    x = this.y + 2 + temp - n;
    methodA(x, y);
    sum = x + y[0] + this.sum;
    System.out.println(n + x + " " + y[0]+ " " + sum + n);
  }
}