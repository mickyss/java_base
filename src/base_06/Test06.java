package base_06;

/**
 * @Author yanyc
 * @Description //TODO $
 * @Date 2020/3/18  20:57
 **/
public class Test06 {

    public static void main(String[] args) {
        Apple apple1 = new Apple(16.6);
        apple1.setName("红富士");
//        apple1.setPrice(10.5);
        System.out.println("苹果名称:" + apple1.getName());
        System.out.println("苹果价格:" + apple1.getPrice());

        Apple apple2 = new Apple();
        apple2.setName("陕西沁心苹果");
        apple2.setPrice(12.5);
        System.out.println("苹果名称:" + apple2.getName());
        System.out.println("苹果价格:" + apple2.getPrice());
    }
}
