/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.List;
import modelo.Alumno;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManager {

    private static final SessionFactory sessionFactory = buildSessionFactory();
    private Session session;

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }

    public Session conectar() {
        // Abro la conexion
        session = HibernateManager.getSessionFactory().openSession();
        return session;
    }

    public Object consultar(Class clase, int id) {
        session.beginTransaction();
        Object objeto = session.get(clase, id);
        session.getTransaction().commit();
        return objeto;
    }

    public List consultar(Class clase) {
        session.beginTransaction();
        Criteria crit = session.createCriteria(clase);
        crit.setMaxResults(1000);
        List objetos = crit.list();
        session.getTransaction().commit();
        return objetos;
    }

    public void guardar(Object unObjeto) {
        session.beginTransaction();
        session.save(unObjeto);
        session.getTransaction().commit();
    }

    public void borrar(Object unObjeto) {
        session.beginTransaction();
        session.delete(unObjeto);
        session.getTransaction().commit();
    }

    void desconectar() {
        HibernateManager.shutdown(); // Cierro la conexion
    }
}
