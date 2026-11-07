# Controlador App

Es una aplicacion que esta hecha con Kotlin y Jetpack Compose, realiza todo lo que se pide en el enunciado:

- Motrar numero inicial.
- Aumenta el numero de uno en uno
- Disminuye el numero de uno en uno
- Un boton para reiniciar el contador a 0
- Implementacion no solicutada: agregar color verde si es mayor a 0 y si es menor rojo.

Utilizamos Kotlin version 2.2.10 y para el Gradle 9.4.1

Lo bueno de kotlin es que ya viene incluido en el Android Studio y se descarga muy facil. Ademas, No hay que instalar nada a mano. La plantilla Empty Activity de Android Studio ya incluye en app/build.gradle.kts:
Y para el Jetpack Gradle descarga solo a la primer que se abre el proyecto.

## Como correrlo:

1. en Android Studio: File > New > Project from Version Control… y pegar la URL de repositorio.
```
   git clone https://github.com/Darieles01/ContadorApp.git
```
2. Abrir la carpeta ContadorApp en Android Studio.
3. Gradle empieza la sincronizacion.
4. Darle Run.

## Estructura:

```
app/
├── manifests/AndroidManifest.xml      → declara MainActivity como pantalla de inicio
├── kotlin+java/com.example.contadorapp/
│   ├── MainActivity.kt                → punto de entrada: abre la pantalla ContadorScreen
│   ├── ContadorScreen.kt              → pantalla: estado del contador, número y color
│   ├── BotonesContador.kt             → botones -1, +1 y Reiniciar
│   └── ui/theme/                      → colores, tipografía y tema (Color.kt, Theme.kt, Type.kt)
└── res/                               → íconos, textos (strings.xml) y otros recursos
Gradle Scripts/build.gradle.kts        → configuración y dependencias
```

## Ramas utilizadas:

- main.
- develop.
- featurepantalla y featurebotones.