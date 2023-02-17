package com.nit.test;

import java.nio.file.FileSystemAlreadyExistsException;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.bean.WishMessageGenerator;

public class SetterInjectionTestApp 
{
    public static void main( String[] args )
    {
    	System.out.println("SetterInjectionTestApp.main()-------------Start of main() method");
       FileSystemResource res= new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml");
       
       //create IOC container
       XmlBeanFactory factory = new XmlBeanFactory(res);
       
       //call the bean 
       WishMessageGenerator bean = factory.getBean("wmg" , WishMessageGenerator.class);
       WishMessageGenerator bean2 = factory.getBean("wmg",WishMessageGenerator.class);
       
      // WishMessageGenerator generator = (WishMessageGenerator) bean;
       
       System.out.println(bean.hashCode()+ " " +bean2.hashCode());
       System.out.println(bean.hashCode()==bean2.hashCode());
       
       //invoke the b.method
       //String msg = generator.generateMessage("Raja");
       
       //System.out.println("Wish Message::" +msg);
      // System.out.println("SetterInjectionTestApp.main()-------------end of main() method");
    }
}
