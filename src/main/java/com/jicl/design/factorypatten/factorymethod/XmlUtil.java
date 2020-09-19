package com.jicl.design.factorypatten.factorymethod;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * TODO
 *
 * @author : xianzilei
 * @date : 2020/9/18 17:08
 */
public class XmlUtil {

    /**
     * 解析配置文件获取bean
     *
     * @param configPath 配置文件路径
     * @return java.lang.Object
     * @author xianzilei
     * @date 2020/9/18 17:13
     **/
    public static Object getBean(String configPath) throws Exception {
        //创建DOM文档对象
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        //读取配置文件
        Document document = documentBuilder.parse(new File(configPath));
        //获取包含类名的文本节点
        NodeList nodeList = document.getElementsByTagName("className");
        //获取节点值
        Node node = nodeList.item(0).getFirstChild();
        String className = node.getNodeValue();

        //反射创建类
        Class<?> c = Class.forName(className);
        return c.newInstance();
    }
}
