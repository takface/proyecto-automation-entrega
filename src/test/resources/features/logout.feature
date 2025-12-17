#language: es

@regression
  Característica: Logout

    @TEST-6

    Escenario: se realiza logout

  Dado que el usuario ingresa a la home
  Y usuario ingresa al login
  Cuando el usuario se desloguea
  Entonces se muestra mensaje de logout
