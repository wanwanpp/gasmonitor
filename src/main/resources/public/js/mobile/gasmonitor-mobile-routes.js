routes = [
  {
    path: '/',
    url: './mlogin.html',
  },
  {
    path: '/about/',
    url: '/framework7-2.0.6/tabbed/pages/about.html',
  },
  {
    path: '/catalog/',
    componentUrl: '/framework7-2.0.6/tabbed/pages/catalog.html',
  },
  {
    path: '/product/:id/',
    componentUrl: '/framework7-2.0.6/tabbed/pages/product.html',
  },
  {
    path: '/settings/',
    url: '/framework7-2.0.6/tabbed/pages/settings.html',
  },
  // Page Loaders & Router
  {
    path: '/page-loader-template7/:user/:userId/:posts/:postId/',
    templateUrl: '/framework7-2.0.6/tabbed/pages/page-loader-template7.html',
  },
  {
    path: '/page-loader-component/:user/:userId/:posts/:postId/',
    componentUrl: '/framework7-2.0.6/tabbed/pages/page-loader-component.html',
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
            componentUrl: '/framework7-2.0.6/tabbed/pages/request-and-load.html',
          },
          {
            context: {
              user: user,
            }
          }
        );
      }, 1000);
    },
  },
  // Default route (404 page). MUST BE THE LAST
  {
    path: '(.*)',
    url: '/framework7-2.0.6/tabbed/pages/404.html',
  },
];
