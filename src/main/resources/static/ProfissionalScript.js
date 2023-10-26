(function(){
$("#tabprofissionais").on("click",".js-delete", function(){
    let botaoClicado = $(this);
        $("#btnsim")
            .attr("data-id", botaoClicado.attr("data-id"));
        $("#modalprofissional").modal("show");
});

$("#btnsim").on("click",function(){
    let botaosim = $(this);
    let id = botaosim.attr("data-id");
    $.ajax(
        {
            url: "/profissionais/remover/" + id,
            method: "GET",
            success: function(){
            window.location.href = "/profissionais";
            }
        }
    )
});

})();

