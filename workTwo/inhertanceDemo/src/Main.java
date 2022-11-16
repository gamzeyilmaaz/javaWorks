public class Main {

    public static void main(String[] args) {
	TarımKrediManager tarımKrediManager = new TarımKrediManager();
	tarımKrediManager.Calculate();
	KrediUI krediUI = new KrediUI();
	krediUI.KrediCalculate(new SoldierManager());
    }
}
