
var projectName = '网上拍卖系统';
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
]


var indexNav = [

{
	name: '竞拍商品',
	url: './pages/jingpaishangpin/list.html'
}, 

{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm5yn2l/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"买家","menuJump":"列表","tableName":"maijia"}],"menu":"买家管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"拍卖者","menuJump":"列表","tableName":"paimaizhe"}],"menu":"拍卖者管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"竞拍商品","menuJump":"列表","tableName":"jingpaishangpin"}],"menu":"竞拍商品管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"竞拍信息","menuJump":"列表","tableName":"jingpaixinxi"}],"menu":"竞拍信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"竞拍结果","menuJump":"列表","tableName":"jingpaijieguo"}],"menu":"竞拍结果管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"买家评价","menuJump":"列表","tableName":"maijiapingjia"}],"menu":"买家评价管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","竞拍"],"menu":"竞拍商品列表","menuJump":"列表","tableName":"jingpaishangpin"}],"menu":"竞拍商品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","评价","修改","删除"],"menu":"竞拍信息","menuJump":"列表","tableName":"jingpaixinxi"}],"menu":"竞拍信息管理"},{"child":[{"buttons":["查看"],"menu":"竞拍结果","menuJump":"列表","tableName":"jingpaijieguo"}],"menu":"竞拍结果管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"买家评价","menuJump":"列表","tableName":"maijiapingjia"}],"menu":"买家评价管理"},{"child":[{"buttons":["查看","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"}],"frontMenu":[{"child":[{"buttons":["查看","竞拍"],"menu":"竞拍商品列表","menuJump":"列表","tableName":"jingpaishangpin"}],"menu":"竞拍商品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"买家","tableName":"maijia"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"竞拍商品","menuJump":"列表","tableName":"jingpaishangpin"}],"menu":"竞拍商品管理"},{"child":[{"buttons":["查看","竞拍结果"],"menu":"竞拍信息","menuJump":"列表","tableName":"jingpaixinxi"}],"menu":"竞拍信息管理"},{"child":[{"buttons":["查看"],"menu":"竞拍结果","menuJump":"列表","tableName":"jingpaijieguo"}],"menu":"竞拍结果管理"},{"child":[{"buttons":["查看"],"menu":"买家评价","menuJump":"列表","tableName":"maijiapingjia"}],"menu":"买家评价管理"}],"frontMenu":[{"child":[{"buttons":["查看","竞拍"],"menu":"竞拍商品列表","menuJump":"列表","tableName":"jingpaishangpin"}],"menu":"竞拍商品模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"拍卖者","tableName":"paimaizhe"}]


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
