package base_07;

/**
 * @Author yanyc
 * @Description //TODO $
 * @Date 2020/3/21  20:18
 **/
public class Test {

    public class SalesEmployee {
        double monthSalary;
        double rate;

        SalesEmployee() {

        }

//        public class HourlyEmployee extends ColaEmployee{
//            double hourSalary;
//            int hour;
//
//            HourlyEmployee(){
//
//            }
//
//            HourlyEmployee(String name,int year,int month,int day,double hourSalary,int hour){
//                super(name, year, month, day);
//                this.hourSalary =hourSalary;
//                this.hour = hour;
//            }
//            @Override
//            double getSalary(int month) {
//                double salary = 0;
//                if(hour<=160){
//                    salary = hour * hourSalary;
//                }else{
//                    salary = 160 * hourSalary + (hour - 160 )*hourSalary*1.5;
//                }
//
//                if(month == this.month){
//                    salary +=100;
//                }
//                return salary;
//            }
//
//        }
//
//        SalesEmployee(String name,int year,int month,int day,double monthSalary,double rate){
//            super(name, year, month, day);
//            this.monthSalary =monthSalary;
//            this.rate = rate;
//        }
//        @Override
//        double getSalary(int month) {
//            double salary=monthSalary * rate;
//            if(month == this.month){
//                salary +=100;
//            }
//            return salary;
//        }
//    }
//
//    public  class Company {
//
//        static void getSalary(int month,ColaEmployee c){
//            System.out.println(month+"月"+c.name+"的工资:"+c.getSalary(month));
//        }
//
//    }
//
//    public class TestCompany {
//
//        /**
//         * @param args
//         */
//        public static void main(String[] args) {
//            // TODO Auto-generated method stub
//            ColaEmployee[] a = new ColaEmployee[3];
//            a[0]=new SalariedEmployee("大川",1988,2,29,3500);
//            a[1]=new HourlyEmployee("海鸥",1988,2,29,20,200);
//            a[2]=new SalesEmployee("abc",1988,5,10,30000,0.1);
//            for(ColaEmployee c:a){
//                Company.getSalary(2, c);
//            }
//        }
//
//    }
    }
}
