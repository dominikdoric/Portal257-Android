# About
Android application which is still in development phase. This application is imagined as some kind of local news application where all information that residents of village Jakšić will need to see will be ind the one place. This way goal of this application is to modernise village and connect people even more.

# Tech stack & Open-source libraries 🛠
- Minimum SDK Level 24
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Jetpack Compose](https://developer.android.com/jetpack/compose) -  Android’s modern toolkit for building native UI
- [Coroutines](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/) - For asynchronous and non blocking programming
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Koin](https://insert-koin.io) - The pragmatic Kotlin dependency injection framework
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
    - [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - perform actions in response to a change in the lifecycle status of another component, such as activities and fragments.
    - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
    - [AndroidX](https://developer.android.com/jetpack/androidx) - major improvement to the original Android Support Library, which is no longer maintained.
    - [Room](https://developer.android.com/training/data-storage/room) - SQLite object mapping library.
    - [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java
- Architecture
    - [MVVM Architecture](https://developer.android.com/jetpack/guide?gclid=CjwKCAiAkJKCBhAyEiwAKQBCkrariGLVBTGun7TGT9IMaVf0ojoXdjIc-5tz-jl1L-CM7EsWjQrExRoCHO0QAvD_BwE&gclsrc=aw.ds) (View - ViewModel - Model)
    - Clean Architecture (Data - Domain - Presentation)
    - Repository pattern
    - Use Cases

# Arhitecture
The architecture of the application is based, apply and strictly complies with each of the following 5 points:
- A single-activity architecture
- Android architecture components, part of Android Jetpack for give to project a robust design, testable and maintainable.
- Pattern Model-View-ViewModel (MVVM) facilitating a separation of development of the graphical user interface.
- S.O.L.I.D design principles intended to make software designs more understandable, flexible and maintainable.
- Modular app architecture allows to be developed features in isolation, independently from other features.

![mvvm-architecture-app-in-android](https://user-images.githubusercontent.com/64093104/110252926-07519900-7f88-11eb-9736-055484d79338.png)
