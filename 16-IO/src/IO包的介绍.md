IO包的介绍
---
> java.io ——Provides for system input and output through data streams, serialization and the file system.

由此得出，I/O操作由三部分协同工作:
- streams        流
- serialization  序列化
- file system    file系统
----

12个接口 51个类

----

## 一、File类
学习File类是帮助我们对系统内文件和目录有一个基本对控制，如：
- 打开
- 删除
- 移动
- 创建
- ...

IDEA：
1. 输入文件名去搜索
2. 打印File数组

----

## 二、Input 和 Output
认识`InputStream`和`OutputStream`这两个IO的鼻祖，Java的IO系统的设计布局正是基于于此。<br/>
可以预见，后面遇到的各种数据源或接收源的处理都是从此继承实现

---

## 三、FilterInputStream 和 FilterOutputStream
在学习各种`xxxInputStream`或`xxxOutputStream`之前，有必要认识两个工具人：
- FilterInputStream
- FilterOutputStream

作为IO的第一继承者，这两个工具类为我们提供了一些实用的方法，避免造轮子，今后很多操作可以借助工具类的帮助

---

## 四、Reader 和 Writer
- `InputStream`和`OutputStream`是面向字节的
  - 也就是说它俩的家族主要是处理更基础的**字节**<br/>
- `Reader`和`Writer`是面向字符的

同样，他俩也有一对工具类：
- InputStreamReader
- OutputStreamWriter

用来处理In/OutputStream到Reader/Writer的转换

----

## 五、RandomAccessFile
RandomAccessFile独立于IO

适用场景：由大小已知的记录组成的文件

主要功能：
1. getFilePointer
2. seek
3. length
4. 指示读取方式

----

## 六、IO的典型使用

### 1.使用BufferReader
```java
        //将file文件路径读取成FileReader对象
        //主要是为了获取文件对象还能读写
        FileReader file = new FileReader(Filename);

        //使用BufferedReader是为了提高速度
        BufferedReader in = new BufferedReader(file);
        
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();

        return sb.toString();
```
### 2. 内存读取
