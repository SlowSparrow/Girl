package imooc.repository;

import imooc.domain.Girl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 廖师兄
 * 2016-11-03 23:17
 */
@Mapper
public interface GirlRepository {

    public List<Girl> findByAge(Integer age);

    public void save(Girl girlA);
    @Select("select * from user where id=#{id}")
    public Girl findOne(int id);

    public List<Girl> findAll();
}
