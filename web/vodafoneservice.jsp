
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style1
{
	font-style:italic;
	font-weight:300;
	font-family:"Trebuchet MS", Arial, Helvetica, sans-seriff;
	font-size:18px;
	text-decoration:underline
}
body {
	background: url(f.jpg) center;
	background-repeat:repeat;
}
a.hylink1:Link, a.hylink1:Visited {
	font-family:"Trebuchet MS", Arial, Helvetica, sans-seriff;
	font-size: 16px;
	font-weight:bold;
	color: #FFF;
	text-decoration: none;
	outline: none;
	font-style:italic;
}

a.hylink1:Hover{
	font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
	font-size: 18px;
	font-weight:bold;
	color: #000;
	text-decoration: none;
}



a {color:#FFFFFF;}
.style12 {font-family: Verdana, Arial, Helvetica, sans-serif}
.style14 {

	color:#FFF;
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	font-style: italic;
	
	
}
.style15
{
	color:#000;
	font-size: 20px;
	font-family: "Times New Roman", Times, serif;
}
#header
{
	background-color:#666;
}
.style16
{
	color:#000;
	font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
	font-size: 18px;
	font-style: italic;
}

-->
</style>
<script language="javascript">
function validate()
{
	var mno=document.f1.mob.value;
	var amt=document.f1.mnt.value;
	var flag=true;
	if(mno.length==0)
	{
		f1.mnt.value="";
		alert("Please enter Mobile number");
		flag=false;
	}
	if(isNaN(mno))
	{
		f1.mob.value="";
		alert("Invalid Mobile number");
		flag=false;

	}
	if(!isNaN(mno))
	{
		if(mno.length!=0)
		{
			if(mno.length<10 || mno.length>10)
			{
				f1.mob.value="";
				alert("Please enter correct Mobile number");
				flag=false;
				
			}
		}
	}
	if(amt.length==0)
	{
		f1.mnt.value="";
		alert("Please enter amount");
		flag=false;

	}
	
	if(isNaN(amt))
	{
		f1.mnt.value="";
		alert("Please enter correct amount");
		flag=false;

	}
	return flag
}
</script>
</head>
<body onLoad="history.go(+1)">
<table>
    <form name="f1" method="post">
<tr>
<td width="168"> <img src="logo.gif"></img></td>
<td width="10"><img src="dotted_divider.gif"></img></td>
<td class="style15">Stay Connected ... Wherever you go ...&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td class="style15" align="right">  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Welcome
<%
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

    try
    {
             HttpSession ses=request.getSession();
             String ses1=(String) ses.getAttribute("sesvarname");
             out.println(ses1);
    }
    catch(Exception ex)
    {
        out.println(ex);
    }
    %>
</td>
<td><input type="submit" name="logout" value="LOGOUT" align="left"></td>
</tr>
</table>

<center>
<center>
</center>
<div id="header" >
<center>
  <table width="968" border="0" >
  <tr>
		<td width="89" height="56" align="center">
		<span class="style14"><a href="home.jsp" class="hylink1">HOME</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="213" align="center"><span class="style14"><a href="howtorecharge.jsp" class="hylink1">HOW TO RECHARGE</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="196" align="center"><span class="style14"><a href="services.jsp " class="hylink1">SERVICES</a><td><img src="tabcontent_bg.gif"></img></td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
	   	<td width="151" align="center"><span class="style14"><a href="contactus.jsp" class="hylink1">CONTACT US</a> <td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		<td width="172" align="center"><span class="style14"><a href="myacc.jsp" class="hylink1">MY ACCOUNT</a> <td><img src="tabcontent_bg.gif"></img></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></td>

	  </tr>
</table>
</center> </div>
<br>
<br>

	<table width="1019" border="1" cellpadding="10" align="center" class="style16">
		<tr  >
			<td width="334" height="349">
			<table>
			<tr>
				<td height="69">SERVICE PROVIDER:</td>
				<td><input type="text" name="serprov" value="VODAFONE"></td>
			</tr>
			
			<tr>
				<td height="69">MOBILE NO:</td>
				<td><input type="text" name="mob"></td>
			</tr>
			<tr>
				<td height="69">AMOUNT:</td>
				<td><input type="text" name="mnt"></td>
			</tr>
			<tr>
				<td><input type="submit" value="JUST RECHARGE IT" name="b1"></td>
			</tr>
			</table>
		  </td>
			 <td width="673" align="justify"><table border="0">
			 <tr class="style1"><td><center><span class="style1" >VODAFONE Prepaid Mobile Recharge
             </span></center></td></tr>
			 			 <tr><td height="30"></td></tr>

			 <tr><td><img src="vodafone.gif"></img></td></tr>
			 <tr><td><br>
Talk time rapidly depleting, no time to visit the nearest retail outlet to refill your prepaid Vodafone mobile phone? Not to worry coz now you can recharge your Vodafone prepaid mobile instantly by registering with JustRechargeIt.com. We provide the fastest and the easiest online mobile recharge solution.

Just Log on to JustRechargeIt.com anytime and from anywhere and eTopUp or recharge your prepaid Vodafone mobile instantly is simple steps: Register, Select Amount and Pay. JustRechargeIt.com is a 24 x 7 free online mobile recharge facility.
 	 
Recharge / eTopUp your Uninor mobile
Log into JustRechargeIt.com and register
Select your service provider "Vodafone" and location
Enter your prepaid Vodafone mobile number
Enter your recharge/etopup amount

Click on the recharge button to recharge your Vodafone mobile number
<br>
As soon as your payment is confirmed, the recharge to your Vodafone prepaid mobile number happens instantly. Within seconds, you will receive a message from Vodafone informing you of your new balance status on your Vodafone prepaid mobile number that you have recharged.

			 </td>	</tr>
		  		 </td>
		</tr></table>
  </table>

</form>
 <%
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
    %>
</body>
</html>