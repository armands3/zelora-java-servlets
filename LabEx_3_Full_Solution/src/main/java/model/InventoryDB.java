package model;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class InventoryDB {

    public static List<Inventory> getAllInventory() {
        EntityManager em = DBUtil.getEMF().createEntityManager();

        String query = "SELECT a from Inventory a";

        TypedQuery<Inventory> tq = em.createQuery(query, Inventory.class);

        List<Inventory> list = null;

        try {
            list = tq.getResultList();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
        return list;
    }

    public static Inventory getInventoryByID(int inventoryID) {
        EntityManager em = DBUtil.getEMF().createEntityManager();

        Inventory inventory = null;
        try {
            inventory = em.find(Inventory.class, inventoryID);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }

        return inventory;
    }
}
