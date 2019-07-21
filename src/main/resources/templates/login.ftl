<html>
<#include "common/header.ftl">

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" method="post" action="/sell/hello/check">
                <div class="form-group">
                    <label for="exampleInputEmail1">账号</label><input  class="form-control" id="userId" />
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">密码</label><input type="password" class="form-control" id="passWord" />
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
    </div>
</div>
</html>