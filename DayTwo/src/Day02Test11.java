import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Day02Test11 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("b","bao");
        map.put("m","ma");
        map.put("y","ying");
        String str = (String) map.get("m");
        System.out.println(str);
        //迭代，map元素
        //获取key的值
        Set set = map.keySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            String name = (String) map.get(key);
            System.out.println(key+":"+name);
        }


    }
}
