class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        String arr[]=date.split("-");
        String year=Integer.toBinaryString(Integer.parseInt(arr[0]));
        String month=Integer.toBinaryString(Integer.parseInt(arr[1]));
        String day=Integer.toBinaryString(Integer.parseInt(arr[2]));
        return year + "-"+ month + "-" + day;
    }
}