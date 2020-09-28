
angular
    .module("telaFazerEmprestimo")
    .factory("emprestimoAPI", emprestimoAPI);

var vm = this;
    function emprestimoAPI($http, config) {
        

        vm.getAmigos = getAmigos;
        vm.getLivros = getLivros;
        vm.getEmprestimos = getEmprestimos;
        vm.saveEmprestimo = saveEmprestimo;
        vm.excluirEmprestimo = excluirEmprestimo;
    

        function getAmigos() {
            return $http.get(config.baseUrl + "/amigo/listarTodos")
        };

        function getLivros() {
            return $http.get(config.baseUrl + "/livro/listarTodos")

        };

        function getEmprestimos(){
            return $http.get(config.baseUrl + "/emprestimo/listarTodos")
        };

        function saveEmprestimo(emprestimo) {
            return $http.post(config.baseUrl + "/emprestimo", emprestimo);
        };

        function excluirEmprestimo(emprestimo){
            return $http.delete(config.baseUrl + "/emprestimo/"+ emprestimo.id)
        };

        return{
            getAmigos: getAmigos,
            getLivros: getLivros,
            getEmprestimos: getEmprestimos,
            saveEmprestimo: saveEmprestimo,
            excluirEmprestimo: excluirEmprestimo,
      
        };

    };