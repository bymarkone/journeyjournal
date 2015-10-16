export function startSaving() {
  return {
    type: 'START_SAVING'
  };
}

export function saved(text) {
  return {
    type: 'SAVED',
    content: text
  };
}
