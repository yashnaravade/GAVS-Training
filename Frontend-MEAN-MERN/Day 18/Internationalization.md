# Internationalization in Angular

## Introduction

Internationalization is the process of designing a software application so that it can be adapted to various languages and regions without engineering changes. Sometimes the term internationalization is abbreviated as i18n, because there are 18 letters between the first i and the last n.

## Angular Internationalization

Angular provides a set of tools and mechanisms to internationalize an Angular application, it is based on the [Internationalization API](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl) that is built into the JavaScript language.

## Angular Internationalization API

Angular provides a set of tools and mechanisms to internationalize an Angular application, it is based on the Internationalization API that is built into the JavaScript language.

The Angular Internationalization API is a set of objects and functions that provide a standard way of accessing language and culture-specific formatting information such as dates, currencies, and numbers.

The Angular Internationalization API is supported by all modern browsers, but it is not supported by Internet Explorer 11.

## How to use the Internationalization in Angular

### i18n attribute

The i18n attribute is used to mark the text that needs to be translated, it is used in the HTML template.

```html
<h1 i18n="@@title">Hello World</h1>
```

### i18n attribute with a placeholder

The i18n attribute can be used with a placeholder, the placeholder is used to mark the text that needs to be translated, it is used in the HTML template.

```html
<h1 i18n="@@title">Hello {{ name }}</h1>
```

### i18n attribute with a description

The i18n attribute can be used with a description, the description is used to mark the text that needs to be translated, it is used in the HTML template.

```html
<h1 i18n="@@title" i18n-description="@@titleDescription">Hello World</h1>
```

### i18n attribute with a placeholder and a description

The i18n attribute can be used with a placeholder and a description, the placeholder is used to mark the text that needs to be translated, it is used in the HTML template.

```html
<h1 i18n="@@title" i18n-description="@@titleDescription">Hello {{ name }}</h1>
```

### i18n attribute with a placeholder and a description and a meaning

The i18n attribute can be used with a placeholder and a description and a meaning, the placeholder is used to mark the text that needs to be translated, it is used in the HTML template.

```html
<h1 i18n="@@title" i18n-description="@@titleDescription" i18n-meaning="@@titleMeaning">Hello {{ name }}</h1>
```

### i18n attribute with a placeholder and a description and a meaning and a id

The i18n attribute can be used with a placeholder and a description and a meaning and a id, the placeholder is used to mark the text that needs to be translated, it is used in the HTML template.

```html

<h1 i18n="@@title" i18n-description="@@titleDescription" i18n-meaning="@@titleMeaning" i18n-id="@@titleId">Hello {{ name }}</h1>
```

