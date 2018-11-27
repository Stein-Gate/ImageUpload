package single.cherry.imageupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication()
@ComponentScan(basePackages = {"single.cherry.imageupdate.dao", "single.cherry.imageupdate.service","single.cherry.imageupdate"})
public class ImageUpdateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImageUpdateApplication.class, args);
    }

	//貌似只能使用这个办法去访问网页，没办直接的访问网页地址
	@RequestMapping("/demo")
	public String uploadHtml(){
		return "upload";
	}
}
