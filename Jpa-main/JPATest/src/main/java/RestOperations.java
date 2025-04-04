import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

public class RestOperations {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=factory.createEntityManager();
		Query query=(Query)entityManager.createQuery("from Employee");
		List<Employee> list = query.list();
		for(Employee e:list) {
			System.out.println(e.getName());//display data
		}
	//	entityManager.getTransaction().begin();
	
		
		//delete
	//	Employee employee=entityManager.find(Employee.class, 10);
	//	entityManager.remove(employee);
	//	entityManager.getTransaction().commit();
	//	entityManager.close();
	//	factory.close();

	}

}
