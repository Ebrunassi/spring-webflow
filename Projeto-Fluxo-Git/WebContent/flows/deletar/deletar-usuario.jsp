<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="${flowExecutionUrl}">

		<input type="hidden" name="_eventId" value="deletar-formulario"> 
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />

		Nome : 						<input type="text" name="nome" maxlength="40"><br>
		<input type="submit" value="Deletar" />

	</form>
</body>
</html>