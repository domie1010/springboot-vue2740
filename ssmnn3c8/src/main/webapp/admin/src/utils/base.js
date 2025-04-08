const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmnn3c8/",
            name: "ssmnn3c8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmnn3c8/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智能停车系统"
        } 
    }
}
export default base
