export default (state, action) => {
  switch (action.type) {
    case 'START_SAVING':
      return { isFetching: true };
    case 'SAVED':
      return { isFetching: false };
    default:
      return state || {};
  }
}
