package Test2_13;
/*一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖，
打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）

```
888元的奖金被抽出
588元的奖金被抽出
10000元的奖金被抽出
1000元的奖金被抽出
2元的奖金被抽出
```
### 训练提示

1. 奖项要随机出现，但奖金不是连续的数字，不能被随机产生。能随机产生的只有数组的索引了，
可以使用随机索引来代表随机元素。因为索引和元素是一一对应的，
2. 哪些奖被抽过了，哪些奖没有被抽过，要定义一个数组来存放已经被抽过的奖项。
3. 每个奖项只能被抽出一次，要写一个方法来控制奖项不重复。*/
import java.util.Random;
public class Test08 {
    public static void main(String[] args) {
        getLuck();
    }

    public static void getLuck() {
        int[] arr = {2,588,888,1000,10000};
        int i=0;
        Random r = new Random();
        int[] checkedValue = new int[arr.length];
        while(true){
            int index = r.nextInt(5);
            boolean isHas = false;
            for(int j=0;j<checkedValue.length;j++){
                if(checkedValue[j]==arr[index]){
                    isHas = true;
                }
            }
            if(!isHas){
                checkedValue[i] = arr[index];
                i++;
            }
            if(i>checkedValue.length-1){
                break;
            }
        }
        for(int x=0;x<checkedValue.length;x++){
            System.out.println(checkedValue[x]+"元的奖金被抽出");
        }
    }
}
