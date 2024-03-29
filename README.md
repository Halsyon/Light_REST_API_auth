# Реализация REST API на Spring Boot.

[![Build Status](https://app.travis-ci.com/Halsyon/Light_REST_API_auth.svg?branch=master)](https://app.travis-ci.com/Halsyon/Light_REST_API_auth)
![GitHub top language](https://img.shields.io/github/languages/top/Halsyon/Light_REST_API_auth?logo=java&logoColor=red)
![GitHub last commit](https://img.shields.io/github/last-commit/Halsyon/Light_REST_API_auth?logo=github)

Это простой проект,
представляет собой знакомство с RestFull API архитектурой клиент-серверного приложения

Used stack technologies:

- Java (Back-end)
- Libraries (java):
- Spring Boot
- Rest API
- Hibernate HQL/ JPA (data-base)
- PostgreSQL PSQL (data-base)
- Gson (parse JSON)
- Maven

Вы можете получить отчет содержащий всех текущих работников и их текущие роли авторизации

- curl -i -X DELETE http://localhost:8080/employeereport/4

![Image of Arch](https://github.com/Halsyon/Light_REST_API_auth/blob/master/image/Screenshot_1.jpg)
  
Вы можете создать нового работника с сохранением всей информации в БД

-  curl -H 'Content-Type: application/json' -X POST -d '{"name":"Petr","surname":"Shirokov","inn":"0258741"}' http://localhost:8080/employeereport/

![Image of Arch](https://github.com/Halsyon/Light_REST_API_auth/blob/master/image/Screenshot_2.jpg)
   
Вы можете произвести обновление записи о работнике в БД, 
либо если такого работника на данный момент не существует,
он будет добавлен по результату такого запроса, где "id":"4" текущий id в БД работника

- curl -i -H 'Content-Type: application/json' -X PUT -d '{"id":"4","name":"John","surname":"Conor","inn":"0000001"}' http://localhost:8080/employeereport/

![Image of Arch](https://github.com/Halsyon/Light_REST_API_auth/blob/master/image/Screenshot_5.jpg)
  
Вы можете удалить существующего работника из БД
- curl -i -X DELETE http://localhost:8080/employeereport/10

![Image of Arch](https://github.com/Halsyon/Light_REST_API_auth/blob/master/image/Screenshot_4.jpg)
![Image of Arch](https://github.com/Halsyon/Light_REST_API_auth/blob/master/image/Screenshot_3.jpg)

В свою очередь в браузере при желании вы можете тоже получить отчет от текущих сотрудниках и их ролях авторизации,
который будет след вида:
![Image of Arch](https://github.com/Halsyon/Light_REST_API_auth/blob/master/image/Screenshot_6.jpg)

