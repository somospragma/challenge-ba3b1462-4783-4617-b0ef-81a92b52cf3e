# Optimización de Desempeño con Caché en Sistema de Pagos

En el contexto de un sistema de pagos de alta concurrencia, es crucial optimizar el desempeño para manejar un alto volumen de transacciones. El sistema requiere la implementación de prácticas de caché utilizando al menos una herramienta como Redis o Memcached. El objetivo es dominar las operaciones de caché distribuido, sharding, estrategias de invalidación y optimización de desempeño en sistemas de alto rendimiento.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Optimización de Desempeño con Caché: Redis y Memcached |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 5-6 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Implementación de Caché Básico

**Objetivo:** Implementar un sistema de caché básico para almacenar información de usuarios y sus transacciones.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los datos que deben ser almacenados en caché.
- Diseña la estructura de datos para el caché.
- Implementa las operaciones básicas de lectura y escritura en el caché.

**Entregable:** Sistema de caché básico funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la granularidad de los datos almacenados en caché.
- Piensa en cómo manejar la consistencia de los datos en caché.

</details>

### Fase 2: Implementación de Sharding

**Objetivo:** Implementar sharding en el sistema de caché para distribuir la carga y mejorar el rendimiento.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Diseña una estrategia de sharding para el caché.
- Implementa la distribución de datos entre diferentes shards.
- Asegura que las operaciones de lectura y escritura se realicen en el shard correcto.

**Entregable:** Sistema de caché con sharding funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo equilibrar la carga entre los shards.
- Piensa en cómo manejar la consistencia entre shards.

</details>

### Fase 3: Estrategias de Invalidación

**Objetivo:** Implementar estrategias de invalidación del caché para mantener la consistencia de los datos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Diseña una estrategia de invalidación del caché.
- Implementa la invalidación de datos en el caché cuando se actualizan en la fuente de datos.
- Asegura que los datos en caché se actualicen correctamente.

**Entregable:** Sistema de caché con estrategias de invalidación funcionales.

<details>
<summary>Pistas de conocimiento</summary>

- Considera diferentes estrategias de invalidación (por tiempo, por evento, etc.).
- Piensa en cómo minimizar el impacto de la invalidación en el rendimiento.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es el sharding y por qué se usa en sistemas de caché?
- **paraQueSirve**: ¿Para qué sirve la invalidación del caché y cuándo debe implementarse?
- **comoSeUsa**: ¿Cómo se implementa una estrategia de sharding en un sistema de caché?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema de caché y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la elección de una estrategia de invalidación del caché?

## Criterios de Evaluacion

- Implementación de un sistema de caché básico funcional.
- Implementación de sharding en el sistema de caché.
- Implementación de estrategias de invalidación del caché.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
