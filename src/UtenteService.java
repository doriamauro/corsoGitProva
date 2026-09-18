public class UtenteService{
    public void stampaDettagliUtente(Utente utente) {
        System.out.println("Nome: " + utente.getNome());
        System.out.println("Cognome: " + utente.getCognome());
        System.out.println("Età: " + utente.getEta());
    }
}