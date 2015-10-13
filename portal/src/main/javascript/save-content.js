let startSaving = () => {
  return {
    type: 'START_SAVING'
  };
};

let saved = () => {
  return {
    type: 'SAVED'
  };
};

export default () => {
  return (dispatch) => {
    dispatch(startSaving());

    return dispatch(saved());
  }
}
