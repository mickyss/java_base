package base_List;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 现在有一个map集合如下：
 *
 * Map<Integer,String> map = new HashMap<Integer, String>();
 *         map.put(1, "张三丰");
 *         map.put(2, "周芷若");
 *         map.put(3, "汪峰");
 *         map.put(4, "灭绝师太");
 *
 * 要求：
 *
 * 1.遍历集合，并将序号与对应人名打印。
 *
 * 2.向该map集合中插入一个编码为5姓名为李晓红的信息
 *
 *        3.移除该map中的编号为1的信息
 *
 *        4.将map集合中编号为2的姓名信息修改为"周林"
 * @author yyuanchao
 * @description
 * @since 2020/4/29 0029
 */
public class Demo02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        // 键和值
        Integer key = null;
        String value = null;
        // 获取键值对的迭代器
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            key = (Integer) entry.getKey();
            value = (String) entry.getValue();
            System.out.println("key:" + key + "---" + "value:" + value);
        }
        map.put(5, "李晓红");
        map.put(2, "周林");
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            key = (Integer) entry.getKey();
            value = (String) entry.getValue();
            System.out.println("key:" + key + "---" + "value:" + value);
        }
    }
}
