/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-25 11:20:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write(" ");
response.setContentType("text/html");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>Home | E-Shopper</title>\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/price-range.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->       \r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.print(basePath);
      out.write("images/ico/favicon.ico\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"");
      out.print(basePath);
      out.write("images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"");
      out.print(basePath);
      out.write("images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"");
      out.print(basePath);
      out.write("images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"");
      out.print(basePath);
      out.write("images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("</head><!--/head-->\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<section id=\"z`z`\">\r\n");
      out.write("<div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"table-responsive col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t <h4>Order ID :");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ param.orderId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" Items</h4> \r\n");
      out.write("\t\t\t\t\t<table class=\"table table-condensed\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"cart_menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"image\"><strong>Item</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"description\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"price\"><strong>Price</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"quantity\"><strong>Quantity</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"total\"><strong>Total</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead><tbody>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /orderDetails.jsp(51,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("i");
      // /orderDetails.jsp(51,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/orderDetails.jsp(51,6) '${itemList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${itemList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"cart_product\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"\"><img src=\"");
            out.print(basePath);
            out.write("getImg?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\" alt=\"\" style=\"border: 1px solid #F7F7F0; height: 100px;width: 80px;\"></a>\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"cart_description\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<h4>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ i.product.productName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</h4>\r\n");
            out.write("\t\t\t\t\t\t\t\t<p>Web ID: ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ i.product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</p>\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t<td class=\"cart_price\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ i.product.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</p>\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"cart_quantity\"> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ i.quantity}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t\r\n");
            out.write("\t\t\t\t\t\t\t<td class=\"cart_total\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<p class=\"cart_total_price\"> ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ i.product.price*i.quantity}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</p>\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_c_005fset_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table table-condensed total-result\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Cart Sub Total</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"shipping-cost\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Shipping Cost</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Free</td>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Total</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cal}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("</table>\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t</body>\r\n");
      out.write("\t\t</html>");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /orderDetails.jsp(50,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("cal");
    // /orderDetails.jsp(50,6) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/orderDetails.jsp(50,6) '0.0'",_el_expressionfactory.createValueExpression("0.0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /orderDetails.jsp(72,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("cal");
    // /orderDetails.jsp(72,7) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/orderDetails.jsp(72,7) '${cal+i.product.price*i.quantity}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${cal+i.product.price*i.quantity}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }
}
