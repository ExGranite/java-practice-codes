public class Test{ 
public static void main(String [] args){ 
Cat c1 = new Cat(); 
Cat c2 = new Cat("Black"); 
Cat c3 = new Cat("Brown", "jumping"); 
Cat c4 = new Cat("Red", "purring"); 
c1.printCat(); 
c2.printCat(); 
c3.printCat(); 
c4.printCat(); 
c1.changeColor("Blue"); 
c3.changeColor("Purple"); 
c1.printCat(); 
c3.printCat(); 
} 
} 
/*Output:
White cat is sitting
Black cat is sitting
jumping cat is Brown
purring cat is Red
Blue cat is sitting
Purple cat is Brown */