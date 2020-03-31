package JavaCollections.AnnotationThree;

import java.lang.annotation.Annotation;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClass = Person.class; //Класс персон - берем как объект класса класс и работаем как с обычным объектом
        Class personClass2 = person.getClass();
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

        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation a : annotations) {
            if (a instanceof Author) {
                System.out.println("Yes");
            }

        }
    }
}
