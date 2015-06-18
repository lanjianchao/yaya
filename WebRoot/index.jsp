<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML>
<html>
<head>
    <title>丫雅教育_首页</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href='http://fonts.googleapis.com/css?family=Pompiere' rel='stylesheet' type='text/css'>
    <link href="./css/qiantaicss.css" rel="stylesheet" type="text/css" media="all" />
    <!--slider-->
    <link href="./css/flexslider.css" rel="stylesheet" type="text/css" media="all" />
    <script src="./js/jquery-1.7.1.min.js" type="text/javascript"></script>
    <script src="./js/jquery.flexslider.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function(){
            SyntaxHighlighter.all();
        });
        $(window).load(function(){
            $('.flexslider').flexslider({
                animation: "slide",
                animationLoop: false,
                itemWidth: 210,
                itemMargin: 5,
                minItems: 1,
                maxItems: 1,
                start: function(slider){
                    $('body').removeClass('loading');
                }
            });
        });
    </script>
</head>
<body>

<div class="qq">

</div>

<div class="con">


    <a  target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=1191271838&site=qq&menu=yes">客服一号：<img src="./images/qq.jpg" align="absmiddle"/></a>

    <a  target="_blank" href="http://www.baidu.com">客服二号：<img src="./images/qq.jpg" align="absmiddle"/></a>
    <a  target="_blank" href="http://www.baidu.com">客服三号：<img src="./images/qq.jpg" align="absmiddle"/></a>
    <a  target="_blank" href="http://www.baidu.com">客服一号：<img src="./images/qq.jpg" align="absmiddle"/></a>
    <a  target="_blank" href="http://www.baidu.com">客服二号：<img src="./images/qq.jpg" align="absmiddle"/></a>


</div>

<script type="text/javascript"src="js/jquery.js"></script>
<script type="text/javascript">
    $(".qq").hover(function(){
        $(".qq").animate({right:"-150"},500,function(){$(".con").animate({right:"0px"},500);});
    });
    $(".con").mouseleave(function(){
        $(".con").animate({right:"-234"},500,function(){$(".qq").animate({right:"-90"},500);});
    });


</script>


<div class="h-bg">
    <div class="wrap">
        <div class="header">
            <div class="logo">
                <a href="indexQuery.action"><img src="./images/logo.jpg"> </a>
            </div>

            <div class="nav">
                <ul>
                    <li class="c6">
                        <a href="baoming.html">
                            Contact
                            <br/>
                            <strong>我要报名</strong>
                        </a>
                    </li>
                    <li class="c5">
                        <a href="star.jsp">
                            Star
                            <br/>
                            <strong>丫雅之星</strong>
                        </a>
                    </li>
                    <li class="c2">
                        <a href="all_passage.jsp">
                            Essay
                            <br/>
                            <strong>作文专区</strong>
                        </a>
                    </li>

                    <li class="c3">
                        <a href="news.jsp">
                            Training
                            <br/>
                            <strong>丫雅培训</strong>
                        </a>
                    </li>

                    <li class="c4">
                        <a href="staff.jsp">
                            Teacher
                            <br/>
                            <strong>教师风采</strong>
                        </a>
                    </li>

                    <li class="c0">
                        <a href="about.html">
                            About
                            <br/>
                            <strong>学校介绍</strong>
                        </a>
                    </li>
                    <li class="c7">
                        <a href="indexQuery.action">
                                     Home       <br/>
                            <strong>首页</strong>
                        </a>
                    </li>

                </ul>
            </div>

            <div class="clear"></div>
        </div>
    </div>
</div>
<div class="wrap">
 <section class="slider">
        <div class="flexslider carousel">
          <ul class="slides">
  	    		<li>
  	    	    <img src="./images/s1.jpg" />
  	    		</li>
              <li>
                  <img src="./images/s2.jpg" />
              </li>
              <li>
                  <img src="./images/s3.jpg" />
              </li>
           

          </ul>
        </div>
      </section>

