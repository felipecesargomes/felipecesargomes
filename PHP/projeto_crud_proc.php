<?php

//Parametros da conexão em uma string
$servidor = "localhost";
$usuario = "root";
$senha = "";
$dbname = "teste";

//utilizando "fábrica de conexão"
$conn = mysqli_connect($servidor, $usuario, $senha, $dbname); 

$nome = $_POST['nome'];
$email = $_POST['email'];

$result_usuarios = "INSERT INTO usuarios (nome, email, idniveisacesso, created) values ('$nome','$email','1', '3',now())";
$resultado_usuarios = mysqli_query($conn, $result_usuarios);

if(mysqli_insert_id($conn)) {
  header("Location: listar.php");
} else {
  header("Location: inserir.php");
}