

## LINUX命令

+ linux查看版本当前操作系统发行信息
	+ 1.cat /etc/issue
	>  cat /etc/issue  
	>  cat /etc/centos-release  
	>  CentOS release 6.9 (Final)
	
	- 2.使用 lsb_release -a
	>  lsb_release -a

   	----- 如果没有安装需要安装 -----
	> yum install -y redhat-lsb

- netstat -ntlp  
	- 显示网络状态 
 
- htop
 - 快速查看关键性能统计数据，如CPU（多核布局）、内存/交换使用

- df
	- 检查linux服务器的文件系统的磁盘空间占用情况
		- -a 全部文件系统列表
		- -h 方便阅读方式显示
		- -i 显示inode信息




- PWDX
	- 查找程序执行路径

	>pwdx 1555  
 

- ps -ef|grep PID
	- 进程详情查看


- 恢复操作
	>cd /www/server/panel  
	>python main.pyc 8888



- 进入钱包测试网络控制台
 	>  ./geth --datadir ./test  --syncmode "full" --maxpeers 999 --rpc --rpcapi "db,eth,net,web3,personal,miner,admin" --rpcaddr 0.0.0.0 --rpcport 3331 console




- 传输文件  
	- rz 上传  
	- sz 下载



## Mysql

+ 进入命令模式

解决方案一：
~~~

mysql/bin目录没有添加到path里面

所以要cd 到mysql/bin目录下然后 ./mysql  -uroot -p密码

~~~

解决方案二：
~~~
修改/etc/profile文件，在文件末尾添加
PATH=/usr/local/mysql/bin:$PATH
export PATH
关闭文件，运行下面的命令，让配置立即生效
source /etc/profile
~~~


- 创建utf-8 数据库
	>CREATE DATABASE tp_wallet DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

+ 查看当前使用的数据库；
 	>select database();

+ 备份表结构 
	+ 进入MySQL的bin目录执行
	> ./mysqldump -h127.0.0.1 -uroot -pETEx123456 -d db_exchange_etex > /home/db_exchange_etex.sql
 


-  备份数据库
	>mysqldump -u root -p --databases db_exchange | gzip > /home/db_exchange20190215.sql.gz

-  解压备份的数据库文件
	>gunzip db_exchange20190215.sql.gz

+ 同一个服务器拷贝数据库
	+ 创建需要拷贝的数据库(db_exchange_etoken)
	+ 退出命令行执行
	> ./mysqldump db_exchange_prod -uroot -proot --add-drop-table | ./mysql db_exchange_etoken -uroot -proot   




## 开放服务器端口
+ 查看开放端口
	>iptables -L


+ 开放23端口
	>firewall-cmd --permanent --add-port=23/tcp  
firewall-cmd --reload

+ 开放8889端口
	>iptables -I INPUT -p tcp --dport 8889 -j ACCEPT

~~~
zookeeper开放端口：

$ sudo /sbin/iptables -I INPUT -p tcp --dport 2181 -j ACCEPT
$ sudo /sbin/iptables -I INPUT -p tcp --dport 2888 -j ACCEPT
$ sudo /sbin/iptables -I INPUT -p tcp --dport 3888 -j ACCEPT

$ sudo /etc/rc.d/init.d/iptables save
$ sudo /etc/init.d/iptables restart

$ sudo /sbin/iptables -L -n
Chain INPUT (policy ACCEPT)
target     prot opt source               destination         
ACCEPT     tcp  --  0.0.0.0/0            0.0.0.0/0           tcp dpt:3888 
ACCEPT     tcp  --  0.0.0.0/0            0.0.0.0/0           tcp dpt:2888 
ACCEPT     tcp  --  0.0.0.0/0            0.0.0.0/0           tcp dpt:2181
~~~


## NGINX
~~~
进入安装目录：
	cd /usr/local/nginx

检查配置文件语法
	../sbin/nginx -t

重启
	../sbin/nginx -s reload
~~~





## 查看隐藏文件
> ll  -a




