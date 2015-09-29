var path = require('path');

module.exports = {
  entry: './src/main/javascript/app.jsx',
  output: {
    filename: 'bundle.js',
    path: path.join(__dirname, '/dist/js'),
    publicPath: 'http://localhost:8090/assets'
  },
  module: {
    loaders: [
      { test: /\.jsx?$/, exclude: /(node_modules)/, loader: 'babel-loader' },
      { test: /\.css$/, loader: "style!css" }
    ]
  },
  resolve: {
    extensions: ['', '.js', '.jsx']
  }
}
