var reg1 = new RegExp("\\w{6,12}");
var reg2 = /^\w{6,12}$/;

var username="sssssdd5sss";
var flag=reg1.test(username);

alert(flag)