package base_06;

/**
 * 苹果类
 * @Author yanyc
 * @Description //TODO $
 * @Date 2020/3/18  20:55
 **/
public class Apple {

    public Apple(){

    }

    public Apple(double price){
        this.price = price;
    }

    private String name = "苹果苹果";

    private double price;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
