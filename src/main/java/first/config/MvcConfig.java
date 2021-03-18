package first.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/participantRegForm").setViewName("participantRegForm");
        registry.addViewController("/lecturerRegForm").setViewName("lecturerRegForm");
        registry.addViewController("/adminPage").setViewName("adminPage");
        registry.addViewController("/chooseRole").setViewName("chooseRole");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/success").setViewName("success");
    }
}