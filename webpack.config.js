const path = require('path');
const webpack = require('webpack');
const htmlWebpackPlugin = require('html-webpack-plugin');
const { VueLoaderPlugin } = require("vue-loader");

// webpack.config.js
module.exports = {
    entry : resolve("/view/app.js"),
    output : {
        path : resolve("/dist"),
        filename : '[name].js'
    },
    resolve : {
        extensions : [ '.js', '.vue', '.json' ],
        alias : {
            'vue$'   : 'vue/dist/vue.esm.js',
            '@'      : resolve('view'),
            '~'      : resolve('view/app'),
            '@image' : resolve('view/asset/img'),
            '@style' : resolve('view/style'),
            'dist~'  : resolve('dist')
        }
    },
    module : {
        rules : [
            {test : /\.vue$/, loader : 'vue-loader'},
            {test : /\.s[a|c]ss$/,loaders: ['style-loader','css-loader','sass-loader?outputStyle=compressed']},
            {test : /\.css$/,use : [ 'vue-style-loader', 'css-loader' ]},
            {test : /\.js$/,loader : 'babel-loader',exclude : /node_modules/},
            {test : /\.(png|jpg|jpeg|gif|svg)$/,loader : 'file-loader',
                options : {
                    publicPath: '/',
                    name : '[path][name].[ext]?[hash]'
                }
            }
        ]
    },
    plugins: [
        new htmlWebpackPlugin({
            template: resolve('/view/index.html'),
            inject: true
        }),
        new VueLoaderPlugin()
    ],
    devtool: 'source-map'
};

// if (process.env.NODE_ENV === 'prod') {
//     module.exports.devtool = '#source-map';
//     // http://vue-loader.vuejs.org/en/workflow/production.html
//     module.exports.plugins = (module.exports.plugins || []).concat([
//         new webpack.DefinePlugin({'process.env': { NODE_ENV: '"production"'} }),
//         new webpack.optimize.UglifyJsPlugin({
//             sourceMap: true,
//             compress: {warnings: false}}),
//         new webpack.LoaderOptionsPlugin({minimize: true})
//     ]);
// }

/* Local function */
function resolve(dir) {return path.join(__dirname, '.', dir);}