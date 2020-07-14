<?php
//teste
setcookie("logado", "Cesar", (time() + (100000000))); //Seta cookie com tempo de 100000000seg
if (isset($_COOKIE["logado"])) { //sessão logado existe ?
	echo $_COOKIE["logado"] . "<br>";
} else {
	echo "Cookie inválido <br>";
}

//Seta sessão
$_SESSION['usuario'] = "cesar@celke.com.br";
$_SESSION['senha'] = "123abc";
echo "Usuário: " . $_SESSION['usuario'] . "<br>";
echo "Senha: " . $_SESSION['senha'] . "<br>";

//unset($_SESSION['usuario']); - destruir sessão
//unset($_SESSION['senha']);

echo "Usuário: " . $_SESSION['usuario'] . "<br>";
echo "Senha: " . $_SESSION['senha'] . "<br>";
