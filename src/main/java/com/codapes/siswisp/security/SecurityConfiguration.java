/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codapes.siswisp.security;

import com.codapes.siswisp.service.impl.LoginServiceImpl;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author toshiba
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final Logger LOG = Logger.getLogger(SecurityConfiguration.class);

    @Autowired
    DataSource dataSource;

    @Autowired
    LoginServiceImpl loginServiceImpl;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(loginServiceImpl)
            .passwordEncoder(encoder());
                
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/resources/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login-auth")
                .defaultSuccessUrl("/navigator/index")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .permitAll()
                .and()
                .csrf()
                .and()
                .exceptionHandling()
                .accessDeniedPage("/403");

    }



    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder(10);
    }

}
