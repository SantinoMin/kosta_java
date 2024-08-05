package servlet.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import servlet.HelloServlet;

@Configuration
public class ServletConfig {
  @Bean
  public ServletRegistrationBean<HelloServlet> helloServletRegistration() {
    return new ServletRegistrationBean<>(new HelloServlet(), "/hello");
  }
}
