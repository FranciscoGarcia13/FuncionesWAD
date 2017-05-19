
package Actions;

import com.opensymphony.xwork2.ActionSupport;
import entity.Usuario;
import entity.NewHibernateUtil;
import org.hibernate.Session;

public class Actions extends ActionSupport {
    
    String nombre, pass, tipoUsr;
    Session hibernateSession;
    Usuario login;
    
    public String getPass() {
        return pass;
    }
    public void setPass(String password) {
        this.pass = password;
    }
    public String getNombre() {
        return nombre;
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
    
    @Override
    public String execute() throws Exception {
        
    hibernateSession=NewHibernateUtil.getSessionFactory().openSession(); 
    hibernateSession.beginTransaction();
    System.out.println("session get");
     
    if(nombre!=null && pass!=null &&(!nombre.equals(""))&&(!pass.equals(""))){
         login=(Usuario) hibernateSession.createQuery("from Usuario where nombre='"+nombre+"'AND password='"+pass+"'").uniqueResult();
    }
    else{
        addActionError("Registro no encontrado");
        return INPUT;
    }
    if(login!=null){
        addActionMessage("Welcome");
        tipoUsr = (String) hibernateSession.createQuery("select tipoUsr from Usuario where nombre='"+nombre+"' AND password='"+pass+"'").uniqueResult();
        //tipoUsr = "Administrador";
        switch (tipoUsr) {
            case "Administrador":
                return "administrador";
            case "Alumno":
                return "alumno";
            case "Profesor":
                return "profesor";
            default:
                break;
        }
        
    }
    
    addActionError("No Existe usuario");
    return INPUT;
    }
    
}