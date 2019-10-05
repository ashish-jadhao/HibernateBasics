package com.ashish.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        Alien ashish = new Alien();
/*        ashish.setAid(05);
        ashish.setaName("Manav");
        ashish.setColor("Yellow");
        */
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
       // ServiceRegistry reg = new serviceregistrybui
        
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        //session.save(ashish);
        
        ashish = (Alien)(session.get(Alien.class, 1));
        tx.commit();
        
        System.out.println(ashish);
    }
    
}
