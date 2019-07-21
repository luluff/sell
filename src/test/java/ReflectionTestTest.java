import com.lulu.dataobject.ProductInfo;
import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class ReflectionTestTest
{
    @Test
    public void testClass() {
        ProductInfo info=new ProductInfo();
        info.setProductStatus(1);
        info.setCategoryType(2);
        info.setProductName("lulu");
        Class t=ProductInfo.class;
        Field field=null;
        Integer test;

        try
        {
            field = ProductInfo.class.getDeclaredField("productStatus");
        } catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
        field.setAccessible(true);
            Class u=field.getType();
            System.out.println(u.getTypeName());


    }
}