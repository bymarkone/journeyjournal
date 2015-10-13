import React from 'react';
import Codemirror from 'react-codemirror';
import TopBar from './top-bar.jsx';
import Jarvis from './jarvis.js';
import { Provider } from 'react-redux';
import { createStore, applyMiddleware } from 'redux';
import thunkMiddleware from 'redux-thunk';
import reducers from './reducers.js';

let options = {
  theme: 'base16-light',
  lineNumbers: true,
  mode: 'jarvis'
}

var storeWithMiddlewareFactory = applyMiddleware(thunkMiddleware)(createStore);
var store = storeWithMiddlewareFactory(reducers);

export default React.createClass({
  render() {
    return (
      <Provider store={store}>
        {
          () => <div>
              <TopBar />
              <Codemirror options={options} />
            </div>
        }
      </Provider>
    )
  }
});

