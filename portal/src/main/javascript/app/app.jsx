'use strict'
var React = require('react')
var Hello = require('./hello')
var Codemirror = require('react-codemirror')

var options = {
  theme: 'base16-light',
  lineNumbers: true
}

React.render(<Hello />, document.getElementById('content'))
React.render(<Codemirror options={options} />, document.getElementById('codemirror-wrapper'))

