angular
    .module('telaFazerEmprestimo')
    .controller('telaFazerEmprestimoCtrl', telaFazerEmprestimoCtrl)

    function telaFazerEmprestimoCtrl(emprestimoAPI, $scope){

        var vm = this;
        vm.emprestimo=[];
        vm.carregarAmigos   = carregarAmigos;
        vm.carregarLivros   = carregarLivros;
        vm.carregarEmprestimos = carregarEmprestimos;
        vm.adicionarLivro   = adicionarLivro;
        vm.adicionarAmigos  = adicionarAmigos;
        vm.apagarLivros     = apagarLivros;

  

        function carregarEmprestimos(){
            
        }

        function carregarLivros() {
            emprestimoAPI.getLivros().then(function(response){              
            vm.livros = response.data;
                });
        };

        function carregarAmigos() {
            emprestimoAPI.getAmigos().then(function(response){              
            vm.amigos = response.data;
                });
        };

        function adicionarLivro(livro) {
            if(livro.id){
                emprestimoAPI.alterarLivro(livro).then(function (data) {
                    delete $scope.livro;
                    $scope.livroForm.$setPristine();
                    carregarLivros();
                });
            }else{
                livroApi.saveLivro(livro).then(function (data) {
                    delete $scope.livro;
                    $scope.livroForm.$setPristine();
                    carregarLivros();
                });
            }
        };

        function adicionarAmigos(amigo) {
            if(amigo.id){
                emprestimoAPI.alterarAmigo(amigo).then(function (data) {
                    delete $scope.amigo;
                    $scope.amigoForm.$setPristine();
                    carregarAmigos();
                });
            }else{
                emprestimoAPI.saveAmigo(amigo).then(function (data) {
                    delete $scope.amigo;
                    $scope.amigoForm.$setPristine();
                    carregarAmigos();
                });
            }
        };

      function apagarLivros (amigo) {
        vm.amigos = vm.amigos.filter(function (amigo) {
            if (amigo.selecionado) {
                emprestimoAPI.excluirAmigo(amigo).then(function (response){                      
                    carregarAmigos();
                });
            }
        });
    }
        carregarEmprestimos();
        carregarAmigos();
        carregarLivros();
    };