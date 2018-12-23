
package com.cn.maven01.model;
import org.junit.*;
import org.junit.Assert.*;
public class HelloWordTest{
  @Test 
  public void testHello(){
    Assert.assertEquals("HelloWord!",new HelloWord().sayHello());}
}
