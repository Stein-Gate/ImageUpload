package single.cherry.imageupdate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    /**
     * 这里需要这样子配置，如果继承WebMvcConfigureSupport的话会出现外部资源访问不到的问题
     * 在这里纠结了一下午 2018-11-26 20:31
     */

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //添加图片地址的映射
        registry.addResourceHandler("/images/**").addResourceLocations("file:D:/Image/picture/");
        //添加视频地址的映射
        registry.addResourceHandler("/vedios/**").addResourceLocations("file:D:/Vedio/");
//        super.addResourceHandlers(registry);
    }

//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
}
