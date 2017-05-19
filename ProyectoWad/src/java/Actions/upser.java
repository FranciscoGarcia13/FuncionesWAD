package Actions;
import com.opensymphony.xwork2.ActionSupport;
import entity.NewHibernateUtil;
import entity.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class upser extends ActionSupport {
    
    private int id;
    private List result;

    public List getResult() {
        return result;
    }

    public void setResult(List result) {
        this.result = result;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public upser() {
    }
    
    public String execute() throws Exception {
        Session hibernateSession;

        hibernateSession = NewHibernateUtil.getSessionFactory().openSession(); 
        //Login user=(Login)hibernateSession.load(Login.class,id);
        //String nom = user.getUsername();
        //String pass = user.getPassword();

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query=session.createQuery("from Usuario where idUsr= :id");
        query.setParameter("id", id);
        result = query.list();
       // System.out.println("Su id es: " + user.getIdLogin() + " Y su nombre es: " + user.getUsername());
        
        return SUCCESS;
    }
    
}
