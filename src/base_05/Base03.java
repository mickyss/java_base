package base_05;

/**
 *
 * 对数组的数据从大到小排序
 *
 *   int[] array = {100,200,30,300,40,200,500,50,38};
 *
 *   要求 排序后的就结果还在array中存储
 *
 * 打印排序结果
 * @author yyuanchao
 * @description
 * @since 2020/3/9 0009
 */
public class Base03 {
    public static void main(String[] args) {
        int[] ary = {100,200,30,300,40,200,500,50,38};
        sort(ary);
        System.out.println("After sort, array item is: ");
        for(int i = 0; i < ary.length; i++){
            System.out.print(ary[i] + " ");
        }
    }
    /**
     * 定义sort方法
     * @param ary
     */
    private static void sort(int[] ary) {
        for(int i = 0; i < ary.length - 1; i++){
            for(int j = i + 1; j < ary.length; j++){
                //交换
                if(ary[j] > ary[i]){
                    int temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
            }
        }
    }
}
