export default (state, action) => {
  switch (action.type) {
    case 'START_SAVING':
      return {
        isFetching: true,
        content: 'Saving...'
      };
    case 'SAVED':
      return {
        isFetching: false,
        content: action.content
      };
    default:
      return state || {};
  }
}
