public class Main {
    public static void main(String[] args) {
        Holder holder = new Holder();
        holder.set(256);
        // correct the line to make the code compile: Integer value=holder.get();
        Integer value = (Integer) holder.get();
        //do not change
        System.out.println(value);
    }
}
