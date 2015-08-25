# ExtTag #
## Summary ##
ExtTag为ExtJS的JSP标签库，以便在IDE中获得良好的编辑支持。

## Entironment ##
  1. extjs3.0.0
  1. jsp2.0
  1. java5.0

## Install ##
  1. 将exttag.jar添加到Web应用的/WEB-INF/lib目录
  1. 将ext-3.0.0添加到Web应用的根目录(可在web.xml中配置ext-home初始化参数)

## Usage ##
标签库使用说明：
  1. 使用<%@ taglib prefix="ext" uri="/exttag"%>引入标签库(必须)
  1. 使用

&lt;ext:ext&gt;



&lt;/ext:ext&gt;

作为根标签(必须)
    * title属性：窗口标题
    * scripts属性：引入外部js脚本文件，以逗号分隔
    * styles属性：引入外部css样式文件，以逗号分隔
  1. 使用

&lt;ext:script&gt;



&lt;/ext:script&gt;

标签添加内部脚本
  1. 使用

&lt;ext:style&gt;



&lt;/ext:style&gt;

标签添加内部样式
  1. 使用var属性声明标签对象在JavaScript中的变量名
  1. 其它标签与属性与extjs一一对应，参见：http://www.extjs.com/deploy/dev/docs/

## Example ##
```
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="ext" uri="/exttag"%>
<ext:ext title="XXXX">
  <ext:viewport var="menuPane" layout="border">
    <ext:items>
      <ext:panel region="center" border="0" layout="border">
        <ext:tbar>
          <ext:toolbarSeparator />
          <ext:toolbarButton text="XXXX">
            <ext:menu>
              <ext:items>
                <ext:textItem text="XXXX"></ext:textItem>
                <ext:textItem text="XXXX"></ext:textItem>
                <ext:textItem text="XXXX"></ext:textItem>
              </ext:items>
            </ext:menu>
          </ext:toolbarButton>
          <ext:toolbarButton text="XXXX">
            <ext:menu>
              <ext:items>
                <ext:textItem text="XXXX"></ext:textItem>
                <ext:textItem text="XXXX"></ext:textItem>
                <ext:toolbarButton text="XXXX">
                  <ext:menu>
                    <ext:items>
                      <ext:textItem text="XXXX"></ext:textItem>
                    </ext:items>
                  </ext:menu>
                </ext:toolbarButton>
                <ext:textItem text="XXXX"></ext:textItem>
              </ext:items>
            </ext:menu>
          </ext:toolbarButton>
        </ext:tbar>
      </ext:panel>
    </ext:items>
  </ext:viewport>
</ext:ext>
```