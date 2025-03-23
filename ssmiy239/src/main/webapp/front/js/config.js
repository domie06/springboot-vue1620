
var projectName = '大学学生成长系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '学校信息',
	url: './pages/xuexiaoxinxi/list.html'
}, 
{
	name: '网课课程',
	url: './pages/wangkekecheng/list.html'
}, 
{
	name: '广告信息',
	url: './pages/guanggaoxinxi/list.html'
}, 

{
	name: '学校公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmiy239/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"老师","menuJump":"列表","tableName":"laoshi"}],"menu":"老师管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"成绩信息","menuJump":"列表","tableName":"chengjixinxi"}],"menu":"成绩信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"选课记录","menuJump":"列表","tableName":"xuankejilu"}],"menu":"选课记录管理"},{"child":[{"buttons":["新增","查看","删除","查看评论","修改"],"menu":"学校信息","menuJump":"列表","tableName":"xuexiaoxinxi"}],"menu":"学校信息管理"},{"child":[{"buttons":["查看","修改","删除","审核","新增","查看评论"],"menu":"网课课程","menuJump":"列表","tableName":"wangkekecheng"}],"menu":"网课课程管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"广告信息","menuJump":"列表","tableName":"guanggaoxinxi"}],"menu":"广告信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"奖惩信息","menuJump":"列表","tableName":"jiangchengxinxi"}],"menu":"奖惩信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课程表","menuJump":"列表","tableName":"kechengbiao"}],"menu":"课程表管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学校公告","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学校信息列表","menuJump":"列表","tableName":"xuexiaoxinxi"}],"menu":"学校信息模块"},{"child":[{"buttons":["查看","选课"],"menu":"网课课程列表","menuJump":"列表","tableName":"wangkekecheng"}],"menu":"网课课程模块"},{"child":[{"buttons":["查看"],"menu":"广告信息列表","menuJump":"列表","tableName":"guanggaoxinxi"}],"menu":"广告信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"成绩信息","menuJump":"列表","tableName":"chengjixinxi"}],"menu":"成绩信息管理"},{"child":[{"buttons":["查看"],"menu":"选课记录","menuJump":"列表","tableName":"xuankejilu"}],"menu":"选课记录管理"},{"child":[{"buttons":["查看","查看评论"],"menu":"学校信息","menuJump":"列表","tableName":"xuexiaoxinxi"}],"menu":"学校信息管理"},{"child":[{"buttons":["查看","选课"],"menu":"网课课程","menuJump":"列表","tableName":"wangkekecheng"}],"menu":"网课课程管理"},{"child":[{"buttons":["查看","查看评论"],"menu":"广告信息","menuJump":"列表","tableName":"guanggaoxinxi"}],"menu":"广告信息管理"},{"child":[{"buttons":["查看"],"menu":"奖惩信息","menuJump":"列表","tableName":"jiangchengxinxi"}],"menu":"奖惩信息管理"},{"child":[{"buttons":["查看"],"menu":"课程表","menuJump":"列表","tableName":"kechengbiao"}],"menu":"课程表管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学校信息列表","menuJump":"列表","tableName":"xuexiaoxinxi"}],"menu":"学校信息模块"},{"child":[{"buttons":["查看","选课"],"menu":"网课课程列表","menuJump":"列表","tableName":"wangkekecheng"}],"menu":"网课课程模块"},{"child":[{"buttons":["查看"],"menu":"广告信息列表","menuJump":"列表","tableName":"guanggaoxinxi"}],"menu":"广告信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"成绩信息","menuJump":"列表","tableName":"chengjixinxi"}],"menu":"成绩信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"选课记录","menuJump":"列表","tableName":"xuankejilu"}],"menu":"选课记录管理"},{"child":[{"buttons":["查看","查看评论"],"menu":"学校信息","menuJump":"列表","tableName":"xuexiaoxinxi"}],"menu":"学校信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","上传"],"menu":"网课课程","menuJump":"列表","tableName":"wangkekecheng"}],"menu":"网课课程管理"},{"child":[{"buttons":["查看评论","查看"],"menu":"广告信息","menuJump":"列表","tableName":"guanggaoxinxi"}],"menu":"广告信息管理"},{"child":[{"buttons":["查看"],"menu":"课程表","menuJump":"列表","tableName":"kechengbiao"}],"menu":"课程表管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学校信息列表","menuJump":"列表","tableName":"xuexiaoxinxi"}],"menu":"学校信息模块"},{"child":[{"buttons":["查看","选课"],"menu":"网课课程列表","menuJump":"列表","tableName":"wangkekecheng"}],"menu":"网课课程模块"},{"child":[{"buttons":["查看"],"menu":"广告信息列表","menuJump":"列表","tableName":"guanggaoxinxi"}],"menu":"广告信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"老师","tableName":"laoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
