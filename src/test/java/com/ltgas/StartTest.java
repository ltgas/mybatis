package com.ltgas;

import com.ltgas.mapper.SampledataMapper;
import com.ltgas.pojo.Sampledata;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StartTest {
    SqlSession sqlSession;

    @Before
    public void openSqlSession() throws IOException {
        String resource = "SqlMapConfig.xml";
        // 1.使用文件流读取核心配置文件 SqlMapConfig.xml
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 2.创建 SqlSessionFactory 工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3.取出 sqlSession ,带（true）参数表示提交事务，默认为空 (false)
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @After
    public void closeSqlSession() {
        sqlSession.close();
    }

    @Test
    public void testQueryAll01() {
        // 取出动态代理的对象，完成接口中方法的调用，实则是调用 xml 文件中相应的标签的功能
        // 方法1：.selectList() 方法接口返回使用类型：实体集类型 -> Sampledata
        List<Sampledata> list = sqlSession.selectList("com.ltgas.mapper.SampledataMapper.queryAll01");
        list.forEach(System.out::println);
        System.out.println("Testing QueryAll() is end!");
    }


    @Test
    public void testQueryAll02() {
        // 取出动态代理的对象，完成接口中方法的调用，实则是调用 xml 文件中相应的标签的功能
        // 方法2：.getMapper(*.class) 方法接口返回使用类型：实体集类型 -> Sampledata
        SampledataMapper sampledataMapperMapper = sqlSession.getMapper(SampledataMapper.class);
        List<Sampledata> sampledata = sampledataMapperMapper.queryAll02();
        sampledata.forEach(System.out::println);
        System.out.println("Testing QueryAll() is end!");
    }

    @Test
    public void testQueryById() {
        // 取出动态代理的对象，完成接口中方法的调用，实则是调用 xml 文件中相应的标签的功能
        // 方法2：适用返回结果是一个实体 方法接口返回使用类型：实体类型 -> Sampledata
        SampledataMapper sampledataMapperMapper = sqlSession.getMapper(SampledataMapper.class);
        Sampledata sampledata = sampledataMapperMapper.queryById(100);
        System.out.println(sampledata);
        System.out.println("Testing QueryBYId() is end!");
    }

    @Test
    public void testQueryLimit01() {
        // 取出动态代理的对象，完成接口中方法的调用，实则是调用 xml 文件中相应的标签的功能
        // 方法1：使用 #{arg0}、#{arg1}... 参数列表传递参数, 方法接口返回使用类型：实体类型 -> Sampledata
        SampledataMapper sampledataMapperMapper = sqlSession.getMapper(SampledataMapper.class);
        List<Sampledata> sampledata = sampledataMapperMapper.queryLimit01(100,5);
        System.out.println(sampledata);
        System.out.println("Testing QueryLimit01 is end that using #{Param?}... !");
    }

    @Test
    public void testQueryLimit02() {
        // 取出动态代理的对象，完成接口中方法的调用，实则是调用 xml 文件中相应的标签的功能
        // 方法2：使用 #{param1}、#{param2}... 参数列表传递参数, 方法接口返回使用类型：实体类型 -> Sampledata
        SampledataMapper sampledataMapperMapper = sqlSession.getMapper(SampledataMapper.class);
        List<Sampledata> sampledata = sampledataMapperMapper.queryLimit02(200,6);
        System.out.println(sampledata);
        System.out.println("Testing QueryLimit02 is end that using #{arg?}... !");
    }

    @Test
    public void testQueryLimit03() {
        // 取出动态代理的对象，完成接口中方法的调用，实则是调用 xml 文件中相应的标签的功能
        // 方法3：使用 @Param 注解方法传递参数, 返回结果是一个实体 方法接口返回使用类型：实体类型 -> Sampledata
        SampledataMapper sampledataMapperMapper = sqlSession.getMapper(SampledataMapper.class);
        List<Sampledata> sampledata = sampledataMapperMapper.queryLimit03(300,7);
        System.out.println(sampledata);
        System.out.println("Testing QueryLimit03 is end that using @Param(\"var name\")[注解] !");
    }

    @Test
    public void testQueryLimit04() {
        // 取出动态代理的对象，完成接口中方法的调用，实则是调用 xml 文件中相应的标签的功能
        // 方法4：使用 map() 方法传递参数，  方法接口返回使用类型：实体类型 -> Sampledata
        SampledataMapper sampledataMapperMapper = sqlSession.getMapper(SampledataMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("startId",400);
        map.put("rows",8);
        List<Sampledata> sampledata = sampledataMapperMapper.queryLimit04(map);
        System.out.println(sampledata);
        System.out.println("Testing QueryLimit04 is end that using Map<V,X>[注解] !");
    }

    // 模糊查询
    @Test
    public void testQueryBycName() {
        SampledataMapper sampledataMapper = sqlSession.getMapper(SampledataMapper.class);
        List<Sampledata> list = sampledataMapper.queryByNearcName("好");
        list.forEach(System.out::println);
        System.out.println("Testing QueryBycName() is end!");
    }
}
