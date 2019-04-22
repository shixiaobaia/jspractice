package com.bite.cookie.a_hello;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * cookie的基本使用
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1)设置编码
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        //2)创建Cookie数据 ,指定cookie名称和cookie的值
        Cookie c = new Cookie("aName","aValue") ;

        //3)由服务器携带回去
        response.addCookie(c);
        //4)提示:"cookie已写回"
        writer.print("cookie已写回");

        //获取Cookie:可以通过Request对象获取Cookie
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for(Cookie cookie:cookies){
                System.out.println(cookie.getName()+"="+cookie.getValue()   );
            }
        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
