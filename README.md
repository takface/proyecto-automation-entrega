# Proyecto de Automatización de Pruebas – Java

Este repositorio contiene la versión finalizada del proyecto de automatización de pruebas 
funcionales desarrollado en Java. El proyecto emplea Selenium WebDriver, 
Cucumber con enfoque BDD y TestNG, organizado mediante Maven.

## Objetivo

El objetivo del proyecto es definir y ejecutar pruebas automatizadas que 
validen flujos funcionales de una aplicación web, organizando los casos en 
lenguaje Gherkin y aplicando el patrón Page Object Model para mantener el 
código modular y escalable.

## Tecnologías

Java  
Selenium WebDriver  
Cucumber  
TestNG  
Maven  
Gherkin  
IntelliJ IDEA

## Instalación y configuración

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Verificar que Maven descargue las dependencias.
4. Asegurar que el JDK esté configurado correctamente.

## Ejecución de pruebas

Las pruebas pueden ejecutarse de dos maneras:

**Desde IntelliJ IDEA**  
- Ejecutar la clase runner de Cucumber directamente.

**Desde Maven en consola:**
mvn test
## Buenas prácticas aplicadas

- Page Object Model para separar la lógica de interacción con la UI.
- Uso de BDD para estructurar escenarios legibles en Gherkin.
- Separación clara entre pasos, pages y configuración global (hooks).
- Proyecto preparado para integración continua.

## Archivo pom.xml

El archivo `pom.xml` define las dependencias de Cucumber, TestNG, 
Selenium y plugins necesarios para compilar y ejecutar las pruebas con Maven.

## Licencia

Este repositorio es de uso personal y académico. No se especifica una licencia pública.

## Enlace

https://github.com/takface/proyecto-automation-entrega
