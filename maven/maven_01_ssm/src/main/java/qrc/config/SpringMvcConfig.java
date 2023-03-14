package qrc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"qrc.controller","qrc.config"})
@EnableWebMvc
//@Import不能和@EnableWebMvc一起使用
public class SpringMvcConfig {
}
