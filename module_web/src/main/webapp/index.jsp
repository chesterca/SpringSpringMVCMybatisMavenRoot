<%--
  Created by IntelliJ IDEA.
  User: cxg
  Date: 2018/6/22
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

  <meta charset="utf-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <link rel="stylesheet"
        href="/css/bootstrap/bootstrap.min.css"/>
  <link rel="stylesheet"
        href="/css/bootstrap/bootstrap-theme.min.css"/>
  <link rel="stylesheet"
        href="/css/LineHeadDataBoard/pageLineHeadDataBoard.css"/>
  <script type="text/javascript"
          src="/plugins/jquery/jquery-3.2.1.min.js"></script>
  <script type="text/javascript"
          src="/plugins/bootstrap/bootstrap.min.js"></script>
  <script type="text/javascript"
          src="/plugins/common-utils/ajax/ajaxFunction.js"></script>
  <title>数据</title>
</head>
<body>
<script>
   $(document).ready(function () {

     $("#submitid").click(function () {
       var data=$("#selectid").val();

       alert(data);
       var  address='${pageContext.request.contextPath}/pageDataboard.do'
       var type='post';
       var callbackfunction = function (resdata) {

       };


       useajax(address, type, data, callbackfunction);
     });

   })

</script>

 <input type="text" class="" name ="selectid" id="selectid"/>
  <input  id="submitid" type="submit" value="查询"/>

</body>
</html>
