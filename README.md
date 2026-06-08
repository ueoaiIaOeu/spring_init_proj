Hello World!

to use this, you have to locate the "spring_init_proj" directly to $CATALINA_HOME/webapps.
than please start your tomcat:
1. go to $CATALINA_HOME/bin
2. chmod +x catalina.sh startup.sh shutdown.sh
3. ./startup.sh 
4. cd $WEBAPP_HOME
5. ./compile.sh
6. Congrads! you just run your spring proj rn

p.s. im really sorry if you Windows user :(

---
now i try to explain how does it all work.

MyWebAppInitializer  
AbstractAnnotationConfigDispatcherServletInitializer
AbstractDispatcherServletInitializer
AbstractContextLoaderInitializer
WebApplicationInitializer


AbstractAnnotationConfigDispatcherServletInitializer this clas just implemet some methods for 
support to another classes

AbstractDispatcherServletInitializer here we bound dispetcher servlet with servletContext

AbstractContextLoaderInitializer here we bound rootContext with ContextLoaderListener and
then bound ContextLoaderListener with servletContext

WebApplicationInitializer its just interface. void onStartup(ServletContext servletContext)
