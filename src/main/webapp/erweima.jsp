<!DOCTYPE title PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
<title>使用jquery.qrcode.js生成随机二维码实战</title>  
<script type="text/javascript" src="https://cdn.bootcss.com/lrsjng.jquery-qrcode/0.14.0/jquery-qrcode.js"></script>  
<script type="text/javascript" src="https://cdn.bootcss.com/lrsjng.jquery-qrcode/0.14.0/jquery-qrcode.min.js"></script>  
<script type="text/javascript" src="http://code.jquery.com/jquery-1.8.3.min.js"></script>  
<script type="text/javascript">  
function displayqrcode(){  
    //使用qrcode.js生成随机二维码，使用jquery生成随机二维码  
    $('#order_code_div').qrcode({  
        text:$('#order_code').val(), //根据 $('#order_code').val() 的值，生成随机二维码    
        render:"canvas",             //设置渲染方式    
        width:180,                    //设置宽度，可以自己根据需要调整    
        height:180                    //设置高度，可以自己根据需要调整    
    });       
}  
</script>  
</head>  
<body>  
    <div>如果需要提供帮助，请留言，博主看到会回复...</div>  
    <!-- 根据随机值，生成二维码 -->  
    <div><input type="text" id="order_code"/></div>  
    <div><input type="button" value="点击生成二维码" onclick="displayqrcode();"></div>  
    <div>  
    <div>下面显示生成的二维码：</div>  
    <div id="order_code_div"></div>  
    </div>  
</body>  