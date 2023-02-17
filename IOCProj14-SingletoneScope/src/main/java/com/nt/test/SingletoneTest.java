package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.ston.Printer;

/**
 * Hello world!
 *
 */
public class SingletoneTest 
{
    public static void main( String[] args )
    {
      
       
       
       
       System.out.println("SetterInjectionTestApp.main()-------------Start of main() method");
       FileSystemResource res= new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
       
       //create IOC container
       XmlBeanFactory factory = new XmlBeanFactory(res);
       
       //call the bean 
       Printer p1 = factory.getBean("p1" , Printer.class);
       Printer p2 =  factory.getBean("p1" , Printer.class);
       
       System.out.println(p1.hashCode()+"  " +p2.hashCode());
       System.out.println("p1==p2 ::" +(p1==p2));
       
       
       System.out.println(p1.hashCode()+ " " +p2.hashCode());
       System.out.println(p1.hashCode()==p2.hashCode());
       
       //invoke the b.method
       //String msg = generator.generateMessage("Raja");
       
       //System.out.println("Wish Message::" +msg);
      // System.out.println("SetterInjectionTestApp.main()-------------end of main() method");
    }
}
