package single.cherry.imageupdate.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import single.cherry.imageupdate.entity.Image;

import java.util.List;

@Mapper
@Component
public interface ImageMapper {

    /**
     * 插入图片
     */
    @Insert("insert into image(name) values(#{name})")
    public boolean insertImage(String name);

    /**
     * 查找单个图片
     */
    @Select("select * from image where id = #{id}")
    public Image getImageByID(int id);

    /**
     * 查找所有的图片
     */
    @Select("select * from image")
    public List<Image> getImageAll();


}
