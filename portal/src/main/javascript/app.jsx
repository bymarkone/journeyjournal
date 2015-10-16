import React from 'react';
import JJEditor from './jj-editor.jsx';
import TopBar from './top-bar.jsx';
import Jarvis from './jarvis.js';
import { Provider } from 'react-redux';
import { createStore, applyMiddleware } from 'redux';
import thunkMiddleware from 'redux-thunk';
import reducers from './reducers.js';

let storeWithMiddlewareFactory = applyMiddleware(thunkMiddleware)(createStore);
let store = storeWithMiddlewareFactory(reducers);

export default React.createClass({
  render() {
    return (
      <Provider store={store}>
        {
          () => <div>
              <TopBar />
              <JJEditor />
            </div>
        }
      </Provider>
    )
  }
});

