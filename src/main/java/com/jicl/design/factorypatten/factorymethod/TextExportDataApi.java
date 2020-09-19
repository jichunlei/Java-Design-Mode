package com.jicl.design.factorypatten.factorymethod;

/**
 * 文本格式导出工具
 *
 * @author : xianzilei
 * @date : 2020/9/18 16:18
 */
public class TextExportDataApi implements ExportDataApi {
    @Override
    public void exportData(String data) {
        System.out.println("将数据[" + data + "]导出为文本格式...");
    }
}
