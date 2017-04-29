package 实验二.ex8;

/**
 * Created by 36249 on 2016/10/21.
 */
public class Matrix {

    private double[][] array ;
    int row;
    int col;
    public Matrix(int row,int col){

        this.row = row;
        this.col = col;
        array = new double[row][col];
    }
    public void set(int row,int col,double value){

        array[row-1][col-1] = value;
    }
    public double get(int row,int col){

        return array[row-1][col-1];
    }

    public int width(){
        return col;
    }
    public int height(){

        return row;
    }

    public Matrix add(Matrix b){
        if(this.row != b.row || this.col != b.col){
            return null;
        }
        Matrix temp = new Matrix(row,col);
        for(int i = 0; i < row; ++i){

            for(int j = 0; j < col ; ++j){

                temp.array[i][j] = this.array[i][j] + b.array[i][j];
            }
        }
        return temp;
    }

    public Matrix multiply(Matrix b){

        if(this.col != b.row){
            return null;
        }
        Matrix temp = new Matrix(row,b.col);
        for(int i = 0; i < row; ++i){

            for(int j = 0; j < b. col ;++j){

                for(int k = 0; k <col; ++j){

                    temp.array[i][j] = this.array[i][k] * b.array[k][j];
                }
            }
        }

        return temp;
    }

    public Matrix transpose(){

        Matrix temp = new Matrix(col,row);
        for(int i = 0 ; i < row; ++i){

            for(int j = 0; j < col ;++j){

                temp.array[j][i] = this.array[i][j];
            }
        }
        return temp;
    }

    public ThreeObject getMax(){

        double max = this.array[0][0];
        int col = 0;
        int row = 0;
        for(int i = 0; i < this.row; ++i){

            for(int j = 0 ; j < this.col ;++j){

                if(max < this.array[i][j]){

                    max = this.array[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new ThreeObject(row,col,max);
    }

    public void print(){

        for(int i = 0 ; i < row; ++i){

            for(int j = 0; j < col ;++j){

                if(j == 0){
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" "+array[i][j]);
                }
            }
            System.out.println("");
        }
    }
    public class ThreeObject{

        double value;
        int row;
        int col;
        public ThreeObject(int row,int col,double value){
            this.row = row;
            this.col = col;
            this.value = value;
        }
        public double getValue(){
            return value;
        }
        public int getRow(){
            return row;
        }
        public int getCol(){
            return col;
        }
    }

}
