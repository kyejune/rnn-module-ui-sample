import PropTypes from 'prop-types';
import {requireNativeComponent, ViewPropTypes, NativeModules} from 'react-native';



let iface = {
    name: 'ImageView',
    propTypes: {
        src: PropTypes.string,
        ...ViewPropTypes, // include the default view properties
    },
};

module.exports = {
    RNAudioPlayer: NativeModules.RNAudioPlayer,
    ImageView: requireNativeComponent('RImageViewSample', iface)
};