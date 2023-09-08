# Directives in Angular

## What are directives?

Directives are instructions in the DOM (Document Object Model). These instructions are represented by elements and attributes. AngularJS has a set of built-in directives which offers functionality to your applications. You can also create new directives to extend the functionality of AngularJS.

## Types of directives

There are three types of directives in AngularJS:

- Component Directives (also called Custom Elements) - These are used to create custom HTML tags that serve as new, custom widgets. AngularJS has built-in directives such as `ngBind`, `ngModel`, and `ngClass`.

- Attribute Directives - These change the appearance or behavior of an element, component, or another directive. AngularJS has built-in directives such as `ngHref`, `ngStyle`, and `ngClass`.

- Structural Directives - These change the DOM layout by adding and removing DOM elements. Structural directives in AngularJS are `ngIf`, `ngSwitch`, and `ngFor`.

- Custom Directives - These are the directives you create to extend the functionality of AngularJS. You will learn how to create custom directives in a later chapter.


## Built-in directives

AngularJS comes with a set of built-in directives. These directives are listed below:

- `ng-app` - This directive defines and links an AngularJS application to HTML.
- `ng-model` - This directive binds the values of AngularJS application data to HTML input controls.
- `ng-bind` - This directive binds the AngularJS Application data to HTML tags.
- `ng-init` - This directive initializes AngularJS application data.
- `ng-repeat` - This directive repeats HTML elements for each item in a collection.
- `ng-show` - This directive shows HTML elements.
- `ng-hide` - This directive hides HTML elements.
- `ng-click` - This directive defines an AngularJS click event.
- `ng-disabled` - This directive disables HTML elements.
- `ng-open` - This directive opens HTML elements.
- `ng-include` - This directive includes HTML content.
- `ng-if` - This directive removes and recreates HTML elements.
- `ng-switch` - This directive hides and shows HTML elements.
- `ng-class` - This directive manipulates the CSS classes of HTML elements.
- `ng-style` - This directive manipulates the style of HTML elements.
- `ng-form` - This directive creates an HTML form.
- `ng-submit` - This directive submits an HTML form.
- `ng-view` - This directive embeds a view into an HTML page.
- `ng-include` - This directive includes HTML content from an external file.
- `ng-src` - This directive specifies the source of images in HTML.
- `ng-cloak` - This directive is used to prevent the AngularJS application from displaying the HTML template while the application is loading.
- `ng-bind-html` - This directive binds the innerHTML of an HTML element to application data.
- `ng-bind-template` - This directive binds the innerHTML of an HTML element to application data.
- `ng-non-bindable` - This directive specifies that the HTML element should not be compiled or binded by AngularJS.
- `ng-pluralize` - This directive displays messages according to the count.
- `ng-repeat-start` - This directive starts an element to be repeated in an array.
- `ng-repeat-end` - This directive ends an element to be repeated in an array.
- `ng-options` - This directive fills a `<select>` element with `<option>` elements.
- `ng-change` - This directive executes a function when the value of an HTML element changes.
- `ng-readonly` - This directive sets the readonly attribute of an HTML element.
- `ng-selected` - This directive sets the selected attribute of an HTML element.
- `ng-mouseover` - This directive executes a function when the mouse pointer moves over an HTML element.
- `ng-mouseleave` - This directive executes a function when the mouse pointer moves out of an HTML element.
- `ng-mouseenter` - This directive executes a function when the mouse pointer moves over an HTML element.
- `ng-mousemove` - This directive executes a function when the mouse pointer moves inside an HTML element.