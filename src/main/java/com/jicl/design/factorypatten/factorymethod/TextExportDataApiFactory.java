package com.jicl.design.factorypatten.factorymethod;

/**
 * 文本格式导出工具工厂类
 *
 * @author : xianzilei
 * @date : 2020/9/18 16:25
 */
public class TextExportDataApiFactory extends ExportDataApiFactory {
    @Override
    public ExportDataApi createExportDataApi() {
        //返回文本导出工具
        return new TextExportDataApi();
    }
}
