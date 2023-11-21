
# language: es
Característica: Login

  Escenario: Ingresar al login

    Dado que el usuario ingresa a la pagina opencart
    Cuando acciona la opcion my account-login
    Entonces ingresa a la pagina login



    Escenario: Usuario se logea correctamente

      Dado  que el usuario ingresa a la pagina opencart
      Y que se encuentra en la pagina login
      Cuando escribe su email y password
      Y acciona la opcion Login
      Entonces ingresa a la pagina myAccount



   Escenario: Login fallido, email incorrecto
     Dado  que el usuario ingresa a la pagina opencart
     Y que se encuentra en la pagina login
     Cuando escribe email incorrecto o no existente
     Y acciona la opcion Login
     Entonces se muestra la alerta


   Escenario: Login fallido, password incorrecto
     Dado  que el usuario ingresa a la pagina opencart
     Y que se encuentra en la pagina login
     Cuando escribe password incorrecto
     Y acciona la opcion Login
     Entonces se muestra la alerta





