package qrc.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


//MyBatis的配置，
// 1.配置数据库连接：形参按类型获取数据库连接DataSource对象
// 2.配置扫描实体类路径，配置了以后文件中的resultType和parameterType就不需要指定全类名qrc.domain.SysUser，我们只需要写SysUser
// 3.将配置存在一个MyBatisConfig类型的Bean对象中

public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("qrc.domain");
        ssfb.setDataSource(dataSource);
        //还有一个事务处理设置，以后再将
        return ssfb;
    }
    //MapperScannerConfigurer会扫描这个包中的所有接口，把每个接口都执行一次getMapper方法，得到每个接口的dao对象 ，创建好的dao对象放入到spring的容器中
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("qrc.dao");
        return msc;
    }
}
