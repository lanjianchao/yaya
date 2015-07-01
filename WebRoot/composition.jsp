<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
    <title>xxxx作文培训机构</title>
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
    <div class="main">
        <div class="pleft">
            <div class="contactedit">
                <s:form name="myform" action="addMes.action" method="post">

                    <table border="0" cellpadding="0" cellspacing="0" width="756">
                        <tbody><tr height="40" valign="top">
                            <td valign="top" align="right">　　姓名：</td>
                            <td valign="top" align="left"><input class="inputw1" name="me.mesName" > <span style="color: #f00">*</span>
                            </td>
                        </tr>
                        <tr height="40" valign="top">
                            <td valign="top" align="right">文章标题：</td>
                            <td valign="top" align="left"><input class="inputw1" name="me.mesWriter" > <span style="color: #f00">*</span>
                            </td>
                        </tr>
                           <tr>
					          <td nowrap align="right" width="13%">年级:</td>
					          <td width="41%">
                                   <select id="mesGrade" name="me.mesGrade">
                                   <option value="二年级">二年级</option>
                                   <option value="三年级">三年级</option>
                                   <option value="四年级">四年级</option>
                                   <option value="五年级">五年级</option>
                                   <option value="六年级">六年级</option>
                                   <option value="初一">初一</option>
                                   <option value="初二">初二</option>
                                   <option value="初三">初三</option>
                                   </select>  
                                     </td>
					       </tr>
                        <tr height="240" valign="top">
                            <td valign="top" align="right">文章内容：</td>
                            <td valign="top" align="left"><textarea style="width: 560px; height: 247px;" name="me.mesContent" class="inputtxt1" required></textarea> <span style="color: #f00">*</span>
                            </td>
                        </tr>
                        <tr height="40" valign="middle">
                            <td colspan="2" align="center"><input class="btn1" value="提 交" type="submit"></td>
                        </tr>
                        </tbody></table>
                </s:form>
            </div>
            </div>

        <div class="pright">
           <div class="lan">
           <ul>
               <li >
                   <a href="all_passage.jsp">
                       全部作品
                   </a>
               </li>

               <li >
                   <a href="good_passage.jsp">
                       优秀作品
                   </a>
               </li>
               <li >
                   <a href="prize_passage.jsp">
                       获奖作品
                   </a>
               </li>
               <li >
                   <a href="public_passage.jsp">
                       已发表作品
                   </a>
               </li>
               <li  class="curr">
                   <a href="composition.jsp">
                     在线投稿
                       </a>
               </li>

               <li >
                   <a href="qiantaiBook1.action">
                       好书推荐
                   </a>
               </li>
               </ul>
           </div>

            <div classs="izone">

                    <div>
                        <a href="comments.jsp">
                            <img style="width:225px;height:150px" src="./images/lyb.jpg">
                        </a>
                    <div>
                        <a href="rencai.jsp">
                            <img style="width:225px;height:150px" src="./images/rczp.jpg">
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