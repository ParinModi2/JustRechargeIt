package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javassist.bytecode.stackmap.BasicBlock.Catch;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public final class login12_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String user1="";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setHeader("X-Powered-By", "JSP/2.1");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <form name=\"f1\" method=\"post\">\r\n");
      out.write("\t<table border=1 align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\"><p>REGISTRED USER</p>\r\n");
      out.write("\t\t\tSimply login and enter the amount to recharge your registered Mobile.\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\tEmail Id:\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=text name=\"username\"value='");
      out.print(user1);
      out.write("'>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\tPassword:\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=password name=\"password\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\"><input type=checkbox name=\"check\">REMEMBER ME</td>\r\n");
      out.write("\t\t</tr>\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\"><a href=\"newreg1.jsp\">REGISTER HERE</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\"><a href=\"forgotpass.jsp\">FORGOT PASSWORD?</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><input type=submit name=login value=\"LOGIN\"></td>\r\n");
      out.write("\t\t\t<td><input type=submit name=admin value=\"ADMIN\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("   ");

   if(request.getParameter("check")!=null)
            {
                String user=request.getParameter("username");
                Cookie c1=new Cookie("cuname", user);
                response.addCookie(c1);
           }
     //  String user1="";
        Cookie ck[]=request.getCookies();
        if(ck!=null)
            {
                for(int i=0;i<ck.length;i++)
                    {
                        if(ck[i].getName().equals("cuname"))
                            {
                                user1=ck[i].getValue();
                                break;
                        }
                    }
                }

    out.println("in jsp");
         Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        if(request.getParameter("login")!=null)
        {
             String e1=request.getParameter("username");
            out.println(e1);
             String e2=request.getParameter("password");
            out.println(e2);
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("select email and pass from registeration where email='"+e1+"' and pass='"+e2+"'");
            if(rs.next())
                response.sendRedirect("howtorecharge.html");
            else
                response.sendRedirect("login12.jsp");
                //out.println("sorry");
        }


      out.write("\r\n");
      out.write("            </body>\r\n");
      out.write("</html>");
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
