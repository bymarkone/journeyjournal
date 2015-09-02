'use strict';
var React = require('react');
var Codemirror = require('react-codemirror');
var TopBar = require('./top-bar');

var options = {
  theme: 'base16-light',
  lineNumbers: true
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


