import React from 'react';
import x from 'codemirror';
import Codemirror from 'react-codemirror';
import { connect } from 'react-redux';
import { startSaving, saved } from './save-content.js';

let mapStateToProps = (state) => {
  return { content: state.content };
}

let mapDispatchToProps = (dispatch) => {
  return {
    save: (text) => {
      dispatch(startSaving())
      dispatch(saved(text))
    }
  }
};

let options = {
  theme: 'base16-light',
  lineNumbers: true,
  mode: 'jarvis'
}

export class JJEditor extends React.Component {
  saveChanges() {
    this.props.save(this.codemirror._currentCodemirrorValue);
  }
  render() {
    let content = this.props.content || '';
    return (
      <div>
        <Codemirror options={options} value={content} ref={(ref) => this.codemirror = ref} />
        <button type="submit" onClick={this.saveChanges.bind(this)}>Save</button>
      </div>
    )
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(JJEditor);
