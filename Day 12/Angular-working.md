# How does an Angular app execute?

## Angular app execution

- Angular app execution starts from `main.ts` file
- `main.ts` file is the entry point of the application
- `main.ts` file contains the `bootstrapModule` method
- `bootstrapModule` method is used to bootstrap the Angular application
- `bootstrapModule` method takes the `AppModule` as an argument
- `AppModule` is the root module of the application
- `AppModule` contains the `AppModule` class
- `AppModule` class contains the `@NgModule` decorator
- `@NgModule` decorator contains the `bootstrap` property
- `bootstrap` property contains the `AppComponent` class
- `AppComponent` class contains the `@Component` decorator
- `@Component` decorator contains the `selector` property
- `selector` property contains the `app-root` value
- `app-root` is the root component of the application


## File structure of an Angular app

- `src` folder contains the source code of the application
- `src` folder contains the `index.html` file
- `index.html` file contains the `app-root` selector
- `app-root` selector is the root component of the application
- `src` folder contains the `main.ts` file
- `main.ts` file is the entry point of the application
- The app folder contains the `app.module.ts` file
- `app.module.ts` file contains the `AppModule` class and `@NgModule` decorator 
- `AppModule` class contains the `bootstrap` property