var React = require('react');
var TopNavBar = React.createClass({
  render: function () {
    return (
      <div className='sticky'>
        <nav className='top-bar' data-topbar role='navigation' data-options='sticky_on: large'>
          <ul>
            <li>
              <h1 className="columns large-5 medium-7 small-12">
                <a href='#'>
                  <img src="/images/tw-logo.png" alt="ThoughtWorks"/>
                  <strong>
                    <i>Tech</i>Dashboard
                  </strong>
                </a>
              </h1>
            </li>
            <li className="toggle-topbar menu-icon">
              <a href=""><span>Menu</span></a>
            </li>
          </ul>
          <section id="global-search" className="top-bar-section">
            <ul>
              <li className="large-5 medium-4 small-12 hide-for-small">
                <div>
                  <input type="text" placeholder="Select a project"></input>
                </div>
              </li>
            </ul>
          </section>
        </nav>
      </div>
    )
  }
});

module.exports = TopNavBar;
