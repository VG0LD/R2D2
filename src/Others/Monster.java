package Others;

public class Monster {
    int eyeAmount;
    int legAmount;
    int handAmount;

    public Monster () {
        eyeAmount = 2;
        legAmount = 2;
        handAmount = 2;
    }

    public Monster (int eyeAmount) {
        this.eyeAmount = eyeAmount;
        legAmount = 2;
        handAmount = 2;
    }

    public Monster (int eyeAmount, int legAmount) {
        this.eyeAmount = eyeAmount;
        this.legAmount = legAmount;
        handAmount = 2;
    }

    public Monster (int eyeAmount, int legAmount, int handAmount) {
        this.eyeAmount = eyeAmount;
        this.legAmount = legAmount;
        this.handAmount = handAmount;
    }

    void voice () {
        System.out.println("Voice");
    }

    void voice (int i) {
        for (int x = 0; x < i; x++) {
            voice();
        }
    }

    void voice (int i, String word) {
        for (int x = 0; x < i; x++) {
            System.out.println(word);
        }
    }

    void defineMonster () {
        System.out.println(eyeAmount + " " + legAmount + " " +handAmount);
    }
}
