package org.zgis.common.util.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.zgis.common.util.StrUtil;

import mockit.Mock;
import mockit.MockUp;

public class StrUtilTest {

    @Test
    public void testAdd() {
        new MockUp<StrUtil>() {
           @Mock
           public int add(int a,int b) {
               return a+a;
           } 
        };
        assertEquals(2, new StrUtil().add(1, 3));
    }
}
