# React Component Lifecycle:
- Mounting
- Updating
- Unmounting
- Error Handling
- Lifecycle Methods

Component lifecycle is a series of methods that are invoked in different stages of the component's existence. The three main stages are mounting, updating, and unmounting. The methods are called in the following order when an instance of a component is being created and inserted into the DOM:

- constructor()
- static getDerivedStateFromProps()
- render()
- componentDidMount()

When the state of a component changes, it triggers an update. The following methods are called during the update:

- static getDerivedStateFromProps()
- shouldComponentUpdate()
- render()
- getSnapshotBeforeUpdate()
- componentDidUpdate()
- componentWillUnmount()
- componentDidCatch()

## Mounting
Mounting is the process of adding elements to the DOM. These methods are called in the following order when an instance of a component is being created and inserted into the DOM:

- constructor()
- static getDerivedStateFromProps()
- render()
- componentDidMount()
- componentWillMount() is deprecated and should be avoided.
- componentDidMount() is invoked immediately after a component is mounted. If you need to load data from a remote endpoint, this is a good place to instantiate the network request.
- This method is a good place to set up any subscriptions. If you do that, don’t forget to unsubscribe in componentWillUnmount().
  - Calling setState() in this method will trigger an extra rendering, but it is guaranteed to flush during the same tick. This guarantees that even though the render() will be called twice in this case, the user won’t see the intermediate state.
  - Use this pattern with caution because it often causes performance issues. It can, however, be necessary for cases like modals and tooltips when you need to measure a DOM node before rendering something that depends on its size or position.
  - This method is also a good place to set up any subscriptions. If you do that, don’t forget to unsubscribe in componentWillUnmount().
  - You may call setState() immediately in componentDidMount(). It will trigger an extra rendering, but it will happen before the browser updates the screen. This guarantees that even though the render() will be called twice in this case, the user won’t see the intermediate state. Use this pattern with caution because it often causes performance issues. In most cases, you should be able to assign the initial state in the constructor() instead. It can, however, be necessary for cases like modals and tooltips when you need to measure a DOM node before rendering something that depends on its size or position.

## Updating
An update can be caused by changes to props or state. These methods are called in the following order when a component is being re-rendered:

- static getDerivedStateFromProps()
- shouldComponentUpdate()
- render()
- getSnapshotBeforeUpdate()
- componentDidUpdate()
- componentWillUpdate() is deprecated and should be avoided.
- componentWillReceiveProps() is deprecated and should be avoided.
- shouldComponentUpdate() is invoked before rendering when new props or state are being received. Defaults to true. This method is not called for the initial render or when forceUpdate() is used.
- Use shouldComponentUpdate() to let React know if a component’s output is not affected by the current change in state or props. The default behavior is to re-render on every state change, and in the vast majority of cases you should rely on the default behavior.


## Unmounting
Unmounting is the process of removing the component from the DOM. This method is called when a component is being removed from the DOM:

- componentWillUnmount()
- componentWillUnmount() is invoked immediately before a component is unmounted and destroyed. Perform any necessary cleanup in this method, such as invalidating timers, canceling network requests, or cleaning up any subscriptions that were created in componentDidMount().
- You should not call setState() in componentWillUnmount() because the component will never be re-rendered. Once a component instance is unmounted, it will never be mounted again.
- Note that React may call this method even if the component is later re-used. This is why it’s important to clean up subscriptions or timers inside componentWillUnmount() so they don’t leak.
- componentWillUnmount() is invoked immediately before a component is unmounted and destroyed. Perform any necessary cleanup in this method, such as invalidating timers, canceling network requests, or cleaning up any subscriptions that were created in componentDidMount().


## Error Handling
These methods are called when there is an error during rendering, in a lifecycle method, or in the constructor of any child component.

- static getDerivedStateFromError()
- componentDidCatch()
- static getDerivedStateFromError() is invoked after an error has been thrown by a descendant component. It receives the error that was thrown as a parameter and should return a value to update state.
- componentDidCatch() is invoked after an error has been thrown by a descendant component. It receives two parameters:
  - error - The error that was thrown.
  - info - An object with a componentStack key containing information about which component threw the error.

# Conclusion
- The componentDidMount() method runs after the component output has been rendered to the DOM. This is a good place to set up a timer:
- The componentWillUnmount() method is called when the component is about to be removed from the DOM.
- The render() method is required and will always be called, the others are optional and will be called if you define them.
- The constructor() method is called before anything else, when the component is initiated, and it is the natural place to set up the initial state and other initial values.
- The static getDerivedStateFromProps() method is called before rendering, when new props or state are being received. It should return an object to update the state, or null to update nothing.
- The getSnapshotBeforeUpdate() method is called right before the changes from the virtual DOM are to be reflected in the DOM. If the method is present, you should also include the componentDidUpdate() method, otherwise you will get an error.
- The shouldComponentUpdate() method is used to let React know if a component is not affected by the changes in the state or the props. The default behavior is to re-render on every state change, and in the vast majority of cases you should rely on the default behavior.
- The componentDidUpdate() method is called after the component is updated in the DOM.
- The static getDerivedStateFromError() method is used to render a fallback UI after an error has been thrown, and the componentDidCatch() method is used to log the error information.
- If you want to get more information about the error, you can use the componentDidCatch() method.
- If a component has multiple error boundaries, only the closest one in the tree will catch an error.
- Error boundaries work like a JavaScript catch {} block, but for components.
- You can pass info to an error boundary as a third argument in componentDidCatch(info).
- Error boundaries catch errors during rendering, in lifecycle methods, and in constructors of the whole tree below them.

