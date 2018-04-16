<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="baselist.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="echarts.js"></script>
<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		 $.get("${ctx}/score/anAvgScore",function(data){ 
			//工厂名称
			var titles=new Array();
			//货物数量
			var numbers=new Array();
			//循环遍历集合
			for (var i = 0; i < data.length; i++) {
				titles[i]=data[i].subject;
				numbers[i]=data[i].score;
			} 
			// 基于准备好的dom，初始化echarts实例
			var myChart = echarts.init(document.getElementById('main'));

			// 指定图表的配置项和数据
	        var option = {
	            title: {
	                text: '学校单科最高分'
	            },
	            tooltip: {},
	            legend: {
	                data:['分数']
	            },
	            xAxis: {
	                data: titles
	            },
	            yAxis: {},
	            series: [{
	                name: '分数',
	                type: 'bar',
	                data: numbers
	            }]
	        };
			// 使用刚指定的配置项和数据显示图表。
		    myChart.setOption(option);
		 }) 
	})
	
</script> 
</head>
<body>
	<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
    <div id="main" style="width: 1000px;height:400px; top: 200px;left: 200px"></div>
</body>
</html>