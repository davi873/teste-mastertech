# Teste MasterTech 

## Endpoints

### Classe UserController
##### /users
  - DESCRIÇÃO: Retorna todos os usuários cadastrados
  - TIPO: GET
  - REQUISIÇÃO: http://localhost:8080/users
  - RETORNO: 
  - ```sh
    [{
        "id": 1,
        "name": "Davi Pires",
        "cpf": 123456789,
        "dateRegister": "2020-06-12T17:11:06.994+00:00"
    },
    {
        "id": 2,
        "name": "Felipe Augusto",
        "cpf": 5544234,
        "dateRegister": "2020-06-12T17:11:40.246+00:00"
    }]
    ```
##### /users/id
  - DESCRIÇÃO: Retorna usuário pelo ID
  - TIPO: GET
  - REQUISIÇÃO: http://localhost:8080/user/2
  - RETORNO: 
  - ```json
    {
    "id": 2,
    "name": "Felipe Augusto",
    "cpf": 5544234,
    "dateRegister": "2020-06-12T17:11:40.246+00:00"
    }
    ```
##### /user
  - DESCRIÇÃO: Cadastra ou atualiza usuário
  - TIPO: POST
  - REQUISIÇÃO: http://localhost:8080/user
  - ```json
    {
    "name": "Felipe Augusto",
    "cpf": "5544234"
    }
    ```
  - RETORNO: ID do usuário cadstrado
  
 ##### /resgisterPonto
  - DESCRIÇÃO: Registra ponto do usuário
  - TIPO: POST
  - REQUISIÇÃO: http://localhost:8080/resgisterPonto
  - ```json
    {
    "user": { "id":1},
    "register":"S"    
    }
    ```
    -user: Objeto com id do usuário
    -register: S para saída e E para entrada
    
  - RETORNO: True se sucesso e false em caso de erro

##### /pontoByUser/idUser
  - DESCRIÇÃO: Lista de ponto do usuário
  - TIPO: GET
  - REQUISIÇÃO: http://localhost:8080/pontoByUser/1
  - RETORNO: 
  - ```json
    {
    "totalHours": 0.1,
    "lsPonto": {
        "2020-06-12T00:00:00.000+00:00": [
            {
                "id": 3,
                "user": {
                    "id": 1,
                    "name": "Davi Pires",
                    "cpf": 123456789,
                    "dateRegister": "2020-06-12T17:11:06.994+00:00"
                },
                "dateRegister": "2020-06-12T17:15:06.021+00:00",
                "register": "E"
            },
            {
                "id": 4,
                "user": {
                    "id": 1,
                    "name": "Davi Pires",
                    "cpf": 123456789,
                    "dateRegister": "2020-06-12T17:11:06.994+00:00"
                },
                "dateRegister": "2020-06-12T17:17:17.380+00:00",
                "register": "S"
            },
            {
                "id": 33,
                "user": {
                    "id": 1,
                    "name": "Davi Pires",
                    "cpf": 123456789,
                    "dateRegister": "2020-06-12T17:11:06.994+00:00"
                },
                "dateRegister": "2020-06-12T19:51:47.444+00:00",
                "register": "E"
            },
            {
                "id": 65,
                "user": {
                    "id": 1,
                    "name": "Davi Pires",
                    "cpf": 123456789,
                    "dateRegister": "2020-06-12T17:11:06.994+00:00"
                },
                "dateRegister": "2020-06-12T19:58:43.318+00:00",
                "register": "S"
            }
        ]
    }
}
    ```
  




