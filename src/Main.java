public class Main {
    public static void main(String[] args) {
        String str= "helloworld";
        String[] taskCourse = taskCourse(str);
        System.out.println(taskCourse[0] + " " + taskCourse[1]);
        }

    private static String[] taskCourse(String str) {
        String [] result = new String[2];
        if( str.length() % 2 == 0){
            result[0] = str.substring(0,str.length()/2);
            result[1] = str.substring(str.length()/2);
        } else {
            result[0] = str.substring(0,str.length()/2);
            result[1] = str.substring(str.length()/2+1);
        }
        return  result;
    }
}


