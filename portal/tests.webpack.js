require('core-js/es5');
var context = require.context('./src/test/javascript', true, /.*_test\.js$/);
context.keys().forEach(context);
