<?php
//teste
session_start();
?>

<html>

<head>
  <meta charset="utf-8">
  <title>Crud - Cadastrar</title>
</head>

<body>
  <a href="listar.php">Listar</a>
  <h1>Cadastrar Usuário</h1>

  <?php
  if (isset($_SESSION['msg'])) {
    echo $_SESSION['msg'];
    unset($_SESSION['msg']);
  }
  ?>

  <form method="POST" action="projeto_crud_proc.php">
    <label>Nome:</label>
    <input type="text" name="nome"><br><br>
    <label>Email:</label>
    <input type="email" name="email"><br><br>
    <input type="submit" value="Cadastrar">
  </form>

</body>

</html>