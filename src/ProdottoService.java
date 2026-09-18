public class ProdottoService {
    public void stampaDettagliProdotto(Prodotto prodotto) {
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Prezzo: " + prodotto.getPrezzo());
    }
}