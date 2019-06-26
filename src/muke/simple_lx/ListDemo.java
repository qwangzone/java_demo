package muke.simple_lx;

import java.util.Arrays;

/*演示数组的常用方法*/
public class ListDemo {
    public static void main(String[] args) {
        int[][] a = {{1,2},{2,3},{9,10}};
        // 遍历数组
        for(int k = 0; k<a.length; k++){
            for(int j=0;j<a[k].length;j++){
                System.out.print(a[k][j]+",");
            }
            System.out.println();

        }
        System.out.println("===============");
        //替换填充数组,FBI警告：会把数组中的所有元素替换，用于初始化数组
        int[] b = {1,2,3,4};
        Arrays.fill(b,12);
        for (int i: b
             ) {System.out.print(i+",");

        }
        System.out.println();
        System.out.println("===============");
        
        //替换制定范围的数组元素,如果填写的长度超过了数组的长度，会导致数组越界
        int[] c = {1,2,3,4};
        try {
            Arrays.fill(c,0,3,20);
        }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();

        }
        for (int i : c
             ) {System.out.print(i+",");

        }
        System.out.println();
        System.out.println("===============");

        //数组排序
        int[] d = {12,7,29,1,4,90};
       // Arrays.sort(d);
        //排序指定的部分数组
        Arrays.sort(d,0,4);
        for (int i : d
        ) {System.out.print(i+",");

        }
        System.out.println();
        System.out.println("===============");

        //复制数组
        int[] e = {1,2,3,4};
        int[] f = Arrays.copyOf(e,10);
        for (int i : f
        ) {System.out.print(i+",");

        }
        System.out.println();
        System.out.println("===============");
        //数组查询,获取某个值的索引,若是查询到则返回对应索引，查询不到则返回被查询到元素在数组中排序的索引+1
        int[] a1={1,20,30,40,50};
        Arrays.sort(a1);
        System.out.println(Arrays.binarySearch(a1,0,3,87));
        System.out.println("===============");
    }
    }


