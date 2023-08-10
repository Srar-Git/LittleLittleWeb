# 目录
- [Github文件管理](#Github文件管理)
	- [新建文件夹](#新建文件夹)
	- [文档内的目录](#文档内的目录)
	- [上传图片](#上传图片)
- [文档的后缀文件名](#文档的后缀文件名)
- [文档内格式](#文档内格式)
	- [语法格式](#语法格式)
	- [图片使用](#图片使用)

# Github文件管理
## 新建文件夹
https://blog.csdn.net/Maiduoudo/article/details/101061643

## 文档内的目录
如何写一个跟这篇的头头一样的目录？直接看这篇的目录,[]里和后面#后的文字和目录指向的标题吻合即可
格式如下:
```
- [Github文件管理](#Github文件管理)
	- [新建文件夹](#新建文件夹)
	- [文档内的目录](#文档内的目录)
	- [上传图片](#上传图片)
- [文档的后缀文件名](#文档的后缀文件名)
......
```

## 上传图片
建议所有用于文档的图片放入*LittleLittleWeb/Doc/Images*中，便于文档统一图片链接

# 文档的后缀文件名
文档的后缀文件名需要为.md文件才能读取Github的文档格式

# 文档内格式
## 语法格式
如何实现在文档内的加粗、斜体、引用、添加代码块等等功能，Github官方文档很详细啦，不懂得可以一起讨论  
**注意！提醒一下，如果打字想要转行，直接在末尾打两个空格就行啦**
- 这个是基础的语法格式  
https://docs.github.com/zh/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax
- 这个是高级的语法格式(我们应该用不到，这是表格，以及这篇文档下面的的都是高级语法格式)    
https://docs.github.com/zh/get-started/writing-on-github/working-with-advanced-formatting/organizing-information-with-tables
## 图片使用
**突然发现也可以直接用微信截图然后粘贴，在文档里直接按`Ctrl+V`就可以上传图片!!!**  
虽然官方文档里有写，但是我们可以直接用*LittleLittleWeb/Doc/Images*中的图片链接  
使用`!+[图片注释]+(相对链接)`来使用图片  
例子：使用/LittleLittleWeb/Doc/Images/Cassidy.png(在链接中不需要根文件夹也就是项目名LittleLittleWeb)  

```
![example icon](/Doc/Images/Cassidy.png)
```
![example icon](/Doc/其他文档/Images/Cassidy.png)

也可以使用`HTML`格式代码来改变图片的大小，例如使用如下代码呈现的效果(src=图片地址, width=图片宽度，px为像素)
```
<img src="/Doc/Images/Cassidy.png" width="500px">
```
<img src="/Doc/其他文档/Images/Cassidy.png" width="500px">
