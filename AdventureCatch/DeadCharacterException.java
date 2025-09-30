

public class DeadCharacterException extends Exception {
    Character exc;
    public DeadCharacterException(Character exc) {
        this.exc = exc;
    }

    @Override
    public String getMessage() {
        if (this.exc instanceof Sorcerer) {
            return "The " + "sorcerer " + exc.getName() + " is dead.";
        } else if (this.exc instanceof Monster) {
            return "The " + "monster " + exc.getName() + " is dead.";         
        } else if (this.exc instanceof Templar) {
            return "The " + "templar " + exc.getName() + " is dead.";         
        }else{
            return "";
        }
    }
}
