public class StudentDriver
{
  public static void main(String[] args)
  {
    Student s1;
    s1= new Student();
    System.out.println(s1);
    System.out.println(s1.nameDao());
    System.out.println(s1.boloToAmiKe());
    System.out.println(s1.addressDao());
    System.out.println(s1.cgpaDao());
    s1.nameBoshao("Tonmoy Dewanjee");
    s1.addressBoshao("Mirpur");
    s1.idBoshao("16301157");
    s1.cgpaBoshao(4.0);
    System.out.println(s1.nameDao());
    System.out.println(s1.boloToAmiKe());
    System.out.println(s1.addressDao());
    System.out.println(s1.cgpaDao());
    Student s2 =  new Student("Azibun Nuder","16301045","Uttara",4.0);
    System.out.println(s2);
    System.out.println(s2.nameDao());
    System.out.println(s2.boloToAmiKe());
    System.out.println(s2.addressDao());
    System.out.println(s2.cgpaDao());
    Student s3 = new Student();
    System.out.println(s3);
    System.out.println(s3.nameDao());
    System.out.println(s3.boloToAmiKe());
    System.out.println(s3.addressDao());
    System.out.println(s3.cgpaDao());
    s1.standUp();
    s2.standUp();
    System.out.println(s1.tellMeYourName());
    System.out.println(s2.tellMeYourName());
    s1.call("Sumit Dutta");
    s2.call("Ananya Ritu");
    System.out.println(s1.add2Numbers(2,3));
  }
}
/*
Student@109dfdfd
Ei name e kono student nai
Student ei nai, abar id :P
Naam nai .. thikana ashbe koi theke?
-4.0
Tonmoy Dewanjee
16301157
Mirpur
4.0
Student@57d8e362
Azibun Nuder
16301045
Uttara
4.0
Student@5de5bb3c
Ei name e kono student nai
Student ei nai, abar id :P
Naam nai .. thikana ashbe koi theke?
-4.0
Tonmoy Dewanjee is now standing up!!
Azibun Nuder is now standing up!!
Sir, my name is Tonmoy Dewanjee
Sir, my name is Azibun Nuder
Tonmoy Dewanjee: Hey, Sumit Dutta, Sir is calling you!!
Azibun Nuder: Hey, Ananya Ritu, Sir is calling you!!
5
*/