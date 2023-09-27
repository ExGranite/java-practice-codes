import static java.lang.System.*;
public class Task07 {
  public static void main (String[] OK) {
    String a = new String("ape");
    String b = new String("apple");
    String c = new String("CAT");
    String d = new String("catfish");
    String e = "apple";
    String f = new String("cat");
    String g = "    1apple2      ";
    //compareTo
    out.println(b.compareTo(e));
    out.println(a.compareTo(b));
    out.println(a.compareTo(c));
    //CompareToIgnoreCase
    out.println(d.compareTo(c));
    out.println(d.compareToIgnoreCase(c));
    //startsWith, endsWith
    out.println(a.startsWith("a"));
    out.println(d.startsWith(f));
    out.println(d.startsWith(c));
    out.println(b.endsWith(e));
    //equals
    out.println(b==e);
    out.println(b.equals(e));
    //equalsIgnoreCase
    out.println(c.equals(f));
    out.println(c.equalsIgnoreCase(f));
    //indexOf
    out.println(b.indexOf("pl"));
    out.println(d.indexOf('f'));
    out.println(c.indexOf("the"));
    //lastIndexOf
    out.println(b.indexOf("p"));
    out.println(b.lastIndexOf("p"));
    //length
    out.println(a.length());
    out.println(d.length());
    //replace(char oldChar, char newChar)
    out.println(d.replace('c', 'K'));
    out.println(d.replace("cat", "Fish"));
    //substring
    out.println(d.substring(0,3));
    out.println(d.substring(3,7));
    out.println(d.substring(3));
    out.println(b.substring(0,3));
    //toCharArray
    char[] h = b.toCharArray();
    for (char i : h)
        out.printf("%c ", i);
    out.println();
    //toLowerCase, toUpperCase
    out.println(c.toLowerCase());
    out.println(a.toUpperCase());
    //trim
    out.println(g);
    out.println(g.trim());
    //valeOf
    int j = 234;
    double k = 23.003;
    String l = String.valueOf(j);
    out.println(l);
    out.println(k);
    out.println(String.valueOf(k));
  }
}