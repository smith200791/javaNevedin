import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
	
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		calculate.ssumm(2, 2);
		calculate.viewLastResult("console");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});//���������� Spring ��� ����� ���� ������������
        //����� ������ ClassPathXmlApplicationContext ����� ������������ FileSystemXmlApplicationContext, ������� ������������ ��������� ����� � ��� �������, ��� ���� � config.xml ����� ����� ��������� ���������. 
        
//        Hello h = (Hello) ac.getBean("hello");//��������� id ������ bean-�
//        h.sayHi();

	}

	
}
