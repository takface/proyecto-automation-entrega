#language: es

@regression

Característica: logout

@TEST-6

Escenario: se realiza logout
Dado que el usuario ingresa a la home
Y el usuario ingresa al login
Cuando el usuario se loguea con datos válidos
Y el usuario se desloguea
Entonces se muestra mensaje de logout
