package spring_intro;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("spring_intro")
@PropertySource("classpath:app.properties")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }
    @Bean
    @Scope("prototype")
    public Person personBean() {
        return new Person(catBean());
    }
}
