angular
    .module('projetoEmprestimo')
    .controller('projetoEmprestimoCtrl', projetoEmprestimoCtrl)

function projetoEmprestimoCtrl(amigosAPI, $scope) {

    var vm = this;
    vm.amigos=[];
    vm.mudaFoto              = mudaFoto;
    vm.carregarAmigos        = carregarAmigos;
    vm.adicionarAmigos       = adicionarAmigos;
    vm.apagarAmigos          = apagarAmigos;
    vm.ordenarPor            = ordenarPor;
    

    function mudaFoto(foto) {
        document.getElementById("icone").src= foto;

    }
    function carregarAmigos() {
        amigosAPI.getAmigos().then(function(response){              
        vm.amigos = response.data;
            });
    };

    function adicionarAmigos(amigo) {
        if(amigo.id){
            amigosAPI.alterarAmigo(amigo).then(function (data) {
                delete $scope.amigo;
                $scope.amigoForm.$setPristine();
                carregarAmigos();
            });
        }else{
            amigosAPI.saveAmigo(amigo).then(function (data) {
                delete $scope.amigo;
                $scope.amigoForm.$setPristine();
                carregarAmigos();
            });
        }
    };    
    function apagarAmigos (amigo) {
        vm.amigos = vm.amigos.filter(function (amigo) {
            if (amigo.selecionado) {
                amigosAPI.excluirAmigo(amigo).then(function (response){                      
                    carregarAmigos();
                });
            }
        });
    }
    function ordenarPor(campo){
        vm.criterioDeOrdenacao = campo;
        vm.direcaoDaOrdenacao  = !vm.direcaoDaOrdenacao;
    };
    carregarAmigos();
};