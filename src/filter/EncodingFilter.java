package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/** 
 * 文件名:       EncodingFilter.java 
 * CopyRright(c)  2010-08 
 * 创 建 人：        王昭阳
 * 日    期：    2010-08-08 
 * 描    述：    利用过滤器解决中文乱码问题
 * 版 本 号：        V1.0
 */ 
public class EncodingFilter implements Filter{
	private String encoding;
	/** 
	 * FunName:           init 
	 * Description :      过滤器初始化时的动作
	 * @param：			  FilterConfig filterConfig
	 * @return：			  无
	 * @Author:           王昭阳
	 * @Create Date:      2010-08-08
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding = filterConfig.getInitParameter("encoding");		
	}
	/** 
	 * FunName:           doFilter 
	 * Description :      利用过滤器解决中文乱码问题
	 * @param：			  ServletRequest request, ServletResponse response,FilterChain chain
	 * @return：			  无
	 * @Author:           王昭阳
	 * @Create Date:      2010-08-08
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(encoding);//解决中文问题
		chain.doFilter(request, response);		
	}
	/** 
	 * FunName:           destroy 
	 * Description :      过滤器消亡时的动作
	 * @param：			  无
	 * @return：			  无
	 * @Author:           王昭阳
	 * @Create Date:      2010-08-08
	 */
	public void destroy() {}
	
}
