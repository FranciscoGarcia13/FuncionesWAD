package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Alumno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Alumno</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilo.css\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div id=\"icons\">\t\r\n");
      out.write("                <div id=\"IPN\" class=\"logo\"> <img src=\"images/ipnLogo.png\"> </div>\r\n");
      out.write("                <div id=\"Escom\" class=\"logo\">  <img src=\"images/escomLogo.png\">  </div> \r\n");
      out.write("                <h1> Generador de Funciones </h1>\r\n");
      out.write("                <h2> Web Aplication Development </h2> \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        <h1> Bienvendo Alumno </h1>\r\n");
      out.write("        <div>\r\n");
      out.write("            <a href=\"login.jsp\" > Cerrar Sesion </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Generador de funciones -->\r\n");
      out.write("        ");

            String numS1 ;
            String numS2 ;
            String numS3 ;
            String dato =" ";
            // optenemos los operadores 
            String ope1 ;
            String ope2 ;
            String ope3 ;
            //valor del value
            int valor1=0;
            int valor2=0;
            int valor3=0;
            String operador1="";
            String operador2="";
            String operador3="";
            
        
      out.write("\r\n");
      out.write("        <div id=\"generador\">\r\n");
      out.write("            <div id=\"funcion\">\r\n");
      out.write("                ");

                    if(request.getParameter("cal")!= null){
                        // optenemos los valores numericos 
                        numS1 =request.getParameter("num1");
                        numS2 =request.getParameter("num2");
                        numS3 =request.getParameter("num3");
                       // optenemos los operadores 
                        ope1 = request.getParameter("op1");
                        ope2 = request.getParameter("op2");
                        ope3 = request.getParameter("op3");
                        
                        dato =" f(x)= X"+ope1+numS1+" "+ope2+numS2+" "+ope3+numS3+" ";
                        
                        valor1=Integer.parseInt(request.getParameter("num1"));
                        valor2=Integer.parseInt(request.getParameter("num2"));
                        valor3=Integer.parseInt(request.getParameter("num3"));
                        
                        operador1=request.getParameter("op1");
                        
                   // convertimos a entero 
                  /*  int numero1 = Integer.parseInt(numS1);
                    int numero2 = Integer.parseInt(numS2);
                    int numero3 = Integer.parseInt(numS3);*/
                        }
                
      out.write("\r\n");
      out.write("                <form action=\"Alumno.jsp\" method=\"post\">\r\n");
      out.write("                    <label>Evaluar : </label>\r\n");
      out.write("                    <input id=\"evaluar\" name=\"evaluar\">\r\n");
      out.write("\r\n");
      out.write("                    <label> Y = </label>\r\n");
      out.write("                    <select class=\"operador\" id=\"op1\" name=\"op1\" >\r\n");
      out.write("                        <option> ");
      out.print( operador1 );
      out.write(" </option>\r\n");
      out.write("                        <option> + </option>\r\n");
      out.write("                        <option> - </option>\r\n");
      out.write("                        <option> * </option>\r\n");
      out.write("                        <option> / </option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <input class=\"numero\" id=\"num1\" name=\"num1\" type=\"number\" min=\"1\" max=\"99\" value=");
      out.print( valor1 );
      out.write(">\r\n");
      out.write("\r\n");
      out.write("                    <select class=\"operador\" id=\"op2\" name=\"op2\">\r\n");
      out.write("                        <option> ");
      out.print( operador2 );
      out.write(" </option>\r\n");
      out.write("                        <option> + </option>\r\n");
      out.write("                        <option> - </option>\r\n");
      out.write("                        <option> * </option>\r\n");
      out.write("                        <option> / </option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <input class=\"numero\" id=\"num2\" name=\"num2\" type=\"number\" min=\"1\" max=\"99\" value=");
      out.print( valor2 );
      out.write(">\r\n");
      out.write("\r\n");
      out.write("                    <select class=\"operador\" id=\"op3\" name=\"op3\">\r\n");
      out.write("                        <option> ");
      out.print( operador3 );
      out.write(" </option>\r\n");
      out.write("                        <option> + </option>\r\n");
      out.write("                        <option> - </option>\r\n");
      out.write("                        <option> * </option>\r\n");
      out.write("                        <option> / </option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <input class=\"numero\" id=\"num3\" name=\"num3\" type=\"number\" min=\"1\" max=\"99\" value=");
      out.print( valor3 );
      out.write(">\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"submit\" value=\"Evaluar Funcion \" name=\"cal\"> \r\n");
      out.write("                    <input type=\"reset\" value=\"Restaurar\">\r\n");
      out.write("                    \r\n");
      out.write("               </form>\r\n");
      out.write("               <div id=\"resultado\">\r\n");
      out.write("                   <h1>\r\n");
      out.write("                       ");
      out.print( dato );
      out.write("\r\n");
      out.write("                   </h1>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
