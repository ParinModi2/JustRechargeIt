/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author A-4
 */
@WebServlet(name="services", urlPatterns={"/services"})
public class services extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet services</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet services at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */

    try{
    HttpSession chkses= request.getSession();
     String ses11=(String)  chkses.getAttribute("sesvarname");
   //  String ses12=(String)  chkses.getAttribute("sesvarmno");

     if(ses11==null)
         {
            response.sendRedirect("login12");
         }


      }
    catch(Exception ex)
     {
        out.println(ex);
     }

      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("#mobilesevicelogo td a {\r\n");
      out.write("background-image: url(\"mobile_recharge_services.gif\");\r\n");
      out.write("background-repeat: no-repeat;\r\n");
      out.write("display: block;\r\n");
      out.write("height: 71px;\r\n");
      out.write("width: 126px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td a.aircel:hover {\r\n");
      out.write("background-position: 0% 0%;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("}\r\n");
      out.write("td a.aircel{\r\n");
      out.write("background-position: 0% -213px;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: -213px;\r\n");
      out.write("}\r\n");
      out.write("td a.tatawalky:hover {\r\n");
      out.write("background-position: -127px 0%;\r\n");
      out.write("background-position-x: -127px;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("}\r\n");
      out.write("td a.tatawalky {\r\n");
      out.write("background-position: -127px -213px;\r\n");
      out.write("background-position-x: -127px;\r\n");
      out.write("background-position-y: -213px;\r\n");
      out.write("}\r\n");
      out.write("td a.loop:hover {\r\n");
      out.write("background-position: -254px 0%;\r\n");
      out.write("background-position-x: -254px;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("}\r\n");
      out.write("td a.loop {\r\n");
      out.write("background-position: -254px -213px;\r\n");
      out.write("background-position-x: -254px;\r\n");
      out.write("background-position-y: -213px;\r\n");
      out.write("}\r\n");
      out.write("td a.bsnl:hover {\r\n");
      out.write("background-position: -381px 0%;\r\n");
      out.write("background-position-x: -381px;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("}\r\n");
      out.write("td a.bsnl {\r\n");
      out.write("background-position: -381px -213px;\r\n");
      out.write("background-position-x: -381px;\r\n");
      out.write("background-position-y: -213px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td a.idea:hover {\r\n");
      out.write("background-position: -508px 0%;\r\n");
      out.write("background-position-x: -508px;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("}\r\n");
      out.write("td a.idea {\r\n");
      out.write("background-position: -508px -213px;\r\n");
      out.write("background-position-x: -508px;\r\n");
      out.write("background-position-y: -213px;\r\n");
      out.write("}\r\n");
      out.write("td a.mtnl:hover {\r\n");
      out.write("background-position: 0% -71px;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: -71px;\r\n");
      out.write("}\r\n");
      out.write("td a.mtnl {\r\n");
      out.write("background-position: 0% -284px;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: -284px;\r\n");
      out.write("}\r\n");
      out.write("td a.mts:hover {\r\n");
      out.write("background-position: -127px -71px;\r\n");
      out.write("background-position-x: -127px;\r\n");
      out.write("background-position-y: -71px;\r\n");
      out.write("}\r\n");
      out.write("td a.mts {\r\n");
      out.write("background-position: -127px -284px;\r\n");
      out.write("background-position-x: -127px;\r\n");
      out.write("background-position-y: -284px;\r\n");
      out.write("}\r\n");
      out.write("td a.uninor:hover {\r\n");
      out.write("background-position: -254px -71px;\r\n");
      out.write("background-position-x: -254px;\r\n");
      out.write("background-position-y: -71px;\r\n");
      out.write("}\r\n");
      out.write("td a.uninor {\r\n");
      out.write("background-position: -254px -284px;\r\n");
      out.write("background-position-x: -254px;\r\n");
      out.write("background-position-y: -284px;\r\n");
      out.write("}\r\n");
      out.write("td a.reliance:hover {\r\n");
      out.write("background-position: -381px -71px;\r\n");
      out.write("background-position-x: -381px;\r\n");
      out.write("background-position-y: -71px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td a.reliance {\r\n");
      out.write("background-position: -381px -284px;\r\n");
      out.write("background-position-x: -381px;\r\n");
      out.write("background-position-y: -284px;\r\n");
      out.write("}\r\n");
      out.write("td a.docomo:hover {\r\n");
      out.write("background-position: -508px -71px;\r\n");
      out.write("background-position-x: -508px;\r\n");
      out.write("background-position-y: -71px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td a.docomo {\r\n");
      out.write("background-position: -508px -284px;\r\n");
      out.write("background-position-x: -508px;\r\n");
      out.write("background-position-y: -284px;\r\n");
      out.write("}\r\n");
      out.write("td a.indicom:hover {\r\n");
      out.write("background-position: 0% -141px;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: -141px;\r\n");
      out.write("}\r\n");
      out.write("td a.indicom {\r\n");
      out.write("background-position: 0% -354px;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: -354px;\r\n");
      out.write("}\r\n");
      out.write("td a.virgin:hover {\r\n");
      out.write("background-position: -127px -141px;\r\n");
      out.write("background-position-x: -127px;\r\n");
      out.write("background-position-y: -141px;\r\n");
      out.write("}\r\n");
      out.write("td a.virgin {\r\n");
      out.write("background-position: -127px -354px;\r\n");
      out.write("background-position-x: -127px;\r\n");
      out.write("background-position-y: -354px;\r\n");
      out.write("}\r\n");
      out.write("td a.vodafone:hover {\r\n");
      out.write("background-position: -254px -141px;\r\n");
      out.write("background-position-x: -254px;\r\n");
      out.write("background-position-y: -141px;\r\n");
      out.write("}\r\n");
      out.write("td a.vodafone {\r\n");
      out.write("background-position: -254px -354px;\r\n");
      out.write("background-position-x: -254px;\r\n");
      out.write("background-position-y: -354px;\r\n");
      out.write("}\r\n");
      out.write("td a.videoconmobile:hover {\r\n");
      out.write("background-position: -381px -141px;\r\n");
      out.write("background-position-x: -381px;\r\n");
      out.write("background-position-y: -141px;\r\n");
      out.write("}\r\n");
      out.write("td a.videoconmobile {\r\n");
      out.write("background-position: -381px -354px;\r\n");
      out.write("background-position-x: -381px;\r\n");
      out.write("background-position-y: -354px;\r\n");
      out.write("}\r\n");
      out.write("td a.airtel:hover {\r\n");
      out.write("background-position: -508px -141px;\r\n");
      out.write("background-position-x: -508px;\r\n");
      out.write("background-position-y: -141px;\r\n");
      out.write("}\r\n");
      out.write("td a.airtel {\r\n");
      out.write("background-position: -508px -354px;\r\n");
      out.write("background-position-x: -508px;\r\n");
      out.write("background-position-y: -354px;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a {\r\n");
      out.write("background-image: url(\"dth_recharge_services.gif\");\r\n");
      out.write("background-position: 0% 0%;\r\n");
      out.write("background-repeat: no-repeat;\r\n");
      out.write("display: block;\r\n");
      out.write("height: 71px;\r\n");
      out.write("width: 126px;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a.dishtv:hover {\r\n");
      out.write("background-position: 0% -71px;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: -71px;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a.dishtv {\r\n");
      out.write("background-position: 0% 0%;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a.sundirect:hover {\r\n");
      out.write("background-position: -126px -71px;\r\n");
      out.write("background-position-x: -126px;\r\n");
      out.write("background-position-y: -71px;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a.sundirect {\r\n");
      out.write("background-position: -126px 0%;\r\n");
      out.write("background-position-x: -126px;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#dthsevicelogo td a.tatasky:hover {\r\n");
      out.write("background-position: -252px -71px;\r\n");
      out.write("background-position-x: -252px;\r\n");
      out.write("background-position-y: -71px;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a.tatasky {\r\n");
      out.write("background-position: -252px 0%;\r\n");
      out.write("background-position-x: -252px;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a.airteltv:hover {\r\n");
      out.write("background-position: -378px -71px;\r\n");
      out.write("background-position-x: -378px;\r\n");
      out.write("background-position-y: -71px;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a.airteltv {\r\n");
      out.write("background-position: -378px 0%;\r\n");
      out.write("background-position-x: -378px;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a.bigtv:hover {\r\n");
      out.write("background-position: -504px -71px;\r\n");
      out.write("background-position-x: -504px;\r\n");
      out.write("background-position-y: -71px;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a.bigtv {\r\n");
      out.write("background-position: -504px 0%;\r\n");
      out.write("background-position-x: -504px;\r\n");
      out.write("background-position-y: 0%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#dthsevicelogo td a.videocon:hover {\r\n");
      out.write("background-position: 0% -213px;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: -213px;\r\n");
      out.write("}\r\n");
      out.write("#dthsevicelogo td a.videocon {\r\n");
      out.write("background-position: 0% -142px;\r\n");
      out.write("background-position-x: 0%;\r\n");
      out.write("background-position-y: -142px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("border-spacing: 2px 2px;\r\n");
      out.write("border-collapse: separate;\r\n");
      out.write("}\r\n");
      out.write(".border5 {\r\n");
      out.write("border: solid #000;\r\n");
      out.write("border-bottom-width: 0px;\r\n");
      out.write("border-right-width: 0px;\r\n");
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
      out.write("\tcolor:#FFF;\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-style: italic;\r\n");
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
      out.write("#mobilesevicelogo .border5 .border5 .style2 {\r\n");
      out.write("\tfont-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body onLoad=\"history.go(+1)\">\r\n");
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
      out.write("\t\t<span class=\"style14\"><a href=\"home\" class=\"hylink1\">HOME</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"213\" align=\"center\"><span class=\"style14\"><a href=\"howtorecharge\" class=\"hylink1\">HOW TO RECHARGE</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"196\" align=\"center\"><span class=\"style14\"><a href=\"services\" class=\"hylink1\">SERVICES</a><td><img src=\"tabcontent_bg.gif\"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t   \t<td width=\"151\" align=\"center\"><span class=\"style14\"><a href=\"contactus.jsp\" class=\"hylink1\">CONTACT US</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\t\t<td width=\"172\" align=\"center\"><span class=\"style14\"><a href=\"myacc\" class=\"hylink1\">MY ACCOUNT</a> <td><img src=\"tabcontent_bg.gif\"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>\r\n");
      out.write("\r\n");
      out.write("\t  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</center> </div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br><table width=\"834\" height=\"387\" border=1 id=\"mobilesevicelogo\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t<tr class=\"border5\">\r\n");
      out.write("\t\t <td colspan=\"5\" class=\"border5\" align=\"center\"><span class=\"style2\"> MOBILE SERVICES\r\n");
      out.write("\t\t </span></td>\r\n");
      out.write("\t</tr >\r\n");
      out.write("\t<tr class=\"border5\">\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\">\t<a href=\"aircelservice\" class=\"aircel\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\"><a href=\"tatawalkyservice\" class=\"tatawalky \"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\"><a href=\"loopservice\" class=\"loop\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\">\t<a href=\"bsnlservice\" class=\"bsnl\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\">\t<a href=\"ideaservice\" class=\"idea\"></a></td>\r\n");
      out.write("\t</tr >\r\n");
      out.write("\r\n");
      out.write("\t<tr class=\"border5\">\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\"><a href=\"mtnlservice\" class=\"mtnl\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\"><a href=\"mtsservice\" class=\"mts\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\"><a href=\"relianceservice\" class=\"reliance\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\">\t<a href=\"docomoservice\" class=\"docomo\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\">\t<a href=\"uninorsevice\" class=\"uninor\"></a></td>\r\n");
      out.write("\t</tr >\r\n");
      out.write("\t\r\n");
      out.write("\t<tr class=\"border5\">\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\">\t<a href=\"tataindicomser\" class=\"indicom\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\"><a href=\"virginservice\" class=\"virgin\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\"><a href=\"vodafoneservice\" class=\"vodafone\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\">\t<a href=\"videoconservice\" class=\"videoconmobile\"></a></td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"middle\" class=\"border5\">\t<a href=\"airtelservice\" class=\"airtel\"></a></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("    ");

         if(request.getParameter("logout")!=null)
        {

            out.println("in logout");
            HttpSession ses=request.getSession();
            ses.removeAttribute("sesvarname");
            ses.removeAttribute("sesvarmno");

            response.sendRedirect("login12");



}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");

        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
