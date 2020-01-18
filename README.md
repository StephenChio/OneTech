# OneTech
事先准备：
1.安装maven
下载地址：http://maven.apache.org/download.cgi
第二步，解压文件包

 

 1.apache-maven-3.5.2-bin.zip     直接解压到指定安装路径。

 2.apache-maven-3.5.2-src.zip     maven源码包。

 

第三步，配置环境变量，类似jdk环境配置

1.创建M2_HOME环境变量，指向maven的安装目录。

 



2.并将%M2_HOME%\bin追加到PATH路径中。

 



3.调试是否安装成功，在cmd中输入 mvn -version


2.安装redis
下载地址：
windows版本：
    https://github.com/MSOpenTech/redis/releases
Linux版本：
    官网下载：
        http://www.redis.cn/
    git下载
        https://github.com/antirez/redis/releases
        
我们现在讨论的是windows下的安装部署，目前windows下最新版本是：3.2.100。
下载地址，提供多种下载内容，
Redis-x64-3.2.100.msi是在windows下，最简单的安装文件，方便，直接会将Redis写入windows服务。
Redis-x64-3.2.100.zip是需要解压安装的，接下来讨论的是这种。
Source code (zip) 源码的zip压缩版
Source code (tar.gz) 源码的tar.gz压缩版
图片1

二：安装

解压安装

将下载的Redis-x64-3.2.100.zip 解压到某个地址。
解压之后存放的地址
图片2
启动命令

通过cmd指定到该redis目录。
使用命令：redis-server.exe 启动服务
启动服务
图片3
出现这种效果，表明启动服务成功。

3.sql文件和图片资源
链接: https://pan.baidu.com/s/1-F6Cd6cao0AAcjhrK5MYlg 提取码: qnz9
数据库使用mysql 创建一个名字为App的数据库，把sql文件导入App数据库
图片资源解压到编译后的OneTech_web/target/classes 文件夹内

前端项目OneTechApp地址：https://github.com/StephenChio/OneTechApp
