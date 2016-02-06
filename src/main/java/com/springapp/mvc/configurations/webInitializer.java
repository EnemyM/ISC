package com.springapp.mvc.configurations;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Anton on 24.01.2016.
 */
public class webInitializer extends AbstractAnnotationConfigDispatcherServletInitializer /*implements WebApplicationInitializer*/ {

//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        applicationContext.register(AppConfig.class);
//        applicationContext.setServletContext(servletContext);
//
//        /*Configuration dispatcher servlet*/
//        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher",
//                new DispatcherServlet(applicationContext));
//        servlet.setLoadOnStartup(1);
//        servlet.addMapping("/");
//    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
