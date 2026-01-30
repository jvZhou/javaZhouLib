function login() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    alert("username:" + username + " password:" + password)
    var data = {
        username: username,
        password: password
    };
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/javaZhou/login", true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            if (xhr.status === 200) {        }    }
    }
}