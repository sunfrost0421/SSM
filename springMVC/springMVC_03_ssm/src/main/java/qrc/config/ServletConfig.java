package qrc.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//1.服务器启动之后，先执行本类，初始化web容器
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    //父容器，不能访问子容器的bean
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //2.加载SpringMvc的配置，这样Web容器就可以通过Spring扫描到相应的表现层资源Controller
    //子容器，能访问父容器的bean
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
    //3.设置Web容器的拦截请求的路径，“/”表示拦截所有浏览器的请求，交给SpringMVC处理
    //对于静态资源的访问不希望拦截给SpringMvc处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //乱码处理，设定过滤器
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
