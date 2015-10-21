import React from 'react/addons';
import { expect } from 'chai';
import JourneyJournal from 'journeyjournal.jsx';
import JJEditor from 'jj-editor.jsx';

const TestUtils = React.addons.TestUtils;

describe('Loads JourneyJournal', () => {
  it('renders codemirror', () => {
    let rendered = TestUtils.renderIntoDocument(<JourneyJournal />);

    expect(TestUtils.findRenderedComponentWithType(rendered, JJEditor)).to.be.an('object');
  });
});
