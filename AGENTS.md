# AGENTS.md

Instrucciones para el agente de IA que abra este repositorio (Claude Code, Cursor, Codex, Copilot, Gemini). Se cargan solas: no hay que pegar nada en ningun chat.

## Que es este repositorio

Es el codigo base de un reto de aprendizaje de Pragma: **Implementación de API REST para gestión de tareas**.

| | |
|---|---|
| Tema | API REST de tareas con Kotlin y Ktor |
| Nivel | senior-l2 |
| Chapter | Backend |
| Especialidad | Kotlin + Ktor |
| Stack | Kotlin / Ktor 2.3 |
| Patron arquitectonico | capas estándar (dominio, aplicación, infraestructura) |
| Tiempo estimado | 8 horas |

## Receta del stack

Esqueleto obligatorio:

- `manifiesto de dependencias y build de Kotlin en la raiz (segun las convenciones idiomaticas de Kotlin/Ktor)`
- `punto de entrada de la aplicacion (segun las convenciones idiomaticas de Kotlin/Ktor)`
- `capa de dominio con entidades y puertos (segun las convenciones idiomaticas de Kotlin/Ktor)`
- `capa de aplicacion con casos de uso (segun las convenciones idiomaticas de Kotlin/Ktor)`
- `capa de infraestructura con los adaptadores y los handlers HTTP de Ktor (segun las convenciones idiomaticas de Kotlin/Ktor)`

Trampas conocidas:

- Todo el codigo, el manifiesto y los tests son de Kotlin/Ktor; no mezclar otro lenguaje ni otro runtime.

Dependencias:

- io.ktor:ktor-server-core-jvm 2.3.12
- io.ktor:ktor-server-netty-jvm 2.3.12
- org.jetbrains.kotlin:kotlin-test-junit 1.9.22
- io.ktor:ktor-serialization-kotlinx-json-jvm 2.3.12
- io.ktor:ktor-server-content-negotiation-jvm 2.3.12
- io.ktor:ktor-server-status-pages-jvm 2.3.12
- org.jetbrains.kotlinx:kotlinx-coroutines-core 1.8.1

## Tu tarea

Dejar este proyecto en estado **verificable**: que el comando de verificacion corra sin errores. Escribi los archivos en disco, en este repositorio. No generes ZIPs ni archivos adjuntos.

En orden:

1. Corre `mvn clean compile` y mira que falla.
2. Completa lo que falte de la lista de abajo: manifiesto de dependencias, punto de entrada, capa de interfaz y las capas del patron declarado.
3. Arregla SOLO los errores que impiden compilar o arrancar.
4. Volve a correr `mvn clean compile` hasta que pase.
5. Pará ahí.

## Regla dura: las fases son trabajo del humano

**PROHIBIDO implementar los entregables de las fases.** El valor del reto esta en que la persona los resuelva. Tu trabajo es que tenga un proyecto que arranca; el hueco pedagogico se queda como esta.

No resuelvas nada de esto:

- **Fase 1 — Definición y creación de tareas**: Dos endpoints funcionales: uno para crear tareas y otro para listar tareas.
- **Fase 2 — Actualización de tareas**: Un endpoint funcional para actualizar tareas.
- **Fase 3 — Validación y manejo de errores**: API mejorada con validaciones y manejo de errores.

Distincion operativa:

- **Arreglar** (si): import faltante, tipo que no existe, dependencia sin declarar, error de sintaxis, archivo referenciado que no existe.
- **No tocar** (no): logica de negocio incompleta, validaciones ausentes, secretos hardcodeados, APIs deprecadas que funcionan, concurrencia insegura, patrones mejorables. Eso es lo que la persona tiene que encontrar.

## Superficie de practica (NO completes)

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs. No toques la logica que el reto pide completar.

- [ ] `src/main/kotlin/domain/infrastructure/controller/TaskController.kt` — La fase "Definición y creación de tareas" se implementa aqui: este archivo es el ejercicio.
- [ ] `src/main/kotlin/domain/application/usecase/UpdateTaskUseCase.kt` — La fase "Actualización de tareas" se implementa aqui: este archivo es el ejercicio.

## Lo que falta y tenes que completar

### Imports sin uso (1) — no rompen la compilacion

Limpieza opcional: el proyecto compila igual con ellos.

- `src/main/kotlin/domain/infrastructure/controller/TaskController.kt` — `Task`

### Presentes (13)

- `pom.xml`
- `src/main/kotlin/com/example/Application.kt`
- `mvnw`
- `mvnw.cmd`
- `.mvn/wrapper/maven-wrapper.properties`
- `src/main/kotlin/domain/domain/model/Task.kt`
- `src/main/kotlin/domain/domain/repository/TaskRepository.kt`
- `src/main/kotlin/domain/application/usecase/CreateTaskUseCase.kt`
- `src/main/kotlin/domain/application/usecase/ListTasksUseCase.kt`
- `src/main/kotlin/domain/application/usecase/UpdateTaskUseCase.kt`
- `src/main/kotlin/domain/infrastructure/repository/InMemoryTaskRepository.kt`
- `src/main/kotlin/domain/infrastructure/controller/TaskController.kt`
- `src/main/kotlin/domain/infrastructure/plugins/Routing.kt`

### Capas del patron declarado

Son las capas que la propuesta arquitectonica plantea, marcadas segun existan hoy en el repo. Orientan donde poner el codigo nuevo; no son una condicion para compilar.

- `src/main/kotlin/domain/model` (ausente)
- `src/main/kotlin/domain/repository` (ausente)
- `src/main/kotlin/application/usecase` (ausente)
- `src/main/kotlin/infrastructure/repository` (ausente)
- `src/main/kotlin/infrastructure/controller` (ausente)
- `src/main/kotlin/infrastructure/plugins` (ausente)

## Verificacion

```bash
mvn clean compile
```

El comando tiene que pasar SIN implementar los archivos de la superficie de practica: solo andamiaje.

Ese comando pasando es la definicion de "terminado" para vos.

## Convenciones que tenes que respetar

- Un solo ecosistema: no declares librerias de otro lenguaje ni mezcles gestores de paquetes.
- Toda libreria que uses tiene que estar declarada en el manifiesto de dependencias.
- Todo import declarado tiene que usarse; todo tipo usado tiene que existir o venir de una dependencia declarada.
- El patron es **capas estándar (dominio, aplicación, infraestructura)**: los contratos (interfaces, puertos) los define la capa interna y los implementa la externa, nunca al revés.
- Los archivos que crees llevan implementacion real, no stubs: sin `TODO`, sin cuerpos vacios, sin `// getters y setters`.

## Contexto del candidato

Sirve para calibrar el nivel del codigo, no para resolver las fases.

- Perfil: Chapter Backend, Especialidad Desarrollador, Tecnología Kotlin, Senior L2
- Brecha que el reto ataca: Construir una API REST en Kotlin con Ktor para gestionar tareas, Implementa endpoints REST en Kotlin con Ktor para crear, listar y actualizar tareas
- Mision: Exponer la gestion de tareas por HTTP

---

*Generado por Challenge Generator — Pragma. `README.md` tiene el enunciado completo del reto para la persona. `PROMPT_MEJORA.md` es la variante para pegar en un chat, si se prefiere ese flujo.*
