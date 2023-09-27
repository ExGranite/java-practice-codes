import java.util.*;
public class Task05 {
    public static void main(String[] args) {
        String kisuShongkha = "74                89          \n    45";
        String[] array = kisuShongkha.split("//s+");
        for(int i = 0; i < array.length; ++i)
            System.out.println(array[i]);
        
        
        
        String golpo = "still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
        String [] gArray = golpo.split("\\n");
        for(int i = 0; i < gArray.length; ++i)
            System.out.println(gArray[i]);
        
        String s="23 3 8 20 32";
        int sum=0;
        String[] n = s.split(" ");
        for(int i = 0; i < n.length; ++i)
            sum+=Integer.parseInt(n[i]);
        System.out.println(sum);
    }
}