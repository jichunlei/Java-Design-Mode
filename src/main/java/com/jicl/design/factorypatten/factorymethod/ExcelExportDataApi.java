package com.jicl.design.factorypatten.factorymethod;

/**
 *  Excel格式导出工具
 *
 * @author : xianzilei
 * @date : 2020/9/18 16:13
 */
public class ExcelExportDataApi implements ExportDataApi {
    @Override
    public void exportData(String data) {
        System.out.println("将数据[" + data + "]导出为Excel格式...");
    }
}
