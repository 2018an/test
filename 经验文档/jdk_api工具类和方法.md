

##jdk api 工具类、方法


 - BeanUtils  	
 	 -  copyProperties()

 - PropertyUtils
	 -  copyProperties() 
	 -  提供类型转换功能，即发现两个JavaBean的同名属性为不同类型时，在支持的数据类型范围内进行转换
	 -  java.util.Date是不被支持的，而它的子类java.sql.Date是被支持的，望被转换的时候，一定要使用java.sql.Date类型

- 缺点：
	-  使用BeanUtils的成本惊人地昂贵！BeanUtils所花费的时间要超过时间总和   
	
</br>


- cage 生成验证码


- 安装MYSQL 教程
	- <https://www.cnblogs.com/tangyb/p/8971658.html>

- springboot 缓存
	- @Cacheput 更新缓存

- nodepad ++ json格式化
	-  <https://blog.csdn.net/hy614/article/details/77980417>

- 缓存解决方案
	- 定义@Cacheable（value = ""）,@PostConstruct另起一个不终止死循环，休眠一秒。

- GUAVA
 	 - 谷歌开源java框架 
 	 - ratelimiter 限流


############################################################################################
***


### **项目配置文件路径问题**


需要启动目录的时候在jar包同级目录下：

执行顺序：  
	1. 同级目录下的一个config/application.properties 文件  
	2. 同级目录下的一个application.properties 文件  
    3. src/main/resources 文件夹下创建的application.properties 文件  
    
参考：  
<https://blog.csdn.net/qq_35981283/article/details/77583073>  
<https://blog.csdn.net/wohaqiyi/article/details/79940380>






########################################################################################
***
- **安装node.js**

	使用官网带 .gz结尾的压缩包，不要使用源码包。  
	 vi .bash_profile   //添加安装路径，使用全局变量  
	 source .bash_profile  //刷新使配置生效
	
	使用：
		<https://blog.csdn.net/u014707697/article/details/82013934>
		
	开启和关闭：
		<https://www.cnblogs.com/bruce-gou/p/5705627.html>
	


	目录：/home/wwwroot/tai  
	端口：真实（8100） 映射（90）  	  
	启动： npm install ->npm build -> npm run dev





#################################################################
***
## MySQL操作
- 删除有外键关联的数据
>start transaction;
>SET FOREIGN_KEY_CHECKS = 0;
>delete from t_user where id!=2160;
>commit;
>SET FOREIGN_KEY_CHECKS = 1;


  