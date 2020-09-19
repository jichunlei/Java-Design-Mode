package com.jicl.design.factorypatten.factorymethod;

/**
 * 客户端
 *
 * @author : xianzilei
 * @date : 2020/9/18 16:26
 */
public class Client {

    public static void main(String[] args) throws Exception {
        //读取配置文件获取指定的工厂类
        ExportDataApiFactory factory = (ExportDataApiFactory)XmlUtil.getBean("config.xml");
        //直接使用工厂类的数据导出
        factory.exportData("xianzilei 真帅！");
    }
}
