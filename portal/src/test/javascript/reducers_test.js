import { expect } from 'chai';
import reducers from 'reducers.js';

describe('Reducers', () => {
  it('returns the ongoing fetching state when start saving', () => {
    var state = {};
    var action = { type: 'START_SAVING'};
    var newState = reducers(state, action);

    expect(newState.isFetching).to.equal(true);
    expect(newState.content).to.equal("Saving...");
  });

  it('updates state when done saving', () => {
    var state = {};
    var action = { type: 'SAVED', content: "hello" };
    var newState = reducers(state, action);

    expect(newState.isFetching).to.equal(false);
    expect(newState.content).to.equal("hello");
  });
});
