var pages = [{
  id : "project",
  urlPath : "project/:projectId",
  pages : [{
    id : "build",
    name : "构建",
    urlPath : "build",
    pages : [{
      id : "design",
      name : "设计",
      urlPath : "design",
      page : "cd/build/design.html"
    }, {
      id : "browse",
      name : "浏览",
      urlPath : "browse",
      page : "cd/build/browse.html"
    }]
  }, {
    id : "deployment",
    urlPath : "deploy",
    name : "部署",
    icon : "assets/images/home/ziyuan.svg",
    pages : [{
      id : "assemblymgr",
      urlPath : "assemblymgr",
      page : "cd/deploy/assembly/browse.html",
      name : "部署装配"
    }, {
      id : "gridDatabinding",
      urlPath : "databinding",
      page : "cd/deploy/platform/overview.html",
      name : "云服务"
    }, {
      id : "assemblies",
      urlPath : "assemblies",
      navbar : false,
      pages : [{
        id : "assembly_overview",
        urlPath : ":assemblyid/overview",
        page : "cd/deploy/platform/overview.html"
      }]
    }, {
      id : "platforms",
      urlPath : "platforms",
      navbar : false,
      pages : [{
        id : "platform_overview",
        urlPath : ":platformid/overview",
        page : "cd/deploy/component/overview.html"
      }]
    }]
  }, {
    id : "project_admin",
    urlPath : "admin",
    name : "管理",
    pages : [{
      id : "project_team",
      name : "团队",
      urlPath : "team",
      page : "pm/project/admin/team.html",
      icon : "assets/images/home/ziyuan.svg"
    }, {
      id : "project_role",
      name : "角色权限",
      urlPath : "role",
      page : "pm/project/admin/role.html",
      icon : "assets/images/home/ziyuan.svg"
    }, {
      id : "codeRepository",
      name : "代码库",
      urlPath : "coderep",
      page : "pm/project/admin/role.html"
    }]
  }]
}];

var config = {
  pages : pages
};

module.exports = config;
