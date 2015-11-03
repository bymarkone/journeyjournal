import React from 'react';
import TestUtils from 'react-addons-test-utils';
import { expect } from 'chai';
import ShallowTestUtils from 'react-shallow-testutils';
import JourneyJournal from 'journeyjournal.jsx';

const shallowRenderer = TestUtils.createRenderer();

describe('Loads JourneyJournal', () => {
  it('renders codemirror', () => {
    shallowRenderer.render(<JourneyJournal />);
    let rendered = shallowRenderer.getRenderOutput();

    expect(rendered.props.children().props).to.be.a('Object');
  });
});
