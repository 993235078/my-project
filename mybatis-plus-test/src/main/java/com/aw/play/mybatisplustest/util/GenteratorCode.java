package com.aw.play.mybatisplustest.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;


/***
 * @author 周继文
 * @date 2019/7/24 15:32
 * @version 1.0.0
 */
public class GenteratorCode {
    public static void main(String[] args) throws InterruptedException {
        //用来获取mybatis-plus.properties文件的配置信息
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        /*String originalProjectPath = "C:\\dev\\ideaWorkSpace\\here-server\\res-server\\src\\main";
        String projectPath = originalProjectPath + "\\java";
        String parentPath = "\\com\\wykj\\here\\resserver";
        String parentRe = "com.wykj.here.resserver";*/
        String originalProjectPath = "C:\\dev\\ideaWorkSpace\\here-server\\job\\src\\main";
        String projectPath = originalProjectPath + "\\java";
        String parentPath = "\\com\\wykj\\here\\job";
        String parentRe = "com.wykj.here.job";
        gc.setOutputDir(projectPath);
        gc.setFileOverride(true);
        gc.setSwagger2(true);
        //开启 ActiveRecord 模式 充血模型 实体自带持久化功能
        gc.setActiveRecord(false);
        // XML 二级缓存
        gc.setEnableCache(false);
        //gc.setDateType(DateType.ONLY_DATE);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(true);
        gc.setAuthor("Irvin");
        //主键策略
        gc.setIdType(IdType.AUTO);
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
/*        dsc.setTypeConvert(new MySqlTypeConvert() {
            @Override
            public DbColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                if (fieldType.contains("datetime")) {
                    return DbColumnType.DATE;
                }
                if (fieldType.contains("date")) {
                    return DbColumnType.DATE;
                }
                return (DbColumnType) super.processTypeConvert(globalConfig, fieldType);
            }
        });*/

        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://47.99.125.113:3306/here_community?characterEncoding=utf8&serverTimezone=Asia/Shanghai&useSSL=false");
        dsc.setUsername("root");
        dsc.setPassword("qwezxc890");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        //strategy.setTablePrefix(new String[] { "SYS_" });// 此处可以修改为您的表前缀
        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
//        strategy.setEntityColumnConstant(true);
        // 驼峰转连字符 如 umps_user 变为 upms/user
        strategy.setControllerMappingHyphenStyle(true);
        // 需要生成的表
        strategy.setInclude("res_advertise");
        //strategy.setExclude(new String[]{"test"}); // 排除生成的表
        mpg.setStrategy(strategy);
        PackageConfig pc = new PackageConfig();
        pc.setParent(parentRe);
        //pc.setModuleName("profit");//模块名称，单独生成模块时使用！！！！！！！！！！！
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("impl");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);


        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();

        // 自定义配置会被优先输出
        String xmsTemplatePath = "/templates/mapper.xml.vm";
        focList.add(new FileOutConfig(xmsTemplatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return originalProjectPath + "/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        String createVoTemplatePath = "/templates/createVo.java.vm";
        focList.add(new FileOutConfig(createVoTemplatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + parentPath +"\\vo\\" + pc.getModuleName() + tableInfo.getEntityName() + "CreateDto.java";
            }
        });

        String updateVoTemplatePath = "/templates/updateVo.java.vm";
        focList.add(new FileOutConfig(updateVoTemplatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + parentPath +"\\vo\\" + pc.getModuleName() + tableInfo.getEntityName() + "UpdateDto.java";
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        TemplateConfig tc = new TemplateConfig();
        tc.setController("/templates/controller.java");
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        tc.setXml(null);
        mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();
    }
}

