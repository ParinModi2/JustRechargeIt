package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aircelservice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    try{
    HttpSession chkses= request.getSession();
     String ses11=(String)  chkses.getAttribute("sesvarname");
   //  String ses12=(String)  chkses.getAttribute("sesvarmno");

     if(ses11==null)
         {
            response.sendRedirect("login12.jsp");
         }


      }
    catch(Exception ex)
     {
        out.println(ex);
     }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1\r\n");
      out.write("{\r\n");
      out.write("\tfont-style:italic;\r\n");
      out.write("\tfont-weight:300;\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-seriff;\r\n");
      out.write("\tfont-size:18px;\r\n");
      out.write("\ttext-decoration:underline\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: url(f.jpg) center;\r\n");
      out.write("\tbackground-repeat:repeat;\r\n");
      out.write("}\r\n");
      out.write("a.hylink1:Link, a.hylink1:Visited {\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-seriff;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tfont-style:italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.hylink1:Hover{\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("a {color:#FFFFFF;}\r\n");
      out.write(".style12 {font-family: Verdana, Arial, Helvetica, sans-serif}\r\n");
      out.write(".style14 {\r\n");
      out.write("\r\n");
      out.write("\tcolor:#FFF;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(".style15\r\n");
      out.write("{\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("}\r\n");
      out.write("#header\r\n");
      out.write("{\r\n");
      out.write("\tbackground-color:#666;\r\n");
      out.write("}\r\n");
      out.write(".style16\r\n");
      out.write("{\r\n");
      out.write("\tcolor:#000;\r\n");
      out.write("\tfont-family:\"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function validate()\r\n");
      out.write("{\r\n");
      out.write("\tvar mno=document.f1.mob.value;\r\n");
      out.write("\tvar amt=document.f1.mnt.value;\r\n");
      out.write("\tvar flag=true;\r\n");
      out.write("\tif(mno.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tf1.mnt.value=\"\";\r\n");
      out.write("\t\talert(\"Please enter Mobile number\");\r\n");
      out.write("\t\tflag=false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(isNaN(mno))\r\n");
      out.write("\t{\r\n");
      out.write("\t\tf1.mob.value=\"\";\r\n");
      out.write("\t\talert(\"Invalid Mobile number\");\r\n");
      out.write("\t\tflag=false;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\tif(!isNaN(mno))\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(mno.length!=0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tif(mno.length<10 || mno.length>10)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tf1.mob.value=\"\";\r\n");
      out.write("\t\t\t\talert(\"Please enter correct Mobile number\");\r\n");
      out.write("\t\t\t\tflag=false;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tif(amt.length==0)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tf1.mnt.value=\"\";\r\n");
      out.write("\t\talert(\"Please enter amount\");\r\n");
      out.write("\t\tflag=false;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(isNaN(amt))\r\n");
      out.write("\t{\r\n");
      out.write("\t\tf1.mnt.value=\"\";\r\n");
      out.write("\t\talert(\"Please enter correct amount\");\r\n");
      out.write("\t\tflag=false;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\treturn flag\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head><body onLoad=\"history.go(+1)\">\r\n");
      out.write("<table>\r\n");
      out.write("    <form name=\"f1\" method=\"post\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"168\"> <img src=\"logo.gif\"></img></td>\r\n");
      out.write("<td width=\"10\"><img src=\"dotted_divider.gif\"></img></td>\r\n");
      out.write("<td class=\"style15\">Stay Connected ... Wherever you go ...&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n");
      out.write("<td class=\"style15\" align=\"right\">  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome  ");

    try {
           // out.println("im ");
             HttpSession ses=request.getSession();
              String ses1=(String) ses.getAttribute("sesvarname");
              out.println(ses1);
                       //   ses.getAttribute("sesvarmno");
        }
    catch(Exception ex)
    {
        out.println(ex);
    }
    
      out.write("</td>\r\n");
      out.write("<td><input type=\"submit\" name=\"logout\" value=\"LOGOUT\" align=\"left\">\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<center>\r\n");
      out.write("</center>\r\n");
      out.write("<div id=\"header\" >\r\n");
      out.write("<center>\r\n");
      out.write("  <table width=\"968\" border=\"0\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("\t\t<td width=\"89\" height=\"56\" align=\"center\">\r\n");
      out.write("\t\t<span class=\"style14\"><a href=\"home.jsp\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge.jsp\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"196\" align=\"center\"><span class=\"style14\"><a href=\"services.jsp \" class=\"hylink1\">SERVICES</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t   \t<td width=\"151\" align=\"center\"><span class=\"style14\"><a href=\"contactus.jsp\" class=\"hylink1\">CONTACT US</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"172\" align=\"center\"><span class=\"style14\"><a href=\"myacc.jsp\" class=\"hylink1\">MY ACCOUNT</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\r\n");
      out.write("\t  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</center> </div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\t<table width=\"1019\" border=\"1\" cellpadding=\"10\" align=\"center\" class=\"style16\">\r\n");
      out.write("\t\t<tr  >\r\n");
      out.write("\t\t\t<td width=\"334\" height=\"349\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"69\">SERVICE PROVIDER:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"serprov\" value=\"AIRCEL\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"69\">MOBILE NO:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"mob\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"69\">AMOUNT:</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"mnt\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"submit\" value=\"JUST RECHARGE IT\" name=\"b1\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t  </td>\r\n");
      out.write("\t\t\t <td width=\"673\" align=\"justify\"><table border=\"0\">\r\n");
      out.write("\t\t\t <tr class=\"style1\"><td ><center><span class=\"style1\">Aircel Prepaid Mobile Recharge\r\n");
      out.write("             </span></center></td></tr>\r\n");
      out.write("\t\t\t <tr><td height=\"30\"></td></tr>\r\n");
      out.write("\t\t\t <tr><td><img src=\"aircel.gif\"></img></td></tr>\r\n");
      out.write("\t\t\t <tr><td><br>\r\n");
      out.write("\t\t\t JustRechargeIt.com is a 24x7, one-stop online mobile recharge station.\r\n");
      out.write("\t\t\t You can recharge your prepaid Aircel mobile instantly from the comfort of your home\r\n");
      out.write("\t\t\t or from your office or from ANYWHERE and at ANYTIME.\r\n");
      out.write("\t\t\t Now you no longer need to rush to the vendor for buying recharge coupons, every time your talk time runs out.\r\n");
      out.write("\t\t\t Just top-up your Aircel prepaid mobile phone by registering with us or if you are already a member,\r\n");
      out.write("\t\t\t by logging into your account and pay with either your credit card or debit card or cash card or your netbanking account.<br>\r\n");
      out.write("<br>\t\t To Recharge your Aircel prepaid mobile online, all you need to do is: \r\n");
      out.write(" \t<br> \r\n");
      out.write(" \t    <br>     Log into JustRechargeIt.com and register<br>\r\n");
      out.write(" \t<br>\t\t Enter your recharge/etopup amount<br>\r\n");
      out.write(" \t\t<br>\t Click on the Recharge button to recharge<br>\r\n");
      out.write("\r\n");
      out.write("\t\t<br>\t Within seconds, you will receive a message from Aircel informing you of your new balance status.\r\n");
      out.write("\t\t  Recharge your Aircel mobile NOW!!</td>\t</tr>\r\n");
      out.write("\t\t  \t\t </td>\r\n");
      out.write("\t\t</tr></table>\r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write(" ");

        if(request.getParameter("b1")!=null)
        {
        String amt=request.getParameter("mnt");
        String mno=request.getParameter("mob");
        String prov=request.getParameter("serprov");
        response.sendRedirect("intermediate.jsp?amnt1="+amt+"&mno="+mno+"&provider="+prov);
        }
    if(request.getParameter("logout")!=null)
        {
           
            out.println("in logout");
            HttpSession ses=request.getSession();
            ses.removeAttribute("sesvarname");
            ses.removeAttribute("sesvarmno");
            
            response.sendRedirect("login12.jsp");



}
    
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
