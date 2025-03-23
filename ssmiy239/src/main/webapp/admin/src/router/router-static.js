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
    import discussxuexiaoxinxi from '@/views/modules/discussxuexiaoxinxi/list'
    import xuexiaoxinxi from '@/views/modules/xuexiaoxinxi/list'
    import discusswangkekecheng from '@/views/modules/discusswangkekecheng/list'
    import news from '@/views/modules/news/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xuankejilu from '@/views/modules/xuankejilu/list'
    import discussguanggaoxinxi from '@/views/modules/discussguanggaoxinxi/list'
    import jiangchengxinxi from '@/views/modules/jiangchengxinxi/list'
    import laoshi from '@/views/modules/laoshi/list'
    import storeup from '@/views/modules/storeup/list'
    import users from '@/views/modules/users/list'
    import wangkekecheng from '@/views/modules/wangkekecheng/list'
    import kechengbiao from '@/views/modules/kechengbiao/list'
    import chengjixinxi from '@/views/modules/chengjixinxi/list'
    import guanggaoxinxi from '@/views/modules/guanggaoxinxi/list'
    import chat from '@/views/modules/chat/list'
    import config from '@/views/modules/config/list'


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
	path: '/discussxuexiaoxinxi',
        name: '学校信息评论',
        component: discussxuexiaoxinxi
      }
      ,{
	path: '/xuexiaoxinxi',
        name: '学校信息',
        component: xuexiaoxinxi
      }
      ,{
	path: '/discusswangkekecheng',
        name: '网课课程评论',
        component: discusswangkekecheng
      }
      ,{
	path: '/news',
        name: '学校公告',
        component: news
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/xuankejilu',
        name: '选课记录',
        component: xuankejilu
      }
      ,{
	path: '/discussguanggaoxinxi',
        name: '广告信息评论',
        component: discussguanggaoxinxi
      }
      ,{
	path: '/jiangchengxinxi',
        name: '奖惩信息',
        component: jiangchengxinxi
      }
      ,{
	path: '/laoshi',
        name: '老师',
        component: laoshi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/users',
        name: '管理员',
        component: users
      }
      ,{
	path: '/wangkekecheng',
        name: '网课课程',
        component: wangkekecheng
      }
      ,{
	path: '/kechengbiao',
        name: '课程表',
        component: kechengbiao
      }
      ,{
	path: '/chengjixinxi',
        name: '成绩信息',
        component: chengjixinxi
      }
      ,{
	path: '/guanggaoxinxi',
        name: '广告信息',
        component: guanggaoxinxi
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
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
