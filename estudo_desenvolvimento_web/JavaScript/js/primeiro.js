function potencia(b, e){
	var rs = b;
	for(i = 1 ; i < e ; i++){
		rs *= b ;

	}
	return rs;
}

function jurosComposto(vp, taxa, parcelas){
	var vf = 0;
	vf = vp * Math.pow((1+taxa/100), parcelas);
	return vf;

}

function conversao(numero){
	var real = 1.00;

}