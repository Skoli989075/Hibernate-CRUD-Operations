package Test.HibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import in.entities.User;

public class App 
{
    public static void main(String[] args)
    {
       // User user1 = new User();
        
      //  user1.setName("sachin");
       // user1.setEmail("skoli9571@gmail.com");
       // user1.setPassword("sachin123");
       // user1.setGender("male");
        //user1.setCity("jalgaon");
        
        User user2 = new User();
        
        user2.setName("mahesh");
        user2.setEmail("mahesh6567@mail.com");
        user2.setPassword("mahesh123");
        user2.setGender("male");
       user2.setCity("pune");


        Configuration cfg = new Configuration();
        cfg.configure();   // 👈 MOST IMPORTANT FIX

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        //-----insert operation--------

        try 
        {
            session.save(user2);
           transaction.commit();
           System.out.println("Data Inserted Successfully ");
        }
        catch (Exception e) 
        {
            transaction.rollback();
            e.printStackTrace();
        }
        
        //--------select operation------
        
      //  try
       // {
        	//User user=session.get(User.class,4);
        	
        // if(user!=null)
        // {
        	//System.out.println(user.getId());
        	//System.out.println(user.getName());
        	//System.out.println(user.getEmail());
        	//System.out.println(user.getPassword());
        	//System.out.println(user.getGender());
        	//System.out.println(user.getCity());
        	
       // }
        // else
        // {
        //	 System.out.println("user not found");
        // }
      // }
       // catch(Exception es)
       // {
        	//es.printStackTrace();
       // }
        
        //-----update operation-------
        
       // try
       // {
        	   
             //  User user=session.get(User.class, 2);
              // user.setName("bhushan");
             //  session.saveOrUpdate(user);
              // transaction.commit();
               
              // System.out.println("Data update Successfully ");
         //  } 
       // catch (Exception e)
       // {
              // transaction.rollback();
               //e.printStackTrace();
       // } 
        
        //------- Delete operation----------
        
     //   try
       // {
        	   
            //   User user=new User();
              // user.setId(2);
              // session.delete(user);
              // transaction.commit();
               
               //System.out.println("user deleted Successfully");
         // } 
        //catch (Exception e)
       // {
               //transaction.rollback();
             //  e.printStackTrace();
       // } 
    
    }
}
