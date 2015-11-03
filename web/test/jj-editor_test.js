import React from 'react';
import TestUtils from 'react-addons-test-utils';
import { expect } from 'chai';
import ShallowTestUtils from 'react-shallow-testutils';
import { JJEditor } from 'jj-editor.jsx';

const shallowRenderer = TestUtils.createRenderer();

describe('Loads JourneyJournal', () => {
  shallowRenderer.render(<JJEditor />);
  let rendered = shallowRenderer.getRenderOutput();
  let codemirror = rendered.props.children[0];
  let button = rendered.props.children[1];

  it('renders div', () => {
    expect(rendered.type).to.equal('div');
  });

  it('renders empty codemirror', () => {
    expect(codemirror).to.be.a('Object');
    expect(codemirror.props.value).to.equal('');
    expect(codemirror.props.options.mode).to.equal('jarvis');
  });

  it('renders button', () => {
    expect(button.props.type).to.equal('submit');
  });

  //it('submits text', () => {
    //rendered.props.save('hello');
    //expect(codemirror.props.value).to.equal('hello');
  //});
});
