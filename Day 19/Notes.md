# Routing

Routing is the process of selecting a path for traffic in a network or between or across multiple networks. Broadly, routing is performed in many types of networks, including circuit-switched networks, such as the public switched telephone network (PSTN), and computer networks, such as the Internet. In packet switching networks, routing directs packet forwarding (the transit of logically addressed network packets from their source toward their ultimate destination) through intermediate nodes. Intermediate nodes are typically network hardware devices such as routers, bridges, gateways, firewalls, or switches. General-purpose computers can also forward packets and perform routing, though they are not specialized hardware and may suffer from limited performance. The routing process usually directs forwarding on the basis of routing tables, which maintain a record of the routes to various network destinations. Thus, constructing routing tables, which are held in the router's memory, is very important for efficient routing.

# Routing in Angular

Routing is a mechanism that allows us to move between different parts of applications by clicking on buttons, links, or using the browser's back and forward buttons. Routing helps us to divide our application into multiple components. We can then load these components on demand based on the URL that the user enters in the browser's address bar. This is known as Single Page Application (SPA).

# Setting up Routing

To set up routing in Angular, we need to import the RouterModule and Routes from @angular/router in the root module. We also need to define the routes that we want to use in our application. We can do this by creating an array of routes and passing it to the RouterModule.forRoot() method. The routes array contains objects that define a route. Each route object has two properties:

path: This is the URL path that we want to use for the route.

component: This is the component that we want to load when the user navigates to the route.


# Router Outlet

The router outlet is a directive that marks the place in the template where the router should display the components for that outlet. The router displays the components for the active route inside the router outlet. The router outlet is a directive that marks the place in the template where the router should display the components for that outlet. The router displays the components for the active route inside the router outlet.

# Router Link

The router link directive binds a link to a route. When the link is clicked, the router navigates to the route. The router link directive binds a link to a route. When the link is clicked, the router navigates to the route.

# Router Link Active

The router link active directive adds a class to an element when the link's route becomes active. The router link active directive adds a class to an element when the link's route becomes active.

# Router State

The router state is a tree of activated route snapshots. The router state is a tree of activated route snapshots.

## How the Router Works

The router is a service that lets us define routes for our application, navigate between different views, and pass data to and from those views. The router is a service that lets us define routes for our application, navigate between different views, and pass data to and from those views. 

### Example

```typescript
import { Component } from '@angular/core';
import { Router } from '@angular/router';

const routes = [
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'contact', component: ContactComponent },
];

@Component({
  selector: 'app-root',
  template: `
    <nav>
      <a routerLink="/home">Home</a>
      <a routerLink="/about">About</a>
      <a routerLink="/contact">Contact</a>
    </nav>
    <router-outlet></router-outlet>
  `,
})
export class AppComponent {
  constructor(private router: Router) {}
}
```

# Route Parameters

Route parameters are used to pass data to a route. Route parameters are used to pass data to a route.

## Example

```typescript

import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

const routes = [
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'contact', component: ContactComponent },
  { path: 'user/:id', component: UserComponent },
];

@Component({
  selector: 'app-root',
  template: `
    <nav>
      <a routerLink="/home">Home</a>
      <a routerLink="/about">About</a>
      <a routerLink="/contact">Contact</a>
    </nav>
    <router-outlet></router-outlet>
  `,
})

export class AppComponent {
  constructor(private route: ActivatedRoute) {}
}
```

## Configuring Routes

We can configure routes in Angular using the RouterModule.forRoot() method. This method takes an array of routes as an argument. Each route is an object that has two properties:

path: This is the URL path that we want to use for the route.

component: This is the component that we want to load when the user navigates to the route.

## Example

```typescript
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'contact', component: ContactComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
```

# Conclusion

Routing is a mechanism that allows us to move between different parts of applications by clicking on buttons, links, or using the browser's back and forward buttons. Routing helps us to divide our application into multiple components. We can then load these components on demand based on the URL that the user enters in the browser's address bar. This is known as Single Page Application (SPA).

