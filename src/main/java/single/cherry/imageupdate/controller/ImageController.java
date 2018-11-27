package single.cherry.imageupdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import single.cherry.imageupdate.util.Result;
import single.cherry.imageupdate.util.ResultUtil;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/image")
public class ImageController {

    private final ResourceLoader resourceLoader;

    @Autowired
    public ImageController(ResourceLoader resourceLoader){
        this.resourceLoader = resourceLoader;
    }

    @RequestMapping("/hello")
    public String HelloWorld(){
        return "Hello World";
    }

    @RequestMapping("/upload")
    public Result upload(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) throws Exception{
        if (file.isEmpty()){
            System.out.println("上传文件为空");
            return ResultUtil.error(500,"上传文件为空");
        }
        //获取项目文件名
        String fileName = file.getOriginalFilename();
        //获取项目后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //上传之后的新路劲
        String filePath = "D://image//upload//";

        try{

        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.error(400,e.toString());
        }

//        return "Upload ----> fileName: "+fileName;
        return ResultUtil.success();
    }

    /**
     * 显示图片，主要在thymleaf上输出，如果是json需要配置映射
     */
    @RequestMapping("show")
    public ResponseEntity showPhotos(String fileName){
        try {
            fileName = "wlop.jpg";
            //y由于读取的是本机的图片，因此file是必须要加上的
            return ResponseEntity.ok(resourceLoader.getResource("file:D://image/"+fileName));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
}
