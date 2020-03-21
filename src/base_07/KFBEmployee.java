package base_07;

/**
 * @Author yanyc
 * @Description //TODO $
 * @Date 2020/3/21  20:18
 **/
public abstract class KFBEmployee {

    String name;
    int year;
    int month;
    int day;
    KFBEmployee(){

    }
    KFBEmployee(String name,int year,int month,int day){
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    abstract double getSalary(int month);
}
