package com.two95.mvn.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Creates a session factory instance and stores employee values to database
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     // Call the save() method to insert a record in database.
        System.out.println("******* WRITE *******");
        Employee empl = new Employee("Saba", "Rish", new Date(System.currentTimeMillis()), "1233442");
        empl = save(empl);
        Employee readEmpl = read(empl.getId());
        System.out.println(readEmpl);
        
    }
    
    private static Employee save(Employee employee) {
    	SessionFactory sf = HibernateUtil.getSessionFactory();
    	Session session = sf.openSession();
    	session.beginTransaction();

    	Long id = (Long) session.save(employee);
    	employee.setId(id);
    		
    	session.getTransaction().commit();
    		
    	session.close();

    	return employee;
    }
    
    private static List list() {
    	SessionFactory sf = HibernateUtil.getSessionFactory();
    	Session session = sf.openSession();

    	List employees = session.createQuery("from Employee").list();
    	session.close();
    	return employees;
    }
    private static Employee read(Long id) {
    	SessionFactory sf = HibernateUtil.getSessionFactory();
    	Session session = sf.openSession();

    	Employee employee = (Employee) session.get(Employee.class, id);
    	session.close();
    	return employee;
    }

}
