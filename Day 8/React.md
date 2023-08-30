# React.js 

## What is React.js?

React is a JavaScript library for building user interfaces. It is maintained by Facebook and a community of individual developers and companies. React can be used as a base in the development of single-page or mobile applications.

## What is JSX?

JSX is a syntax extension to JavaScript. It is similar to a template language, but it has full power of JavaScript. JSX gets compiled to React.createElement() calls which return plain JavaScript objects called “React elements”. React elements describe what you want to see on the screen. React then takes these elements and renders them into the DOM.

## What is Virtual DOM?

The virtual DOM (VDOM) is a programming concept where an ideal, or “virtual”, representation of a UI is kept in memory and synced with the “real” DOM by a library such as ReactDOM. This process is called reconciliation.

## What is the difference between state and props?

Props (short for properties) are a Component's configuration, its options if you may. They are received from above and immutable as far as the Component receiving them is concerned.

State starts with a default value when a Component mounts and then suffers from mutations in time (mostly generated from user events). It's a serializable* representation of one point in time—a snapshot.

## What is the difference between stateful and stateless components?

Stateful components are simply components that have a state. Stateless components are simply components that don’t have a state.

## What is the difference between a controlled component and an uncontrolled component?

A controlled component is a component where React is in control and is the single source of truth for the form data. Uncontrolled components are where your form data is handled by the DOM itself.

## What is the difference between createElement and cloneElement?

JSX elements will be transpiled into a createElement function which will use to create a React element which is a plain JavaScript object that represents a DOM node. cloneElement is used to clone an element and pass it new props.

## Class Component vs Functional Component

Class components are ES6 classes and Functional Components are functions. The only constraint for a functional component is to accept props as an argument and return valid JSX.

## Features of React

- It uses the virtual DOM instead of the real DOM.
- It uses server-side rendering.
- It follows uni-directional data flow or data binding.
- It supports the use of reusable/composable UI components to develop the view.
- It is used for developing the single page application.
- It is easy to integrate with other frameworks (Angular, Backbone) since it is only a view library.
- It uses JSX for templating instead of regular JavaScript.
- It supports the use of inline templating.
- It is licensed under Facebook’s BSD license.
- It provides a simple interface to communicate with the Model part of the application.
- It uses reusable/composable UI components to develop the view.
- It is declarative in nature that makes the code more predictable and easier to debug.
- It provides high performance as it uses a virtual DOM.
- It uses a uni-directional data flow or one-way data binding.

## Library vs Framework

A library is a collection of functions that you can call, these days usually organized into classes. Each call does some work and returns control to the client.

A framework is a collection of patterns and libraries to help with building an application. The framework provides a skeleton where the application “lives”. The application code will call the framework when appropriate to get things done.

