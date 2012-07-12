(function(app) {
	app.views.cliente = {
		pesquisar : function() {
			var usuarioNome = $("#usuario-nome").val() ? $("#usuario-nome").val() : "todos";
			var url = "/locadora/clientes/pesquisar/" + usuarioNome;
			$("#list-clientes").load(url);
		}
	};
})(locadora);