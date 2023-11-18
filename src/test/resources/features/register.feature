# language: es

  Característica: Register

    Escenario: ingreso al register

      Dado que el usuario ingresa a la pagina opencart
      Y acciona la opcion my account-register
      Entonces ingresa a la pagina account



    Escenario: el usuario se registra correctamente

      Dado que el usuario ingresa a la pagina opencart
      Y acciona la opcion my account-register
      Cuando el usuario completa todos los campos
      Entonces se visualiza mensaje de creado correctamente
      Y se dirige a la pagina myAccount




    Escenario: el usuario se registra correctamente y si se subscribe

      Dado que el usuario ingresa a la pagina opencart
      Y acciona la opcion my account-register
      Cuando el usuario completa todos los campos subscribiendose
      Entonces se visualiza mensaje de creado correctamente
      Y se dirige a la pagina myAccount




    Escenario: el usuario deja los campos vacios

      Dado que el usuario ingresa a la pagina opencart
      Y acciona la opcion my account-register
      Cuando el usuario deja vacio los campos
      Entonces se verefican los mensajes  de error en los campos








   #Esquema del escenario: el usuario deja un campo vacio

     # Dado que el usuario ingresa a la pagina opencart
     # Y acciona la opcion my account-register
      #Cuando el usuario completa los campos con nombre "<nombre>", apellido "<apellido>", email "<email>", telefono "<telefono>", password "<password>"
      #Entonces se verefica el mensaje "<mensaje>" de error

      #Ejemplos:

      #| nombre | apellido | email | telefono | password | mensaje |
      #| juan   |    | pablo@gmail.com | 3516619221| 123456| Last Name must be between 1 and 32 characters!  |
      #|    | palacios | pablo1@gmail.com | 3516679221| 123456| First Name must be between 1 and 32 characters! |
      #| pedro   | gutierres  |       | 3516619223| 123456| E-Mail Address does not appear to be valid!         |
      #| lucas   | pereira  | pablo2@gmail.com |    | 123456| Telephone must be between 3 and 32 characters!    |
      #| matias  |  rodriguez   | pablo3@gmail.com | 3516614221|     | Password must be between 4 and 20 characters! |











