package Lista6.questao12;

public class Servicos {

        private TipoServico tipo;
        private double valor;

        public Servicos(TipoServico tipo, double valor) {
            this.tipo = tipo;
            this.valor = valor;
        }

        public TipoServico getTipo() {
            return tipo;
        }
        public double getValor() {
            return valor;
        }

}
