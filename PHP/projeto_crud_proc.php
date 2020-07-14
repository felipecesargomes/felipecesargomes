<?php

session_start();

//utilizando "fábrica de conexão"
include_once("conexaofabrica.php");

//$nome = $_POST['nome'];
$nome = filter_input(INPUT_POST, 'nome', FILTER_SANITIZE_STRING);
$email = filter_input(INPUT_POST, 'email', FILTER_SANITIZE_EMAIL);

$result_usuarios = "INSERT INTO usuarios (nome, email, IDSITUACAOS, idniveisacessos, created) values ('$nome','$email','1', '1',now())";
$resultado_usuarios = mysqli_query($conn, $result_usuarios);

if(mysqli_insert_id($conn)) {
  $_SESSION['msg'] = "<span style='color:green;'>Usuário cadastrado com sucesso</span>";
  header("Location: listar.php");
} else {
  "<span style='color:red;'>Usuário não foi cadastrado com sucesso</span>";
  header("Location: inserir.php");
}
