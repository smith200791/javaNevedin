import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
	
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		calculate.ssumm(2, 2);
		calculate.viewLastResult("console");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});//показываем Spring где лежит файл конфигурации
        //Также вместо ClassPathXmlApplicationContext можно использовать FileSystemXmlApplicationContext, который используется абсолютно также с той разнице, что путь к config.xml нужно будет указывать полностью. 
        
//        Hello h = (Hello) ac.getBean("hello");//указываем id нашего bean-а
//        h.sayHi();

	}

	
}
