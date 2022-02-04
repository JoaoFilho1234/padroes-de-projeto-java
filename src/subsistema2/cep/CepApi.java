package subsistema2.cep;

import one.dio.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Calçado";
    }

    public String recuperarEstado(String estado) {
        return "PE";
    }


}
