<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>丫雅教育</title>
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
                minItems: 2,
                maxItems: 4,
                start: function(slider){
                    $('body').removeClass('loading');
                }
            });
        });
    </script>
</head>
<body>
<div class="h-bg">
<div class="wrap">
	<div class="header">
		<div class="logo">
		  	 <a href="indexQuery.action"><img src="./images/logo.jpg"> </a>
		 </div>
        <div class="nav">
            <ul>
                <li class="c6">
                    <a href="baoming.jsp">
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
                        Home
                        <br/>
                        <strong>首页</strong>
                    </a>
                </li>
            </ul>
        </div>
	 <div class="clear"></div>
	</div>
</div>
</div>
<div class="content_bg">
<div class="wrap">
<div class="content">
 <div class="imain">
     <div class="ileft">
 	<h2>教师风采</h2>
	<div class="clear"></div>
  <div class="teacher">

      <div class="each_teacher">
      <p>
          <img src="images/huang2.jpg">
          <br/>
          <h3 style="font-size: 20px;font-family: Microsoft YaHei">YY----黄老师</h3><br/>
          <p style="padding-right: 20px;">从事小学低中年级作文教学。是一位教学功底、亲和力、责任心和爱心兼备的老师，她的课堂活泼有序，方法灵活，她能根据孩子不同的年龄特点，因材施教，更是对孩子十分的细心和耐心。在课堂上充分能调动学生的积极性和主动性，让学生在学习过程中体验到学习的乐趣，体会到“我手抒我心”的快乐！她的教学工作深受学生和家长的好评！</p>

          <div class="clear"></div>
      </p>
      </div>

      <div class="each_teacher">
          <p>
              <img src="images/gao2.jpg">
              <br/>
          <h3 style="font-size: 20px;font-family: Microsoft YaHei">YY----高老师</h3><br/>
         教学工作中认真备课，精心设计每一讲的作文内容，在课堂教学中根据学生学习的情况，即使反思并调整教学设计，尽量让学生发挥学习的自主性，让孩子们快乐学习并学有所获，课堂上注重引导和鼓励学生，培养学生良好的品格和学习习惯，同时注重激发学生的学习兴趣，让学生在牢固掌握知识点的同时获得良好的学习方法。进入她的课堂后不久，你会发现，孩子们的发言活跃了，写作兴趣也增强了，作文也越写越出色了！

          <div class="clear"></div>
          </p>
      </div>
      <div class="each_teacher">
          <p>
              <img src="images/yang1.png">
              <br/>
          <h3 style="font-size: 20px;font-family: Microsoft YaHei">YY----杨老师</h3><br/>
          男，一直从事小学奥数、华数教学多年，在奥数上面有自己独特的教学方法，熟悉多套奥数、华数教材。对教材分析透彻，把握重点，因材施教，学生成绩优秀，多名学生获数学竞赛中获奖，所带历届毕业班的学生大部分考入了名校。

          <div class="clear"></div>
          </p>
      </div>
      <div class="each_teacher">
          <p>
              <img src="images/ls1.png">
              <br/>
          <h3 style="font-size: 20px;font-family: Microsoft YaHei">飞飞老师</h3><br/>
          教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介 教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介

          <div class="clear"></div>
          </p>
      </div>

      <div class="each_teacher">
          <p>
              <img src="images/ls1.png">
              <br/>
          <h3 style="font-size: 20px;font-family: Microsoft YaHei">飞飞老师</h3><br/>
          教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介 教师简介教师简介教师简介教师简介教师简介教师简介教师简介教师简介

          <div class="clear"></div>
          </p>
      </div>
      <div class="fenye" display="block;">
        

      </div>
  </div>
  
               <div id="fenye" class="plist" style="margin-top:6px;text-align:right;">
                    共２页 | 第１页
               <a href="staff.jsp">[首页</a> | <a href="staff.jsp" >上一页</a> | <a href="staff2.jsp" >下一页</a> | <a href="staff2.jsp" >末页</a>] 
             
                    </div>	
     </div>
     
     

     <div class="iright">

         <div classs="izone">
             <div>

                     <img style="height:520px" src="./images/xx.jpg">

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

 </div>
</div>

<div class="wrap">

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
    </div>
</body>
</html>