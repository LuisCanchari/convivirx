
function cuotaDetallesPost(idcuota){
	let tabla = document.getElementById("tabla_cuota_detalle").getElementsByTagName('tbody')[0];
	jsonDetalles=[];
	
    for (let fila of tabla.rows) {
    	var id = fila.cells[0].innerText;
    	var conId = fila.cells[1].getElementsByTagName('span')[0].getAttribute("data-concepto-id");
    	//conId = fila.cells[1].getElementsByTagName('span')[0].dataset.conceptoId;
    	var monto=fila.cells[2].getElementsByTagName('input')[0].value;
    	    	
    	var filaDetalle = new Detalle(id, idcuota, conId, monto);
    	jsonDetalles.push(filaDetalle);
    }
    
    console.log(jsonDetalles);
    console.info(JSON.stringify(jsonDetalles));
    
    $.ajax({
        url: "http://localhost:8080/convivir/cuota/detalles",
        data: JSON.stringify(jsonDetalles),
        type: "POST",
        dataType:"html",
        contentType:'application/json'   
        ,success : function(){
            console.log("ok!");
            window.location.replace("http://localhost:8080/convivir/estadocuenta/uprivada/lista");
        }
        ,error : function(a,b,c){
            console.log("err!", a, b, c);
            alert("Hubo un error")
        }
    });
}

function cuotaDetallesPut(idcuota){
	let tabla = document.getElementById("tabla_cuota_detalle").getElementsByTagName('tbody')[0];
	jsonDetalles=[];
	
    for (let fila of tabla.rows) {
    	var id = fila.cells[0].innerText;
    	var conId = fila.cells[1].getElementsByTagName('span')[0].getAttribute("data-concepto-id");
    	//conId = fila.cells[1].getElementsByTagName('span')[0].dataset.conceptoId;
    	var monto=fila.cells[2].getElementsByTagName('input')[0].value;
    	    	
    	var filaDetalle = new Detalle(id, idcuota, conId, monto);
    	jsonDetalles.push(filaDetalle);
    }
    
    console.log(jsonDetalles);
    console.info(JSON.stringify(jsonDetalles));
    
    $.ajax({
        url: "http://localhost:8080/convivir/cuota/detalles",
        data: JSON.stringify(jsonDetalles),
        type: "PUT",
        dataType:"html",
        contentType:'application/json'   
        ,success : function(){
            console.log("ok!");
            $('#modalConceptos').modal('hide');
            window.location.replace("http://localhost:8080/convivir/estadocuenta/uprivada/lista");
        }
        ,error : function(a,b,c){
            console.log("err!", a, b, c);
            alert("Hubo un error")
        }
    });
}

function cuotaDetallesActualizar(idcuota){
	let tabla = document.getElementById("tabla_cuota_detalle").getElementsByTagName('tbody')[0];
	jsonDetalles=[];
	
    for (let fila of tabla.rows) {
    	var id = fila.cells[0].innerText;
    	var conId = fila.cells[1].getElementsByTagName('span')[0].getAttribute("data-concepto-id");
    	//conId = fila.cells[1].getElementsByTagName('span')[0].dataset.conceptoId;
    	var monto=fila.cells[2].getElementsByTagName('input')[0].value;
    	    	
    	var filaDetalle = new Detalle(id, idcuota, conId, monto);
    	jsonDetalles.push(filaDetalle);
    }
    
    console.log(jsonDetalles);
    console.info(JSON.stringify(jsonDetalles));
    
    $.ajax({
        url: "http://localhost:8080/convivir/cuota/detalles",
        data: JSON.stringify(jsonDetalles),
        type: "PUT",
        dataType:"html",
        contentType:'application/json'   
        ,success : function(){
            console.log("ok!");
            window.location.replace("http://localhost:8080/convivir/estadocuenta/uprivada/lista");
        }
        ,error : function(a,b,c){
            console.log("err!", a, b, c);
            alert("Hubo un error")
        }
    });
}



function Detalle(id, cuotaId, conceptoId, monto){
	this.id=id
	this.cuotaId= cuotaId
	this.conceptoId=conceptoId
	this.monto=monto
}

function doSearch(pageNum) {
//Jquery 
//$ codigo Jquery : Libreria de Java Script.
//# idetifica una etiqueta dle html	
	
	//document.getElementById("idPageNum").val(pageNum);

	$("#idPageNum").val(pageNum);
	$("#Search_form").submit();

}