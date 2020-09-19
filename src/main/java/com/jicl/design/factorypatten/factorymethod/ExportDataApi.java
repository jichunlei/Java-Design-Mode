package com.jicl.design.factorypatten.factorymethod;

/**
 * 数据格式导出工具抽象类/接口
 *
 * @author : xianzilei
 * @date : 2020/9/18 16:07
 */
public interface ExportDataApi {
    /**
     * 导出数据
     *
     * @param data 数据
     * @return void
     * @author xianzilei
     * @date 2020/9/18 16:02
     **/
    void exportData(String data);
}
