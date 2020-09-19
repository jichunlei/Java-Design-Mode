package com.jicl.design.factorypatten.factorymethod;

/**
 * 数据格式导出工具工厂抽象类/接口
 *
 * @author : xianzilei
 * @date : 2020/9/18 16:01
 */
public abstract class ExportDataApiFactory {

    /**
     * 数据导出：供客户端调用
     *
     * @param data 数据
     * @return void
     * @author xianzilei
     * @date 2020/9/18 17:36
     **/
    public void exportData(String data) {
        //创建工具
        ExportDataApi exportDataApi = createExportDataApi();
        //导出数据
        exportDataApi.exportData(data);
    }

    /**
     * 创建数据导出工具
     *
     * @return 数据导出工具
     * @author xianzilei
     * @date 2020/9/18 16:14
     **/
    protected abstract ExportDataApi createExportDataApi();
}
