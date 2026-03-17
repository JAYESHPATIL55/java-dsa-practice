class Array_Practice {
    public static void main(String []args){
        String[] arr = new String[10];
        arr[0]="jayesh";
        arr[1]="patil";
        arr[2]="dsa";
        arr[3]="java";
        arr[4]="frontend";
        arr[5]="sql";
        arr[6]="plsql";
        arr[7]="mangoDB";
        arr[8]="kotlin";
        arr[9]="Swift";
        String[] other = arr;
        other[4]="dsa";
        other[2]="frontend";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" "+arr[i]);
        }

    }
}
