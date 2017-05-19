package Actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entity.NewHibernateUtil;
import entity.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddAction extends ActionSupport 
{
private List result;

    public List getResult() {
        return result;
    }

    public void setResult(List result) {
        this.result = result;
    }
    /////////////////////////////////
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    ////////////////////////////////
     private Integer idUsr;
     private String nombre;
     private String tipoUsr;
     private String correo;
     private String password;
    
     Session hibernateSession;
     
    public Integer getIdUsr() {
        return this.idUsr;
    }
    
    public void setIdUsr(Integer idUsr) {
        this.idUsr = idUsr;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoUsr() {
        return this.tipoUsr;
    }
    
    public void setTipoUsr(String tipoUsr) {
        this.tipoUsr = tipoUsr;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    

    public Session getHibernateSession() {
        return hibernateSession;
    }

    public void setHibernateSession(Session hibernateSession) {
        this.hibernateSession = hibernateSession;
    }

@Override
    public String execute() throws Exception 
    {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query=session.createQuery("from Usuario");
        //Query query=session.createQuery("from Usuario where idUsr= :id");
        //query.setParameter("id", 2);
        result = query.list();
        session.close();
        return SUCCESS;
    }
    
  
    public String borrar() throws Exception 
    {
       /* Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t=session.beginTransaction();
        Query query = session.createQuery("delete Usuario where idUsr = :id");
        query.setParameter("id", 10);
        query.executeUpdate();
        t.commit();*/
        //session.close();
        
        //Session hibernateSession;
        hibernateSession=NewHibernateUtil.getSessionFactory().openSession(); 
        Transaction t=hibernateSession.beginTransaction(); 
        Usuario user=(Usuario)hibernateSession.load(Usuario.class,id);
        hibernateSession.delete(user);
        t.commit(); 
 
        return SUCCESS;
    }
    
    public String insetar() throws Exception 
    {
        
         hibernateSession=NewHibernateUtil.getSessionFactory().openSession(); 

         Transaction t0=hibernateSession.beginTransaction();
         Usuario user0 = new Usuario();
         //user0.setIdUsr(idUsr);
         user0.setNombre(nombre);
         user0.setPassword(password);
         user0.setCorreo(correo);
         user0.setTipoUsr(tipoUsr);
         hibernateSession.save(user0);
         t0.commit();
         
         return SUCCESS;
        }
    
}



