package base_List;

import java.util.*;

/**
 * 定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 * @author yyuanchao
 * @description
 * @since 2020/4/29 0029
 */
public class Demo03 {
    public static void main(String[] args) {
        //定义一个String类型的List集合,用来存储题目给定的字符串
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        //将集合中的两个元素进行拼接,调用method1(String str) 进行统计,筛选.
        String str = list.get(0)+list.get(1);
        method1(str);
    }
    private static void method1(String str) {

        HashMap hashMap = new HashMap();

        //把str分成数组
        char[] strArray = str.toCharArray();



//        //1. 创建Map集合,key是字符串中的字符,value是字符的个数
//        //由于HashMap具有筛选功能,可以帮助我们对字符进行统计.
//        HashMap<Character,Integer> map = new HashMap<>();
//        //2.将形式参数传递过来的字符串使用toCharArray()的方法转换成Char类型的字符数组.c用来遍历获取字符数组中的每一个值.
//        for(char c :str.toCharArray()){
//            //对于字符串"abcbcd"为例,char c =a; map.containKey(a)为false,执行:号后的1
//            //map.put(a,1); 这样就将a字符与对应的数量添加到了map集合中.
//            map.put(c,map.containsKey(c)?map.get(c)+1:1);
//        }
//        //获取最后一个key
//        Set<Character> chrs = map.keySet();
//        List list = new ArrayList(chrs);
//        char lastKey = (char)(list.get(list.size()-1));
//        //char lastKey =  (char)list.lastIndexOf("d");
//        //   System.out.println(lastKey);
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){
//            char key = entry.getKey();
//            int value = entry.getValue();
//            //如果是最后一个key直接打印key与value结束.
//            if (key == lastKey)
//            {
//                System.out.println(key+"="+value);
//                break;
//            }
//            //如果不是最后一个,打印 key与value和一个逗号分隔
//            System.out.print(key+"="+value+",");
//
//        }

    }
}
