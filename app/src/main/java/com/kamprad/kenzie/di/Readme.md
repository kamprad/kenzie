# DI(Dependency Injection)

This folder contains the Dagger 2 components and modules.

## How Dagger 2 works on android

Dependency injection usually requires access to the creation of every object, but in Android, a lot of the objects are
actually created and handled by the android framework itself (eg. creation of Activity, Fragment, etc..), and our code
does not have control over it's creation and constructor, we can only ask Android to create it for us.

This makes dependency injection a bit more complex on android, so instead of injecting the dependency of Android API's
object through the constructor, we inject it after it's creation using AppInjector class in Pos9App's onCreate function.

AppInjector will bind a callback that will be called every time a fragment or activity is created that will then inject
said activity with it's dependencies.

More info: https://google.github.io/dagger/