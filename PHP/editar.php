<?php
//teste
session_start();
include_once("conexaofabrica.php");
$id = filter_input(INPUT_GET, 'id', FILTER_SANITIZE_NUMBER_INT);
$result_usuario = "SELECT idusuarios,nome,email from usuarios where idusuarios='$id' limit 1";
$resultado_usuario = mysqli_query($conn, $result_usuario);
$row_usuario = mysqli_fetch_assoc($resultado_usuario);
?>

<html>

<head>
  <meta charset="utf-8">
  <title>Crud - Editar</title>
</head>

<body>

  <a href="listar.php">Editar</a>
  <h1>Editar Usuário</h1>

  <?php
  if (isset($_SESSION['msg'])) {
    echo $_SESSION['msg'];
    unset($_SESSION['msg']);
  }
  ?>

  <form method="POST" action="projeto_crud_proc_editar.php">
    <label>Nome:</label>
    <input type="text" name="nome" value="<?php echo $row_usuario['nome']; ?>"><br><br>
    <label>Email:</label>
    <input type="email" name="email" value="<?php echo $row_usuario['email']; ?>"><br><br>
    <input type="hidden" name="id" value="<?php echo $row_usuario['idusuarios']; ?>"><br><br>
    <input type="submit" value="Editar">
  </form>

</body>

</html>