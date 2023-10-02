(function(){
    $("#tabfornecedores").on("click",".js-delete", function(){
        let botaoClicado = $(this);
        $("#btnsim").attr("data-id", botaoClicado.attr("data-id"));
        $("#modalfornecedor").modal("show");
    });

    $("#btnsim").on("click", function(){
        let botaoSim = $(this);
        let id = botaoSim.attr("data-id");
        $.ajax(
            {
                url: "/fornecedores/remover/" + id,
                method: "GET",
                sucess: function(){
                    window.location.hre
                }
            }
        );    
    });
})();