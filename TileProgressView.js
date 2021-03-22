import PropTypes from 'prop-types';

import {requireNativeComponent, ViewPropTypes} from 'react-native';

var viewProps = {
  name: 'TileProgressView',
  propTypes: {
    progress: PropTypes.number,
    color: PropTypes.string,
    loadingColor: PropTypes.string,
  },
};

const TileProgressView = requireNativeComponent('TileProgressView');


module.exports = TileProgressView;
