/**
 * Created by doubi.liu on 2017/10/17.
 */

//ajax传输json数据
function useajax(address, type, jsondata, callbackfunction) {
    if (jsondata != null) {
        $.ajax({
            type: type,
            contentType: 'application/json',
            url: address,
            dataType: 'json',
            data: jsondata,
            success: function (resdata) {
                callbackfunction(resdata);
            },
            error: function () {
                alert("error")
            }
        });
    } else {
        $.ajax({
            type: type,
            contentType: 'application/json',
            url: address,
            dataType: 'json',
            success: function (resdata) {
                callbackfunction(resdata);
            },
            error: function () {
                //alert("error")
            }
        });
    }
}
