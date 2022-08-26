/*
 * @Author: Liu Li liuliwoku1@163.com
 * @Date: 2022-08-25 17:28:45
 * @LastEditors: Liu Li liuliwoku1@163.com
 * @LastEditTime: 2022-08-26 09:40:09
 * @FilePath: \javapr\leetcode\module-info.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */

 module hello.world {
   exports com.javapr.test; //只有声明导出的包，外部代码才允许访问

   
    requires java.base; // don't write is ok
    requires java.xml;
 }

//  $ jlink --module-path hello.jmod --add-modules java.base,java.xml,hello.world --output jre/

/* 打开cmd.exe

1. 切换工作目录到oop-module，在当前目录下编译所有的.java文件，并存放到bin目录下，命令如下：

D:\Program Files\Eclipse\oop-module>javac -d bin src/module-info.java src/com/itranswarp/sample/*.java

编译成功，原来空白的bin目录下多了class文件：

src目录下的module-info.java被编译到bin目录下的 module-info.class；

src目录下的com/itranswarp/sample/Main.java 和 Greeting.java 被编译到bin/com/itranswarp/sample目录下的

Main.class 和 Greeting.class

2. 把bin目录下的所有class文件先打包成jar:

D:\Program Files\Eclipse\oop-module>jar --create --file hello.jar --main-class

com.itranswarp.sample.Main -C bin .

(bin后面是空格再加点（.）表示当前目录)

编译成功后，当前目录增加一个hello.jar文件；

可以直接运行：java -jar hello.jar

3. 把jar包转换成模块（.jmod）:

D:\Program Files\Eclipse\oop-module>jmod create --class-path hello.jar hello.jmod

编译成功后，当前目录下得到一个hello.jmod模块文件；

可以直接运行：java --module-path hello.jar --module hello.world

4. 打包JRE，jlink裁剪程序用到的模块

D:\Program Files\Eclipse\oop-module>jlink --module-path hello.jmod --add-modules

java.base,java.xml,hello.world --output jre/

5. 切换到jre目录，运行JRE

D:\Program Files\Eclipse\oop-module\jre\bin>java --module hello.world */