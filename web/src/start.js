import React from 'react';
import JourneyJournal from './journeyjournal.jsx';
import TopBar from './top-bar.jsx';

let App = React.createClass({
  render() {
    return (
      <div>
        <TopBar/>
        <JourneyJournal/>
      </div>
    )
  }
});

React.render(<App />, document.body);
