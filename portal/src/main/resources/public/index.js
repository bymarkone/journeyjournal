var Previous = React.createClass({
  render: function () {
    var previous = this.props.data.filter(function(item) { return item.name === 'previous';})[0];
    var moments = previous.highlights.map(function (highlight) {
      return (<p>{highlight.title}</p>);
    });
    return (
      <section className="inner-section">
        <h1>{previous.title}</h1>
        {moments}
      </section>
    )
  }
});

var Retro = React.createClass({
  render: function () {
    var retroData = this.props.data;
    var retro = _.groupBy(retroData, function(item) {
      return item.group;
    });

    var moments = [];
    _.forEach(retro, function(highlights, key) {
      var items = highlights.map(function(item) {
        return (<li>{item.description}</li>);
      });
      moments.push(
        <div>
          <h3>{key}</h3>
          <ul>{items}</ul>
        </div>
      );
    });
    return (
      <section className="inner-section">
        <h1>2014</h1>
        {moments}
      </section>
    )
  }
});

var Feedbacks = React.createClass({
  render: function() {
    var feedbackData = this.props.data;
    var byQuality = _.groupBy(feedbackData, function(item) {
      return item.quality;
    });

    var feedbacks = [];
    _.forEach(byQuality, function(eachQuality, quality) {

      var byFrom = _.groupBy(eachQuality, function(i) { return i.from });

      var classes = [];
      _.forEach(byFrom, function(eachFrom, clazz) {

        var items = [];
        _.forEach(eachFrom, function(item) {
          items.push(<p>{item.description}</p>)
        })
        classes.push(
          <div>
            <h3>{clazz}</h3>
            {items}
          </div>
        );

      });
      feedbacks.push(
        <div>
          <h1>{quality}</h1>
            {classes}
        </div>
      );

    });

    return (
      <section className="inner-section">
        <h1>Feedback</h1>
        {feedbacks}
      </section>
    );
  }
});

var Highlights = React.createClass({
  render: function() {
    var highlights = this.props.data.filter(function (item) {
      return item.name === 'highlights'
    })[0];
    var elements = highlights.highlights.map(function (highlight) {
      return (<li>{highlight.title}</li>);
    });
    return (
      <section className="inner-section">
        <h1>{highlights.title}</h1>
        <ol>
          {elements}
        </ol>
      </section>
    );
  }
});

var Board = React.createClass({
  render: function () {
    var boardData = this.props.data;
    var capabilities = boardData.map(function(capability) {
      return (<p><strong>{capability.name}</strong> with vision <i>{capability.mission}</i></p>);
    });
    return (
      <section className="inner-section">
        <h1>Capability</h1>
        {capabilities}
      </section>
    )
  }
});

var ReviewSection = React.createClass({
  render: function () {
    return (
      <h1>{this.props.id}</h1>
    );
  }
});

var MainReview = React.createClass({
  render: function () {
    return (
      <div className="review">
        <div className="review-tab">
          <ul>
            <li>
              <a href="#retro">2014 at ThoughtWorks</a>
            </li>
            <li>    |    </li>
            <li>
              <a href="#feedback">Feedbacks</a>
            </li>
            <li>    |    </li>
            <li>
              <a href="#board">2015</a>
            </li>
          </ul>
        </div>
        <section id="retro">
          <Retro id="retro" data={this.props.data.fact} />
        </section>
        <section id="feedback">
          <Feedbacks id="feedback" data={this.props.data.feedback} />
        </section>
        <section id="board">
          <Board id="board" data={this.props.data.capability} />
        </section>
      </div>
    );
  }
});
React.render(
  <MainReview data={data}/>,
  document.getElementById('content')
);