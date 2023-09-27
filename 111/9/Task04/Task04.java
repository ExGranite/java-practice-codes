import java.util.*;
public class Task04{//using tokenizer
   
    public static void main(String[]args){
        StringTokenizer kisuShongkha = new StringTokenizer("74                89          \n    45");
        while (kisuShongkha.hasMoreElements()) {
            String token = kisuShongkha.nextElement().toString();
            System.out.println(token);
        }
        
        String golpo = "still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
        StringTokenizer st = new StringTokenizer(golpo, "\n");
        while (st.hasMoreElements()) {
            String token = st.nextElement().toString();
            System.out.println(token);
        }
        
        StringTokenizer s = new StringTokenizer("23 3 8 20 32");
        int sum=0;
        while (s.hasMoreElements()) {
            int token = Integer.parseInt(s.nextElement().toString());
            sum+=token;
        }
        System.out.println(sum);
    }
}
//Write code below that adds the above numbers and prints sum.