</div>
</div>
<div class="cont_bg">
<div class="wrap">



     <div class="imain">
         <div class="ileft">
     <div class="inews l">
     <div class="top">
         <div class="title">
             Subject Activity |
             <span>主题活动</span>
         </div>
         <a href="activity.jsp">more>></a>
     </div>
     <div class="list">
         <ul>

          <s:iterator value="#session.actIndex" id="ae">
                 <li>
                     <a href="upAct.action?actId=<s:property value="#ae.actId"/>" ><s:property value="#ae.actTheme"/></a>
                     <span>20<s:property value="#ae.actDate"/></span>
                 </li>
                 </s:iterator>
         </ul>
     </div>
     </div>
     <div class="inews r">
         <div class="top">
             <div class="title">
                 School News |
                 <span>学校新闻</span>
             </div>
             <a href="news.jsp">more>></a>
         </div>
         <div class="list">
             <ul>
             <s:iterator value="#session.index" id="ne">
                 <li>
                     <a href="upNews.action?newsId=<s:property value="#ne.newsId"/>" ><s:property value="#ne.newsTheme"/></a>
                     <span>20<s:property value="#ne.newsDate"/></span>
                 </li>
                 </s:iterator>
             </ul>
         </div>
        </div>
             <div class="clear"></div>
             <div class="ithor">

                     <img class="adimg" src="./images/heng.jpg"></image></a>
              </div>




     <div class="daohang">
         <h3>名师风采</h3>
         <span style="float: right"><a href="staff.jsp">more>></a></span>
         </div>

     <div class="section group staff">
         <div class="listview_1_of_2 images_1_of_2">
             <div class="listimg listimg_2_of_1">
                 <a href="details.html"><img src="./images/001.jpg"></a>
             </div>
             <div class="txt_s list_2_of_1">
                 <h3>教师姓名</h3>
                 <p>简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介</p>
                 <div class="btn">
                     <a href="staff.jsp"> more <span>>></span></a>
                 </div>
             </div>
         </div>
         <div class="listview_1_of_2 images_1_of_2">
             <div class="listimg listimg_2_of_1">
                 <a href="staff.jsp"><img src="./images/002.jpg"></a>
             </div>
             <div class="txt_s list_2_of_1">
                 <h3>教师姓名</h3>
                 <p>简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介简介</p>
                 <div class="btn">
                     <a href="staff.html">more <span>>></span></a>
                 </div>
             </div>
         </div>
     </div>
     <div class="daohang">
         <h3>优秀作品</h3>
         <span style="float: right"><a href="good_passage.jsp">more>></a></span>
     </div>
     <div class="pleft">
         <div class="txtlist h200">
             <ul>
          <s:iterator value="#session.mesIndex" id="me">
                 <li>
                     <a href="upMes.action?mesId=<s:property value="#me.mesId"/>" ><s:property value="#me.mesName"/></a>
                     <span>20<s:property value="#me.mesDate"/></span>
                 </li>
                 </s:iterator>
                 </ul>
         </div>
         </div>
     </div>






<div class="iright">
    <div class="inewsalbum">
        <div class="top">家长感言</div>
        <div class="list">
            <ul>

                <li>

                    <a class="title" href="#">家长感言标题</a>
                    <p style="text-align:left">家长感言内容家长感言内容家长感言内容家长感言内容家长感言内容家长感言内容</p>
                </li>
                <li>

                    <a class="title" href="#">家长感言标题</a>
                    <p style="text-align:left">家长感言内容家长感言内容家长感言内容家长感言内容家长感言内容家长感言内容家长感言内容家长感言内容</p>
                </li>
                <li>

                    <a class="title" href="#">家长感言标题</a>
                    <p style="text-align:left">家长感言内容家长感言内容家长感言内容家长感言内容家长感言内容家长感言内容家长感言内容家长感言内容</p>
                </li>

            </ul>
        </div>
    </div>

    <div classs="izone">

        <div>

                <img style="height:150px;width: 225px" src="#">

        </div>


        <div>
            <a href="comments.jsp">
                <img style="height:150px" src="./images/lyb.jpg">
            </a>
        </div>

        <div>
            <a href="rencai.jsp">
                <img style="height:150px" src="./images/rczp.jpg">
            </a>
        </div>


        </div>

  </div>
 </div>

    <div class="clear"></div>

</div>

<div class="footer">
    <div style="text-align: center">
    <span style="font-size:  14px">
        版权所有 @ 湖南丫雅教育xxxx

    </span><br/>
         <span style="font-size:  12px">
        2015-05-30

    </span>
</div>
    </div>

</body>
</html>
