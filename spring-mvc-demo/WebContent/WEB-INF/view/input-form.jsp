
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input From</title>
</head>
<body >
	
	<h1 style="color:tomato">Who is your Love </h1>
	<form action="viewForm" method="Get"> <!-- This action should be same as process form requestMapping("/....") -->
		<input type="text" placeholder="Enter name" name="myname"> <!-- Here name will be used as ID in next jsp to pull data -->
		<input type="Submit">
	</form>
</body>
</html>