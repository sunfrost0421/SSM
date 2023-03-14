package qrc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan({"qrc.dao","qrc.service"})
//排除表现层的bean，表现层的由springMvc管理
//@ComponentScan(value = "qrc",
//        excludeFilters = @ComponentScan.Filter(
//            type = FilterType.ANNOTATION,
//            classes = Controller.class
//        )
//)
public class SpringConfig {
}
