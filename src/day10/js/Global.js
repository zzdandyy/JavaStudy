// encodeURI() URL编码
var s1 = encodeURI("http://www.baidu.com?wd=你好");
alert(s1);
// decodeURI() URL解码
var s2 = decodeURI("%E4%BD%A0%E5%A5%BD");
alert(s2)

// encodeURIComponent() URL编码 会编码更多的字符 ? : // 等等
let s3 = encodeURIComponent("http://www.baidu.com?wd=你好");
alert(s3);
// decodeURIComponent() URL解码
let s4 = decodeURIComponent("http%3A%2F%2Fwww.baidu.com%3Fwd%3D%E4%BD%A0%E5%A5%BD");
alert(s4);


// parseInt()  逐一判断每一个字符是否是数字直到不是数字为止，然后把前面的字符串转换为number
var str ="123abc"
var num=parseInt(str);
alert(num+1);

// isNaN() 判断一个值是不是NaN,原因是NaN参与运算，全为NaN，所以不能用==NaN

//解析代码片段并执行
var jscode="alert(123)";
eval(jscode);



