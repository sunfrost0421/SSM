package qrc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


//SpringMvc只控制表现层的Bean,
@Configuration
@ComponentScan({"qrc.controller","qrc.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
