package data;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
import hibernate.Hibernate;
import java.util.List;
import org.hibernate.Session;


public interface Crud<T>
{
    default boolean create(T obj)
    {
        Session sesion = null;
        boolean state = false;
        try
        {
            sesion = Hibernate.getSesion().openSession(); 
            sesion.beginTransaction();
            sesion.save(obj);
            sesion.getTransaction().commit();
            state = true;
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            sesion.getTransaction().rollback();
            state = false;
        } finally
        {
            if (sesion != null)
            {
                sesion.close();
            }
        }
        return state;
    }

    default boolean delete(T obj)
    {
        Session sesion = null;
        boolean state = false;
        try
        {
            sesion = Hibernate.getSesion().openSession();
            sesion.beginTransaction();
            sesion.delete(obj);
            sesion.getTransaction().commit();
            state = true;
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            sesion.getTransaction().rollback();
            state = false;
        } finally
        {
            if (sesion != null)
            {
                sesion.close();
            }
        }
        return state;
    }

    default boolean update(T obj)
    {
        Session sesion = null;
        boolean state = false;
        try
        {
            sesion = Hibernate.getSesion().openSession();
            sesion.beginTransaction();
            sesion.update(obj);
            sesion.getTransaction().commit();
            state = true;
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            sesion.getTransaction().rollback();
            state = false;
        } finally
        {
            if (sesion != null)
            {
                sesion.close();
            }
        }
        return state;
    }

    default List<T> read(String hql)
    {
        Session sesion = null;
        List<T> lista = null;
        try
        {
            sesion = Hibernate.getSesion().openSession(); 
            sesion.beginTransaction();
            lista = sesion.createQuery(hql).list();
            sesion.getTransaction().commit();
        } catch (Exception ex)
        {
            sesion.getTransaction().rollback();
        } finally
        {
            if (sesion != null)
            {
                sesion.close();
            }
            return lista;
        }
    }
}

