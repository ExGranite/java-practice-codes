public class BoroInt{
    public String val;
    public BoroInt(){
        val = "0";
    }
    public BoroInt(String v){
        for (int i = 0; i < v.length(); ++i) {
            if (!Character.isDigit(v.charAt(i))){
                System.out.println("BoroIntErModdheNumberCharaArKisuDeyaJaiNaException");
                break;
            }
        }
    }
    public BoroInt(int v){
        val = String.valueOf(v);
    }
    public BoroInt(BoroInt v){
        val = v.val;
    }
    public String trim(String val){
        return val.trim();
    }
    public boolean validValue(String val){
        for (int i = 0; i < val.length(); ++i) {
            if (!Character.isDigit(val.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public BoroInt add(BoroInt v){
        val = String.valueOf(Integer.parseInt(val) + Integer.parseInt(v.val));
        BoroInt temp = new BoroInt(this.val);
        return temp;
    }
    public BoroInt subtract(BoroInt v){
        val = String.valueOf(Integer.parseInt(val) - Integer.parseInt(v.val));
        BoroInt temp = new BoroInt(this.val);
        return temp;
    }
    public BoroInt multiply(BoroInt v){
        val = String.valueOf(Integer.parseInt(val) * Integer.parseInt(v.val));
        BoroInt temp = new BoroInt(this.val);
        return temp;
    }
    public BoroInt divide(BoroInt v){
        val = String.valueOf(Integer.parseInt(val) / Integer.parseInt(v.val));
        BoroInt temp = new BoroInt(this.val);
        return temp;
    }
}