public class CodeWordChecker implements StringChecker {

    private int min = 6;
    private int max = 20;
    private String notOccur;

    public CodeWordChecker(String str){
        this.notOccur = str;
    }

    public CodeWordChecker(int min,int max, String notOccur){
        this.min = min;
        this.max = max;
        this.notOccur = notOccur;
    }

    public boolean isValid(String str){
        if (str.length()>this.max||str.length()<this.min){
            return false;
        }
        if(str.indexOf(this.notOccur)!=-1){
            return false;
        }
        return true;
    }

}
