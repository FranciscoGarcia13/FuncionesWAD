package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Administrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Administrador</title>\r\n");
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
      out.write("            <fieldset id=\"admin\">\r\n");
      out.write("                <h1> Bienvendo Administrador </h1>\r\n");
      out.write("                <table class=\"info\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Agregar Usuario  </td>\r\n");
      out.write("                        <td><a href=\"InsertarUser.jsp\" >ADD</a></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Listar Usuarios  </td>\r\n");
      out.write("                        <td><a href=\"view.action\" >VIEW</a></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <a href=\"login.jsp\" > Cerrar Sesion </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </fieldset>\r\n");
      out.write("    </div> \r\n");
      out.write("        \r\n");
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
