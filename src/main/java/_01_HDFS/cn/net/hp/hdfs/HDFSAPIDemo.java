package _01_HDFS.cn.net.hp.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * java客户端操作【HDFS（hadoop file system）】
 * 环境：VMware虚拟机，创建3个CentOS 6.8虚拟系统节点，安装jdk1.8，ssh；安装hadoop-2.9.1，搭建集群；
 * windows10安装同版本jdk/hadoop（*替换bin目录，本地依赖支持）；ssh工具Xshell 6；执行sbin下的命令启动HDFS；
 * @Author huangpeng
 */
public class HDFSAPIDemo {
    /*流程模板：
    1,创建和HDFS交互的客户端对象{URI:HDFS主机路径：端口；Configuration对象；String：用户}；
    2，通过API调用对应的方法，执行操作;
    3,关闭连接；
    */

    //使用全局变量初始化FileSystem对象；
    private Configuration conf = new Configuration();
    private URI uri;

    {
        try {
            //IP可通过修改，自定义主机名；
            uri = new URI("hdfs://192.168.136.129:9000");

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private String user = "javaCli";
    private FileSystem fs;
    {
        try (FileSystem fileSystem = FileSystem.get(uri, conf, user )) {

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //一、目录的创建、删除、重命名；
    @Test
    public void testDirOperating() throws Exception {

    }



    //二、文件目录信息查看；
    //三、文件是否存在，上传/下载；
    //四、文件内容查看、写入、读取文件指定的长度；

}
