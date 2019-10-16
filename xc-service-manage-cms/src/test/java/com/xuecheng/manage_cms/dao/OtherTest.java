package com.xuecheng.manage_cms.dao;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bigStone
 * @date 2019/9/20 10:34
 */
public class OtherTest {

    @Test
    public void test01() throws Exception{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse("1949-10-01");
        String toString = parse.toString();
        System.out.println("===========");
        System.out.println(parse);
    }


}
