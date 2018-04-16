<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>留下爱</title>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="/rmbih/css/demo.css" />
<link rel="stylesheet" type="text/css" href="/rmbih/css/slicebox.css" />
<link rel="stylesheet" type="text/css" href="/rmbih/css/custom.css" />
<script type="text/javascript" src="/rmbih/js/modernizr.custom.46884.js"></script>
<script type="text/javascript" src="/rmbih/js/dynamicLoading.js"></script>
<script type="text/javascript" src="/rmbih/js/template.js"></script>
<script type="text/javascript" src="/rmbih/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="/rmbih/js/jquery.slicebox.js"></script>
<script type="text/javascript" src="/rmbih/js/page.js"></script>
<script type="text/javascript" src="/rmbih/js/picIndex.js"></script>
</head>
<body>
	<div class="container">
		<h1>
			留下爱 <span>我们的足迹</span>
		</h1>

		<div class="more">
			<ul id="sb-examples">
				<li>照片</li>
			</ul>
		</div>

		<div class="wrapper">

			<ul id="sb-slider" class="sb-slider">
			</ul>

			<div id="shadow" class="shadow"></div>

			<div id="nav-arrows" class="nav-arrows">
				<a href="javascript:void(0);">Next</a> <a href="javascript:void(0);">Previous</a>
			</div>

		</div>
		<!-- /wrapper -->

		<p class="info">
			<strong>Example 3:</strong> Random orientation and number of slices
		</p>

	</div>
	<script type="text/javascript">
		$(function() {
			picModule.getPicList("1");
// 			
		});
	</script>

	<script id="picList" type="text/html">
		{{each list as value i}}
			<li>
				<a href="javascript:void(0);" target="_blank"><img src="{{value.picUrl}}" alt="" /></a>
				<div class="sb-description">
					<h3>{{value.picContent}}</h3>
				</div>
			</li>
		{{/each}}
	</script>

</body>
</html>
