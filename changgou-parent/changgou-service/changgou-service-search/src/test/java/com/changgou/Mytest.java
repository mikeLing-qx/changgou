package com.changgou;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: QIXIANG LING
 * @date: 2020/7/20 11:04
 */
public class Mytest {

    @Test
    public void testDemo(){
            Map<String,String> map = new HashMap<String, String>();

            map.put("xiaocui1","gongchen");
            map.put("xiaocui2","daima");
            map.put("xiaocui3","xuexi");
            map.put("xiaocui4","dagong");

            System.out.println(map.keySet());

            System.out.println("-----分割线-----");
            for(String map1 : map.keySet()){
                String string = map.keySet().toString();
                System.out.println(string);
        }
    }


    @Test
    public void testStr() {
        String str = "[磐] xdm有挂[223P] | 177";
        String[] strList = str.split(" ");
        // 作者名
        String authorName = strList[0].replace("[", "").replace("]", "");

        // 文章名
        String[] aritcleStrings = strList[1].split("\\[");
        String aricleName = aritcleStrings[0];

        // 页数
        Integer totalPic = Integer.valueOf(aritcleStrings[1].replace("P]", ""));

    }
}
