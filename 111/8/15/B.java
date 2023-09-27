class B extends A {
    public static int x = 1;
    public int sum = 2;
    public B(){
        y = temp + 1 ;
        x = 3 + temp + x;
        temp-=2;
    }  
    public B(B b){
        sum = b.sum + super.sum;
        x = b.x + x;
    }
    public void methodB(int m, int n){    
        int [] y = {0};
        super.y = y[0] + this.y + m; 
        x = super.y + 2 + temp - n;
        methodA(x, y);
        sum = x + y[0] + super.sum;
        System.out.println(x + " " + y[0]+ " " + sum);
    }
    public static void main(String [] a){
        int x[] = {23};
        A a1 = new A();
        B b1 = new B();
        B b2 = new B(b1);
        a1.methodA(1, x);
        b2.methodB(3, 2);
        a1.methodA(1, x);
    }
}