# MicroServices Example

## Projeto Exemplo de Arquitetura de Microserviços

### Back-End - Java Spring Boot

## Orquestração de Containers com Docker Compose

Ao realizar o download do projeto abra o **CMD** ou o **Terminal** em seu sistema operacional e execute:

```
docker-compose up --build
```

### Documentação do projeto

Após rodar o container utilize esta **URL**:

```
http://localhost:8080/swagger-ui/index.html#/

```

## Se um container não subir pode estar ocorrendo um conflito de porta:

#### Para evitar conflitos de portas nas aplicações:

**Confira se a porta 5432** está sendo utilizada em sua máquina:
No Windows, você pode usar:

```
netstat -ano | findstr :5432
```

Em sistemas baseados em Linux ou Mac, use o comando:

```
sudo lsof -i :5432
```

**Você pode encerrar o processo que está utilizando a porta**, copiando o PID(númeração lado direito)

No Windows, você pode usar:

```
taskkill /PID <numeroPID> /F
```

Em sistemas baseados em Linux ou Mac, use o comando:

```
sudo kill -9 <numeroPID>
```
