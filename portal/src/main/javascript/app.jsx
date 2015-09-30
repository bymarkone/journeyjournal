import React from 'react';
import Codemirror from 'react-codemirror';
import TopBar from './top-bar.jsx';
import Jarvis from './jarvis.js';

let options = {
  theme: 'base16-light',
  lineNumbers: true,
  mode: 'jarvis'
}

export default React.createClass({
  render() {
    return (
      <div>
        <TopBar />
        <Codemirror options={options} />
      </div>
    )
  }
});

