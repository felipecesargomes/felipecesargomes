<?php
//teste
session_start();

//utilizando "fábrica de conexão"
include_once("conexaofabrica.php");

//$nome = $_POST['nome'];
$id = filter_input(INPUT_GET, 'id', FILTER_SANITIZE_NUMBER_INT);

$result_usuarios = "DELETE FROM USUARIOS WHERE IDUSUARIOS='$id'";
$resultado_usuarios = mysqli_query($conn, $result_usuarios);

if(mysqli_affected_rows($conn)) {
  $_SESSION['msg'] = "<span style='color:green;'>Usuário deletado com sucesso</span>";
  header("Location: listar.php");
} else {
  $_SESSION['msg'] = "<span style='color:red;'>Usuário não foi deletado com sucesso</span>";
  header("Location: listar.php");
}