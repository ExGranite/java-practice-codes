public class Test{
public static void main(String [] args){
Student s1 = new Student("Bob", 1);
Student s2 = new Student("Tom", 2);
Student s3 = new Student("Jack", 3);
Student s4 = new Student("Jill", 4);
Printer pr = new Printer();
pr.printDetail(s1);
pr.printDetail(s2);
pr.printDetail(s3);
pr.printDetail(s4);
}
}
/*
Name of the Student: Bob
ID of the Student: 1
Name of the Student: Tom
ID of the Student: 2
Name of the Student: Jack
ID of the Student: 3
Name of the Student: Jill
ID of the Student: 4
*/