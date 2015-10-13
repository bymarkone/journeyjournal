import React from 'react';
import Codemirror from 'react-codemirror';
import { connect } from 'react-redux';
import saveContent from './save-content.js';

let mapStateToProps = (state) => {
  return {};
}

let mapDispatchToProps = (dispatch) => {
  return {
    save: (text) => dispatch(saveContent(text))
  }
};

export default connect(mapStateToProps, mapDispatchToProps)(Codemirror);
