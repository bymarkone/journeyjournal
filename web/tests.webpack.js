require('core-js/es5');
var context = require.context('./test', true, /.*_test\.js$/);
context.keys().forEach(context);
