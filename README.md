# OneTech
事先准备:

一.安装maven

第一步，下载maven

下载地址：http://maven.apache.org/download.cgi
![Image](https://github.com/StephenChio/img-folder/blob/master/20180125104433174.png)

第二步，解压文件包

1.apache-maven-3.5.2-bin.zip     直接解压到指定安装路径。

第三步，配置环境变量，类似jdk环境配置

1.创建M2_HOME环境变量，指向maven的安装目录。

![Image](https://github.com/StephenChio/img-folder/blob/master/20180125103247489.png)

2.并将%M2_HOME%\bin追加到PATH路径中。

 ![Image](https://github.com/StephenChio/img-folder/blob/master/20180125103448461.png)

3.调试是否安装成功，在cmd中输入 mvn -version
 ![Image](https://github.com/StephenChio/img-folder/blob/master/20180125103643968.png)


二.安装redis

1.下载redis

下载地址：

windows版本：https://github.com/MSOpenTech/redis/releases

Linux版本：

官网下载:http://www.redis.cn/

git下载:https://github.com/antirez/redis/releases
        
我们现在讨论的是windows下的安装部署，目前windows下最新版本是：3.2.100。
下载地址，提供多种下载内容，
Redis-x64-3.2.100.msi是在windows下，最简单的安装文件，方便，直接会将Redis写入windows服务。
Redis-x64-3.2.100.zip是需要解压安装的，接下来讨论的是这种。
Source code (zip) 源码的zip压缩版
Source code (tar.gz) 源码的tar.gz压缩版
![Image](https://github.com/StephenChio/img-folder/blob/master/564792-20170302141835970-345229799.png)

2.安装

解压安装

将下载的Redis-x64-3.2.100.zip 解压到某个地址。解压之后存放的地址
![Image](https://github.com/StephenChio/img-folder/blob/master/564792-20170302141837188-1772743982.png)

通过cmd指定到该redis目录。使用命令：redis-server.exe 启动服务
![Image](https://github.com/StephenChio/img-folder/blob/master/564792-20170302141837907-542406591.png)

出现这种效果，表明启动服务成功。




三.注意事项

1.修改本地日志地址

文件地址 OneTech_web⁩/src⁩/⁨main/⁨resources⁩/⁨config⁩/logging-config-dev.xml
![Image](https://github.com/StephenChio/img-folder/blob/master/1.png)
把value替换成自己电脑的一个文件夹

2.修改本地资源地址

文件地址 OneTech_web⁩/src⁩/⁨main/⁨resources⁩/⁨config⁩/application-dev.properties
![Image](https://github.com/StephenChio/img-folder/blob/master/2.png)
把localUrl替换成自己电脑的一个文件夹

3.修改本地mysql数据库配置

文件地址 OneTech_web⁩/src⁩/⁨main/⁨resources⁩/⁨config⁩/application-dev.properties
![Image](https://github.com/StephenChio/img-folder/blob/master/3.png)
把数据库配置修改成自己本地数据库的配置 数据库和文件资源导入方法看第四点。

4.导入pinyin4j-2.5.0.jar

在百度网盘下载pinyin4j-2.5.0.jar包，在OneTech_common/src/main文件夹下创建一个resources文件夹，在resources文件夹下创建一个lib文件夹，把
pinyin4j-2.5.0.jar放到lib文件夹内即可。


四.sql文件和图片资源

链接: https://pan.baidu.com/s/1-F6Cd6cao0AAcjhrK5MYlg 提取码: qnz9

数据库使用mysql 

创建一个名字为App的数据库，把sql文件导入App数据库

图片资源解压到编译后的OneTech_web/target/classes 文件夹内

运行方法1.点击clone下载解压，使用idea，open打开项目，导入为maven项目，等待下载依赖完成点击运行即可。



五.此项目为前后端分离项目

前端项目OneTechApp地址：https://github.com/StephenChio/OneTechApp
