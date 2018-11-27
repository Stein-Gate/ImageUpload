package single.cherry.imageupdate.service;

import org.springframework.stereotype.Service;
import single.cherry.imageupdate.dao.ImageMapper;

import javax.annotation.Resource;

@Service
public class ImageService {

    @Resource
    private ImageMapper imageMapper;

    /**
     * 插入图片
     * @param name 图片名称
     * @return
     */
    public boolean inserImage(String name){
        return inserImage(name);
    }
}
