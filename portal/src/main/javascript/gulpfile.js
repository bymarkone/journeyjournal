var gulp = require('gulp');
var lib = require('bower-files')({
  overrides: {
    react: {
      main: ['react.js', 'JSXTransformer.js'],
      dependencies: {}
    }
  }
});
var sass = require('gulp-sass');

gulp.task('sass', function () {
  return gulp.src('./style/*.scss')
    .pipe(sass())
    .pipe(gulp.dest('./style'));
});

gulp.task('bower', function() {
  return gulp.src(lib.ext('js').files)
    .pipe(gulp.dest('lib/'))
});

gulp.task('buildLibs', function() {
  return gulp.src('lib/*.js')
    .pipe(gulp.dest('../resources/public/lib'));
});

gulp.task('buildSources', function() {
  return gulp.src('src/*.*')
    .pipe(gulp.dest('../resources/public'));
});

gulp.task('buildStyles', ['sass'], function() {
  return gulp.src(['style/*.css', 'style/*.map'])
    .pipe(gulp.dest('../resources/public/style'));
});

gulp.task('default', ['buildLibs', 'buildSources', 'buildStyles'], function() {

});
