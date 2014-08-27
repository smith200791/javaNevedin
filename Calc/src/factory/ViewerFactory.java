package factory;

import intf.Viewer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
@SuppressWarnings("resource")
public class ViewerFactory {
	public Viewer createView(String code) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});//���������� Spring ��� ����� ���� ������������
        return (Viewer)ac.getBean(code);
	}
}
