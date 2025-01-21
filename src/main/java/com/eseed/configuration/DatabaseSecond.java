package com.eseed.configuration;

import java.util.HashMap;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
//@EnableJpaRepositories(basePackages = "com.eseed.repository", 
@EnableJpaRepositories(basePackages = {"com.eseed.repository", "com.eseed.repository.ddap"},
        entityManagerFactoryRef = "secondEntityManager", transactionManagerRef = "secondTransactionManager")
//@EntityScan(basePackages = "com.eseed.dto")
@EntityScan(basePackages = {"com.eseed.entity", "com.eseed.dto","com.eseed.dao","com.eseed.config"})


public class DatabaseSecond {
	
	@Autowired
    private Environment env;

    public DatabaseSecond() {
        super();
    }

    @Bean(name = "secondEntityManager")
    public LocalContainerEntityManagerFactoryBean secondEntityManager() {
        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(secondDataSource());
        em.setPackagesToScan("com.eseed.entity", "com.eseed.dto", "com.eseed.dao", "com.eseed.config");
        
        
        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        final HashMap<String, Object> properties = new HashMap<String, Object>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
        properties.put("hibernate.dialect", env.getProperty("spring.jpa.persistent.database-platform"));
        properties.put("hibernate.format_sql", env.getProperty("spring.jpa.properties.hibernate.format_sql"));
        properties.put("hibernate.show_sql", env.getProperty("spring.jpa.properties.hibernate.show_sql"));
        properties.put("hibernate.use_sql_comments", env.getProperty("spring.jpa.properties.hibernate.use_sql_comments"));
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Bean(name = "secondDataSource")
    public DataSource secondDataSource() {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.persistent.datasource.driver-class-name"));
        dataSource.setUrl(env.getProperty("spring.persistent.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.persistent.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.persistent.datasource.password"));

        return dataSource;
    }

    @Bean(name = "secondTransactionManager")
    public PlatformTransactionManager secondTransactionManager() {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(secondEntityManager().getObject());
        return transactionManager;
    }
}

