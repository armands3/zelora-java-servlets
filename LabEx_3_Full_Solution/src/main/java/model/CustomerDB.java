package model;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CustomerDB {

    public static List<Customer> getAllCustomers() {
        EntityManager em = DBUtil.getEMF().createEntityManager();

        String query = "SELECT a from Customer a";

        TypedQuery<Customer> tq = em.createQuery(query, Customer.class);

        List<Customer> list = null;

        try {
            list = tq.getResultList();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
        return list;
    }

    public static Customer getCustomerByID(int customer_id) {
        EntityManager em = DBUtil.getEMF().createEntityManager();

        Customer Customer = null;
        try {
            Customer = em.find(Customer.class, customer_id);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }

        return Customer;
    }
        }
