package 实验四.ex6.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 36249 on 2016/11/21.
 */
public class XDatabase {

    List<Xman>[] dnaSeq;
    List<Xman>[] nameIndex;

    int cur;
    int sum;
    public XDatabase(int size){

        dnaSeq = new ArrayList[size];
        for(int i = 0; i <size ;++i){

            dnaSeq[i] = new ArrayList<>();
        }

        nameIndex = new ArrayList[size];
        for(int i = 0; i < size; ++i){

            nameIndex[i] = new ArrayList<>();
        }

        this.cur = 0;
        this.sum = size;
    }

    public Xman add(Xman xman){

        int i = Math.abs(xman.getDNASequence().hashCode() % sum);
        int j = Math.abs(xman.getName().hashCode() % sum);

        ++cur;

        add(dnaSeq[i],xman);
        return add(nameIndex[j],xman);


    }

    public Xman getByDNASequence(String dnaSeqence){


        int i = Math.abs(dnaSeqence.hashCode() % sum);

        for(int k = 0; k < dnaSeq[i].size() ; ++k){

            if(dnaSeq[i].get(k).getDNASequence().equals(dnaSeqence)){

                return dnaSeq[i].get(k);
            }
        }

        return  null;
    }

    public List<Xman> getByName(String name){



        int i = Math.abs(name.hashCode() % sum);


        if(nameIndex[i].size() == 0){

            return new ArrayList<>();
        }

        return nameIndex[i];
    }

    public Xman delete(String dnaSeq){

        int i = Math.abs(dnaSeq.hashCode() % sum);
        Xman xman = null;
        for(int k = 0; k < this.dnaSeq[i].size();++k){

            if(this.dnaSeq[i].get(k).getDNASequence().equals(dnaSeq)){

                xman = this.dnaSeq[i].get(k);
                this.dnaSeq[i].remove(k);
            }
        }

        if(xman == null){

            return null;
        }

        --cur;

        String name = xman.getName();
        i = Math.abs(name.hashCode() % sum);

        for(int k = 0; k < nameIndex[i].size(); ++k){

            if(nameIndex[i].get(k).getDNASequence().equals(dnaSeq)){

                return nameIndex[i].remove(k);
            }
        }

        return null;
    }

    public int size(){

        return cur;
    }

    public List<Xman>friends(String dnaSeq) {

        Xman xman = getByDNASequence(dnaSeq);
        List<Xman> list = new ArrayList<>();

        for (int i = 0; i < sum; ++i) {

            for (int k = 0; k < this.dnaSeq[i].size(); ++k) {

                if (!this.dnaSeq[i].get(k).equals(xman)) {


                    Xman temp = this.dnaSeq[i].get(k);

                    if (isInList(temp.getEnemy(), xman)) {

                        continue;
                    }


                    List<Xman> temp1 = temp.getEnemy();

                    for (int j = 0; j < temp1.size(); ++j) {

                        List<Xman> temp2 = temp1.get(j).getEnemy();

                        if(isInList(temp2,xman)){

                            list.add(this.dnaSeq[i].get(k));
                            break;
                        }

                    }

                }
            }
        }

        return list;
    }

    public List<Xman>partner(String name){

        List<Xman> nameList = getByName(name);
        List<Xman> list = new ArrayList<>();
        if(nameList == null){

            return list;
        }
        for(int i = 0 ; i < nameList.size() ;++i){

            Xman xman = nameList.get(i);
            for(int j = 0; j < sum;++j){

                for(int k = 0; k < this.dnaSeq[j].size(); ++j){


                    if(!this.dnaSeq[j].get(k).equals(xman)){

                        List<Xman> temp = this.dnaSeq[j].get(k).getEnemy();
                        if(isInList(temp,xman)){

                            continue;
                        }

                        int flag = 0;

                        for(int h = 0; h < temp.size() ;++h){

                            List<Xman>temp1 = temp.get(h).getEnemy();
                            if(!isInList(temp1,xman)){

                                flag = 1;
                                break;
                            }
                        }

                        if(flag == 0){

                            list.add(this.dnaSeq[j].get(k));
                        }
                    }
                }
            }


        }

        return list;
    }
    public List<Xman> archrival(String name){

        List<Xman> nameList = getByName(name);
        List<Xman> list = new ArrayList<>();

        if(nameList == null){

            return list;
        }
        for(int i = 0 ; i < nameList.size(); ++i){

            Xman xman = nameList.get(i);

            for(int j = 0; j < sum; ++j){

                for(int k = 0; k < this.dnaSeq[j].size();++k ){


                    if(!this.dnaSeq[j].get(k).equals(xman)){

                        List<Xman> temp = dnaSeq[j].get(k).getEnemy();

                        if(isInList(temp,xman)){

                            List<Xman> temp1 = friends(dnaSeq[j].get(k).getDNASequence());
                            int flag = 0;
                            for(int h = 0; h < temp1.size() ;++h){

                                List<Xman> temp2 = temp1.get(h).getEnemy();
                                if(!isInList(temp2,xman)){

                                    flag = 1;
                                    break;
                                }
                            }

                            if(flag == 0){

                                list.add(this.dnaSeq[j].get(k));
                            }
                        }

                    }
                }
            }

        }

        return list;
    }

    @Nullable
    private Xman add(@NotNull List<Xman>  list, Xman xman){

        for(int i = 0; i < list.size(); ++i){

            if(list.get(i).equals(xman)){

                return list.set(i,xman);
            }
        }

        list.add(xman);
        return null;
    }

    private boolean isInList(List<Xman> list,Xman xman){


        for(int i = 0 ; i < list.size(); ++i){

            if(list.get(i).equals(xman)){

                return true;
            }
        }

        return false;
    }
}
