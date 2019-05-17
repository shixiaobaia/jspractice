<%--
  Created by IntelliJ IDEA.
  User: zhangyang
  Date: 2019/5/11
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jquery-ajax的使用</title>
    <script src="/js/jquery-1.8.3.js"></script>
    <script>

        //页面载入事件
        $(function(){
            //给input 标签派点击事件:click()
            $("#btn").click(function () {
                //定义变量
                var url = "/jqueryAjax" ;
               // var params = "username=张三" ;//tomcat8.0以下:后台获取的参数会乱码:手动解码

                //params参数可以支持:json格式{"key":value}
                var params ={"username":"张三"} ;
                //发送ajax: 给服务器发送
                //方式1:$(this).load(url, [params], [callback]) :了解
                //url:后台地址
                //data:参数数据
                //callback:回调函数
               /*$(this).load(url,params,function (data) {
                    alert(data) ;
                });*/


               //方式2:get方式提交
                //$.get(url, [data], [callback], [type])
                //url:请求路径 data:请求参数  callback:服务器响应过来的数据(任意类型)
                //type:服务器响应成功返回过来 返回内容格式，xml, html, script, json(常用), text, _default
               /* $.get(url,params,function (data) {

                    //展示响应成功的数据
                    alert(data) ;
                }) ;*/

               //方式3://$.post(url, [data], [callback], [type])
               $.post(url,params,function (data) {//data:服务器返回的参数对象
                   alert(data.msg) ;
                },"json"); //在后台返回json格式回来

               //方式4:$.ajax([options])
               /* $.ajax({
                    "type":"get",
                    "url":url,
                    "sucess":function (data) {
                        alert(data) ;
                    },
                    "error":function () {},
                    "data":params,
                    "dataType":"json"
                }) ;*/

        });
            })
    </script>
</head>
<body>
<input type="button" value="发送ajax" id="btn">
</body>
</html>
