package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/** 
 * 文件名:       EncodingFilter.java 
 * CopyRright(c)  2010-08 
 * 创 建 人：        王昭阳
 * 日    期：    2010-08-08 
 * 描    述：    利用过滤器进行session检查
 * 版 本 号：        V1.0
 */ 
public class SessionCheckFilter implements Filter {
	/** 
	 * FunName:           init 
	 * Description :      过滤器初始化时的动作
	 * @param：			  FilterConfig filterConfig
	 * @return：			  无
	 * @Author:           王昭阳
	 * @Create Date:      2010-08-08
	 */
	public void init(FilterConfig filterConfig) throws ServletException {	}
	/** 
	 * FunName:           doFilter 
	 * Description :      利用过滤器进行session检查，防止用户不通过登录而直接输入网址进入操作界面
	 * @param：			  ServletRequest request, ServletResponse response,FilterChain chain
	 * @return：			  无
	 * @Author:           王昭阳
	 * @Create Date:      2010-08-08
	 */
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
	FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)servletRequest; 
		HttpServletResponse response = (HttpServletResponse)servletResponse;
		HttpSession session = request.getSession(); 
		if (session.getAttribute("type") == null) {
			response.sendRedirect("/EduSystem/index.jsp");
		}
		filterChain.doFilter(servletRequest, servletResponse); 
	}
	/** 
	 * FunName:           destroy 
	 * Description :      过滤器消亡时的动作
	 * @param：			  无
	 * @return：			  无
	 * @Author:           王昭阳
	 * @Create Date:      2010-08-08
	 */
	public void destroy() {	}
}
