package com.selftraining.springboot.WebServiceSandBox;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanPersonConfiguration {

    @Bean
    @Qualifier("ID")
    public String strID(){return "none";}

    @Bean
    @Qualifier("firstName")
    public String strfisrtName(){return "Miguel Angel";}

    @Bean
    @Qualifier("lastName")
    public String strlastName(){return "Coca Saavedra";}

    @Bean
    @Qualifier("address")
    public String straddress(){return "Marie Courie S/N";}
}
