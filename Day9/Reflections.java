package Day9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflections {

    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException, InstantiationException {
        Class c = Class.forName("Day9.Book");
        System.out.println(c.getName());

        Book b = new Book();
        c = b.getClass();
        System.out.println(c.getName());

        Field[] fields = c.getDeclaredFields();
        for (Field field : fields)
        {
            System.out.println(field.getName());
            System.out.println(field.getGenericType());
            if (field.getName().equals("isbn")){
                field.setAccessible(true);
                field.set(b, 155654);
                System.out.println(b);
            }
        }


        Constructor<Book> [] cons = c.getDeclaredConstructors();
        for (Constructor<Book> con : cons)
        {
            System.out.println(con.getParameterCount());
            if (con.getParameterCount()==2)
            {
                Book bb = con.newInstance(56546216, "YGFghsva");
                System.out.println(bb);
            }
        }

        Method [] methods = c.getDeclaredMethods();
        for (Method method : methods)
        {
            System.out.println(method.getName());
            System.out.println(method.getParameterCount());
            if (method.getName().equals("simplePrivateMethod"))
            {
                method.setAccessible(true);
                method.invoke(b);
            }
            if (method.getName().equals("simpleStaticMethod"))
            {
                method.setAccessible(true);
                method.invoke(null);
            }
        }

        methods = c.getDeclaredMethods();
        for (Method method : methods){
            if (method.getAnnotation(MyAnno.class)!=null){
                MyAnno anno = method.getDeclaredAnnotation(MyAnno.class);
                if (anno.priority() == 1) {
                    method.invoke(b);
                }
            }
        }
    }
}
