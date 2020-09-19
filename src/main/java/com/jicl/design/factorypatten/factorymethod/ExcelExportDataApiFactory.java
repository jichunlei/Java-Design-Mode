package com.jicl.design.factorypatten.factorymethod;

/**
 * Excel格式导出工具工厂类
 *
 * @author : xianzilei
 * @date : 2020/9/18 16:19
 */
public class ExcelExportDataApiFactory extends ExportDataApiFactory {
    @Override
    public ExportDataApi createExportDataApi() {
        //返回Excel导出工具
        return new ExcelExportDataApi();
    }
}
