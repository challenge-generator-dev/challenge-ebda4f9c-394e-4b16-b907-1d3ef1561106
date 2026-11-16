# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener el proyecto completo y arrancable. Guarda los archivos que te devuelva en la
carpeta del repo, respetando exactamente las rutas.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `src/main/kotlin/domain/infrastructure/controller/TaskController.kt` — La fase "Definición y creación de tareas" se implementa aqui: este archivo es el ejercicio.
- `src/main/kotlin/domain/application/usecase/UpdateTaskUseCase.kt` — La fase "Actualización de tareas" se implementa aqui: este archivo es el ejercicio.

## Lo que le falta a este proyecto

Esto NO lo tenes que adivinar: salio de comparar el proyecto contra la arquitectura declarada del reto y de un analisis estatico del codigo. Completalo TODO.

### Imports sin uso — no rompen la compilacion

Limpieza opcional: el proyecto compila igual con ellos:

- `src/main/kotlin/domain/infrastructure/controller/TaskController.kt` — `Task`

## Como saber que terminaste

```bash
mvn clean compile
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Kotlin, Senior L2

### Brecha de conocimiento
Construir una API REST en Kotlin con Ktor para gestionar tareas, Implementa endpoints REST en Kotlin con Ktor para crear, listar y actualizar tareas

### Misión / candidato
Exponer la gestion de tareas por HTTP

### Reto
- Tema: API REST de tareas con Kotlin y Ktor
- Seniority: senior-l2
- Tipo: practical
- Título: Implementación de API REST para gestión de tareas
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Definición y creación de tareas — objetivo: Implementar endpoints para crear y listar tareas — entregable (NO resolver): Dos endpoints funcionales: uno para crear tareas y otro para listar tareas.
- Fase 2: Actualización de tareas — objetivo: Implementar un endpoint para actualizar tareas — entregable (NO resolver): Un endpoint funcional para actualizar tareas.
- Fase 3: Validación y manejo de errores — objetivo: Mejorar la API con validaciones y manejo de errores — entregable (NO resolver): API mejorada con validaciones y manejo de errores.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (entrega de archivos).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Entrega de archivos
Entregá cada archivo con su ruta completa, respetando exactamente la estructura de rutas
indicada por los marcadores: un bloque por archivo, precedido por su ruta. No generes ZIPs
ni archivos adjuntos.
La entrega debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: Entregá los archivos completos al finalizar. No preguntes si el usuario
quiere recibirlos. Simplemente entregalos; No debes desplegar en el chat el resumen de lo que arreglaste, solo entregá los archivos.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del último archivo entregado
No preguntes si el usuario quiere los archivos: simplemente entregalos siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: pom.xml ===
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.example</groupId>
  <artifactId>ktor-skeleton</artifactId>
  <version>1.0.0</version>
  <packaging>jar</packaging>
  
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <kotlin.version>1.9.22</kotlin.version>
    <ktor.version>2.3.12</ktor.version>
    <jvm.target>21</jvm.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>io.ktor</groupId>
      <artifactId>ktor-server-core-jvm</artifactId>
      <version>${ktor.version}</version>
    </dependency>
    <dependency>
      <groupId>io.ktor</groupId>
      <artifactId>ktor-server-netty-jvm</artifactId>
      <version>${ktor.version}</version>
    </dependency>
    <dependency>
      <groupId>org.jetbrains.kotlin</groupId>
      <artifactId>kotlin-test-junit</artifactId>
      <version>${kotlin.version}</version>
      <scope>test</scope>
    </dependency>
      <dependency>
          <groupId>io.ktor</groupId>
          <artifactId>ktor-serialization-kotlinx-json-jvm</artifactId>
          <version>2.3.12</version>
      </dependency>
      <dependency>
          <groupId>io.ktor</groupId>
          <artifactId>ktor-server-content-negotiation-jvm</artifactId>
          <version>2.3.12</version>
      </dependency>
      <dependency>
          <groupId>io.ktor</groupId>
          <artifactId>ktor-server-status-pages-jvm</artifactId>
          <version>2.3.12</version>
      </dependency>
      <dependency>
          <groupId>org.jetbrains.kotlinx</groupId>
          <artifactId>kotlinx-coroutines-core</artifactId>
          <version>1.8.1</version>
      </dependency>
  </dependencies>

  <build>
    <sourceDirectory>${project.basedir}/src/main/kotlin</sourceDirectory>
    <testSourceDirectory>${project.basedir}/src/test/kotlin</testSourceDirectory>
    <plugins>
      <plugin>
        <groupId>org.jetbrains.kotlin</groupId>
        <artifactId>kotlin-maven-plugin</artifactId>
        <version>${kotlin.version}</version>
        <executions>
          <execution>
            <id>compile</id>
            <goals>
              <goal>compile</goal>
            </goals>
          </execution>
          <execution>
            <id>test-compile</id>
            <goals>
              <goal>test-compile</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.11.0</version>
        <configuration>
          <source>${jvm.target}</source>
          <target>${jvm.target}</target>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>

// === ARCHIVO: src/main/kotlin/com/example/Application.kt ===
package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.http.*
import domain.infrastructure.plugins.configureRouting

data class ErrorResponse(val error: String)

fun main() {
    embeddedServer(Netty, port = 8080, module = Application::module).start(wait = true)
}

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    install(StatusPages) {
        exception<IllegalArgumentException> { call, cause ->
            call.respond(
                HttpStatusCode.BadRequest,
                ErrorResponse(cause.message ?: "Bad request")
            )
        }
        exception<NoSuchElementException> { call, cause ->
            call.respond(
                HttpStatusCode.NotFound,
                ErrorResponse(cause.message ?: "Not found")
            )
        }
        exception<Exception> { call, cause ->
            call.respond(
                HttpStatusCode.InternalServerError,
                ErrorResponse("Internal server error")
            )
        }
    }
    configureRouting()
}

// === ARCHIVO: mvnw ===
#!/bin/sh
"exec" "$(dirname "$0")/mvnw" "$@"

// === ARCHIVO: mvnw.cmd ===
@REM
@REM Copyright 2007 The Apache Software Foundation.
@REM
@REM Licensed under the Apache License, Version 2.0 (the "License");
@REM you may not use this file except in compliance with the License.
@REM You may obtain a copy of the License at
@REM
@REM     http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing, software
@REM distributed under the License is distributed on an "AS IS" BASIS,
@REM WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@REM See the License for the specific language governing permissions and
@REM limitations under the License.

@IF "%MAVEN_SKIP_RC%" == "" @
@call :chkMHome
@IF ERRORLEVEL 1 @
@call "%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config" %MAVEN_CMD_LINE_ARGS%
@goto :continue

@:chkMHome
@REM Check for Maven home defined inside Maven wrapper distribution
@IF "%MAVEN_HOME%" == "" (
  @SET MAVEN_HOME=%~dp0\.mvn\wrapper\maven-wrapper
)

@:continue
@set CMD_LINE_ARGS=%*
@set MAVEN_JAVA_EXE="%JAVA_HOME%\bin\java.exe"
@set WRAPPER_JAR="%MAVEN_HOME%\maven-wrapper.jar"
@set WRAPPER_PROPS="%MAVEN_HOME%\maven-wrapper.properties"
@set WRAPPER_LOG="%MAVEN_HOME%\maven-wrapper.log"

@if exist %MAVEN_JAVA_EXE% (
  if exist %WRAPPER_JAR% (
    %MAVEN_JAVA_EXE% %MAVEN_OPTS% -classpath %WRAPPER_JAR% -Dmaven.multiModuleProjectDirectory="%MAVEN_PROJECTBASEDIR%" org.apache.maven.wrapper.MavenWrapperMain %CMD_LINE_ARGS%
  ) else (
    @echo Could not locate maven-wrapper.jar, using basic mvn commands
    @call mvn %CMD_LINE_ARGS%
  )
) else (
  @echo Could not locate java.exe, please check JAVA_HOME
)

// === ARCHIVO: .mvn/wrapper/maven-wrapper.properties ===
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.6/apache-maven-3.9.6-bin.zip
wrapperUrl=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.3.0/maven-wrapper-3.3.0.jar

// === ARCHIVO: src/main/kotlin/domain/domain/model/Task.kt ===
package domain.model

import java.util.UUID

data class Task(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val description: String?,
    val completed: Boolean = false
) {
    init {
        require(name.isNotBlank()) { "Task name cannot be blank" }
    }

    fun update(name: String?, description: String?, completed: Boolean?): Task {
        return this.copy(
            name = name ?: this.name,
            description = description ?: this.description,
            completed = completed ?: this.completed
        ).also {
            require(it.name.isNotBlank()) { "Task name cannot be blank" }
        }
    }
}

// === ARCHIVO: src/main/kotlin/domain/domain/repository/TaskRepository.kt ===
package domain.repository

import domain.model.Task

interface TaskRepository {
    suspend fun save(task: Task): Task
    suspend fun findById(id: String): Task?
    suspend fun findAll(): List<Task>
    suspend fun findByName(name: String): Task?
    suspend fun update(task: Task): Task
}

// === ARCHIVO: src/main/kotlin/domain/application/usecase/CreateTaskUseCase.kt ===
package domain.application.usecase

import domain.model.Task
import domain.repository.TaskRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CreateTaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(name: String, description: String?): Task {
        return withContext(Dispatchers.IO) {
            val existingTask = taskRepository.findByName(name)
            require(existingTask == null) { "A task with name '$name' already exists" }

            val task = Task(name = name, description = description)
            taskRepository.save(task)
        }
    }
}

// === ARCHIVO: src/main/kotlin/domain/application/usecase/ListTasksUseCase.kt ===
package domain.application.usecase

import domain.model.Task
import domain.repository.TaskRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ListTasksUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(): List<Task> {
        return withContext(Dispatchers.IO) {
            taskRepository.findAll()
        }
    }
}

// === ARCHIVO: src/main/kotlin/domain/application/usecase/UpdateTaskUseCase.kt ===
package domain.application.usecase

import domain.model.Task
import domain.repository.TaskRepository

class UpdateTaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(id: String, name: String?, description: String?, completed: Boolean?): Task {
        // TODO(reto): Implementar la lógica para actualizar una tarea.
        // 1. Verificar que la tarea existe usando taskRepository.findById(id)
        // 2. Si no existe, lanzar una excepción con mensaje "Task not found"
        // 3. Usar el método update de la entidad Task para crear una nueva versión actualizada
        // 4. Persistir la tarea actualizada usando taskRepository.update(task)
        // 5. Retornar la tarea actualizada
        throw NotImplementedError("UpdateTaskUseCase not implemented")
    }
}

// === ARCHIVO: src/main/kotlin/domain/infrastructure/repository/InMemoryTaskRepository.kt ===
package domain.infrastructure.repository

import domain.model.Task
import domain.repository.TaskRepository
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class InMemoryTaskRepository : TaskRepository {
    private val tasks = mutableListOf<Task>()
    private val mutex = Mutex()

    override suspend fun save(task: Task): Task {
        mutex.withLock {
            tasks.add(task)
            return task
        }
    }

    override suspend fun findById(id: String): Task? {
        mutex.withLock {
            return tasks.find { it.id == id }
        }
    }

    override suspend fun findAll(): List<Task> {
        mutex.withLock {
            return tasks.toList()
        }
    }

    override suspend fun findByName(name: String): Task? {
        mutex.withLock {
            return tasks.find { it.name == name }
        }
    }

    override suspend fun update(task: Task): Task {
        mutex.withLock {
            val index = tasks.indexOfFirst { it.id == task.id }
            if (index != -1) {
                tasks[index] = task
            }
            return task
        }
    }
}

// === ARCHIVO: src/main/kotlin/domain/infrastructure/controller/TaskController.kt ===
package domain.infrastructure.controller

import domain.application.usecase.CreateTaskUseCase
import domain.application.usecase.ListTasksUseCase
import domain.application.usecase.UpdateTaskUseCase
import domain.model.Task
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.util.*
import kotlinx.coroutines.runBlocking

@KtorExperimentalAPI
class TaskController(
    private val createTaskUseCase: CreateTaskUseCase,
    private val listTasksUseCase: ListTasksUseCase,
    private val updateTaskUseCase: UpdateTaskUseCase
) {
    suspend fun createTask(call: ApplicationCall) {
        TODO("reto: implementa") // TODO(reto)
    }

    suspend fun listTasks(call: ApplicationCall) {
        TODO("reto: implementa") // TODO(reto)
    }

    suspend fun updateTask(call: ApplicationCall) {
        TODO("reto: implementa") // TODO(reto)
    }
}

// === ARCHIVO: src/main/kotlin/domain/infrastructure/plugins/Routing.kt ===
package domain.infrastructure.plugins

import domain.application.usecase.CreateTaskUseCase
import domain.application.usecase.ListTasksUseCase
import domain.application.usecase.UpdateTaskUseCase
import domain.infrastructure.controller.TaskController
import domain.infrastructure.repository.InMemoryTaskRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.util.*
import kotlinx.coroutines.runBlocking

@KtorExperimentalAPI
fun Application.configureRouting() {
    val taskRepository = InMemoryTaskRepository()
    val createTaskUseCase = CreateTaskUseCase(taskRepository)
    val listTasksUseCase = ListTasksUseCase(taskRepository)
    val updateTaskUseCase = UpdateTaskUseCase(taskRepository)
    
    val taskController = TaskController(
        createTaskUseCase = createTaskUseCase,
        listTasksUseCase = listTasksUseCase,
        updateTaskUseCase = updateTaskUseCase
    )

    routing {
        route("/api/tasks") {
            post {
                runBlocking {
                    taskController.createTask(call)
                }
            }
            
            get {
                runBlocking {
                    taskController.listTasks(call)
                }
            }
            
            put("/{id}") {
                runBlocking {
                    taskController.updateTask(call)
                }
            }
        }
        
        get("/health") {
            call.respond(mapOf("status" to "OK"))
        }
    }
}
```
