var app = angular.module('app', ['ngResource', 'ngRoute']);

/**
 * Configuração das Rotas (páginas do sistema)
 */
app.config(['$routeProvider', function($routerProvider){
	$routerProvider
		.when('/', {
			templateUrl: 'home.html'
		})
		
		.when('/noticias', {
			templateUrl: 'noticias-list.html',
			controller: 'NoticiaController',
			method: 'list'
		})
		
		.when('/noticias/new', {
			templateUrl: 'noticias-form.html',
			controller: 'NoticiaController',
			method: 'create'
		})
		
		.when('/noticias/:id', {
			templateUrl: 'noticias-show.html',
			controller: 'NoticiaController',
			method: 'show'
		})		
		
		.when('/noticias/:id/edit', {
			templateUrl: 'noticias-form.html',
			controller: 'NoticiaController',
			method: 'show'
		})		
		
		
		
		
		
		
		.when('/usuarios', {
			templateUrl: 'usuarios-list.html',
			controller: 'UsuarioController',
			method: 'list'
		})
		
		.when('/usuarios/new', {
			templateUrl: 'usuarios-form.html',
			controller: 'UsuarioController',
			method: 'create'
		})
		
		.when('/usuarios/:id', {
			templateUrl: 'usuarios-show.html',
			controller: 'UsuarioController',
			method: 'show'
		})		
		
		.when('/usuarios/:id/edit', {
			templateUrl: 'usuarios-form.html',
			controller: 'UsuarioController',
			method: 'show'
		})
		
			
		
		
		
		
		
		
		.when('/adms', {
			templateUrl: 'adms-list.html',
			controller: 'AdmController',
			method: 'list'
		})
		
		.when('/adms/new', {
			templateUrl: 'adms-form.html',
			controller: 'AdmController',
			method: 'create'
		})
		
		.when('/adms/:id', {
			templateUrl: 'adms-show.html',
			controller: 'AdmController',
			method: 'show'
		})		
		
		.when('/adms/:id/edit', {
			templateUrl: 'adms-form.html',
			controller: 'AdmController',
			method: 'show'
		})	
		
			
		
		
		
		.when('/vouchers', {
			templateUrl: 'vouchers-list.html',
			controller: 'VoucherController',
			method: 'list'
		})
		
		.when('/vouchers/new', {
			templateUrl: 'vouchers-form.html',
			controller: 'VoucherController',
			method: 'create'
		})
		
		.when('/vouchers/:id', {
			templateUrl: 'vouchers-show.html',
			controller: 'VoucherController',
			method: 'show'
		})		
		
		.when('/vouchers/:id/edit', {
			templateUrl: 'vouchers-form.html',
			controller: 'VoucherController',
			method: 'show'
		})		
		
		
		
		;
}]);


//NoticiaService
app.factory('NoticiaService', function($resource) {
	return $resource('/api/noticias/:id', {}, {});
});

//NoticiaController
app.controller('NoticiaController', function($scope, $routeParams, $route, $location, NoticiaService) {
	
	$scope.list = function() {
		$scope.noticias = NoticiaService.query();	
	}
	
	$scope.show = function() {
		$scope.noticia = NoticiaService.get({"id": $routeParams.id});
	}
	
	$scope.create = function() {
		$scope.noticia = {};
	}	
	
	$scope.edit = function() {
		$scope.noticia = NoticiaService.get({"id": $routeParams.id});
	}	
	
	$scope.save = function() {
		NoticiaService.save($scope.noticia, function(noticia){
			if(noticia) {
				$location.path('/noticias/' + noticia.id);
			}
    	});
	}
	
	$scope.remove = function() {
		if(confirm('Confirma a Exclusão?')) {
	    	NoticiaService.remove($scope.noticia, function(){
	    		$location.path('/noticias');
	    	});
		}
    }
	
	//Chama o método definido na rota
	if($route.current.method){ 
		$scope[$route.current.method]();
	}
});




//UsuarioService
app.factory('UsuarioService', function($resource) {
	return $resource('/api/usuarios/:id', {}, {});
});

//NoticiaController
app.controller('UsuarioController', function($scope, $routeParams, $route, $location, UsuarioService) {
	
	$scope.list = function() {
		$scope.usuarios = UsuarioService.query();	
	}
	
	$scope.show = function() {
		$scope.usuario = UsuarioService.get({"id": $routeParams.id});
	}
	
	$scope.create = function() {
		$scope.usuario = {};
	}	
	
	$scope.edit = function() {
		$scope.usuario = UsuarioService.get({"id": $routeParams.id});
	}	
	
	$scope.save = function() {
		UsuarioService.save($scope.usuario, function(usuario){
			if(usuario) {
				$location.path('/usuarios/' + usuario.id);
			}
  	});
	}
	
	$scope.remove = function() {
		if(confirm('Confirma a Exclusão?')) {
			UsuarioService.remove($scope.usuario, function(){
	    		$location.path('/usuarios');
	    	});
		}
  }
	
	//Chama o método definido na rota
	if($route.current.method){ 
		$scope[$route.current.method]();
	}
});






//ADMService
app.factory('AdmService', function($resource) {
	return $resource('/api/adms/:id', {}, {});
});

//AdmController
app.controller('AdmController', function($scope, $routeParams, $route, $location, AdmService) {
	
	$scope.list = function() {
		$scope.adms = AdmService.query();	
	}
	
	$scope.show = function() {
		$scope.adm = AdmService.get({"id": $routeParams.id});
	}
	
	$scope.create = function() {
		$scope.adm = {};
	}	
	
	$scope.edit = function() {
		$scope.adm = AdmService.get({"id": $routeParams.id});
	}	
	
	$scope.save = function() {
		AdmService.save($scope.adm, function(adm){
			if(adm) {
				$location.path('/adms/' + adm.id);
			}
  	});
	}
	
	$scope.remove = function() {
		if(confirm('Confirma a Exclusão?')) {
	    	AdmService.remove($scope.adm, function(){
	    		$location.path('/adms');
	    	});
		}
  }
	
	//Chama o método definido na rota
	if($route.current.method){ 
		$scope[$route.current.method]();
	}
});





//VoucherService
app.factory('VoucherService', function($resource) {
	return $resource('/api/vouchers/:id', {}, {});
});

//VoucherController
app.controller('VoucherController', function($scope, $routeParams, $route, $location, VoucherService) {
	
	$scope.list = function() {
		$scope.vouchers = VoucherService.query();	
	}
	
	$scope.show = function() {
		$scope.voucher = VoucherService.get({"id": $routeParams.id});
	}
	
	$scope.create = function() {
		$scope.voucher = {};
	}	
	
	$scope.edit = function() {
		$scope.voucher = VoucherService.get({"id": $routeParams.id});
	}	
	
	$scope.save = function() {
		VoucherService.save($scope.voucher, function(voucher){
			if(voucher) {
				$location.path('/vouchers/' + voucher.id);
			}
  	});
	}
	
	$scope.remove = function() {
		if(confirm('Confirma a Exclusão?')) {
			VoucherService.remove($scope.voucher, function(){
	    		$location.path('/vouchers');
	    	});
		}
  }
	
	//Chama o método definido na rota
	if($route.current.method){ 
		$scope[$route.current.method]();
	}
});