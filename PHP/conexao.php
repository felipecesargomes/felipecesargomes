<?php

//Parametros da conexão em uma string
$servidor = "localhost";
$usuario = "root";
$senha = "";
$dbname = "teste";

//utilizando "fábrica de conexão"
$conn = mysqli_connect($servidor, $usuario, $senha, $dbname); 

$nome = "Felipe";
$email = "felip@gmail.com";
$result_usuarios = "INSERT INTO usuarios (nome,email,niveis_acesso_id,situacao_id) values ('$nome','$email',2,3)";
$resultado_usuario = mysqli_query($conn, $result_usuarios);
echo mysqli_insert_id($conn);

if(mysqli_insert_id($conn)) {
  echo "Inserido com sucesso <br>";
  echo mysqli_insert_id($conn);
} else {
  echo "erro ao inserir! <br><br>";
}

//Armazendando uma query em string
$result_usuarios = "SELECT idusuario, nome, email FROM USUARIOS";

//Conectando no banco de dados e executando querySQL
$resultado_usuario = mysqli_query($conn, $result_usuarios);

//pecorrer vetores associativos e armazenando em uma variavel obj chamada usuário para cada linha existente
while($row_usuario = mysqli_fetch_assoc($resultado_usuario)) {
    echo "ID: " . $row_usuario['idusuario'] . "<br>";
    echo "Nome: " . $row_usuario['nome'] . "<br>";
    echo "Email: " . $row_usuario['email'] . "<br><hr>";
}
