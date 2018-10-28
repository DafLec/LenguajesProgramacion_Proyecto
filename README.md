# proyecto

## Conclusiones P2
Con este proyecto se busca anticipar las características físicas de criminales a partir de los datos de crímenes analizados de un dataset de Estados Unidos. Esto será posible si modificamos un poco la base de datos. Al momento de cargar los datos nos percatamos que la base de datos descargada de kaggle era demasiado grande y al momento de intentar cargarla el programa marcaba un error, por lo cual tuvimos que limitar el dataset. Asimismo el filtrado de los datos se complicó ya que algunos datos tenían un fin de línea antes de lo esperado y esto estaba alterando el orden de los datos. Tuvimos que editar un poco los datos a mano para poder cargarlos sin problema en el programa, filtrar los datos irrelevantes y normalizar los que usaríamos: quitamos varias columnas como la dirección del crimen o URLs a las noticias acerca del crímen para enfocarnos solo en las medidas relevantes o que parecen tener una relación con los resultados que buscamos. Así mismo, llenamos varios datos en blanco según las correlaciones con otros campos o eliminamos las filas con datos que fuese imposible recuperar y normalizamos columnas como la longitud y latitud de los crímenes que nos sirven para analizar la localización del atentado, se eligió esto en vez de eliminar las columnas de longitud y latitud debido a que en el país de análisis existe una segregación poblacional sustancial entre el norte y el sur, el este y el oeste y existen concentraciones de diferentes precursores de crímenes tales como armas y comunidades marginales basados en estas características. Creemos que vamos a tener que cambiar algunos de los datos, ya que son alfanuméricos, para en un futuro poder analizarlos con machine learning, sin embargo, esto puede ser realizado programáticamente en Clojure.

En el código en este repositorio se muestra un ejemplo burdo de la carga y división de los datos en sets de entrenamiento y prueba así como el diseño básico de una red neuronal que procese los mismos. La red fue hecha con la librería Cortex lo cual facilita mucho el proceso ya que evita tener que implementar todas las bases matemáticas así como los métodos de creación de redes y su entrenamiento que serían muy tediosas y tardadas si las hicieramos de cero. Cortex además, aprovecha muy bien el buen manejo de Clojure de matrices y vectores que son la base para el análisis con Machine Learning. En este momento, la red fue diseñada con parámetros estándar, pero será posible ajustarla a los datos y el problema con ayuda de Cortex para próximas iteraciones del proyecto. Por obvias razones concluimos que el uso de Cortex es extremadamente benéfico para este proyecto ya que nos facilitará el problema y ahorrará mucho tiempo, además de que no todos los partícipes del proyecto de clase conocen bien los fundamentos del aprendizaje automático y Cortex les permitirá implementar las redes neuronales con facilidad sin requerir dedicar demasiado tiempo a estos detalles innecesarios para la entrega. Por otro lado, nos preguntamos si Cortex cuenta con funcionalidad para la limpieza adicional requerida en los datos o si será necesaria y ventajosa la utilización de otra librería. Por suerte, la instalación del entorno de desarrollo ya fue configurada y con Leininger no debe haber problemas para agregar otras librerías que nos apoyen en este proyecto. 

Como se puede apreciar, la programación funcional y lenguajes como Clojure son perfectamente capaces de solucionar problemas que requieran Machine Learning para su solución e incluso pueden facilitar varias partes del proceso. Además el uso de librerías que realicen las operaciones complicadas y tardadas que no son específicas para un proyecto nos permiten solucionar una gran cantidad de problemas que de otra forma no sería posible o tomarían mucho más tiempo. 

## License

Copyright © 2018 Dafne Lecona Yoali Sotomayor
