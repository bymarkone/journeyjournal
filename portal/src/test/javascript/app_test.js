import React from 'react/addons';
import { expect } from 'chai';
import App from 'app.jsx';
import Codemirror from 'react-codemirror';
import TopBar from 'top-bar.jsx';

const TestUtils = React.addons.TestUtils;

describe('Loads app', () => {
  it('renders top bar', () => {
    let rendered = TestUtils.renderIntoDocument(<App />);

    expect(TestUtils.findRenderedComponentWithType(rendered, TopBar)).to.be.an('object');
  });

  it('renders codemirror', () => {
    let rendered = TestUtils.renderIntoDocument(<App />);

    expect(TestUtils.findRenderedComponentWithType(rendered, Codemirror)).to.be.an('object');
  });
});
