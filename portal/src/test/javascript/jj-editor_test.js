import React from 'react/addons';
import { expect } from 'chai';
import JourneyJournal from 'journeyjournal.jsx';
import JJEditor from 'jj-editor.jsx';
import Codemirror from 'react-codemirror';

const TestUtils = React.addons.TestUtils;

describe('Creates editor', () => {
  let rendered = TestUtils.renderIntoDocument(<JourneyJournal />);
  let editor = TestUtils.findRenderedComponentWithType(rendered, JJEditor);
  let button = TestUtils.findRenderedDOMComponentWithTag(rendered, "button");
  let codemirror = TestUtils.findRenderedComponentWithType(rendered, Codemirror);

  it('renders codemirror', () => {
    expect(codemirror).to.be.an('object');
  });

  it('renders button', () => {
    expect(TestUtils.isDOMComponent(button)).to.be.true;
  });

  it('submits text', () => {
    codemirror._currentCodemirrorValue = 'hello';
    TestUtils.Simulate.click(button);
    expect(editor.state.storeState.content).to.equal('hello');
  });
});
