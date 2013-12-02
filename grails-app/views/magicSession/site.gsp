<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="main"/>
<title>Magic session example</title>
</head>
<body>

	<div style="margin: 20px;">
		<h1>Magic session example</h1>
		<p>This page will present usage of magic session</p>
	</div>

	<g:javascript>
		$.get("${createLink(controller:'example')}", function(response) {
				console.log(response);
			});
	</g:javascript>
</body>
</html>