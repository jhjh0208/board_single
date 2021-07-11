<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판</title>
    <link rel="stylesheet" type="text/css" href="../../themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../demo/demo.css">
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../js/jquery.easyui.min.js"></script>
</head>
<body>
    <p>size</p>
    <div style="margin:20px 0;"></div>
    <table class="easyui-datagrid" title="게시판" style="width:700px;height:250px"
            data-options="rownumbers:true,singleSelect:true,url:'datagrid_data1.json',method:'get',toolbar:toolbar">
        <thead>
            <tr>
                <th data-options="field:'itemid',width:80">글번호</th>
                <th data-options="field:'productid',width:100">제목</th>
                <th data-options="field:'listprice',width:80,align:'right'">작성일</th>
                <th data-options="field:'unitcost',width:80,align:'right'">첨부파일</th>
                <th data-options="field:'status',width:60,align:'center'">조회수</th>
            </tr>
        </thead>
        <tbody>
        <%for(int i = 0; i<10; i++){    %>
        	<tr>
        		<td>1</td>
        		<td>2</td>
        		<td>3</td>
        		<td>4</td>
        		<td>5</td>
        	</tr>
        	<%
        	}
        	%>
        </tbody>
    </table>
    
    <script type="text/javascript">
        var toolbar = [{
            text:'조회', 
            iconCls:'icon-search',
            handler:function(){alert('조회')}
        },{
            text:'입력',
            iconCls:'icon-add',
            handler:function(){alert('입력')}
        },{
            text:'수정',
            iconCls:'icon-edit',
            handler:function(){alert('수정')}
        },{
            text:'삭제',
            iconCls:'icon-cancel',
            handler:function(){alert('삭제')}
        }];
    </script>
</body>
</html>