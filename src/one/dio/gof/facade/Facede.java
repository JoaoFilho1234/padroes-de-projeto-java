package one.dio.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facede {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
