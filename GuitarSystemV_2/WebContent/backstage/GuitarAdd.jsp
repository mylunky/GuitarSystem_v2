<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>GuitarSystem-V2.0</title>
</head>
<body>
<center><h1>Guitar销售系统-V2.0</h1></center>
<hr/>
 <div><strong>添加Guitar</strong>&nbsp;&nbsp;需要查询请点击<a href="GuitarSearch.jsp">查询</a>！</div>
 <hr/>  
        <form action="addGuitar" method="post" class="am-form am-form-horizontal" >
          <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">序列号</label>
            <div class="am-u-sm-9">
              <input type="text" name="guitar.serialNumber">
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">制作人</label>
            <div class="am-u-sm-9">
              <input type="text" name="guitar.spec.builder">
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">模型</label>
            <div class="am-u-sm-9">
              <input type="text" name="guitar.spec.modelx">
            </div>
          </div>
		  
	      <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">类型</label>
            <div class="am-u-sm-9">
              <input type="text" name="guitar.spec.type"/>
            </div>
          </div>
		  
		  <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">背面木质</label>
            <div class="am-u-sm-9">
              <input type="text" name="guitar.spec.backWood">
            </div>
          </div>
		  
		  <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">顶部木质</label>
            <div class="am-u-sm-9">
              <input type="text" name="guitar.spec.topWood">
            </div>
          </div>
          
           <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">价格</label>
            <div class="am-u-sm-9">
              <input type="text" name="guitar.price"/>
            </div>
          </div>
	
          <div class="am-form-group">
            <div class="am-u-sm-9 am-u-sm-push-3">
              <input type="submit"  id="submit" value="提交"/>
            </div>
          </div>
        </form>
</html>
