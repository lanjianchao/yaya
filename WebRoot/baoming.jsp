<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML>
<html>
<head>
    <title>丫雅作文培训机构_我要报名</title>
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
        
    function check(){
    var flag;
    var checks = document.getElementsByName("applySub");
    for(var i=0;i<checks.length;i++){
    if(checks[i].checked==true){
    flag = true;
    return true;
    break;
    }
    }
    if(!flag){
    alert("请至少选择一项科目");
    return false;
    }
    }
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

<div class="content_bg">
<div class="wrap">
    <div class="main">
        <div class="pleft">
            <div class="contactedit">
              <s:form name="myform" action="addApply.action" method="post">

                    <table border="0" cellpadding="0" cellspacing="0" width="756">
                        <tbody><tr height="40" valign="top">
                            <td valign="top" align="right">　　姓名：</td>
                            <td valign="top" align="left"><input class="inputw1" name="ae.applyName"  required> <span style="color: #f00">*</span>
                            </td>
                        </tr>
                        <tr height="40" valign="top">
                            <td valign="top" align="right">　　性别：</td>
                            <td valign="top" align="left"><input id="man" name="ae.applySex" type="radio" value="男"  checked/>男
                           <input id="woman" name="ae.applySex" type="radio" value="女" />女 <span style="color: #f00">*</span></td>
                        </tr>
                        <tr height="40" valign="top">
                            <td valign="top" align="right">联系方式：</td>
                            <td valign="top" align="left"><input class="inputw1" name="ae.applyPhone" value=""  required> <span style="color: #f00">*</span>
                            </td>
                        </tr>
                        <tr height="40" valign="top">
                            <td valign="top" align="right">　　学校：</td>
                            <td valign="top" align="left"><input class="inputw1" name="ae.applySchool" value=""  required> <span style="color: #f00">*</span>
                            </td>
                        </tr>
                        <tr height="40" valign="top">
                            <td valign="top" align="right">　　年级：</td>
                            <td valign="top" align="left">
                                <select id="grade" name="ae.applyGrade">
                                    <option value="一年级">一年级</option>
                                    <option value="二年级">二年级</option>
                                    <option value="三年级">三年级</option>
                                    <option value="四年级">四年级</option>
                                    <option value="五年级">五年级</option>
                                    <option value="六年级">六年级</option>
                                    <option value="初一">初一</option>
                                    <option value="初二">初二</option>
                                    <option value="初三">初三</option>
                                </select> <span style="color: #f00">*</span>
                            </td>
                        </tr>
                        <tr height="40" valign="top">
                            <td valign="top" align="right">　　科目： </td>
                            <td valign="top" align="left">
                                <input id="zuowen" name="applySub" type="checkbox" value="作文"  checked/>作文 &nbsp;
                                <input id="jichushuxue" name="applySub" type="checkbox" value="基础数学" />基础数学&nbsp;
                                <input id="aoshu" name="applySub" type="checkbox" value="奥数" />奥数&nbsp;
                                <input id="yingyu" name="applySub" type="checkbox" value="英语" />英语&nbsp;
                                <input id="xiezi" name="applySub" type="checkbox" value="写字" />写字&nbsp;
                            </td>
                        </tr>
                        <tr height="40" valign="top">
                            <td valign="top" align="right">　　 </td>
                            <td valign="top" align="left">
                                <input id="jiyi" name="applySub" type="checkbox" value="记忆" />记忆 &nbsp;
                                <input id="weiqi" name="applySub" type="checkbox" value="围棋" />围棋&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input id="zhuchi" name="applySub" type="checkbox" value="主持" />主持&nbsp;
                                <input id="meishu" name="applySub" type="checkbox" value="美术" />美术&nbsp;
                                <input id="jiqiren" name="applySub" type="checkbox" value="机器人" />机器人&nbsp;
                                <input id="xinli" name="applySub" type="checkbox" value="心理讲座" />心理讲座&nbsp;
                            </td>
                        </tr>



                        <tr height="240" valign="top">
                            <td valign="top" align="right">备注说明：</td>
                            <td valign="top" align="left"><textarea style="width: 560px; height: 290px;" name="ae.applyContent" class="inputtxt1"></textarea>
                            </td>
                        </tr>
                        <tr height="40" valign="middle">
                          <td colspan="2" align="center"><input class="btn1" value="提 交" type="submit" onclick="return check();"></td>
                        </tr>
                        </tbody></table>
                </s:form>
            </div>
            </div>

        <div class="pright">


            <div classs="izone">
                <div>

                        <img style="width:225px;height:180px" src="./images/yy.jpg">

                </div>

                    <div>
                        <a href="comments.jsp">
                            <img style="width:225px;height:150px" src="./images/lyb.jpg">
                        </a>
                    </div>

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
