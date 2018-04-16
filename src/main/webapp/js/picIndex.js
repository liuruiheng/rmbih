var aaa = (function (my) {
	function print(aaa){
		alert(aaa+"--aaaaa");
	}
	my.print = print;
	return my;
}(aaa || {}));

var aaa = (function (my) {
	function printb(aaa){
		alert(aaa+"--bbbbb");
	}
	my.printb = printb;
	return my;
}(aaa || {}));




var picModule = (function(my) {
	
	function getPicList(userId) {
//		alert("asdasd");
		$.ajax({
			type : "get",
			url : "/rmbih/pic/getPicList",
			data : {
				userId : userId
			},
			dataType : "json",
			async : false,
			success : function(data) {//data:images/1.jpg
				console.log(data);
				$("#sb-slider").html(template('picList', data));
				slicebox = $('#sb-slider').slicebox({
					cuboidsCount:10,
					cuboidsRandom:true,
					autoplay:false,
					interval:3000,
					disperseFactor : 30
				});
//				Page.init();
			}
		});
	}

	my.getPicList = function(userId) {
		getPicList(userId);
	};

	return my;
}(picModule || {}));



var picModule = (function(my) {

	function getPicList3(userId) {
//		alert("asdasd");
		$.ajax({
			type : "get",
			url : "/rmbih/pic/getPicList",
			data : {
				userId : userId
			},
			dataType : "json",
			async : false,
			success : function(data) {
				console.log(data);
				$("#sb-slider").html(template('picList', data));
				slicebox = $('#sb-slider').slicebox({
					cuboidsCount:10,
					cuboidsRandom:true,
					autoplay:false,
					interval:3000,
					disperseFactor : 30
				});
//				Page.init();
			}
		});
	}

	my.getPicList3 = getPicList3;

	return my;
}(picModule || {}));