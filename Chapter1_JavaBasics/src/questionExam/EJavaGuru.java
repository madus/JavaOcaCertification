package questionExam;

/**
 * Created by Alexandra on 5/30/2022.
 */
public class EJavaGuru {

    static public void main   (String[] array) {
        System.out.println("EJavaGuru");

        Course c = new Course();
        c.courseName = "Java";

        System.out.println(c.courseName);
    }


}
 class Course{

     String courseName;

 }