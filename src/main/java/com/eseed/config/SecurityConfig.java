package com.eseed.config;

import java.beans.Customizer;
import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionFixationProtectionStrategy;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.security.web.header.writers.StaticHeadersWriter;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.session.web.http.HeaderHttpSessionIdResolver;
import org.springframework.session.web.http.HttpSessionIdResolver;
import org.springframework.web.bind.annotation.PostMapping;

import com.eseed.captcha.CaptchaAuthenticatioFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

	@Autowired
	private UserDetailsService userDetailsService;
	int rnd = (int) Math.random();


	protected void configure(HttpSecurity http) throws Exception {
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().csrf().disable() // Disable
																												// CSRF
																												// for
																												// simplicity
				.authorizeRequests().anyRequest().authenticated().and().httpBasic();
	}

	// Register HttpSessionEventPublisher to enable handling of HttpSession events
	@Bean
	public HttpSessionEventPublisher httpSessionEventPublisher() {
		return new HttpSessionEventPublisher();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		// System.out.println("password encoder called");
		return new CustomPasswordEncoder();
	}

	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(passwordEncoder());
	
		return provider;
	}

	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() throws Exception {

		return (web) -> web.ignoring().antMatchers("/css/", "/img/", "/js/", "/webjars/", "/fonts/", "/icon-fonts/");

	}

	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		return http

				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
						.invalidSessionStrategy(new MyCustomInvalidSessionStrategy()).maximumSessions(1)
						.maxSessionsPreventsLogin(false).sessionRegistry(sessionRegistry()).expiredUrl("/?logout")
						.and()

						.sessionFixation().newSession()
//			            .sessionFixation((sessionFixation) -> sessionFixation
//			                    .newSession()
//			                )

				)

				.headers(headers -> headers
						// .contentSecurityPolicy("default-src 'self'").and().

						// .cacheControl(). // Disable the default Cache-Control header
						// .addHeaderWriter(new StaticHeadersWriter("Server", ""))

						.addHeaderWriter((request, response) -> {
							response.setHeader("X-Content-Type-Options", "nosniff");
							response.setHeader("X-XSS-Protection", "1; mode=block");
							response.setHeader("X-Frame-Options", "deny");
//							response.setHeader("Content-Security-Policy",
//									"form-action 'self' default-src 'self' script-src 'self'  ;");
//
//							response.setHeader("Strict-Transport-Security",
//									"max-age=63072000; includeSubDomains; preload");
//							response.setHeader("Server", "");
							// response.setHeader("Content-Security-Policy", "form-action 'self' 'nonce- +
							// generatedNonce + ' ;");

							// Set additional cookie attributes
							// response.setHeader("Set-Cookie", "JSESSIONID=; HttpOnly; Secure;
							// SameSite=Strict; Expires=0");
							// response.setHeader("Set-Cookie", "myCustomCookie=myCookieValue; HttpOnly;
							// Secure; SameSite=Strict; Expires=0; Path=/login");

						})

				)

//			        .headers()
//	              //  .httpStrictTransportSecurity().disable()
//			        .addHeaderWriter(new StaticHeadersWriter("Content-Security-Policy",
//			                "script-src-elem 'self'; script-src 'self';unsafe-inline' 'nonce-" + generatedNonce + "'; report-uri /csp-report-endpoint"))
//	                .and()
//	                
//			        .cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues())
				//
//			        .and()
//			        
//			        

				.csrf().csrfTokenRepository(csrfTokenRepository()).ignoringAntMatchers("/uploadCertificate").and().authorizeRequests()
				
				.antMatchers("/?logout").permitAll()
				// ... (other configurations)
				.antMatchers("/rbkroles/**").hasAuthority("25").antMatchers("/maoroles/**").hasAuthority("5")
				.antMatchers("/horoles/**").hasAuthority("22").antMatchers("/ddap/**").hasAuthority("17").antMatchers("/ddap/**").hasAuthority("11")
				.antMatchers("/horoles/**").hasAuthority("18").antMatchers("/mro/**").hasAuthority("2")
				.antMatchers("/dao/**").hasAuthority("9").antMatchers("/dfo/**").hasAuthority("55")
				.antMatchers("/rdo/**").hasAuthority("46").antMatchers("/vro/**").hasAuthority("30").antMatchers("/dmio/**")
				.hasAuthority("56").antMatchers("/searchFormbykhataSno/**").hasAuthority("25").antMatchers("/apssdc/**").hasAuthority("15")

				.and().formLogin().loginPage("/").permitAll().defaultSuccessUrl("/login-auth", true)
				.failureUrl("/?error=true").and()

				.logout()

				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))

				.invalidateHttpSession(true).clearAuthentication(true).deleteCookies("JSESSIONID").logoutUrl("/logout")
//			            .logoutSuccessHandler(new LogoutSuccessHandler() {
				//

				.logoutSuccessUrl("/?logout").permitAll().and()

				.exceptionHandling().accessDeniedPage("/403").accessDeniedPage("/400").accessDeniedPage("/404")
				.accessDeniedPage("/500").and()
				// .httpBasic(Customizer.withDefaults())
				// .addFilterBefore(captchaAuthenticatioFilter,
				// UsernamePasswordAuthenticationFilter.class)
				.addFilterBefore(new CaptchaAuthenticatioFilter("/", "/?captcha_error=true"),
						UsernamePasswordAuthenticationFilter.class)

				.build();
	}

	@Bean
	public SecureRandom secureRandom() {
		return new SecureRandom();
	}

//	@Bean
//	public HttpSessionEventPublisher httpSessionEventPublisher() {
//	    return new HttpSessionEventPublisher();
//	}

	@Bean
	public SessionRegistry sessionRegistry() {
		return new SessionRegistryImpl();

	}

	@Bean
	public SessionAuthenticationStrategy sessionAuthenticationStrategy() {
		return new SessionFixationProtectionStrategy();
	}

	@Bean
	public SessionFixationProtectionStrategy sessionFixation() {
		SessionFixationProtectionStrategy sessionFixationProtectionStrategy = new SessionFixationProtectionStrategy();
		// Configure additional settings if needed
		sessionFixationProtectionStrategy.setMigrateSessionAttributes(true);
		return sessionFixationProtectionStrategy;
	}

	@Bean
	public CsrfTokenRepository csrfTokenRepository() {
		HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
		repository.setHeaderName("X-CSRF-TOKEN");
		return repository;
	}

	@Bean
	public HttpSessionIdResolver httpSessionIdResolver() {
		return HeaderHttpSessionIdResolver.xAuthToken(); // Example: using a header-based session resolver
	}

}