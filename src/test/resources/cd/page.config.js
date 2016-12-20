var pages = [{
  id: "portal", // 一级页面标示符
  urlPath: "portal", // 浏览器路由地址,  localhost:8080/default/index.html/#/portal
  page: "sample/pages/portal/index.html", // HTML文件目录，相对于webcontent的路径，如：devops-sample/com.primeton.devops.sample/src/webcontent/pages/portal/index.html, 注意别忘了加构建包的webPath
  root: true
}, {
  id: "signup",
  urlPath: "signup",
  page: "sample/pages/portal/signup.html"
}, {
  id: "forgotPassword",
  urlPath: "forgotPassword",
  page: "sample/pages/portal/forgotPassword.html"
}, {
  id: "signin",
  urlPath: "signin",
  page: "sample/pages/portal/signin.html"
}, {
  id: "apply",
  urlPath: "apply",
  page: "sample/pages/portal/apply.html"
}, {
  id: "home",
  urlPath: "home",
  pages: [{
    id: "form", // 二级页面标示符
    urlPath: "form", // 浏览器路由地址， localhost:8080/default/index.html/#/home/form
    name: "Form",
    icon: "assets/images/home/product.svg",
    pages: [{
    	id: "formBasic", // 三级页面标示符
    	urlPath: "basic", // 浏览器路由地址， localhost:8080/default/index.html/#/home/form/basic
    	page: "sample/pages/home/form/index.html",
    	name: "Form"
    }, {
    	id: "formTooltip",
    	urlPath: "tooltip",
    	page: "sample/pages/home/form/toolTip.html",
    	name: "Tooltip"
    }, {
    	id: "formButton",
    	urlPath: "button",
    	page: "sample/pages/home/form/button.html",
    	name: "Button"
    }, {
    	id: "formCombobox",
    	urlPath: "combobox",
    	page: "sample/pages/home/form/comboBox.html",
    	name: "ComboBox"
    }, {
    	id: "formIframe",
    	urlPath: "iframe",
    	frame: true,
        page: "sample/pages/home/form/iframe.html",
    	name: "Iframe"
    }]
  }, {
    id: "tree",
    urlPath: "tree",
    name: "Tree",
    icon: "assets/images/home/market.svg",
    pages: [{
    	id: "treeBasic",
    	urlPath: "basic",
    	page: "sample/pages/home/tree/index.html",
    	name: "Tree"
    }, {
    	id: "treeFiltertree",
    	urlPath: "filtertree",
    	page: "sample/pages/home/tree/filterTree.html",
    	name: "FilterTree"
    },{
    	id: "contextMenutree",
    	urlPath: "contextmenu",
    	page: "sample/pages/home/tree/contextMenu.html",
    	name: "ContextMenu"
    }]
  }, {
    id: "dnd",
    urlPath: "dnd",
    name: "Drag&Drop",
    icon: "assets/images/home/product.svg",
    page:  "sample/pages/home/dnd/index.html" 
  }, {
    id: "echart",
    urlPath: "echarts",
    name: "Chart_ECharts",
    icon: "assets/images/home/market.svg",
    page:"sample/pages/home/chart/basicCharts.html" 
  }, {
    id: "tabs",
    urlPath: "tabs",
    name: "Tabs",
    icon: "assets/images/home/product.svg",
    page: "sample/pages/home/tabs/index.html"
    },{
    id: "grid",
    urlPath: "grid",
    name: "Grid",
    icon: "assets/images/home/ziyuan.svg",
    pages: [{
      id: "gridBasic",
      urlPath: "basic",
      page: "sample/pages/home/grid/index.html",
      name: "Grid"
    }, {
      id: "gridDatabinding",
      urlPath: "databinding",
      page: "sample/pages/home/grid/dataBinding.html",
      name: "DataBinding"
  }]
},{
    id: "deploy",
    urlPath: "deploy",
    name: "部署",
    icon: "assets/images/home/ziyuan.svg",
    pages: [{
      id: "assembly",
      urlPath: "assembly",
      page: "cd/deploy/html/assembly/browse.html",
      name: "部署装配"
    }, {
      id: "gridDatabinding",
      urlPath: "databinding",
      page: "cd/deploy/assembly_platform.html",
      name: "云服务"
  }]
}]
}, {
  id: "assemblies",
  urlPath: "assemblies",
  navbar: false,
  pages: [{
    id: "assembly_preview",
    urlPath: ":assemblyid/preview",
    page: "cd/deploy/assembly_platform.html"
  }]
}, {
  id: "platforms",
  urlPath: "platforms",
  navbar: false,
  pages: [{
    id : "platform_preview",
    urlPath : ":platformid/preview",
    page: "cd/deploy/platform_component.html"
  }]
}];
var config = {
  pages: pages
};
module.exports = config;
