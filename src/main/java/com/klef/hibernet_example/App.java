package com.klef.hibernet_example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
         
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();  
        Transaction t;
        Employee e=new Employee();
        e.setFn("viswa");
        e.setLn("kishore");
        session.save(e);
        t=session.beginTransaction();
        t.commit();
        System.out.println("Employee Data inserted successfully");
        PermenantEmployee p1=new PermenantEmployee();
        p1.setFn("ramu");
        p1.setLn("raghava");
        p1.setSalary(100000);
        p1.setYear(2);
        session.save(p1);
        t=session.beginTransaction();
        t.commit();
        System.out.println("permenant Employee data inserted successfully");
        
        Contract_Employee c1= new Contract_Employee();
        c1.setFn("ram");
        c1.setLn("lakshamn");
        session.save(c1);
        t=session.beginTransaction();
        t.commit();
        System.out.println("contract employee data insetted successfully");
        
        
//        //data reterving
//        Employee e1=session.find(Employee.class, 1);
//        System.out.println("data reterived successfully");
//        
//        //update
//        e1.setFn("sai");
//        e1.setLn("veera");
//        session.update(e1);
//        t=session.beginTransaction();
//        t.commit();
//        System.out.println("data updated successfully");
//        
//        //delete
//        
//         session.delete(e);
         System.out.println("data deleted");
    }
}
