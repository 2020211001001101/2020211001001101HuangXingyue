/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-31 09:16:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Lab3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>cal</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"myForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/calServlet\" method=\"post\">\r\n");
      out.write("  First val: <input id=\"firstVal\" type=\"text\" name=\"firstVal\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.cFirstValue.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("  Enter a name：<input id=\"enterName\" type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.cName.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><br>\r\n");
      out.write("  Second val：<input id=\"secondVal\" type=\"text\" name=\"secondVal\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.cSecondValue.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("  Lengyh：<input id=\"length\" type=\"text\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.cLength.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><br>\r\n");
      out.write("  Result：<input id=\"result\" type=\"text\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.cResult.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><br>\r\n");
      out.write("  <input id=\"hidden\" type=\"hidden\" name=\"action\" value=\"\">\r\n");
      out.write("  <button id=\"add\" type=\"button\" >Add</button>&nbsp;\r\n");
      out.write("  <button id=\"subtract\" type=\"button\">Subtract</button>&nbsp;\r\n");
      out.write("  <button id=\"multiply\" type=\"button\">Multiply</button>&nbsp;\r\n");
      out.write("  <button id=\"divide\" type=\"button\">Divide</button>&nbsp;\r\n");
      out.write("  <button id=\"computeLength\" type=\"button\">Compute Length</button>&nbsp;\r\n");
      out.write("  <br>\r\n");
      out.write("  <button id=\"reset\" type=\"button\">Reset</button>\r\n");
      out.write("</form>\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/3.4.0/jquery.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("  $('#add').click(function () {\r\n");
      out.write("    $(\"#hidden\").attr(\"value\",\"add\");\r\n");
      out.write("    console.log($(\"#hidden\").attr(\"value\"))\r\n");
      out.write("    if(checkFormNum()){\r\n");
      out.write("      $('#myForm').submit();\r\n");
      out.write("    }\r\n");
      out.write("  })\r\n");
      out.write("  $('#subtract').click(function () {\r\n");
      out.write("    $('#hidden').attr(\"value\",\"subtract\");\r\n");
      out.write("    if(checkFormNum()){\r\n");
      out.write("      $('#myForm').submit();\r\n");
      out.write("    }\r\n");
      out.write("  })\r\n");
      out.write("  $('#multiply').click(function () {\r\n");
      out.write("    $('#hidden').attr(\"value\",\"multiply\");\r\n");
      out.write("    if(checkFormNum()){\r\n");
      out.write("      $('#myForm').submit();\r\n");
      out.write("    }\r\n");
      out.write("  })\r\n");
      out.write("  $('#divide').click(function () {\r\n");
      out.write("    $('#hidden').attr(\"value\",\"divide\");\r\n");
      out.write("    if(checkFormNum()){\r\n");
      out.write("      $('#myForm').submit();\r\n");
      out.write("    }\r\n");
      out.write("  })\r\n");
      out.write("  $('#computeLength').click(function () {\r\n");
      out.write("    $('#hidden').attr(\"value\",\"computeLength\");\r\n");
      out.write("    if(chexkFormString()){\r\n");
      out.write("      $('#myForm').submit();\r\n");
      out.write("    }\r\n");
      out.write("  })\r\n");
      out.write("  $('#reset').click(function () {\r\n");
      out.write("    $('#firstVal').attr(\"value\",\"\");\r\n");
      out.write("    $('#secondVal').attr(\"value\",\"\");\r\n");
      out.write("    $('#enterName').attr(\"value\",\"\");\r\n");
      out.write("    $('#length').attr(\"value\",\"\");\r\n");
      out.write("    $('#result').attr(\"value\",\"\");\r\n");
      out.write("    $('#hidden').attr(\"value\",\"\");\r\n");
      out.write("  })\r\n");
      out.write("  function checkFormNum() {\r\n");
      out.write("    if (!checkNumber($('#firstVal').val())){\r\n");
      out.write("      alert(\"First val is not a number\");\r\n");
      out.write("      return false;\r\n");
      out.write("    }\r\n");
      out.write("    if (!checkNumber($('#secondVal').val())){\r\n");
      out.write("      alert(\"Second val is not a number\");\r\n");
      out.write("      return false;\r\n");
      out.write("    }\r\n");
      out.write("    return true;\r\n");
      out.write("  }\r\n");
      out.write("  function chexkFormString() {\r\n");
      out.write("    if (checkString($('#enterName').val())){\r\n");
      out.write("      alert(\"Name is not valid\");\r\n");
      out.write("      return false;\r\n");
      out.write("    }\r\n");
      out.write("    return true;\r\n");
      out.write("  }\r\n");
      out.write("  function checkNumber(theObj) {\r\n");
      out.write("    const reg = /^[0-9]+.?[0-9]*$/;\r\n");
      out.write("    return reg.test(theObj);\r\n");
      out.write("  }\r\n");
      out.write("  function checkString(str) {\r\n");
      out.write("    const reg = /\\d/;\r\n");
      out.write("    return reg.test(str);\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
