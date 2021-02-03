var arr1 = new Array(1, 2, 3, 4);
var arr2 = new Array(5);
var arr3 = [1, 2, 3];
var arr4 = [1, "abc", true];
document.write(arr1 + "<br>");
document.write(arr2 + "<br>");
document.write(arr3 + "<br>");
document.write(arr4 + "<br>"); //数组元素是可变的
document.write(arr4[1] + "<br>"); //访问数组元素
arr4[10] = '666'
document.write(arr4.length + "<br>"); //自动改变数组的长度

//Array的方法
//join 安装某一分隔符拼接数组中的元素
document.write(arr1.join("-") + "<br>");
//push 添加元素
arr1.push(5);
document.write(arr1 + "<br>");