const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmiy239/",
            name: "ssmiy239",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmiy239/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学学生成长系统"
        } 
    }
}
export default base
