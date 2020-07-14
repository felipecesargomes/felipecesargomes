<?php
//teste
session_start();
include_once("conexaofabrica.php");
?>


<html lang="pt-br">
<head>
  <meta charset="utf-8">
  <title>Crud - Listar</title>
</head>

<body>
  <a href="inserir.php">Cadastrar</a>

  <?php
  //teste
  echo "<h1>Listar usuários</h1>";
  if (isset($_SESSION['msg'])) {
    echo $_SESSION['msg'];
    unset($_SESSION['msg']);
  }

  $result_qnt_user = "SELECT COUNT(idusuarios) as qnt_usuarios from usuarios";
  $resultado_qnt_user = mysqli_query($conn, $result_qnt_user);
  $row_qnt_user = mysqli_fetch_assoc($resultado_qnt_user); //retorna a primeira linha e armazena na variavel row_qnt_user
  echo "<h3>" . "Quantidade de usuários: " . $row_qnt_user['qnt_usuarios'] . "</h3>";

  $result_usuarios = "SELECT user.idusuarios as iduser, user.nome as nomeuser, user.email as emailuser, sit.nome as nome_sit, nivac.nome as nivac_nome FROM usuarios user inner join situacaos sit on sit.idsituacaos = user.idsituacaos inner join niveis_acessos nivac ON nivac.idniveisacessos = user.idniveisacessos";
  $resultado_usuarios = mysqli_query($conn, $result_usuarios);

  while ($row_usuarios = mysqli_fetch_assoc($resultado_usuarios)) {
    echo "ID: " . $row_usuarios['iduser'] . "<br>";
    echo "Nome: " . $row_usuarios['nomeuser'] . "<br>";
    echo "Email: " . $row_usuarios['emailuser'] . "<br>";
    echo "Situação: " . $row_usuarios['nome_sit'] . "<br>";
    echo "Nível de Acesso: " . $row_usuarios['nivac_nome'] . "<br>";
    echo "<a href='editar.php?id=" . $row_usuarios['iduser'] . "'>Editar</a><br>";
    echo "<a href='projeto_crud_proc_apagar.php?id=" . $row_usuarios['iduser'] . "'>Apagar</a><hr>";
  }
  ?>

</body>

</html>
