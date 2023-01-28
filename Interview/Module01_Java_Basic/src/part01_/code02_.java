package part01_;

/**
 * @Author: ajie
 * @Date: 2023/1/28
 * @Description: 探究引用传递
 */
public class code02_ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        change(arr);
        //会将数组中的元素改变
        System.out.println(arr[0]);
    }

    public static void change(int[] array) {
        // 将数组的第⼀个元素变为0
        array[0] = 0;
    }
}
