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
      { test: /\.jsx$/, loader: 'jsx-loader?insertPragma=React.DOM&harmony' },
      { test: /\.css$/, loader: "style-loader!css-loader" }
    ]
  },
  resolve: {
    extensions: ['', '.js', '.jsx']
  }
}
