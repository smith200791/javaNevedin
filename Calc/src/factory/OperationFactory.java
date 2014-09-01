package factory;

import intf.Operation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OperationFactory {
	@SuppressWarnings("resource")
	public Operation createOperation(String code,Integer integer,Integer integer2) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
		//���������� Spring ��� ����� ���� ������������
        return (Operation)ac.getBean(code);
	}
}
