package base_07;

/**
 * 请定义一个交通工具(Vehicle)的类，其中有:
 * 属性：速度(speed)，车的类型(type)等等
 * 方法：移动(move())，设置速度(setSpeed(double s))，加速speedUp(double s),减速speedDown(double s)等等.
 * 最后在测试类Vehicle中的main()中实例化一个交通工具对象，
 * 并通过构造方法给它初始化speed,type的值，并且打印出来。另外，调用加速，减速的方法对速度进行改变。
 */
public class Vehicle {
    public double speed;
    public String type;

    // 移动方法
    public void move() {
        System.out.println(type + " 速度 " + speed + " 迈----");
    }

    // 设置速度方法
    public void setSpeed(double s) {
        speed = s;
    }

    // 加速
    public void speedUp(double num) {
        speed += num;
    }

    // 减速
    public void speedDown(double num) {
        if (speed >= num) {
            speed -= num;
        } else {
            speed = 0;
        }
    }

    public Vehicle() {
        speed = 70;
        type = "凯迪拉克";
        System.out.println(type + " 速度 " + speed + " 迈----");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();//创建对象
        v.move();
        v.setSpeed(80);// set速度为 80
        v.move();
        v.speedUp(50);//速度加50
        v.move();
    }
}