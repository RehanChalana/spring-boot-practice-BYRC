import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        // Parrot p = context.getBean("parrot3",Parrot.class);
        System.out.println(p.getName());

        Parrot q = context.getBean("miki",Parrot.class);
        System.out.println(q.getName());
        String s = context.getBean(String.class);
        
        System.out.println(s);
    }
}
