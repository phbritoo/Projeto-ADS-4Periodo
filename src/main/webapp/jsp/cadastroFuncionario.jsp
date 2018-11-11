<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Funcionário</title>
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="../css/Form.css" rel="stylesheet">
<link href="../css/creative.min.css" rel="stylesheet">
</head>
<body id="page-top">
	<c:import url="menu.jsp" />
	<header>
	<div class="container">
		<div class="row main">
			<div class="panel-heading">
				<div class="panel-title text-center">
					<h1 class="title">Cadastro de Funcionário</h1>
					<hr />
				</div>

			</div>
			<div class="main-login main-center">
				<form class="form-horizontal" method="post"
					action="<c:url value="../"></c:url>" id="Form1">

					<div class="form-group">
						<label for="name" class="cols-sm-2 control-label">Nome</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-user" aria-hidden="true"></i></span> <input
									type="text" class="form-control" name="nome" id="nome"
									placeholder="Digite seu nome" required="required" autofocus="" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="email" class="cols-sm-2 control-label">E-mail</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-envelope" aria-hidden="true"></i></span> <input
									type="email" class="form-control" name="email" id="email"
									placeholder="Digite seu E-mail" required="required"
									autofocus="" />
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<label for="name" class="cols-sm-2 control-label">Funcão</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-envelope" aria-hidden="true"></i></span> <input
									type="email" class="form-control" name="funcao" id="nome"
									placeholder="Funcao do Funcionario" required="required"
									autofocus="" />
							</div>
						</div>
					</div>



					<div class="form-group">
						<label for="password" class="cols-sm-2 control-label">Senha</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock" aria-hidden="true"></i></span> <input
									type="password" class="form-control" name="senha" id="senha"
									placeholder="Digite sua senha" required="required" autofocus="" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="confirm" class="cols-sm-2 control-label">Confirme
							sua senha</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-lock" aria-hidden="true"></i></span> <input
									type="password" class="form-control" name="csenha"
									id="confsenha" placeholder="Confirme sua senha"
									required="required" autofocus="" />
							</div>
						</div>
					</div>

					<div class="form-group ">
						<button type="submit"
							class="btn btn-primary btn-lg btn-block login-button">Cadastrar</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	</header>
</body>
</html>