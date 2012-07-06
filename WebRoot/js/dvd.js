(function(app) {
	var $formAlugarDVD = $("#formAlugarDVD");
	var actionForm = $formAlugarDVD.attr("action");
	app.views.dvd = {
		alugar : function(id) {
			var $formAlugarDVD = $("#formAlugarOuDevolverDVD");
			var actionForm = $formAlugarDVD.attr("action");
			var novaAction = actionForm.replace("/?/", "/" + id + "/alugar");
			$formAlugarDVD.attr("action", novaAction);
			$formAlugarDVD.submit();
		},
		devolver : function(id) {
			var $formAlugarDVD = $("#formAlugarOuDevolverDVD");
			var actionForm = $formAlugarDVD.attr("action");
			var novaAction = actionForm.replace("/?/", "/" + id + "/devolver");
			$formAlugarDVD.attr("action", novaAction);
			$formAlugarDVD.submit();
		}
	};
})(locadora);