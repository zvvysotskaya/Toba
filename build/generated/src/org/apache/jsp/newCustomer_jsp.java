package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <title>TOBA Titan Online Banking Application</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/color.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div id=\"wrapper\">\n");
      out.write("            <header>\n");
      out.write("                <div id=\"logo\"></div>\n");
      out.write("                <div id=\"titleApp\"><h1>Titan Online Banking Application</h1></div>    \n");
      out.write("                  \n");
      out.write("            </header>           \n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                    <li><a href=\"login.html\">Login / Register </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>   \n");
      out.write("               <main> \n");
      out.write("                   <h2>Create an Account</h2>\n");
      out.write("                   <p id=\"center\">To create an account, please fill out the form.</p>\n");
      out.write("                   <h2> <i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</i></h2>\n");
      out.write("                   \n");
      out.write("                   <form action=\"register\" method=\"post\" class=\"customer\">\n");
      out.write("                       <input type=\"hidden\" name=\"action\" value=\"bb\">\n");
      out.write("                           <label>First Name:</label>\n");
      out.write("                           <input type=\"text\" name=\"firstName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user2.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                           \n");
      out.write("                           <label>Last Name:</label>\n");
      out.write("                           <input type=\"text\" name=\"lastName\" value=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user2.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                           \n");
      out.write("                           <label>Phone:</label>\n");
      out.write("                           <input type=\"tel\" name=\"phone\" value=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user2.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                           <label>Address:</label>\n");
      out.write("                           <input type=\"text\" name=\"address\" value=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user2.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                           <label>City:</label>\n");
      out.write("                           <input type=\"text\" name=\"city\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user2.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                           <label>State:</label>\n");
      out.write("                           <input type=\"text\" name=\"state\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user2.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                           <label>Zipcode:</label>\n");
      out.write("                           <input type=\"text\" name=\"zipcode\" value=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user2.zipcode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                           <label>Email:</label>\n");
      out.write("                           <input type=\"text\" name=\"email\" value=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user2.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br><br>\n");
      out.write("                           <input type=\"submit\" value=\"Submit\"><br>\n");
      out.write("                           \n");
      out.write("                   </form>\n");
      out.write("                           <br><br>\n");
      out.write("     </main>\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"copy\">\n");
      out.write("copyright &copy; 2018 AAAA, Inc. All rights reserved.<br><br>\n");
      out.write("<a href=\"mailto:contact@AAAA.com\">contact@AAAA.com</a>\n");
      out.write("</div>\n");
      out.write("            </footer>    \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
