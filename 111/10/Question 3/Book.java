public class Book{
    private String name;
    private double price;
    private int qty;
    private Author author;
    String getName(){
        return name;
    }
    String getAuthor(){
     return author.toString();
    }
    double getPrice(){
        return price;
    }
    void setPrice(double p){
        price = p;
    }
    int getQty(){
        return qty;
    }
    void setQty(int q){
        qty = q;
    }
    public String toString(){
        return "'"+name+"' by "+ author.toString();
    }
}