package JavaCollections.AnnotationThree;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        Class classObject1 = Class.forName(scanner.next());
        Class classObject2 = Class.forName(scanner.next());
        String methodNam = scanner.next();

        Method m = classObject1.getMethod(methodNam, classObject2);
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        m.invoke(o1, o2);

        System.out.println(o1);
//        Person person = new Person();
//
//        Class personClass = Person.class; //Класс персон - берем как объект класса класс и работаем как с обычным объектом
//        Class personClass2 = person.getClass();
        //Class personClass3 = Class.forName("AnnotationThree.Person");

//        Method[] methods = personClass.getMethods();
//        for (Method m : methods) {
//            System.out.println(m.getName() + ", "
//                    + m.getReturnType() + ", " +
//                    Arrays.toString(m.getParameterTypes()));
//        }

//        Field[] fields = personClass.getDeclaredFields();
//        for (Field f : fields) {
//            System.out.println(f.getName() + ", "
//                    + f.getType());
//        }

//        Annotation[] annotations = personClass.getAnnotations();
//        for (Annotation a : annotations) {
//            if (a instanceof Author) {
//                System.out.println("Yes");
//            }
//
//        }
    }
}
