ForoHub API - Challenge Alura
ForoHub es una API REST desarrollada en Java con Spring Boot 3 para gestionar los tópicos de un foro de discusión. Este proyecto es parte del desafío de back-end del programa Oracle Next Education (ONE).

Estado del Proyecto: Paso 11 Finalizado
La API implementa un CRUD completo para la gestión de tópicos con las siguientes funcionalidades:

Registro de Tópicos (POST /topicos): Permite crear nuevos temas validando que no existan duplicados (título y mensaje idénticos).

Listado Paginado (GET /topicos): Consulta de todos los tópicos con paginación de 10 elementos por defecto, ordenados por fecha de creación.

Detalle de Tópico (GET /topicos/{id}): Visualización completa de un tópico específico.

Actualización (PUT /topicos/{id}): Edición de título y mensaje con validación de existencia de ID y reglas de negocio.

Eliminación (DELETE /topicos/{id}): Borrado físico de registros de la base de datos tras verificar su existencia.

Manejo de Errores: Respuestas estándar como 404 Not Found para IDs inexistentes y 400 Bad Request para errores de validación.

Tecnologías Utilizadas
Java 17

Spring Boot 3

Spring Data JPA

Hibernate

MySQL 8.0

Flyway (Migraciones de base de datos)

Maven

Lombok

Validation (Bean Validation)

Endpoints de la API
POST /topicos: Registra un nuevo tópico.

GET /topicos: Lista tópicos con paginación.

GET /topicos/{id}: Detalle de un tópico específico.

PUT /topicos/{id}: Actualiza título o mensaje de un tópico.

DELETE /topicos/{id}: Elimina un tópico de la base de datos.

Configuración e Instalación
Clonar el repositorio.

Configurar la base de datos en MySQL llamada forohub_db.

Ajustar las credenciales en el archivo src/main/resources/application.properties.

Ejecutar la aplicación desde el IDE o con el comando ./mvnw spring-boot:run.

Desarrollado por Sebastian