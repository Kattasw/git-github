package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import Bean.Test;

public class Client {
	public static void main(String args[]){
		//find xml
		Resource r = new ClassPathResource("resorces/spring.xml");
		//load xml into container
		BeanFactory factory = new XmlBeanFactory(r);
		//create test class object
		Object o1 = factory.getBean("t");
		Object o2 = factory.getBean("t");
		Object o3 = factory.getBean("t");
		Object o4 = factory.getBean("t");
		System.out.println(o1==o2);
		System.out.println(o3==o4);
		
		Test t = (Test)o1;
		t.hello();
	}

}
