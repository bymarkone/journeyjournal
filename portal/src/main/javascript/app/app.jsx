'use strict';
var React = require('react');
var Codemirror = require('react-codemirror');
var TopBar = require('./top-bar');
require('./jarvis');

var options = {
  theme: 'base16-light',
  lineNumbers: true,
  mode: 'jarvis'
}

var App = React.createClass({
  render: function() {
    return (
      <div>
        <TopBar />
        <Codemirror options={options} />
      </div>
    )
  }
});

React.render(<App />, document.body);


