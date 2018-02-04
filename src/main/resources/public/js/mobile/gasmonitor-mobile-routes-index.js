routes_index = [
    {
        path: '/',
        url: './mlogin.html',
    },
    {
        path: '/about/',
        url: './pages/about.html',
    },
    {
        path: '/catalog/',
        componentUrl: './pages/catalog.html',
    },
    {
        path: '/product/:id/',
        componentUrl: './pages/product.html',
    },
    {
        path: '/settings/',
        url: './pages/settings.html',
    },
    // Page Loaders & Router
    {
        path: '/page-loader-template7/:user/:userId/:posts/:postId/',
        templateUrl: './pages/page-loader-template7.html',
    },
    {
        path: '/page-loader-component/:user/:userId/:posts/:postId/',
        componentUrl: './pages/page-loader-component.html',
    },
    {
        path: '/request-and-load/user/:userId/',
        async: function (routeTo, routeFrom, resolve, reject) {
            // Router instance
            var router = this;

            // App instance
            var app = router.app;

            // Show Preloader
            app.preloader.show();

            // User ID from request
            var userId = routeTo.params.userId;

            // Simulate Ajax Request
            setTimeout(function () {
                // We got user data from request
                var user = {
                    firstName: 'Vladimir',
                    lastName: 'Kharlampidi',
                    about: 'Hello, i am creator of Framework7! Hope you like it!',
                    links: [
                        {
                            title: 'Framework7 Website',
                            url: 'http://framework7.io',
                        },
                        {
                            title: 'Framework7 Forum',
                            url: 'http://forum.framework7.io',
                        },
                    ]
                };
                // Hide Preloader
                app.preloader.hide();

                // Resolve route to load page
                resolve(
                    {
                        componentUrl: './pages/request-and-load.html',
                    },
                    {
                        context: {
                            user: user,
                        }
                    }
                );
            }, 1000);
        }
    },
    // Start: 菜单里对应项目的 routes
    {
      path: '/sys/setting',
        url: './pages/sys/setting.html'
    },
    {
      path: '/tenant/list',
        url: './pages/tenant/list.html'
    },
    {
      path: '/tenant/user/list',
        url: './pages/tenant/user/list.html'
    },
    {
      path: '/bas/setting',
        url: './pages/bas/setting.html'
    },
    {
      path: '/bas/unit/list',
        url: './pages/bas/unit/list.html'
    },
    {
      path: '/bas/role/list',
        url: './pages/bas/role/list.html'
    },
    {
      path: '/tenant/info',
        url: './pages/tenant/info.html'
    },
    {
      path: '/tenant/sum-table',
        url: './pages/tenant/sum-table.html'
    },
    {
      path: '/site/list',
        url: './pages/site/list.html'
    },
    {
      path: '/site/sites-manage',
        url: './pages/site/sites-manage.html'
    },
    // End  : 菜单里对应项目的 routes
    // Default route (404 page). MUST BE THE LAST
    {
        path: '(.*)',
        url: './pages/404.html'
    }
];
