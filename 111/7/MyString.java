public class MyString {
    char[] a;
    MyString(){}
    MyString(char[] charSeq){
        a = charSeq;
    }
    MyString(String str){
        a = str.toCharArray();
    }
    int length(){
        return a.length;
    }
    char charAt(int n){
        if(n>=0 && n<a.length){
            return a[n];
        }else{
            return ' ';
        }
    }
    boolean startsWith(MyString prefix){
        if(a[0]==prefix.a[0]){
            return true;
        }
        return false;
    }
    boolean startsWith(String prefix){
        if(a[0]==prefix.charAt(0)){
            return true;
        }
        return false;
    }
    boolean endsWith(MyString prefix){
        if(a[length()-1]==prefix.a[prefix.length()-1]){
            return true;
        }
        return false;
    }
    boolean endsWith(String prefix){
        if(a[length()-1]==prefix.charAt(prefix.length()-1)){
            return true;
        }
        return false;
    }
    MyString replaceFirst(char oldChar, char newChar){
        for(int i = 0; i < length(); i++){
            if(a[i]==oldChar){
                a[i]=newChar;
                break;
            }
        }
        MyString b = new MyString(a);
        return b;
    }
    MyString replaceAll(char oldChar, char newChar){
        for(int i = 0; i < length(); i++){
            if(a[i]==oldChar){
                a[i]=newChar;
            }
        }
        MyString b = new MyString(a);
        return b;
    }
    MyString replaceLast(char oldChar, char newChar){
        for(int i = length()-1; i >= 0; i--){
            if(a[i]==oldChar){
                a[i]=newChar;
                break;
            }
        }
        MyString b = new MyString(a);
        return b;
    }
    MyString toLowerCase(){
        for(int i = 0; i < length(); i++){
            a[i]=Character.toLowerCase(a[i]);
        }
        MyString b = new MyString(a);
        return b;
    }
    MyString toUpperCase(){
        for(int i = 0; i < length(); i++){
            a[i]=Character.toUpperCase(a[i]);
        }
        MyString b = new MyString(a);
        return b;
    }
    boolean equals(MyString rightStr){
        if(a==rightStr.a){
            return true;
        }
        return false;
    }
    boolean equalsIgnoreCase ( MyString rightString ){
        MyString a = this.toLowerCase();
        MyString b = rightString.toLowerCase();
        if(a==b){
            return true;
        }
        return false;
    }
    int compareTo ( MyString str ){
        for(int i = 0; i < length(); i++){
            if (a[i]==str.a[i]){
                continue;
            }else{
                return (int)a[i] - (int)str.a[i];
            }
        }
        return 0;
    }
    int compareTo (String str ){
        for(int i = 0; i < length(); i++){
            if (a[i]==str.charAt(i)){
                continue;
            }else{
                return (int)a[i] - (int)str.charAt(i);
            }
        }
        return 0;
    }
    int compareToIgnoreCase(MyString str){
        MyString a = this.toLowerCase();
        MyString b = str.toLowerCase();
        for(int i = 0; i < a.length(); i++){
            if (a.a[i]==b.a[i]){
                continue;
            }else{
                return (int)a.a[i] - (int)b.a[i];
            }
        }
        return 0;
    }
    int compareToIgnoreCase(String str){
        MyString a = this.toLowerCase();
        MyString c = new MyString(str);
        MyString b = c.toLowerCase();
        for(int i = 0; i < a.length(); i++){
            if (a.a[i]==b.a[i]){
                continue;
            }else{
                return (int)a.a[i] - (int)b.a[i];
            }
        }
        return 0;
    }
    MyString substring (int start){
        char[] s = new char[length()-start];
        for(int i = start; i < length(); i++){
            s[i]=a[i];
        }
        MyString d = new MyString(s);
        return d;
    }
    MyString substring (int start, int end){
        char[] s = new char[end-start+1];
        for(int i = start; i <= end; i++){
            s[i]=a[i];
        }
        MyString d = new MyString(s);
        return d;
    }
    int indexOf (char ch){
        for(int i = 0; i < length(); i++){
            if(a[i]==ch){
                return i;
            }
        }
        return -1;
    }
    int lastIndexOf (char ch){
        for(int i = length()-1; i >= 0; i--){
            if(a[i]==ch){
                return i;
            }
        }
        return -1;
    }
    int indexOf ( char ch, int start ){
        for(int i = start; i < length(); i++){
            if(a[i]==ch){
                return i;
            }
        }
        return -1;
    }
    int lastIndexOf (char ch, int start){ 
        for(int i = length()-1; i >= start; i--){
            if(a[i]==ch){
                return i;
            }
        }
        return -1;
    }
    int indexOf ( MyString str){
        for(int i = 0; i < length(); i++){
            if(a[i]==str.a[0]){
                return i;
            }
        }
        return -1;
    }
    int lastIndexOf ( MyString str){
        for(int i = length()-1; i >= 0; i--){
            if(a[i]==str.a[0]){
                return i;
            }
        }
        return -1;
    }
    int indexOf (String str){
        MyString s = new MyString(str);
        for(int i = 0; i < length(); i++){
            if(a[i]==s.a[0]){
                return i;
            }
        }
        return -1;
    }
    int lastIndexOf (String str){
        MyString s = new MyString(str);
        for(int i = length()-1; i >= 0; i--){
            if(a[i]==s.a[0]){
                return i;
            }
        }
        return -1;
    }
    MyString concat (MyString str){
        char[] d = new char[a.length + str.a.length];
        System.arraycopy(a, 0, d, 0, a.length);
        System.arraycopy(str.a, 0, d, a.length, str.a.length);
        MyString w = new MyString(d);
        return w;
    }
    MyString concat (char[ ] charSeq){
        char[] d = new char[a.length + charSeq.length];
        System.arraycopy(a, 0, d, 0, a.length);
        System.arraycopy(charSeq, 0, d, a.length, charSeq.length);
        MyString w = new MyString(d);
        return w;
    }
    MyString concat (String str){
        MyString q = new MyString(str);
        char[] d = new char[a.length + q.a.length];
        System.arraycopy(a, 0, d, 0, a.length);
        System.arraycopy(q.a, 0, d, a.length, q.a.length);
        MyString w = new MyString(d);
        return w;
    }    
}