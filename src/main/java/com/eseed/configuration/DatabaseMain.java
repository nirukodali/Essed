package com.eseed.configuration;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
@EnableJpaRepositories(basePackages = "com.eseed.repo",

        entityManagerFactoryRef = "mainEntityManager", transactionManagerRef = "mainTransactionManager")


@EntityScan(basePackages = {"com.eseed.entity", "com.eseed.dto","com.eseed.dao","com.eseed.config"})



public class DatabaseMain {
	
	    @Autowired
	    private Environment env;

	    public DatabaseMain() {
	        super();
	    }

	    @Primary
	    @Bean(name = "mainEntityManager")
	    public LocalContainerEntityManagerFactoryBean mainEntityManager() {
	        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
	        em.setDataSource(mainDataSource());
	        em.setPackagesToScan("com.eseed.entity", "com.eseed.dto", "com.eseed.dao", "com.eseed.config");
	        

	        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	        em.setJpaVendorAdapter(vendorAdapter);
	        final HashMap<String, Object> properties = new HashMap<String, Object>();
	        properties.put("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
	        properties.put("hibernate.dialect", env.getProperty("spring.jpa.database-platform"));
	        properties.put("hibernate.format_sql", env.getProperty("spring.jpa.properties.hibernate.format_sql"));
	        properties.put("hibernate.show_sql", env.getProperty("spring.jpa.properties.hibernate.show_sql"));
	        properties.put("hibernate.use_sql_comments", env.getProperty("spring.jpa.properties.hibernate.use_sql_comments"));
	       
	        em.setJpaPropertyMap(properties);
	        return em;
	    }

	    @Primary
	    @Bean(name = "mainDataSource")
	    public DataSource mainDataSource() {
	        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
	        dataSource.setUrl(env.getProperty("spring.datasource.url"));
	        dataSource.setUsername(env.getProperty("spring.datasource.username"));
	        dataSource.setPassword(env.getProperty("spring.datasource.password"));
	        return dataSource;
	    }

	    @Primary
	    @Bean(name = "mainTransactionManager")
	    public PlatformTransactionManager mainTransactionManager() {
	        final JpaTransactionManager transactionManager = new JpaTransactionManager();
	        transactionManager.setEntityManagerFactory(mainEntityManager().getObject());
	        return transactionManager;
	    }
}
