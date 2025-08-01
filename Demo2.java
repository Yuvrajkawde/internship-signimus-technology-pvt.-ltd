package in.ineuron.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller 
public class Demo2 {

    @Bean
    
    public String test(){

        return "hello";
    }

}
