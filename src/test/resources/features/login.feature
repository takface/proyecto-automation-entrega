#language: es

@regression
Característica: Login

  @TEST-2
  Escenario: Login correcto
    Dado que el usuario ingresa a la home
    Y el usuario ingresa al login
    Cuando el usuario se loguea con datos válidos
    Entonces se verifica que el usuario se logueo correctamente

  @TEST-3
  Escenario: Login incorrecto
    Dado que el usuario ingresa a la home
    Y el usuario ingresa al login
    Cuando el usuario se loguea con datos inválidos
    Entonces se muestra un mensaje de error de login