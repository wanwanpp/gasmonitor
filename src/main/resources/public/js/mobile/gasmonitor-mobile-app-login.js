// Dom7
var $$ = Dom7;

// Framework7 App main instance
var app  = new Framework7({
    root: '#app', // App root element
    id: 'com.gasmonitor.login', // App bundle ID
    name: '监控平台用户登录', // App name
    theme: 'auto', // Automatic theme detection
    // App routes
    routes: routes
});

// Start: vue login
var vue_login = new Vue({
    el: '#view-login',
    data: {
        username: '',
        password: ''
    },
    methods: {
        onClick_signIn: function() {
            // app.dialog.alert(['登录，用户名：', this.username, '，密码：', this.password].join(''));
            app.dialog.preloader();
            var self = this;
            setTimeout(function () {
                app.dialog.close();
                if('Pandaroid' == self.username && 'Pandaroid' == self.password) {
                    app.dialog.alert('登录成功！', '提示', function () {
                        window.location.replace('m_index.html');
                    });
                } else {
                    app.dialog.alert('登录失败，请核对用户名和密码！');
                }
            }, 3000);
        }
    }
});
// End  : vue login