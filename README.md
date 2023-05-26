# 运行环境

> * JDK 11
> * maven 3.8.7
> * mysql 8.0.32



# 运行步骤

> 修改application.yaml的数据库配置
>
> 
>
> 如需将项目运行到服务器上，请先使用mvn clean 在使用mvn package将项目打包成jar文件
>
> <img src="E:\研究生\笔记\typora-user-images\rubbish_java_jar.png" alt="image-20230512115722722" />
>
> 将rubbish_java-0.0.1-SNAPSHOT.jar文件放到服务器中
>
> 同时服务器需要安装对应版本的jdk以及mysql
>
> springboot项目自带tomcat，无需安装
>
> ```shell
> #运行
> java -jar rubbish_java-0.0.1-SNAPSHOT.jar
> ```
>
> 
