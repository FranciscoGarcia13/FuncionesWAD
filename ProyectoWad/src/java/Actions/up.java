
package Actions;

import com.opensymphony.xwork2.ActionSupport;
import entity.NewHibernateUtil;
import entity.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class up extends ActionSupport {
    
    private int idUsr;
    private String nombre; 
    private String password;   
    private String correo;
    private String tipoUsr;
    

    public int getIdUsr() {
        return idUsr;
    }

    public void setIdUsr(int idUsr) {
        this.idUsr = idUsr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoUsr() {
        return tipoUsr;
    }

    public void setTipoUsr(String tipoUsr) {
        this.tipoUsr = tipoUsr;
    }
    
    
    public up() {
    }
    
    public String execute() throws Exception {
        
        System.out.print("El id es: " + idUsr + " El nombre es: " + nombre + " El passwrd es: " + password);
        
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Query query = session.createQuery("update Usuario set nombre = :usr, tipoUsr = :tusr, password = :pass, correo = :mail where idUsr = :id");
        query.setParameter("usr", nombre);
        query.setParameter("pass", password);
        query.setParameter("mail", correo);
        query.setParameter("tusr", tipoUsr);
        query.setParameter("id", idUsr);
        query.executeUpdate();
        t.commit();
        session.close();
  
        return SUCCESS;
    }
    
}
