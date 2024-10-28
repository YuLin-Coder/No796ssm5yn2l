import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import jingpaixinxi from '@/views/modules/jingpaixinxi/list'
    import paimaizhe from '@/views/modules/paimaizhe/list'
    import jingpaijieguo from '@/views/modules/jingpaijieguo/list'
    import maijia from '@/views/modules/maijia/list'
    import messages from '@/views/modules/messages/list'
    import maijiapingjia from '@/views/modules/maijiapingjia/list'
    import config from '@/views/modules/config/list'
    import users from '@/views/modules/users/list'
    import jingpaishangpin from '@/views/modules/jingpaishangpin/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/jingpaixinxi',
        name: '竞拍信息',
        component: jingpaixinxi
      }
          ,{
	path: '/paimaizhe',
        name: '拍卖者',
        component: paimaizhe
      }
          ,{
	path: '/jingpaijieguo',
        name: '竞拍结果',
        component: jingpaijieguo
      }
          ,{
	path: '/maijia',
        name: '买家',
        component: maijia
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/maijiapingjia',
        name: '买家评价',
        component: maijiapingjia
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/jingpaishangpin',
        name: '竞拍商品',
        component: jingpaishangpin
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
