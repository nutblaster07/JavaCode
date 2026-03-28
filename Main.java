import java.util.*;
class Main{
    public static void main(String[] args) {
       /*  ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ListIterator<Integer> litr=list.listIterator(list.size());
        while(litr.hasPrevious()){
            System.out.println(litr.previous()+1);
        }
        for (Integer i:list ) {
           System.out.println(i);
            
        }
        System.out.println("using Iterator");
        Iterator<Integer> itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }

        System.out.println("using ListIterator");
        ListIterator<Integer> ltr=list.listIterator();
        
        
        while (ltr.hasNext()) {
            
            System.out.println(ltr.next());
            
        }
       HashSet<Integer> hs=new HashSet<>();
       hs.add(5);
       hs.add(3);
       hs.add(2);
       hs.add(1);
       System.out.println(hs);
       Iterator<Integer> itr=hs.iterator();
      
       while(itr.hasNext()){
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
       }*/
       HashMap<String,Integer> hsp=new HashMap<>();
       hsp.put("Age",22);
       hsp.put("tele",99329);
       hsp.put("Roll",21);
       hsp.forEach((e1,e2)->{
        System.out.println(e1+"=>"+e2);
       });
       System.out.println(hsp.get("Age"));

    }
}