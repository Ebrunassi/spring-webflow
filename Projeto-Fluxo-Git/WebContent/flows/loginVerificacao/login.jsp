<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Teste</h3>
	<form action="${flowExecutionUrl}" method="post">
    	<input type="hidden" name="_eventId" value="faz-login"> 
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
		
		<input type="text" name="nome" maxlength="40"><br> 
		<input type="password" name="senha" maxlength="40"><br>
		<input type="submit" value="Login" />
	    
	</form>	
	
	<form action="${flowExecutionUrl}" method="post">
		<input type="hidden" name="_eventId" value="requisicao-cadastro">
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
		
		<input type="submit" value="Cadastrar" />
	</form>
	
	
	<form action="${flowExecutionUrl}" method="post">
		<input type="hidden" name="_eventId" value="requisicao-deletar">
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
		
		<input type="submit" value="Deletar" />
	</form>
</body>
</html>