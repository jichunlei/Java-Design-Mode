package com.jicl.design.factorypatten.factorymethod;

/**
 * Xml格式导出工具工厂类
 *
 * @author : xianzilei
 * @date : 2020/9/18 16:21
 */
public class XmlExportDataApiFactory extends ExportDataApiFactory {
    @Override
    public ExportDataApi createExportDataApi() {
        //返回XML导出工具
        return new XmlExportDataApi();
    }
}
