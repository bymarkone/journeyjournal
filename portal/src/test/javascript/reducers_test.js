import { expect } from 'chai';
import reducers from 'reducers.js';

describe('Reducers', () => {
  it('returns the ongoing fetching state when start saving', () => {
    var state = {};
    var action = { type: 'START_SAVING' };

    expect(reducers(state, action)).to.deep.equal({ isFetching: true });
  });

  it('returns the finished fetching state when saved', () => {
    var state = {};
    var action = { type: 'SAVED' };

    expect(reducers(state, action)).to.deep.equal({ isFetching: false });
  });
});
