module.exports = function(config) {
  config.set({
    basePath: '',
    frameworks: ['mocha'],
    files: ['tests.webpack.js'],
    exclude: [],
    preprocessors: {
      'tests.webpack.js': ['webpack']
    },
    webpack: {
      module: {
        loaders: [
          { test: /codemirror.js$/, loader: 'babel-loader' },
          { test: /\.jsx?$/, exclude: /(node_modules)/, loader: 'babel-loader' },
          { test: /\.css$/, loader: "style!css" }
        ]
      },
      resolve: {
        modulesDirectories: [
          "src",
          "node_modules"
        ]
      }
    },
    reporters: ['progress'],
    port: 9876,
    colors: true,
    loglevel: config.LOG_INFO,
    autoWatch: true,
    browsers: ['PhantomJS'],
    singleRun: false
  });
};
