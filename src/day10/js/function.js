function fun1(a, b) {
    alert(a)
}

var fun2 = function (a, b) {
    alert(b)
}
fun1(1);
fun2(1, 2);

function  fun3(a,b){
    return a+b;
}


function add(){
    var sum =0;
    for (var i=0;i<arguments.length;i++){
        sum+=i;
    }
    return sum;
}
alert(add(1,2,5,6,7,9))