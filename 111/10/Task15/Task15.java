public class Task15{
    public static void main(String[] args) {
        String fileName = "a.txt";
        File f = new File(fileName);
       
        if (f.isDirectory()) {
            String[] files = f.list();
            if (files.length > 0)
                System.out.println("directory must be empty");
        }
        boolean d = f.delete();
        
        if (!d)
            System.out.println("deletion failed");
    }
}