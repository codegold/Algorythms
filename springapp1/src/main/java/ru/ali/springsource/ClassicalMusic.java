package ru.ali.springsource;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
   //private ClassicalMusic classicalMusic;

//   @Autowired
//    private ClassicalMusic(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }
//

    @PostConstruct
    public void doInit(){
        System.out.println("doing init");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("doing destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody.";
    }
}
