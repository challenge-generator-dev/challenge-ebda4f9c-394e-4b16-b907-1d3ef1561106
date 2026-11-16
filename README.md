# Implementación de API REST para gestión de tareas

El objetivo es construir una API REST en Kotlin con Ktor para gestionar tareas. La API debe permitir crear, listar y actualizar tareas. La gestión de tareas se realizará a través de HTTP. El sistema debe validar que las tareas tengan un nombre único y que el nombre no esté vacío.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | API REST de tareas con Kotlin y Ktor |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y entregará cada archivo con su ruta.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y entregará cada archivo con su ruta. Guárdalos en la carpeta donde quieras trabajar, respetando las rutas.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no entrega todos los archivos al terminar el análisis, escríbele: "entrégame todos los archivos con su ruta".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición y creación de tareas

**Objetivo:** Implementar endpoints para crear y listar tareas

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Diseña y crea un endpoint para crear una nueva tarea. Asegúrate de que el nombre de la tarea sea único y no esté vacío.
- Implementa un endpoint para listar todas las tareas existentes.

**Entregable:** Dos endpoints funcionales: uno para crear tareas y otro para listar tareas.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que cada tarea debe tener un nombre único y no puede estar vacía.
- Piensa en cómo manejarías la validación del nombre de la tarea.

</details>

### Fase 2: Actualización de tareas

**Objetivo:** Implementar un endpoint para actualizar tareas

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Crea un endpoint para actualizar una tarea existente. Asegúrate de que la actualización mantenga la unicidad del nombre de la tarea y que el nombre no esté vacío.

**Entregable:** Un endpoint funcional para actualizar tareas.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejarías la actualización del nombre de la tarea para mantener su unicidad.
- Piensa en cómo validarías que el nombre de la tarea no esté vacío durante la actualización.

</details>

### Fase 3: Validación y manejo de errores

**Objetivo:** Mejorar la API con validaciones y manejo de errores

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa validaciones adicionales para asegurar la integridad de los datos en la API.
- Maneja adecuadamente los errores que puedan ocurrir durante la creación, listado y actualización de tareas.

**Entregable:** API mejorada con validaciones y manejo de errores.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en posibles errores que podrían ocurrir durante las operaciones de la API y cómo los manejarías.
- Considera cómo podrías mejorar la experiencia del usuario en caso de errores.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una API REST y cómo se utiliza en el contexto de gestión de tareas?
- **paraQueSirve**: ¿Para qué sirve cada endpoint implementado en la API?
- **comoSeUsa**: ¿Cómo se usan los endpoints para crear, listar y actualizar tareas?
- **erroresComunes**: ¿Qué errores comunes pueden ocurrir durante la implementación de la API y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones importantes se deben tomar al diseñar y mejorar la API?

## Criterios de Evaluacion

- Implementación correcta de endpoint para crear tareas con validación de nombre único y no vacío.
- Implementación correcta de endpoint para listar tareas.
- Implementación correcta de endpoint para actualizar tareas con validación de nombre único y no vacío.
- Mejora de la API con validaciones adicionales y manejo de errores.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT) si no tenes un agente en el IDE. Declara lo mismo que AGENTS.md; los archivos que te devuelva el chat los guardas en esta carpeta respetando las rutas.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn clean compile
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
