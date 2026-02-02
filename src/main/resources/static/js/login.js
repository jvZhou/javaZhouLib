function login() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var data = {
        userName: username,
        passWord: password
    };
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "proDuce/login", true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(JSON.stringify(data));
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            var code = JSON.parse(xhr.response).code;
            if ( code ===  "200") {
                alert("登录成功,后续做重定向跳转")
            }else{
                alert("登录失败")
            }
        }
    }
}