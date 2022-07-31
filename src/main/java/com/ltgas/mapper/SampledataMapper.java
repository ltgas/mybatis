package com.ltgas.mapper;

import com.ltgas.pojo.Sampledata;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SampledataMapper {
    /*查询返回结果中唯一值时，方法返回值为实体类（可用实体类名);
    查询返回结果为结果集（多条记录）,方法返回值多采用 List<类名>*/
    List<Sampledata> queryAll01();
    List<Sampledata> queryAll02();
    List<Sampledata> queryPages();
    Sampledata queryById(int id);
    // queryLimit01~04()~ 方法使用不同参数传递方式查询
    List<Sampledata> queryLimit01(int startId,int rows);
    List<Sampledata> queryLimit02(int startId,int rows);
    List<Sampledata> queryLimit03(@Param("startId") int startId, @Param("rows") int rows);
    List<Sampledata> queryLimit04(Map<String,Object> params);

    List<Sampledata> queryByNearcName(String name);

    Sampledata addRowData(Sampledata sampledata);
    Sampledata updateRowData(Sampledata sampledata);
    Integer DeleteRowData(String name);
}
