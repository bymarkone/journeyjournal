import React from 'react';
import JourneyJournal from './journeyjournal.jsx';
import TopBar from './top-bar.jsx';

class App extends React.component {
  render() {
    return (
      <div>
        <TopBar/>
        <JourneyJournal/>
      </div>
    )
  }
}

React.render(<App />, document.body);
