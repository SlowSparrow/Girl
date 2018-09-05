package imooc.controller;

import org.apache.ibatis.datasource.unpooled.UnpooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.activation.DataSource;
import java.sql.SQLException;

@Configuration
public class MybaitsSpringConfig {
//    @Bean
//    public PooledDataSource createDefaultDataSource() throws SQLException {
//        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
//        String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/dbgirl?useSSL=false&characterEncoding=utf8&serverTimezone=GMT%2B8";
//        String dbUserName = "root";
//        String dbPassword = "123456";
//        PooledDataSource ds = new PooledDataSource(Thread.currentThread().getContextClassLoader(), jdbcDriver,
//                jdbcUrl, dbUserName, dbPassword);
//        ((PooledDataSource) ds).setPoolTimeToWait(100);
//        ((PooledDataSource) ds).forceCloseAll();  // otherwise the MyBatis pool is not initialized correctly
//        return ds;
//    }

    @Bean(name = "dataSource")
    @Primary
    public UnpooledDataSource createDefaultDataSource2() throws SQLException {
        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/dbgirl?useSSL=false&characterEncoding=utf8&serverTimezone=GMT%2B8";
        String dbUserName = "root";
        String dbPassword = "123456";
        UnpooledDataSource ds = new UnpooledDataSource(Thread.currentThread().getContextClassLoader(), jdbcDriver,
                jdbcUrl, dbUserName, dbPassword);
        return ds;
    }

    @Bean(name="dataSource2")
    public DataSource createC3p0Source() throws SQLException {
        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/dbgirl?useSSL=false&characterEncoding=utf8&serverTimezone=GMT%2B8";
        String dbUserName = "root";
        String dbPassword = "123456";
        UnpooledDataSource ds = new UnpooledDataSource(Thread.currentThread().getContextClassLoader(), jdbcDriver,
                jdbcUrl, dbUserName, dbPassword);
        return (DataSource) ds;
    }
}
