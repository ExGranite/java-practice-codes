public class Trim{
    public static char [] trim(char [] input){
        String a = "";
        for (int i = 0; i < input.length; ++i){
            if(input[i]!=' '){
                a += input[i];
            }else{
                a += " ";
                for (int j = i+1; j < input.length; ++j){
                    if(input[j] == ' '){
                        continue;
                    }else{
                        i = j-1;
                        break;
                    }
                }
            }
        }
        char[] b = new char[a.length()];
        for (int i = 0; i < a.length(); ++i){
            b[i] = a.charAt(i);
        }
        return b;
    }
    public static void main(String [] args){
        char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
        for (int i = 0; i< input.length; i++){
            System.out.print(input[i]);
        }
        System.out.println("");
        char []  output = trim(input);
        for (int i = 0; i< output.length; i++){
            System.out.print(output[i]);
        }
        System.out.println("");    
    }
}
