package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class tvuser {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("appilcationcontext.xml");
		TV tv= (TV)factory.getBean("tv");
		tv.poweron();
		tv.pweroff();
		tv.volumedown();
		tv.volumeup();
		factory.close();
	}
}
