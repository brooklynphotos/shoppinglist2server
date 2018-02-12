package photos.brooklyn.shoppinglist.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import photos.brooklyn.shoppinglist.utils.UniformResponseInterceptor;

@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {

    @Autowired
    UniformResponseInterceptor requestInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestInterceptor);
    }
}