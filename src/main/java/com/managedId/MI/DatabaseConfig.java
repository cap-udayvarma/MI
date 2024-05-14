//package com.managedId.MI;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DatabaseConfig {
//
////    @Value("${spring.datasource.url}")
//    private String databaseUrl = "jdbc:sqlserver://seventy5-server.database.windows.net:1433;database=seventy;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;Authentication=ActiveDirectoryManagedIdentity";
//
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Assuming MySQL database
//        dataSource.setUrl(databaseUrl);
//        return dataSource;
//    }
//}
//
