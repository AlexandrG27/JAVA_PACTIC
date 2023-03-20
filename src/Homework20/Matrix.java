package ru.mirea.lab1.Homework20;

public class Matrix <T extends Number>{

    private  T[][] matrix;


    public Matrix()
    {

    }
    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public <A extends Number> Number[][] sum (Matrix mat1)
    {
        Double [][] mat=new Double[mat1.getLength()][mat1.getLengthColumn()];

        for (int i =0; i< mat1.getLength();i++)
        {
            for (int j=0; j< mat1.getLengthColumn(); j++)
            {
               mat[i][j]=matrix[i][j].doubleValue()+mat1.getMatrix()[i][j].doubleValue();
            }
        }

        return mat;
    }

    public <A extends Number> Number[][] sub (Matrix mat1)
    {
        Double [][] mat=new Double[matrix.length][mat1.getLength()];

        for (int i =0; i<matrix.length;i++)
        {
            for (int j=0; j<mat1.getLengthColumn(); j++)
            {
                mat[i][j]=matrix[i][j].doubleValue()-mat1.getMatrix()[i][j].doubleValue();
            }
        }

        return mat;
    }
    public <A extends Number> Number[][] mult (Matrix mat1)
    {
        Double [][] mat=new Double[matrix.length][mat1.getLength()];

        for (int i =0; i< matrix.length;i++)
        {
            for (int j=0; j<mat1.getLengthColumn(); j++)
            {
                mat[i][j]= Double.valueOf(0);

                for (int k=0; k< mat1.getLength(); k++)
                {
                    mat[i][j]+=matrix[i][k].doubleValue()*mat1.getMatrix()[k][j].doubleValue();
                }
            }
        }

        return mat;
    }


    public T[][] getMatrix() {
        return matrix;
    }

    public int getLengthColumn()
    {
        return matrix[0].length;
    }

    public int getLength()
    {
        return matrix.length;
    }


}
