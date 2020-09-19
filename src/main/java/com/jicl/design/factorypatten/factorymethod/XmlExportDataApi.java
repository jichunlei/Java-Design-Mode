package com.jicl.design.factorypatten.factorymethod;

/**
 * Xml格式导出工具
 *
 * @author : xianzilei
 * @date : 2020/9/18 16:16
 */
public class XmlExportDataApi implements ExportDataApi {
    @Override
    public void exportData(String data) {
        System.out.println("将数据[" + data + "]导出为XML格式...");
    }
}
