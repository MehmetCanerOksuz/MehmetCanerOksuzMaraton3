package com.caneroksuz.repository;

import com.caneroksuz.repository.entity.Arac;
import com.caneroksuz.repository.entity.Kiralama;
import com.caneroksuz.repository.entity.Kisi;
import com.caneroksuz.untity.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import java.util.List;

public class KiralamaRepository {


    public List<Arac> kiralananAraclarByKisiId(Long id){
        String hql="SELECT k.arac FROM Kiralama k where k.kisi.id=:id";
        Session session = HibernateUtil.getSessionFactory().openSession();
        TypedQuery<Arac> typedQuery =session.createQuery(hql, Arac.class);
        typedQuery.setParameter("id",id);
        return typedQuery.getResultList();
    }


    public Kiralama kiralamaOlustur(Kiralama kiralama) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(kiralama);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return kiralama;
    }
}
